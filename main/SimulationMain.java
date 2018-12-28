package main;

import java.util.Scanner;

public class SimulationMain {

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
				
		sc.close();
		
		// Set things up and get the simulation going.
	}
}
