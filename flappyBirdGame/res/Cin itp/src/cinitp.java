import java.util.Scanner;

public class cinitp {
	public static void main(String[] args)
	{
		// Create scanner object
		Scanner wejscie = new Scanner(System.in);
		// Output the prompt
		System.out.println("Wpisz jak¹œ liczbê typu float: ");
		// Wait for the user to enter a line of text
		double liczba= wejscie.nextDouble();
		// Tell them what they entered.
		System.out.println("Wpisales: "+ liczba);
	}
}
Scanner liczba1 = new Scanner(System.in);

System.out.println("Enter a number: ");

int liczba = scanner.nextInt();

while (liczba != 5 )
{
	System.out.println("Enter a number: ");
	liczba = scanner.nextInt();
}
int liczba;
do {
	System.out.println("Enter a number: ");
	liczba = liczba1.nextInt();
}while(liczba != 5);
System.out.println("Jest 5!!");
}