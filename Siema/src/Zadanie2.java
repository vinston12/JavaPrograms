import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main (String args[]){
        int a = 4;
        int b = -2;
        System.out.println(Math.pow(a, b));
        System.out.println(Math.abs(b));
        System.out.println(Math.sqrt(Math.pow(a, b)));
        BigInteger bigInteger1  = new BigInteger("-421324");
        BigInteger bigInteger2  = new BigInteger("123");
        System.out.println(bigInteger1.pow(1234).toString());
        System.out.println(bigInteger1.abs().toString());
    }
}


