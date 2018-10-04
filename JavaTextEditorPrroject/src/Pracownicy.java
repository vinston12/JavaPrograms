public class Pracownicy extends GraLosowa{


    public Pracownicy(String n, int w) {
        super(n,w);
    }

    public static void main(String[] args) {
        Pracownicy JanBierut = new Pracownicy("Jan Bierut", 2500);
        Pracownicy NatanielKazek = new Pracownicy("Nataniel Kazek", 23000);

        Pracownicy[] prac = {JanBierut, NatanielKazek};

        for (Pracownicy p:prac){
            System.out.println(p);
            podwyżkaLubObniżka();
        }

      /*  public String toString() {
            return "Imie pracownika: " +  + ", jego początkowa wypłata: " + JanBierut.getWYPŁATA();
        }*
        System.out.println();
        System.out.println("Czy "+ JanBierut.getName() +" dostanie podwyżke czy obniżke? Ile procent dostanie??");
        podwyżkaLubObniżka();
        */
    }
}
