package elements;

import java.util.ArrayList;
import java.util.List;

import notification.Observable;
import notification.Observer;

/**
 * 
 * @author Yemi
 *
 */
public class ElevatorButton implements Observable {
	
	/**
	 * 
	 */
	private List<Observer> observers;
	
	/**
	 * 
	 */
	private ElevatorButtonType type;
	
	/**
	 * This is the number printed on the button indicating the floor being selected.
	 */
	private Integer floorNumber;
	
	/**
	 * 
	 */
	public ElevatorButton(ElevatorButtonType type, Integer floorNumber) {
		observers = new ArrayList<>();
		this.type = type;
		this.floorNumber = floorNumber;
	}
	
	/**
	 * 
	 */
	public void registerObserver(Observer observer) { 
		observers.add(observer);		
	}
	
	/**
	 * The Observers notified have to be removed from the list?
	 */
	public void buttonPushed() {
		
		if( this.type == ElevatorButtonType.FLOOR_SELECTION ) {
			
		}		
	}
}
