public class zadanie1 {
    public static void main(String[] args) {
        int koło = 5;
    int poleKołaNr1 = 543;
    int poleKołaNr2 = 41;
    double polePierwszegoKoła = Math.PI;
        while(poleKołaNr1>polePierwszegoKoła){
        polePierwszegoKoła+=polePierwszegoKoła;
        System.out.println(polePierwszegoKoła);
    }
        System.out.println("Pole jest większe od poleKołaNr1 i ma wartość: "+(int)polePierwszegoKoła);
  }
}