package exceptions;

public class DuplicateFloorException extends SimulationException {
	
	public DuplicateFloorException(String message) {
		this.message = message;
	}
}
