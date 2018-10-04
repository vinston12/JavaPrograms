public class Zadanie7 {
    public static void main(String[] args) {
        int szer = 0;
        int szer2 = 6;
        for (int i = 0; i <= 6; i++) {
            for (int j = szer2; j > 0; j--) {
                System.out.print(" ");
            }
            szer2--;
            for (int k = 0; k < szer; k++) {
                System.out.print(" *");
            }
            szer++;
            System.out.println(" ");
        }
        int x = 5;
        int y = 1;
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k < y; k++) {
                System.out.print(" ");
            }
            y++;
            for (int j = 0; j < x; j++) {
                System.out.print(" *");
            }
            x--;
            System.out.println(" ");
        }
    }
}
