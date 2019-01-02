package notification;

public class ElevatorDoorOpenedEvent extends Event {
	
	private int floorNumber;
	
	private int elevatorNumber;
	
	public ElevatorDoorOpenedEvent(int floorNumber, int elevatorNumber) {
		super();
		this.floorNumber = floorNumber;
		this.elevatorNumber = elevatorNumber;
	}

	
	public int getFloorNumber() {
		return floorNumber;
	}


	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}


	public int getElevatorNumber() {
		return elevatorNumber;
	}


	public void setElevatorNumber(int elevatorNumber) {
		this.elevatorNumber = elevatorNumber;
	}
}
