package notification;

public class ReachedFloorEvent extends Event {
	
	/**
	 * 
	 */
	private int floorNumber;
	
	/**
	 * 
	 */
	private int elevatorNumber;
	
	/**
	 * 
	 * @param floorNumber
	 * @param elevatorNumber
	 */
	public ReachedFloorEvent(int floorNumber, int elevatorNumber) {
		this.floorNumber = floorNumber;
		this.elevatorNumber = elevatorNumber;
	}

	/**
	 * 
	 * @return
	 */
	public int getFloorNumber() {
		return floorNumber;
	}

	/**
	 * 
	 * @param floorNumber
	 */
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 * 
	 * @return
	 */
	public int getElevatorNumber() {
		return elevatorNumber;
	}

	/**
	 * 
	 * @param elevatorNumber
	 */
	public void setElevatorNumber(int elevatorNumber) {
		this.elevatorNumber = elevatorNumber;
	}	
}
