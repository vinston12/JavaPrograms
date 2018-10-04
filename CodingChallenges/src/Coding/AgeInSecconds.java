package Coding;

import java.util.Scanner;

public class AgeInSecconds {
	int years = 0;
	public AgeInSecconds(int years) {
		this.years = years;
	}
	public static int YearToSecc(int years) {
		years = (years * 12 *30 *24 *60 *60);
		return years;
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int howManyYears = 0;
	System.out.println("How many years you want to calculate?");
	howManyYears = scanner.nextInt();
	int bla = YearToSecc(howManyYears);
	
	System.out.println(howManyYears + " years = " + bla + "sec");
}
}
