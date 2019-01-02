package main;

import java.io.Console;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import elements.Building;
import elements.Elevator;
import elements.ElevatorButton;
import elements.ElevatorController;
import elements.Floor;
import exceptions.InvalidFloorException;
import factories.ElevatorSimulationFactory;

/**
 * 
 * @author Yemi
 *
 */
public class SimulationMain {
	
	/**
	 * 
	 */
	private Building building; 
	
	/**
	 * 
	 */
	private ElevatorController controller;

	
	/**
	 * 
	 */
	public SimulationMain() {
		
	}
	
	/**
	 * This method gets input 
	 */
	private void runSimulation( ) {
		
		Console console = System.console();
		
		console.printf("%s", "For each person needing elevator service, enter the following:");
		console.printf("%s", "Person name:");
		console.printf("%s", "For each of the destination enter the following:");
		console.printf("%s", "floor number, time spent on floor");
		console.printf("%s", "After all the destination is entered then ");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			console.printf("%s", "Enter passenger's name");
			
		}		
	}
	
	/**
	 * 
	 */
	private void setupNotifications( ) {
		
		// The Elevators are all subscribed to the ElevatorController		
		Map<Integer, Elevator> elevators = building.getElevators();		
		Set<Integer> keySet = elevators.keySet();
		for(Integer key : keySet) {
			Elevator elevator = elevators.get(key);
			controller.registerObserver( elevator );
			
			// The Elevators are all subscribed to their buttons
			List<ElevatorButton> buttons = elevator.getElevatorButtons();
			for(ElevatorButton button : buttons) {
				button.registerObserver(elevator);
			}
			
			// The controller is subscribed to the FloorElevatorButtons
			Map<Integer,Floor> floors = building.getFloors();
			Set<Integer> floorKeySet = floors.keySet();
			for(Integer floorKey : floorKeySet) {
				try {
					Floor floor = building.getFloor(floorKey);
					floor.getUpButton().registerObserver(controller);
					floor.getDownButton().registerObserver(controller);					
				} catch(InvalidFloorException e) {
					
				}
			}
		}				
	}
	
	/**
	 * 
	 */
	private void startElevatorThreads() {
		
		Map<Integer, Elevator> elevators = building.getElevators();		
		Set<Integer> keySet = elevators.keySet();
		for(Integer key : keySet) {
			Elevator elevator = elevators.get(key);
			Thread thread = new Thread(elevator);
			thread.start();
		}
	}
	
	/**
	 * 
	 * @param numberOfFloors
	 * @param numberOfElevators
	 */
	private void initialize(int numberOfFloors, int numberOfElevators, int elevatorCapacity) {		
		ElevatorSimulationFactory factory = new ElevatorSimulationFactory();		
		building = factory.createBuilding(numberOfFloors, numberOfElevators, elevatorCapacity);		
		controller = factory.createController();
		setupNotifications();
		startElevatorThreads();
	}
	
	/**
	 * We need to determine what the input values will be from here. Possible
	 * entries are shown below 1. How tall is the building? 2. How many elevators
	 * Possible arguments are floors, number of elevators,
	 * 
	 * @param args
	 */
	public static void main(String... args) {
		
		int numberOfFloors = 0;
		int numberOfElevators = 0;
		int elevatorCapacity = 0;

		System.out.println("Welcome to the Elevator Simulation APP!!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {			
			System.out.println("Enter the number of floors - must be an integer \n");
			if (sc.hasNextInt() ) {
				numberOfFloors = sc.nextInt();
				break;
			} else {
				System.out.println("Invalid entry!!!");
			}
		}
		
		while(true) {
			System.out.println("Enter the number of elevators - must be an integer \n");
			System.out.println();
			if (sc.hasNextInt() ) {
				numberOfElevators = sc.nextInt();
				break;
			} else {
				System.out.println("Invalid entry!!!");
			}
		}			
		
		while(true) {
			System.out.println("Enter the elevator capacity - must be an integer \n");
			System.out.println();
			if (sc.hasNextInt() ) {
				elevatorCapacity = sc.nextInt();
				break;
			} else {
				System.out.println("Invalid entry!!!");
			}
		}
		
		sc.close();
		
		SimulationMain simulationMain = new SimulationMain();
		
		simulationMain.initialize(numberOfFloors, numberOfElevators, elevatorCapacity);
		
		simulationMain.runSimulation();
	}
}
