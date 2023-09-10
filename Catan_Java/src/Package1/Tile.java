package Package1;

public class Tile {

	// Attributes
	private String resource;
	private int tileValue;
	private Road[] segments = new Road[6];
	private Building[] nodes = new Building[6];

	// Parameter Constructor
	public Tile(String resource, int tileValue) {
		this.setResource(resource);
		this.setTileValue(tileValue);
		for (int i = 0; i < 6; i++) {
			segments[i] = new Road(0);
			nodes[i] = new Building(0, 0);
		}
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public int getTileValue() {
		return tileValue;
	}

	public void setTileValue(int tileValue) {
		this.tileValue = tileValue;
	}

	public Road[] getSegments() {
		return segments;
	}

	public void setSegments(Road[] segments) {
		this.segments = segments;
	}

	public Building[] getNodes() {
		return nodes;
	}

	public void setNodes(Building[] nodes) {
		this.nodes = nodes;
	}

}
