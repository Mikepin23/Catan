package Package1;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tile tile1 = new Tile("Wood", 5);
		
		System.out.println(tile1.getResource());
		System.out.println(tile1.getTileValue());
		System.out.println(tile1.getSegments()[5].getOwner());
	
	}

}
