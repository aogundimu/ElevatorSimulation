package elements;

import java.util.logging.Logger;

/**
 *  
 * @author Yemi
 *
 */
public class ElevatorOperationRequestButton extends ElevatorButton {
	
	/**
	 * 
	 */
	private final Logger logger = Logger.getLogger( this.getClass().getName() );
	
	/**
	 * 
	 * @param type
	 */
	public ElevatorOperationRequestButton(ElevatorButtonType type) {
		super(type);		
	}
}
