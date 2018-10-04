package main;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marek Jadczak: C++ Wars");
        System.out.println("1. Start");
        System.out.println("2. Opcje");
        System.out.println("3. Wczytaj");
        System.out.println("4. Wyjscie");
        int wybor;
        int wybor1;
        System.out.println("Wybierz z menu: ");
        wybor = sc.nextInt();
        switch (wybor) {
            case 1:
                System.out.println("1. Nowa Gra");
                wybor1 = sc.nextInt();
                switch (wybor1) {
                    case 1:
                        System.out.println("LOADING...");
                        System.out.println("Marex zabiera ci efajke");
                        System.out.println("    GAME OVER!  ");
                        break;
                }
                case 2:
                    System.out.println("1. Najwyzsza grafika");
                    System.out.println("2. Srednia grafika");
                    System.out.println("3. Potato komputer");
                    wybor1=sc.nextInt();
                    switch (wybor1){
                        case 1:
                            System.out.println("Wybrales Najwyzsza grafika");
                            break;
                        case 2:
                            System.out.println("Wybrales Srednia grafika");
                            break;
                        case 3:
                            System.out.println("Wybrales gowno komputer");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Wybrales Srednia grafika");
                    break;
                case 4:
                    System.out.println("Elo mordo, mordziaty, do nastepnego.");
                    break;
            }
        }
    }



