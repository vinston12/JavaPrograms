package meta3;

public class Przekazywanie {
	
	public static void �rednia(int... var) {
		double s = 0;
		for (int x : var) {
			s=s+x;
		}
		s=s/var.length;
		
		System.out.println("�rednia: " + s);
		System.out.println("�rednia zaokr�glona: " + (int)s);
	}
	
public static void main(String[] args) {
	�rednia(2,3,4,5,6);
}
}