package travelScript;

import java.util.List;

/**
 * The TravelScript is a container for all the visitation plans of a Person. The
 * data structure used is a LinkedList which ensures the order of the visitation 
 * order specified.
 * 
 * @author Yemi
 *
 */
public class TravelScript {
	
	private String owner = null;
	
	private List<ScriptItem> scriptItems = null;

	public TravelScript(String owner, List<ScriptItem> scriptItems) {
		super();
		this.owner = owner;
		this.scriptItems = scriptItems;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<ScriptItem> getScriptItems() {
		return scriptItems;
	}

	public void setScriptItems(List<ScriptItem> scriptItems) {
		this.scriptItems = scriptItems;
	}	

}
