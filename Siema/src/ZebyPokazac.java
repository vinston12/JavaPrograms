import java.util.Scanner;

public class ZebyPokazac {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Wpisz cos");
        String cze = skaner.nextLine();
        System.out.println("jeszcze raz");
        String co = skaner.nextLine();
        System.out.println(cze == co);
        System.out.println(cze.equals(co));
    }
}
