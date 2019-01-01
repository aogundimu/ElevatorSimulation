package elements;

import java.util.logging.Logger;

public class ElevatorFloorRequestButton extends ElevatorButton {
	
	/**
	 * This is the number printed on the button indicating the floor being selected.
	 */
	private Integer floorNumber;
	
	/**
	 * 
	 */
	private final Logger logger = Logger.getLogger( this.getClass().getName() );
	
	
	public ElevatorFloorRequestButton(int floorNumber) {
		super(ElevatorButtonType.FLOOR_SELECTION);
		this.floorNumber = floorNumber;
	}
}
