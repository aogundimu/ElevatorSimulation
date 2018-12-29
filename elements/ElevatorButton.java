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
	 * 
	 */
	public ElevatorButton() {
		observers = new ArrayList<>();
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
		
	}
}
