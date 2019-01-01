package elements;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import general.Direction;
import notification.Event;
import notification.Observable;
import notification.Observer;

/**
 * 
 * @author Yemi
 *
 */
public class Elevator implements Runnable, Observer, Observable {
	
	/**
	 * 
	 */
	private Integer location = null;
	
	/**
	 * 
	 */
	private List<Integer> stops = null; 
	
	/**
	 * 
	 */
	private Direction direction = null;
	
	/**
	 * 
	 */
	private Integer elevatorNumber = null;
	
	/**
	 * 
	 */
	private List<ElevatorButton> elevatorButtons;
	
	/**
	 * 
	 */
	private List<Person> passengers;
	
	
	/**
	 * 
	 */
	private Set<Observer> observers;
	
	/**
	 * 
	 */
	private final Logger logger = Logger.getLogger( this.getClass().getName() );
	
	/**
	 * 
	 */
	public Elevator() {
	
	}
	
	public List<ElevatorButton> getElevatorButtons() {
		return elevatorButtons;
	}

	public void setElevatorButtons(List<ElevatorButton> elevatorButtons) {
		this.elevatorButtons = elevatorButtons;
	}

	/**
	 * 
	 * @param location
	 * @param stops
	 * @param direction
	 * @param elevatorNumber
	 */
	public Elevator(Integer location, Direction direction, Integer elevatorNumber, 
											int numberOfFloors) {
		super();
		this.location = location;
		this.stops = new LinkedList<>();
		this.elevatorButtons = new ArrayList<>();
		this.passengers = new LinkedList<>();
		for(int i = 1; i <= numberOfFloors; ++i) {
			ElevatorButton button = new ElevatorFloorRequestButton(i);
			this.elevatorButtons.add(button);
		}
		
		// The creation of other Elevator Button Types could be done here.
		this.direction = direction;
		this.elevatorNumber = elevatorNumber;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getLocation() {
		return location;
	}

	/**
	 * This is the floor on which the Elevator is at the moment.
	 * @param location
	 */
	public void setLocation(Integer location) {
		this.location = location;
	}

	/**
	 * 
	 * @return
	 */
	public List<Integer> getStops() {
		return stops;
	}

	/**
	 * 
	 * @param stops
	 */
	public void setStops(List<Integer> stops) {
		this.stops = stops;
	}

	/**
	 * 
	 * @return
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * 
	 * @param direction
	 */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getElevatorNumber() {
		return elevatorNumber;
	}

	/**
	 * 
	 * @param elevatorNumber
	 */
	public void setElevatorNumber(Integer elevatorNumber) {
		this.elevatorNumber = elevatorNumber;
	}

	/**
	 * 
	 * @param floorNumber
	 */
	public void addStop(int floorNumber) {
		this.stops.add(floorNumber);
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return passengers.isEmpty();
	}
	
	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elevatorNumber == null) ? 0 : elevatorNumber.hashCode());
		return result;
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elevator other = (Elevator) obj;
		if (elevatorNumber == null) {
			if (other.elevatorNumber != null)
				return false;
		} else if (!elevatorNumber.equals(other.elevatorNumber))
			return false;
		return true;
	}

	/**
	 * 
	 */
	public synchronized void registerObserver(Observer observer) {
		
	}
	
	/**
	 * 
	 */
	@Override
	public synchronized void notify(Event event) {
		
	}
	
	
	/**
	 * 
	 */
	public void run() {
		
		while( true ) {
			
		}		
	}

	@Override
	public String toString() {
		return "Elevator [elevatorNumber=" + elevatorNumber + "]";
	}
}
