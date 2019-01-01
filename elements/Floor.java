package elements;

import java.util.List;
import java.util.logging.Logger;

import notification.Event;
import notification.Observable;
import notification.Observer;

/**
 * 
 * @author Yemi
 *
 */
public class Floor implements Observer, Observable {
	
	/**
	 * 
	 */
	private List<Elevator> elevatorsOnFloor;
	
	/**
	 * 
	 */
	private int floorNumber;
	
	/**
	 * 
	 */
	private FloorElevatorButton upButton;
	
	/**
	 * 
	 */
	private FloorElevatorButton downButton;	
	
	/**
	 * 
	 */
	private final Logger logger = Logger.getLogger( this.getClass().getName() );
	
	/**
	 * 
	 * @param floorNumber
	 */
	public Floor(int floorNumber) {
		super();
		this.floorNumber = floorNumber;
	}

	/**
	 * 
	 * @return
	 */
	public List<Elevator> getElevatorsOnFloor() {
		return elevatorsOnFloor;
	}

	/**
	 * 
	 * @param elevatorsOnFloor
	 */
	public void setElevatorsOnFloor(List<Elevator> elevatorsOnFloor) {
		this.elevatorsOnFloor = elevatorsOnFloor;
	}

	/**
	 * 
	 * @return
	 */
	public int getFloorNumber() {
		return floorNumber;
	}

	/**
	 * 
	 * @param floorNumber
	 */
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 * 
	 * @return
	 */
	public FloorElevatorButton getUpButton() {
		return upButton;
	}

	/**
	 * 
	 * @param upButton
	 */
	public void setUpButton(FloorElevatorButton upButton) {
		this.upButton = upButton;
	}

	/**
	 * 
	 * @return
	 */
	public FloorElevatorButton getDownButton() {
		return downButton;
	}

	/**
	 * 
	 * @param downButton
	 */
	public void setDownButton(FloorElevatorButton downButton) {
		this.downButton = downButton;
	}	
	
	/**
	 * 
	 */
	public boolean equals(Object obj) {		
		if ( obj instanceof Floor) {
			if ( obj == this ) {
				return true;
			} else if  ( ((Floor) obj).getFloorNumber() == this.floorNumber ) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}		
	}
	
	/**
	 * 
	 */
	@Override
	public void notify(Event event) {
		
	}
	
	/**
	 * 
	 */
	@Override
	public void registerObserver(Observer observer) {
		
	}
}
