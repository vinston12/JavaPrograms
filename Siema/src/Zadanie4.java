public class Zadanie4 {
    public static void main(String[] args) {
        double pi = 3.14159265359;
        double PoleKola =0;
        double promien=9;
        int PoleKolanr1 = 14;
        int PoleKolanr2 = 2;
        PoleKola = Math.PI*Math.pow(promien,2);
        System.out.println("Pole kola przed petla nr1 wynosi: " + PoleKolanr1 + ", a wczesniejszego kola:" + PoleKola);
        while (PoleKola < PoleKolanr1) {
            PoleKola = PoleKola + PoleKola;
        }
        System.out.println("Pole kola po petli nr1 wynosi: " + PoleKolanr1 + ", a wczesniejszego:" + PoleKola);
    }
}
