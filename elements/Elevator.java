package elements;

import java.util.LinkedList;
import java.util.List;

import general.Direction;
import notification.Event;
import notification.Observable;
import notification.Observer;

public class Elevator implements Runnable, Observer, Observable {
	
	/**
	 * 
	 */
	private Integer location;
	
	/**
	 * 
	 */
	private List<Integer> stops = new LinkedList<>();
	
	/**
	 * 
	 */
	private Direction direction;
	
	/**
	 * 
	 */
	private Integer elevatorNumber;
	
	/**
	 * The buttons pushed in the elevator
	 */
	private List<Integer> buttonsPushed;	
	

	
	public void registerObserver(Observer observer) {
		
	}
	
	public void notify(Event event) {
		
	}
	
	/**
	 * 
	 */
	public void run() {
		
	}
}
