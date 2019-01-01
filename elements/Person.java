package elements;

import notification.ElevatorDoorClosed;
import notification.ElevatorDoorOpened;
import notification.Event;
import notification.Observer;
import notification.ReachedFloorEvent;
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
		
		if ( obj instanceof Person ) {			
			if ( obj == this ) {
				return true;
			} else if ( ((Person)obj).getName().equals(this.getName()) ) {
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
		
		while( true ) {
			
		}		
	}

	@Override
	public void notify(Event event) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * @param event
	 */
	public synchronized void notify( ElevatorDoorClosed event) {
		
	}
	
	/**
	 * 
	 * @param event
	 */
	public synchronized void notify( ElevatorDoorOpened event ) {
		
	}
	
	/**
	 * 
	 * @param event
	 */
	public synchronized void notify( ReachedFloorEvent event ) {
		
	}
}
