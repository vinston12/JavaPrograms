package main;

import java.util.Scanner;

public class xd {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        String imie = "";
        for (int i = 0; i<999;i++) {
            System.out.println("Wpisz swoje imie: ");
            imie = skaner.next();
            if (imie.equals("Marta") || (imie.equals("marta"))) {
                System.out.println(imie.toLowerCase());
            } else {
                System.out.println("Cześć " + imie);
            }
        }
    }
}
