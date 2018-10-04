package meta1;
import java.util.Scanner;

public class Zadanie3 {
public static void main(String[] args) {
	Scanner liczby = new Scanner(System.in);
	int n,m,k;
	System.out.println("Wpisz 3 liczby dodatnie: ");
	n = liczby.nextInt();
	m = liczby.nextInt();
	k = liczby.nextInt();
	if ((n < 0) || (m < 0) || (k<0) || (n < 0) && (m < 0) && (k < 0))
	{
		System.out.println("Podales przynajmniej jedna zla liczbe");
	}
	for (int i = m+1 ; i < k; i++)
	{
		System.out.println("Wielokrotnosci: "+ n + " * "+ i + " = "+ n*i);
	}
	}
}

