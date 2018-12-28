package elements;

import java.util.List;

import general.Direction;

public class Elevator implements Runnable {
	
	private Integer location;
	
	private Integer destination;
	
	private Direction direction;
	
	private Integer elevatorNumber;
	
	private List<Integer> buttonsPushed;
	
	
	
	public Elevator(Integer location, Integer destination, Direction direction, Integer elevatorNumber,
			List<Integer> buttonsPushed) {
		super();
		this.location = location;
		this.destination = destination;
		this.direction = direction;
		this.elevatorNumber = elevatorNumber;
		this.buttonsPushed = buttonsPushed;
	}



	public void run() {
		
	}
}
