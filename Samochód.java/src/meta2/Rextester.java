package meta2;
import java.util.*;
import java.lang.*;

import java.util.Scanner;

 class Samoch�d {
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
        Samoch�d samochodzik[] = new Samoch�d[2];
        for(int i=0; i<samochodzik.length; i++){
            samochodzik[i] = new Samoch�d();
        }
		for (Samoch�d i: samochodzik) {
			System.out.println("Wpisz mark� samochodu: ");
			i.wpiszMarke();
			System.out.println("Wpisz cen� samochodu (W tysi�cach, po przecinku): ");
			i.wpiszCene();
			System.out.println("Wpisz przebieg samochodu (W tysi�cach, po przecinku): ");
			i.wpiszPrzebieg();
		}
        for (Samoch�d x: samochodzik)
        {	
        System.out.println();
        System.out.println("Numer samochodu: " + x.liczenieNumeruSamochodu());
        System.out.println("Marka samochodu: " + x.getNazwa());
        System.out.println("Cena samochodu: " + x.getCena() + "ty�");
        System.out.println("Przebieg samochodu: "  + x.getPrzebieg() + "ty�");
	}
    }
}