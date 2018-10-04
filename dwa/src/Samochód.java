import java.util.*;
import java.lang.*;

import java.util.Scanner;

class Samochód {
	Scanner scanner = new Scanner(System.in);
	private int cena;
	private int przebieg;
	private int Id;
	private static int nextId=1;
	private String nazwa;
        
	public String getNazwa()
	{
		return nazwa;
	}
	public int getCena() {
		return cena;
	}
	public int getPrzebieg() {
		return przebieg;
	}
	
	public int getId() {
		return Id;
	}
	public void wpiszMarke() {
		nazwa = scanner.nextLine();
	}
	public void wpiszCene() {
		cena = scanner.nextInt();
	}
	public void wpiszPrzebieg() {
		przebieg = scanner.nextInt();
	}

	
	

}

class Rextester
{  
    public static void main(String args[])
    {
        Samochód samochodzik[] = new Samochód[6];
        for(int i=0; i<samochodzik.length; i++){
            samochodzik[i] = new Samochód();
        }
		for (Samochód i: samochodzik) {
			i.wpiszMarke();
			i.wpiszCene();
			i.wpiszPrzebieg();
		}
        for (Samochód x: samochodzik)
        {	
        System.out.println();
        System.out.println("Samochód numer: " + x.getId());
        System.out.println("Marka samochodu: " + x.getNazwa());
        System.out.println("Cena samochodu: " + x.getCena() + "tyœ");
        System.out.println("Przebieg samochodu: "  + x.getPrzebieg() + "tyœ");
	}
    }
}