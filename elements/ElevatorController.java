package elements;

import java.util.logging.Logger;

import notification.Event;
import notification.Observable;
import notification.Observer;

/**
 * The ElevatorController acts as the supervisor of all the operators
 */
public class ElevatorController implements Observer, Observable {
	
	/**
	 * 
	 */
	private static ElevatorController instance = null;
	
	/**
	 * 
	 */
	private final Logger logger = Logger.getLogger( this.getClass().getName() );
	
	/**
	 * 
	 */
	private ElevatorController() {
				
	}
	
	/**
	 * 
	 * @return
	 */
	public static ElevatorController getInstance() {
		
		if ( instance == null ) {
			
			synchronized( ElevatorController.class ) {
				
				if (instance == null) {
					instance = new ElevatorController();
				}								
			}
		}
		
		return instance;
	}
	
	
	/**
	 * 
	 */
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 */
	@Override
	public void notify(Event event) {
		// TODO Auto-generated method stub
		
	}

}
