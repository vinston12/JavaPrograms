package main;
import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kalkulator");
        System.out.println("Lista komend: ");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        System.out.print("Podaj numer: ");
        int wybor = sc.nextInt();
        System.out.print("Podaj pierwsza liczbe: ");
        int liczba1 = sc.nextInt();
        System.out.print("Podaj druga liczbe: ");
        int liczba2 = sc.nextInt();
        switch (wybor) {
            case 1:
                System.out.print(liczba1 + liczba2);
                break;
            case 2:
                System.out.print(liczba1 - liczba2);
                break;
            case 3:
                System.out.print(liczba1 * liczba2);
                break;
            case 4:
                System.out.print(liczba1 / liczba2);
                break;
            default:
                System.out.print("Nie poprawny wybor!");
                break;
        }
    }
}
