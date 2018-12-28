package elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import exceptions.InvalidFloorException;

public class Building {

	private static Building instance = null;

	Map<Integer, Floor> floors;

	private Building() {
		floors = new TreeMap<>();
	}

	public static Building getInstance() {

		if (instance == null) {
			
			synchronized (Building.class) {
				if (instance == null) {
					instance = new Building();
				}
			}
		}

		return instance;
	}
	
	public void addFloor(Floor floor) {			
		floors.put(floor.getFloorNumber(), floor);
	}

	public Floor getFloor(int floorNumber) throws InvalidFloorException {
		
		Floor floor = floors.get(floorNumber);
		
		if ( floor == null ) {
			throw new InvalidFloorException("Floor number " + floorNumber + " does not exist");
		}
		
		return floor;
	}
}
