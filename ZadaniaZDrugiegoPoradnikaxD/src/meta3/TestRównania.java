package meta3;

import java.util.Scanner;







public class TestRównania {
	public static void main(String[] args) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("Wpisz a: ");
		int a = skaner.nextInt();
		System.out.println("Wpisz b: ");
		int b = skaner.nextInt();
		System.out.println("Wpisz c: ");
		int c = skaner.nextInt();
		
		RównanieKwadratowe r = new RównanieKwadratowe(a, b, c);
		System.out.println(r);
		System.out.println();
		System.out.println("Parametr a: "+a);
		System.out.println("Parametr b: "+b);
		System.out.println("Parametr c: "+c);
		System.out.println();
		System.out.println(r.rozwi¹¿());
		
		
	}
	
	
	
	
}
