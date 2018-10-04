package meta1;





class Dominikchuja{
	private int x;
	public Dominikchuja(int x) {
		this.x = x;
	}
	public int x() {
		return x;
	}
}
class Furniture1 extends Dominikchuja{
	//klasa meble
	private String room;
	private double size;
	private String material;
	private String j;
	public Furniture1(String room, double size,String j, String material, int x) {
		super(x);
		this.room = room;
		this.size = size;
		this.material = material;
		this.j = j;
		if (j.equals("m")) this.size=size/100;
	}
	public String getRoom() {
		return this.room;
	}
	public double getSize() {
		return this.size;
	}
	public String getMaterial() {
		return this.material;
	}
	public String getJ() {
		return this.j;
	}
	
}

public class Home1 {
public static void main(String[] args) {
	
	Furniture1 commode = new Furniture1("Bedroom", 185,"m", "leather",10);
	Furniture1 myOwnBed = new Furniture1("My Room", 245,"cm", "Wood and foam",9);
	Furniture1 myOwnDesk = new Furniture1("My Room",65, "m", "Wood",4);
	System.out.println(commode.x());
	System.out.println("Furniture: Commode,   \n In room: " + commode.getRoom() + "\n Size: " + commode.getSize() + commode.getJ() + "\n Material: " + commode.getMaterial());
	System.out.println();
	System.out.println("Furniture: My own Bed,  \n In room: " + myOwnBed.getRoom() 	 + "\n Size: " + myOwnBed.getSize() + myOwnBed.getJ() +"\n Material: " + myOwnBed.getMaterial());
	System.out.println();
	System.out.println("Furniture: My own Desk,   \n In room: " + myOwnDesk.getRoom() 	 + "\n Size: " + myOwnDesk.getSize() + myOwnDesk.getJ() +"\n Material: " + myOwnDesk.getMaterial());
	
}
}