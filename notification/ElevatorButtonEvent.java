package notification;

import java.util.logging.Logger;

import elements.ElevatorButton;

public class ElevatorButtonEvent extends Event {
	
	private ElevatorButton button;
	
	/**
	 * 
	 */
	private final Logger logger = Logger.getLogger( this.getClass().getName() );
	
	/**
	 * This denotes the pushing of a floor request button while in elevator.
	 * 
	 * @param button
	 */
	public ElevatorButtonEvent(ElevatorButton button) {
		this.button = button;
	}
}
