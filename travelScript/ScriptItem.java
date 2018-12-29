package travelScript;

public class ScriptItem {
	
	private int floor;
	
	private long timeSpent;

	public ScriptItem(int floor, long timeSpent) {
		super();
		this.floor = floor;
		this.timeSpent = timeSpent;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public long getTimeSpent() {
		return timeSpent;
	}

	public void setTimeSpent(long timeSpent) {
		this.timeSpent = timeSpent;
	}
}
