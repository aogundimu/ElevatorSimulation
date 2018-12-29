package factories;

import elements.Building;
import elements.Floor;

public class ElevatorSimulationFactory {
	
	private Floor createFloor(int floorNumber) {
		 return null;
	}
	
	public Building createBuilding(int numberOfFloors, int numberOfElevators) {
		
		Building building = Building.getInstance();
		
		return building;
	}

}
