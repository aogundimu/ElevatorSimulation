package factories;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import elements.Building;
import elements.Elevator;
import elements.ElevatorController;
import elements.Floor;
import elements.FloorElevatorButton;
import exceptions.DuplicateFloorException;
import general.Direction;

public class ElevatorSimulationFactory {

	/**
	 * 
	 * @param elevatorNumber
	 * @param numberOfFloors
	 * @param elevatorCapacity
	 * @return
	 */
	private Elevator createElevator(int elevatorNumber, int numberOfFloors, int elevatorCapacity) {		
		Elevator elevator = new Elevator( 1, Direction.IDLE, elevatorNumber, numberOfFloors, elevatorCapacity);
		return elevator;
	}
	
	/**
	 * 
	 * @param floorNumber
	 * @return
	 */
	private Floor createFloor(int floorNumber) {
		Floor floor = new Floor(floorNumber);
		FloorElevatorButton febDown = new FloorElevatorButton();
		floor.setDownButton(febDown);

		FloorElevatorButton febUp = new FloorElevatorButton();
		floor.setDownButton(febUp);

		return floor;
	}

	/**
	 * 
	 * @param numberOfFloors
	 * @param numberOfElevators
	 * @param elevatorCapacity
	 * @return
	 */
	public Building createBuilding(int numberOfFloors, int numberOfElevators, int elevatorCapacity) {

		Building building = Building.getInstance();

		Floor floor = null;

		for (int i = 1; i <= numberOfFloors; ++i) {
			floor = createFloor(i);
			try {
				building.addFloor(floor);
			} catch (DuplicateFloorException ex) {
				
			}
		}
		
		Map<Integer, Elevator> elevators = new TreeMap<>();
		for( int i = 1; i <= numberOfElevators; ++i) {
			Elevator elevator = createElevator(i, numberOfFloors, elevatorCapacity);
			elevators.put(i, elevator);
		}
		
		building.setElevators(elevators);

		return building;
	}
	
	/**
	 * 
	 * @return
	 */
	public ElevatorController createController() {
		ElevatorController controller = ElevatorController.getInstance();
		return controller;		
	}
}
