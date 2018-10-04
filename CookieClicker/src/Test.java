import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        String[] pierwszaCyfra = new String[10];
        String[] drugaCyfra = new String[10];
        int x = 0;
        int y = 1;
        for (int i=0;i<pierwszaCyfra.length;i++) {
            if (x == 0) {
                System.out.println("Wpisz cyfry które chcesz porównać");
                pierwszaCyfra[i] = skaner.next();
            }
                System.out.println(pierwszaCyfra[i].substring(x, y));
                x += 2;
                y += 2;
        }
        //String pierwszyZnak = pierwszaCyfra.substring(0,1);
        //System.out.println(pierwszyZnak);

       // String result = x < 1 ? "a" : "b";
       // System.out.println(result);

    }
}
