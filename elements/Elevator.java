package elements;

import java.util.LinkedList;
import java.util.List;

import general.Direction;
import notification.Event;
import notification.Observable;
import notification.Observer;

public class Elevator implements Runnable, Observer, Observable {
	
	/**
	 * 
	 */
	private Integer location = null;
	
	/**
	 * 
	 */
	private List<Integer> stops = null; // = new LinkedList<>();
	
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
	public Elevator() {
		
	}
	
	/**
	 * 
	 * @param location
	 * @param stops
	 * @param direction
	 * @param elevatorNumber
	 */
	public Elevator(Integer location, List<Integer> stops, Direction direction, Integer elevatorNumber) {
		super();
		this.location = location;
		this.stops = stops;
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

	public List<Integer> getStops() {
		return stops;
	}

	public void setStops(List<Integer> stops) {
		this.stops = stops;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Integer getElevatorNumber() {
		return elevatorNumber;
	}

	public void setElevatorNumber(Integer elevatorNumber) {
		this.elevatorNumber = elevatorNumber;
	}

	public void registerObserver(Observer observer) {
		
	}
	
	public void notify(Event event) {
		
	}
	
	/**
	 * 
	 */
	public void run() {
		
		while( true ) {
			
		}		
	}
}
