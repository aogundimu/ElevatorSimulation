package notification;

import java.util.logging.Logger;

import elements.Person;

public class ElevatorEnteredEvent extends Event {
	
	/**
	 * 
	 */
	private Person passenger;
	
	/**
	 * 
	 */
	private final Logger logger = Logger.getLogger( this.getClass().getName() );
	
	/**
	 * 
	 * @param passenger
	 */
	public ElevatorEnteredEvent(Person passenger) {
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
