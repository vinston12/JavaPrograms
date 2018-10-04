package meta1;
import java.util.Scanner;

public class Zadanie2 
	{
	public static void main(String[] args) 
		{
			Scanner liczby = new Scanner(System.in);
			System.out.println("Wpisz dwie dodatnie liczby: ");
			int n,m,wielokrot;
			n = liczby.nextInt();
			m = liczby.nextInt();
			if ((n < 0) || (m < 0) || (n < 0) && (m < 0))
			{
				System.out.println("Podales przynajmniej jedna zla liczbe");
			}
			for (int i=0;i<=m;i++)
			{
				
				System.out.println("Wielokrotnosci: " + n +" * "+ i +" = " +  n*i);
				
			}
			
		}
}