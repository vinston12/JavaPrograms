package Coding;

import java.math.BigDecimal;
import java.util.Scanner;

public class TemperatureConverter {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double celcious = 0.0;
	double faren = 0.0;
	String cORf;
	String c = "C";
	String f = "F";
	System.out.println("Welcome in temperature converter!");
	System.out.println("---------------------------------");
	System.out.println("Do you want to count C to F or vice versa? [C/F]");
	cORf = scanner.next();
	if (cORf.equals(c) || cORf.equals("c")) {
		System.out.println("Ok, how many?");
		celcious = scanner.nextDouble();
		faren = (celcious*9/5+32);
		System.out.println("t [°C] " + celcious + " = "+ "t [°F] = "+ faren);
	}
	else if (cORf.equals(f) || cORf.equals("f")) {
			System.out.println("Ok, how many?");
			faren = scanner.nextDouble();
			celcious = ((faren-32)*5/9);
			System.out.println("t [°F] "+ faren + " = "+"t [°C] = " +celcious);
	}

	scanner.close();
}

}
