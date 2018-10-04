import java.sql.SQLOutput;
import java.util.Scanner;

public class ThrOw {

        public static final double INCH_PER_CM = 0.3937007874;


    public static void main(String[] args) {
        int rectangle_length_int = 0;
        int rectangle_width_int = 0;
        String userChoice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz ile cm długości ma mieć prostokąt: ");
        rectangle_length_int = scanner.nextInt();
        System.out.println("Wpisz ile cm szerokości ma mieć prostokąt: ");
        rectangle_width_int = scanner.nextInt();

        System.out.println("Jeśli chcesz znać pole i długości w cm wpisz 'cm', natomiast jeśli w calach wpisz 'inch'");

        userChoice = scanner.next();
        if (userChoice.equals("cm")) {
            System.out.println("Prostokąt ma " + rectangle_length_int + " cm długości, i " + rectangle_width_int + " cm szerokości," +
                    " jego pole wynosi " + rectangle_length_int * rectangle_width_int + " cm");
        }else if (userChoice.equals("inch")){
            System.out.print("Prostokąt ma (w zaokrągleniu ");
            System.out.format("%.1f%n",rectangle_length_int*INCH_PER_CM);
            System.out.print("cali długości, i ");
            System.out.format("%.1f%n",rectangle_width_int*INCH_PER_CM);
            System.out.print("cali szerokości, jego pole wynosi: ");
            System.out.format("%.1f%n", rectangle_length_int*INCH_PER_CM*rectangle_width_int*INCH_PER_CM);
        }else{
            throw new ArithmeticException("Podana wartość nie jest uwzględniona w programie.");
        }
    }
}java.text.DecimalFormat
