public class zadanie4 {
    public static void pierwszeTrzyLinie(){
        int szer = 16;
        int szer2 = 24;
        int dlg1 = 0;
        while (dlg1 <= 2) {
            for (int a = 0; a <= dlg1; a++) {
                for (int j = szer2; j > 0; j--) {
                    System.out.print(" ");
                }
                szer2 -= 5;
                for (int c = 0; c < szer; c++) {
                    System.out.print("*");
                }
                szer += 10;
                System.out.println(" ");
            }
            dlg1++;
            if (dlg1 == 2) {
                break;
            }
        }
    }
    public static void nastepneCzteryLinie() {
        int dlg1 = 3;
        int szer = 37;
        int szer2 = 12;
        for (int i = 0; i <= 4; i++) {
            for (int j = szer2; j >= 0; j--) {
                System.out.print(" ");
            }
            szer2--;
            for (int c = 0; c <= szer; c++) {
                System.out.print("*");
            }
            szer += 2;
            System.out.println(" ");
        }
    }
    public static void przerwa(){
        int szer = 45;
        int szer2 = 8;
        for (int j = szer2; j >= 0; j--) {
            System.out.print(" ");
        }
        for (int c = 0; c <= szer; c++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    public static void kolejneCzteryLinie(){
        int szer = 45;
        int szer2 = 8;
        for (int i = 0; i <= 4; i++) {
            for (int j = szer2; j >= 0; j--) {
                System.out.print(" ");
            }
            szer2++;
            for (int c = 0; c <= szer; c++) {
                System.out.print("*");
            }
            szer -= 2;
            System.out.println(" ");
        }
    }
    public static void zakonczenieTrzemaLiniami(){
        int szer = 36;
        int szer2 = 14;
        int dlg1 = 0;
        while (dlg1 <= 2) {
            for (int a = 0; a <= dlg1; a++) {
                for (int j = szer2; j > 0; j--) {
                    System.out.print(" ");
                }
                szer2 += 5;
                for (int c = 0; c < szer; c++) {
                    System.out.print("*");
                }
                szer -= 10;
                System.out.println(" ");
            }
            dlg1++;
            if (dlg1 == 2) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int szer = 16;
        int szer2 = 24;
        int dlg1 = 0;
        pierwszeTrzyLinie();

        dlg1 = 3;
        szer = 37;
        szer2 = 12;
        nastepneCzteryLinie();

        szer = 45;
        szer2 = 8;
        przerwa();

        kolejneCzteryLinie();

        szer = 36;
        szer2 = 14;
        dlg1 = 0;
        zakonczenieTrzemaLiniami();

        }
    }

