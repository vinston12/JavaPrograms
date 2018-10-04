package main;

import java.util.Scanner;

public class Zadania {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int sprawdzenie = 0;
        int ileLiczb = 0;
        int ileLiczbZostałoWpisanych = 0;
        int tab[] = new int[10];
        int kolejnaLiczba = 0;
        int wynik = 1;
        boolean wyjście = false;
            System.out.println("Witaj w naszym kalkulatorze Marta!");
            System.out.println("Co byś chciał zrobić?");
            System.out.println("Wciśnij 1 aby dodać liczby");
            System.out.println("Wciśnij 2 aby odjąć liczby");
            System.out.println("Wciśnij 3 aby pomnożyć liczby");
            System.out.println("Wciśnij 4 aby podzielić liczby");
            sprawdzenie = skaner.nextInt();

                   switch (sprawdzenie) {
                       case 1: {
                           System.out.println("Witaj w dodawaniu liczb, wpisz ile liczb chciałbyś dodać: ");
                           ileLiczb = skaner.nextInt();
                           ileLiczbZostałoWpisanych = ileLiczb;
                           for (int i = 0; i < ileLiczbZostałoWpisanych; i++) {
                               System.out.println("Wpisz " + (i+1) + " liczbę: ");
                               tab[i] = skaner.nextInt();
                               kolejnaLiczba = tab[i];
                               wynik += kolejnaLiczba;
                           }
                           System.out.println("Wynik wynosi: " +wynik);
                           break;
                       }
                       case 2: {
                           System.out.println("Witaj w odejmowaniu liczb, wpisz ile liczb chciałbyś odjąć: ");
                           ileLiczb = skaner.nextInt();
                           ileLiczbZostałoWpisanych = ileLiczb;
                           for (int i = 0; i < ileLiczbZostałoWpisanych; i++) {
                               System.out.println("Wpisz " + (i+1) + " liczbę: ");
                               tab[i] = skaner.nextInt();
                               kolejnaLiczba = tab[i];
                               wynik -= kolejnaLiczba;
                           }
                           System.out.println("Wynik wynosi: " +wynik);
                           break;
                       }
                       case 3: {
                           System.out.println("Witaj w mnożeniu liczb, wpisz ile liczb chciałbyś pomnożyć: ");
                           ileLiczb = skaner.nextInt();
                           ileLiczbZostałoWpisanych = ileLiczb;
                           for (int i = 0; i < ileLiczbZostałoWpisanych; i++) {
                               System.out.println("Wpisz " + (i+1) + " liczbę: ");
                               tab[i] = skaner.nextInt();
                               kolejnaLiczba = tab[i];
                               wynik = (wynik * kolejnaLiczba);
                           }
                           System.out.println("Wynik wynosi: " +wynik);
                           break;
                       }
                       case 4: {
                           System.out.println("Witaj w dzieleniu liczb, wpisz dwie liczby które chciałbyś podzielić: ");
                           kolejnaLiczba = 1;
                           for (int i = 0; i < 2; i++) {
                               System.out.println("Wpisz " + (i + 1) + " liczbę: ");
                               tab[i] = skaner.nextInt();
                               if (i == 0) {
                                   wynik = tab[i];
                               }
                               if (i == 1) {
                                   kolejnaLiczba = tab[i];
                               }
                               wynik = wynik / kolejnaLiczba;
                           }
                           System.out.println("Wynik wynosi: " + wynik);
                           break;
                       }
                       default: {
                           System.out.println("Wpisałeś złą liczbę! Spróbuj jeszcze raz!");
                       }
                   }
               }
           }
