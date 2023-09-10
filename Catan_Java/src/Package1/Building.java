package Package1;

public class Building {
	
	// Attributes
	private int owner;
	private int type;
	
	
	// Parameter Constructor
	public Building(int owner, int type) {
		this.setOwner(owner);
		this.setType(type);
	}


	public int getOwner() {
		return owner;
	}


	public void setOwner(int owner) {
		this.owner = owner;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}

}
