package elements;

import java.util.Map;
import java.util.TreeMap;

import exceptions.DuplicateFloorException;
import exceptions.InvalidFloorException;

/**
 * 
 * @author Yemi
 *
 */
public class Building {

	/**
	 * 
	 */
	private static Building instance = null;

	/**
	 * 
	 */
	Map<Integer, Floor> floors;
	
	/**
	 * 
	 */
	Map<Integer, Elevator> elevators;

	/**
	 * 
	 */
	private Building() {
		floors = new TreeMap<>();
		elevators = new TreeMap<>();
	}

	

	/**
	 * 
	 * @return
	 */
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
	
	public Map<Integer, Floor> getFloors() {
		return floors;
	}

	public void setFloors(Map<Integer, Floor> floors) {
		this.floors = floors;
	}

	public Map<Integer, Elevator> getElevators() {
		return elevators;
	}

	public void setElevators(Map<Integer, Elevator> elevators) {
		this.elevators = elevators;
	}
	
	/**
	 * 
	 * @param floor
	 */
	public void addFloor(Floor floor) throws DuplicateFloorException {	
		
		Floor fl = floors.get(floor.getFloorNumber());
		
		if ( fl != null ) {
			throw new DuplicateFloorException( "Floor " + floor.getFloorNumber() +  " already exists");
		}
		
		floors.put(floor.getFloorNumber(), floor);
	}

	/**
	 * 
	 * @param floorNumber
	 * @return
	 * @throws InvalidFloorException
	 */
	public Floor getFloor(int floorNumber) throws InvalidFloorException {
		
		Floor floor = floors.get(floorNumber);
		
		if ( floor == null ) {
			throw new InvalidFloorException("Floor number " + floorNumber + " does not exist");
		}
		
		return floor;
	}
}
