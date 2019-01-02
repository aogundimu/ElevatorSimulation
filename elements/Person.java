package elements;

import notification.ElevatorDoorClosedEvent;
import notification.ElevatorDoorOpenedEvent;
import notification.ElevatorExitedEvent;
import notification.Event;
import notification.Observer;
import notification.ReachedFloorEvent;
import travelScript.ScriptItem;
import travelScript.TravelScript;

/**
 * 
 * @author Yemi
 *
 */
public class Person implements Runnable, Observer {

	/**
	 * 
	 */
	private int location;

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private TravelScript travelScript;

	/**
	 * 
	 * @return
	 */
	public TravelScript getTravelScript() {
		return travelScript;
	}

	/**
	 * 
	 * @param travelScript
	 */
	public void setTravelScript(TravelScript travelScript) {
		this.travelScript = travelScript;
	}

	/**
	 * 
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * 
	 * @param location
	 */
	public void setLocation(int location) {
		this.location = location;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param name
	 * @param location
	 * @param travelScript
	 */
	Person(String name, int location, TravelScript travelScript) {
		this.name = name;
		this.location = location;
		this.travelScript = travelScript;
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			if (obj == this) {
				return true;
			} else if (((Person) obj).getName().equals(this.getName())) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 
	 */
	@Override
	public void run() {

		while (true) {
			
			// On the first floor
			

		}
	}

	/**
	 * 
	 */
	@Override
	public void notify(Event event) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * @param event
	 */
	public synchronized void notify(ElevatorDoorClosedEvent event) {

	}

	/**
	 * 
	 * @param event
	 */
	public synchronized void notify(ElevatorDoorOpenedEvent event) {		

		ScriptItem item = travelScript.getScriptItems().get(0);
		if ( item.getFloor() == event.getFloorNumber() ) {
			
			// Remove the first item from the script
			travelScript.getScriptItems().remove(0);
			
			int elevatorNumber = event.getElevatorNumber();				
			ElevatorExitedEvent eee = new ElevatorExitedEvent(this);
			Elevator elevator = Building.getInstance().getElevators().get(elevatorNumber);
			elevator.notify(eee);

		} else {
			// Do nothing
		}
		

	}

	/**
	 * 
	 * @param event
	 */
	public synchronized void notify(ReachedFloorEvent event) {
		
		this.location = event.getFloorNumber();		
	}
}
