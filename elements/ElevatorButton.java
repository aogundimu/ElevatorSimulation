package elements;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import notification.Observable;
import notification.Observer;

/**
 * 
 * @author Yemi
 *
 */
public abstract class ElevatorButton implements Observable {
	
	/**
	 * 
	 */
	protected List<Observer> observers;
	
	/**
	 * 
	 */
	private ElevatorButtonType type;
	
	/**
	 * 
	 */
	private final Logger logger = Logger.getLogger( this.getClass().getName() );
	
	/**
	 * 
	 */
	public ElevatorButton(ElevatorButtonType type) {
		observers = new ArrayList<>();
		this.type = type;		
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
