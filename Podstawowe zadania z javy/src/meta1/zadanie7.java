package meta1;
import java.util.Scanner;

class data {
	int dni;
	int miesiac;
	int rok;

}
public class zadanie7 {
public static void main(String[] args) {
	Scanner wpisz = new Scanner(System.in);
	data dni = new data();
	data miesiac = new data();
	data rok = new data();
	 
	for (int i = 0; i<10; i++)
	{
		System.out.println("Wpisz dzien");
		dni.dni = wpisz.nextInt();
		if (dni.dni > 31 )
		{
			System.out.println("Za duza liczba!");
			break;
		}
		System.out.println("Wpisz miesiac");
		miesiac.miesiac = wpisz.nextInt();
		if (miesiac.miesiac > 12)
		{
			System.out.println("Za duza liczba!");
			break;
		}
		System.out.println("Wpisz rok");
		rok.rok=wpisz.nextInt();
		System.out.println("Data: " + dni.dni + "-" + miesiac.miesiac + "-" + rok.rok);
		
	}
	
	
}
}
