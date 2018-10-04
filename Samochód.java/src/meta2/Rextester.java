package meta2;
import java.util.*;
import java.lang.*;

import java.util.Scanner;

 class Samochód {
	Scanner scanner = new Scanner(System.in);
	private double cena;
	private double przebieg;
	private int Id;
	private static int nextId=1;
	private String nazwa;
      
	public String getNazwa()
	{
		return nazwa;
	}
	public double getCena() {
		return cena;
	}
	public  double getPrzebieg() {
		return przebieg;
	}
	
	public int getId() {
		return Id;
	}
	public void wpiszMarke() {
		nazwa = scanner.nextLine();
	}
	public void wpiszCene() {
		cena = scanner.nextDouble();
	}
	public void wpiszPrzebieg() {
		przebieg = scanner.nextDouble();
	}
	public int liczenieNumeruSamochodu() {
		Id = nextId;
		nextId++;
		return Id;
	}


	
	

}

public class Rextester
{  
    public static void main(String args[])
    {
        Samochód samochodzik[] = new Samochód[2];
        for(int i=0; i<samochodzik.length; i++){
            samochodzik[i] = new Samochód();
        }
		for (Samochód i: samochodzik) {
			System.out.println("Wpisz markê samochodu: ");
			i.wpiszMarke();
			System.out.println("Wpisz cenê samochodu (W tysi¹cach, po przecinku): ");
			i.wpiszCene();
			System.out.println("Wpisz przebieg samochodu (W tysi¹cach, po przecinku): ");
			i.wpiszPrzebieg();
		}
        for (Samochód x: samochodzik)
        {	
        System.out.println();
        System.out.println("Numer samochodu: " + x.liczenieNumeruSamochodu());
        System.out.println("Marka samochodu: " + x.getNazwa());
        System.out.println("Cena samochodu: " + x.getCena() + "tyœ");
        System.out.println("Przebieg samochodu: "  + x.getPrzebieg() + "tyœ");
	}
    }
}