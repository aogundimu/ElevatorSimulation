package notification;

import elements.Person;

/**
 * 
 * @author Yemi
 *
 */
public class ElevatorExitedEvent extends Event {
	
	/**
	 * 
	 */
	private Person passenger;
	
	/**
	 * 
	 * @param passenger
	 */
	public ElevatorExitedEvent(Person passenger) {
		this.passenger = passenger;
	}

	/**
	 * 
	 * @return
	 */
	public Person getPassenger() {
		return passenger;
	}

	/**
	 * 
	 * @param passenger
	 */
	public void setPassenger(Person passenger) {
		this.passenger = passenger;
	}
}
