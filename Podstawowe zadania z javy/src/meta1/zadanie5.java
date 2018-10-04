package meta1;
import java.util.Scanner;
 
class Osoba {
    String name;
    int age;
 
    void speak()
    {
        System.out.println("My name is: " + name + ", " + "I am "+ age);
    }
    void hello()
    {
        System.out.println("Hello there!");
    }
}
 
public class zadanie5
{
    private static Scanner wpisz;
 
    public static void main(String[] args)
    {
        wpisz = new Scanner(System.in);
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba();
        osoba1.hello();
        System.out.println("Wpisz swoje imie: ");
        osoba1.name = wpisz.nextLine();
        System.out.println("Wpisz Ile masz lat: ");
        osoba1.age = wpisz.nextInt();
         
        // przejscie do nowej lini zalatwi sprawe
        wpisz.nextLine();
 
        System.out.println("Wpisz swoje imie: ");
 
        osoba2.name = wpisz.nextLine();
        System.out.println("Wpisz Ile masz lat: ");
        osoba2.age = wpisz.nextInt();
 
        osoba1.speak();
        osoba2.speak();
 
    }
}