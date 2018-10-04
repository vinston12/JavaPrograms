package meta3;

import java.util.Scanner;

public class Srednia
{
public static void main (String[] args) throws java.lang.Exception
{
	Srednia srednia = new Srednia();
Scanner scanner = new Scanner(System.in);
 
int a, i, n;
double w = 0.0;
 
//pobierz liczbe elementów
n = scanner.nextInt();
 
//powtarzaj dla wszystkich elementow
for( i = 0; i < n; i++ )
{
//pobierz wartosc kolejnego elementu
a = scanner.nextInt();
//dodaj wartosc elementu do sumy
w += a;
}
	
//wypisz wynik
System.out.println(w/n);
}
}