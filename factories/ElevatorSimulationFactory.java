package factories;

import elements.Building;
import elements.Floor;
import elements.FloorElevatorButton;
import exceptions.DuplicateFloorException;

public class ElevatorSimulationFactory {

	private Floor createFloor(int floorNumber) {
		Floor floor = new Floor(floorNumber);
		FloorElevatorButton febDown = new FloorElevatorButton();
		floor.setDownButton(febDown);

		FloorElevatorButton febUp = new FloorElevatorButton();
		floor.setDownButton(febUp);

		return floor;
	}

	public Building createBuilding(int numberOfFloors, int numberOfElevators) {

		Building building = Building.getInstance();

		Floor floor = null;

		for (int i = 1; i <= numberOfFloors; ++i) {
			floor = createFloor(i);
			try {
				building.addFloor(floor);
			} catch (DuplicateFloorException ex) {
				
			}
		}

		return building;
	}
}
