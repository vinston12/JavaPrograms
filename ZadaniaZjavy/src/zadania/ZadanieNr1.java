package zadania;

import java.util.Random;



public class ZadanieNr1 {
	public static void main(String[] args) {
		int[] tab = new int[10];
		int wynik;
		double srednia = 0;
		int n=0;
		int g=0;
		Random generator = new Random();
		for (int i=0;i<tab.length;i++) {
			tab[i]=generator.nextInt(20)-10;
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		wynik = tab[0];
		for (int i = 0; i<tab.length;i++) {
			if (wynik>tab[i]) {
				wynik=tab[i];
			}
		}System.out.println("Najmniejsza liczba to: " + wynik);
	wynik = tab[0];
		for (int i=1;i<tab.length;i++) {
				if (wynik<tab[i]) {
					wynik=tab[i];
				}
			}System.out.println("Najwiêkszy: " + wynik);
			for (int i=0;i<tab.length;i++) {
				 srednia= srednia + tab[i];
			}srednia = srednia / tab.length;
			System.out.println("Œrednia: " + srednia);
				for (int j=0;j<tab.length;j++)
				{
					if (srednia < tab[j])
					{
						n++;
					}
					if (srednia > tab[j]) {
						g++;
					}
				}
				System.out.println("Mniejsze od œredniej: " + g);
				System.out.println("Wiêksze od œredniej: " + n);
				System.out.println("Liczby w odwrotnej kolejnoœci: ");
				for (int i=9;i>=0;i--) {
					System.out.print(tab[i]+ " ");
				}
			}

			
}	


