package elements;

import notification.Event;

public class ElevatorController {
	
	private static ElevatorController instance = null;
	
	private ElevatorController() {
				
	}
	
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
	
	
	public void initialize() {
		
		
	}
	
	public void buttonPushed(Event event) {
		
		
	}

}
