package elements;

import java.util.List;
import java.util.logging.Logger;

import notification.Observable;
import notification.Observer;

/**
 * 
 * @author Yemi
 *
 */
public class FloorElevatorButton implements Observable {
	
	/**
	 * 
	 */
	private List<Observer> observers;
	
	/**
	 * 
	 */
	private final Logger logger = Logger.getLogger( this.getClass().getName() );
	
	/**
	 * 
	 */
	public void pushButton() {
		
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}
}
