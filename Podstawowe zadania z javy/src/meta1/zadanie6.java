package meta1;
import java.util.Scanner;

class dziennik
{
	String imie;
	int wiek;
	int obecnosc;
	int spr,krtk,odp;
	
	void lista()
	{
		  System.out.println("Imie: "+imie+ "\t" + "Wiek: "+wiek);
	}
	void oceny() 
	{
		System.out.println("Ocena ze sprawdzianu: " + spr + " Ocena z kartkowki: "+krtk+" Ocena z odpowiedzi: "+odp);
	}
	void frekwencja()
	{
		System.out.println(imie + ", ilosc godzin opuszczonych: " + obecnosc);
	}

}
public class zadanie6
{
	public static void main(String[] args)
		{
			Scanner wpisz = new Scanner(System.in);
			String dzialanie;
			int wyjscie;
			  
			    dziennik osoba1 = new dziennik();
				dziennik osoba2 = new dziennik();
				dziennik osoba3 = new dziennik();
			
			osoba1.imie="Jan Kowalski";
			osoba1.wiek=15;
			osoba1.obecnosc= 24;
			osoba1.spr=2;
			osoba1.krtk=3;
			osoba1.odp=3;

			
			osoba2.imie="Kacper Kowalski";
			osoba2.wiek=16;
			osoba2.obecnosc= 54;
			osoba2.spr=1;
			osoba2.krtk=4;
			osoba2.odp=3;
			
			osoba3.imie="Krystian Kowalski";
			osoba3.wiek=15;
			osoba3.obecnosc= 11;
			osoba3.spr=5;
			osoba3.krtk=3;
			osoba3.odp=1;
			
			
			System.out.println("Witamy w dzienniku elektroniczym dla nauczycieli!");
			System.out.println("-------------------------------------------------");
			System.out.println("Co chialbys zrobic?");
			System.out.println("Wpisz 'uczniowie' aby przejsc do listy uczniow oraz ich danych");
			System.out.println("Wpisz 'oceny' aby przejsc do ocen uczniow");
			System.out.println("Wpisz 'frekwencja' aby przejsc do frekwencji");
			
			dzialanie = wpisz.nextLine();
			
		switch(dzialanie)
		{
		case "uczniowie":
		{
				osoba1.lista();
				osoba2.lista();
				osoba3.lista();
				
		}
		case "oceny":
		{
			osoba1.oceny();
			osoba2.oceny();
			osoba3.oceny();
		}
		case "frekwencja":
		{
			osoba1.frekwencja();
			osoba2.frekwencja();
			osoba3.frekwencja();


		}
	}
	
			

}
			
}
