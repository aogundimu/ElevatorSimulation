package general;

/**
 * 
 * @author Yemi
 *
 */
public class SimulationTime {
	
	/**
	 * 
	 */
	private long currentTime;
	
	/**
	 * 
	 */
	private static SimulationTime instance = null;
	
	/**
	 * 
	 */
	private SimulationTime() {
		currentTime = System.currentTimeMillis();
	}
	
	/**
	 * 
	 * @return
	 */
	private static SimulationTime getInstance() {
				
		if ( instance == null ) {
			
			synchronized( SimulationTime.class ) {
				
				if ( instance == null) {
					instance = new SimulationTime();
				}
			}			
		}
		
		return instance;
	}
}
