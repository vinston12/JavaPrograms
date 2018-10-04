package meta3;

public class Przekazywanie {
	
	public static void œrednia(int... var) {
		double s = 0;
		for (int x : var) {
			s=s+x;
		}
		s=s/var.length;
		
		System.out.println("Œrednia: " + s);
		System.out.println("Œrednia zaokr¹glona: " + (int)s);
	}
	
public static void main(String[] args) {
	œrednia(2,3,4,5,6);
}
}