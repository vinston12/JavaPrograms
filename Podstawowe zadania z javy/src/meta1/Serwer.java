package meta1;
import java.util.Scanner;

class Punkt
{
	Scanner scanner = new Scanner(System.in);
	int pktX;
	int pktY;
	String wybierz;
	 void zwiekszanieX()
	{
		
			pktX++;
		}
	 void zwiekszanieY()
		{
			
				pktY++;
			}
		
	void zmienianieX(int wrt)
	{
			pktX = pktX+ wrt;
		}
	void zmienianieY(int wrt)
	{
			pktY = pktY+ wrt;
		}


	int zwX()
	{
		return pktX;
	}
	int zwY()
	{
		return pktY;
	}
	void wyswietl()
	{
		System.out.println("Wartosc pktX = "+ pktX);
		System.out.println("Wartosc pktY = "+ pktY);
	}
	
}
public class Serwer {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Wpisz wspolrzedne ");
	System.out.println("Pierwsza: ");
	Punkt punkt = new Punkt();
	int wrt;
	punkt.pktX =scanner.nextInt();
	System.out.println("Druga: ");
	punkt.pktY =scanner.nextInt();
	punkt.zwiekszanieX();
	punkt.zwiekszanieY();
	punkt.wyswietl();
	System.out.println("Wpisz wartosc");
	wrt = scanner.nextInt();
	punkt.zmienianieX(wrt);
	punkt.zmienianieY(wrt);
	punkt.zwX();
	punkt.zwY();
	punkt.wyswietl();
	scanner.close();
	
	
}

}
