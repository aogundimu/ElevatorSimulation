package elements;

import notification.Event;

/**
 * The ElevatorController acts as the supervisor of all the operators
 */
public class ElevatorController {
	
	/**
	 * 
	 */
	private static ElevatorController instance = null;
	
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
	public void initialize() {
		
		
	}
	
	/**
	 * 
	 * @param event
	 */
	public void buttonPushed(Event event) {
		
		
	}

}
