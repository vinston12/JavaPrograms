package main;
import java.util.Scanner;
public class Lemoniada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Witamy w Automacie do Lemoniady!");
        int wybor;
        int pass;
        System.out.println("1. Kup kubek lemoniady(0,25$)");
        System.out.println("2. Pomoc");
        System.out.println("3. Tworcy");
        System.out.println("0. Tryb Awaryjny");
        System.out.println("Wybierz z menu po numerkavvch: ");
            wybor = sc.nextInt();
            switch(wybor){
                case 1:
                    System.out.println("bzzzzzt");
                    break;
                    case 2:
                        System.out.println("Lemoniadia najwyzszej jakosci przywieziona prosto z krain lemomiad, zawiera cukier i kwas cytrynowy. Jest zolta.");
                        break;
                        case 3:
                            System.out.println("Czarny i mimek po częsci");
                    break;
                case 0:
                    System.out.println("Podaj haslo dostepu: ");
                    pass = sc.nextInt();
                    if(pass==2137){
                        System.out.println("Haslo poprawne, aktywowanie trybu awaryjnego.");
                    }
                    else{
                        System.out.println("Nieprawidlowe haslo. Blokada systemu.");
                    }
                    break;
                    default:
                        System.out.println("Sprobuj ponownie pozniej...");
                        break;
        }
    }
}
