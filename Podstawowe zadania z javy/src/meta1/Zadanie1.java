package meta1;
import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {	
		Scanner wartosc = new Scanner(System.in);
		Scanner napisy = new Scanner(System.in);
		int liczba,exit,b,c,wynik, dzielnik;
		float wynik1;
		String a;
		do
		{
		System.out.println("Witaj w malym kalkulatorze!");
		System.out.println("--------------------------------------------------");
		System.out.println("Jezeli chcesz pomnozyc liczby wpisz 'mnozenie' ");
		System.out.println("Jezeli chcesz podzielic liczby wpisz 'dzielenie' ");
		System.out.println("Jezeli chcesz dodac liczby wpisz 'dodwanie' ");
		System.out.println("Jezeli chcesz odjac liczby wpisz 'odejmowanie' ");
		System.out.println("Jezeli chcesz sprawdzic czy dana liczba dzieli sie przez dany dzielnik wpisz 'dzielnik' ");
		a = napisy.nextLine();
		switch(a)
		{
		case "mnozenie":
		{
			System.out.println("Wpisz pierwsza liczbe: ");
			b = wartosc.nextInt();
			System.out.println("Wpisz druga liczbe: ");
			c = wartosc.nextInt();
			wynik = b*c;
			System.out.println("Wynik mnozenia: " + wynik);
			break;
		}
		case "dzielenie":
		{
			System.out.println("Wpisz pierwsza liczbe: ");
			b = wartosc.nextInt();
			System.out.println("Wpisz druga liczbe: ");
			c = wartosc.nextInt();
			wynik = b*c;
			System.out.println("Wynik mnozenia: " + wynik);
			break;
		}
		case "dodawanie":
		{
			System.out.println("Wpisz pierwsza liczbe: ");
			b = wartosc.nextInt();
			System.out.println("Wpisz druga liczbe: ");
			c = wartosc.nextInt();
			wynik = b*c;
			System.out.println("Wynik mnozenia: " + wynik);
			break;
		}
		case "odejmowanie":
		{
			System.out.println("Wpisz pierwsza liczbe: ");
			b = wartosc.nextInt();
			System.out.println("Wpisz druga liczbe: ");
			c = wartosc.nextInt();
			wynik = b*c;
			System.out.println("Wynik mnozenia: " + wynik);
			break;
		}
		case "dzielnik":
		{
			System.out.println("Wpisz dzielnik liczby: ");
			dzielnik = wartosc.nextInt();
			System.out.println("Wpisz druga liczbe: ");
			liczba = wartosc.nextInt();
			if (liczba%dzielnik == 0)
			{
				System.out.println("Liczba " + liczba + " jest podzielna przez " + dzielnik);
			}else
				System.out.println("Liczba " + liczba + " nie jest podzielna przez " + dzielnik);
			break;
		}
		}
		System.out.println("Jezeli chcesz wyjsc z programu wpisz '1', jezli chcesz kontynuowac wpisz '2'");
		exit = wartosc.nextInt();
		}while (exit != 1);
		

	}
}
