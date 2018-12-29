package elements;

import travelScript.TravelScript;

/**
 * 
 * @author Yemi
 *
 */
public class Person implements Runnable {
	
	/**
	 * 
	 */
	private int location;
	
	
	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private TravelScript travelScript;
	
	/**
	 * 
	 * @return
	 */
	public TravelScript getTravelScript() {
		return travelScript;
	}

	/**
	 * 
	 * @param travelScript
	 */
	public void setTravelScript(TravelScript travelScript) {
		this.travelScript = travelScript;
	}

	/**
	 * 
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * 
	 * @param location
	 */
	public void setLocation(int location) {
		this.location = location;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * 
	 * @param name
	 * @param location
	 * @param travelScript
	 */
	Person(String name, int location, TravelScript travelScript) {
		this.name = name;
		this.location = location;
		this.travelScript = travelScript;
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		
		if ( obj instanceof Person ) {			
			if ( obj == this ) {
				return true;
			} else if ( ((Person)obj).getName().equals(this.getName()) ) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 
	 */
	public void run() {
		
		while( true ) {
			
		}		
	}
}
