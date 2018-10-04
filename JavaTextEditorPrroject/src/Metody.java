import java.util.Random;

public class Metody {

    public static int WYPŁATA = 15200;
    public static int wypłataOstateczna;
    public static int obliczanieProcentu;


    public static int podwyżka(){
        Random randomowe = new Random();

        int randomowyProcent = randomowe.nextInt(3+50);

        obliczanieProcentu = WYPŁATA * randomowyProcent / 100;
        wypłataOstateczna = WYPŁATA + obliczanieProcentu;
        return Math.round(wypłataOstateczna/100)*100;
    }

    public static int obniżka(){
        Random randomowe = new Random();

        int randomowyProcent = randomowe.nextInt(3+50);

        obliczanieProcentu = WYPŁATA * randomowyProcent / 100;
        wypłataOstateczna = WYPŁATA - obliczanieProcentu;
        return Math.round(wypłataOstateczna/100)*100;
    }

    public static void podwyżkaLubObniżka(){
        Random randomowe = new Random();
        int wylosowane = randomowe.nextInt(2);
            if (wylosowane == 1)
                System.out.println("Jest to podwyżka, Wypłata teraz wynosi: "+ podwyżka() + " zł");
            else
                System.out.println("Jest to obniżka, Wypłata teraz wynosi: "+ obniżka()+ " zł");

        }



    public static int getWYPŁATA() {
        return WYPŁATA;
    }

    public static void main(String[] args) {



    }
}
