package main;
import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba1;
        int liczba2;
        double promien;
        System.out.println("Kalkulator");
        System.out.println("Lista komend: ");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Pierwiastkowanie");
        System.out.println("6. Pole kwadratu");
        System.out.println("7. Pole kola");
        System.out.print("Podaj numer: ");
        int wybor = sc.nextInt();

        switch (wybor) {
            case 1:
                System.out.print("Podaj pierwsza liczbe: ");
                liczba1 = sc.nextInt();
                System.out.print("Podaj druga liczbe: ");
                liczba2 = sc.nextInt();
                System.out.print(liczba1 + liczba2);
                break;
            case 2:
                System.out.print("Podaj pierwsza liczbe: ");
                liczba1 = sc.nextInt();
                System.out.print("Podaj druga liczbe: ");
                 liczba2 = sc.nextInt();
                System.out.print(liczba1 - liczba2);
                break;
            case 3:
                System.out.print("Podaj pierwsza liczbe: ");
                 liczba1 = sc.nextInt();
                System.out.print("Podaj druga liczbe: ");
                 liczba2 = sc.nextInt();
                System.out.print(liczba1 * liczba2);
                break;
            case 4:
                System.out.print("Podaj pierwsza liczbe: ");
                liczba1 = sc.nextInt();
                System.out.print("Podaj druga liczbe: ");
                liczba2 = sc.nextInt();
                System.out.print(liczba1 / liczba2);
                break;
            case 5:
                System.out.print("Podaj liczbe: ");
                liczba1 = sc.nextInt();
                System.out.print("Pierwiastek z " + liczba1 + " to "+ Math.sqrt(liczba1));
                break;
            case 6:
                System.out.print("Podaj liczbe: ");
                liczba1 = sc.nextInt();
                System.out.print("Pole kwadratu liczby " + liczba1 + " to " + Math.pow(liczba1,2));
                break;
            case 7:
                System.out.print("Podaj promien: ");
                promien = sc.nextInt();
                System.out.print("Pole kola o promieniu " + promien + " wynosi " + Math.PI*Math.pow(promien,2));
                break;
            default:
                System.out.print("Nie poprawny wybor!");
                break;
        }
    }
}
