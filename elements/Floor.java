package elements;

import java.util.List;

public class Floor {
	
	private List<Elevator> elevatorsOnFloor;
	
	private int floorNumber;
	
	private FloorElevatorButton upButton;
	
	private FloorElevatorButton downButton;	
	
	public List<Elevator> getElevatorsOnFloor() {
		return elevatorsOnFloor;
	}

	public void setElevatorsOnFloor(List<Elevator> elevatorsOnFloor) {
		this.elevatorsOnFloor = elevatorsOnFloor;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public FloorElevatorButton getUpButton() {
		return upButton;
	}

	public void setUpButton(FloorElevatorButton upButton) {
		this.upButton = upButton;
	}

	public FloorElevatorButton getDownButton() {
		return downButton;
	}

	public void setDownButton(FloorElevatorButton downButton) {
		this.downButton = downButton;
	}	
	
}
