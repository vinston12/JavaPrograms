public class Zadanie3 {
    public static void main(String[] args) {
    String zmiennaA="Mimek";
    String zmiennaB="Dominik";
    String zmiennaC="Czarny";
    if(zmiennaA.length()>zmiennaB.length()){
        if(zmiennaA.length()>zmiennaB.length()){
            System.out.print("Jest dluzszy: " + zmiennaA);
        }
        else{
            System.out.print("Jest dluzszy: " + zmiennaC);
        }
    }
    else{
        if(zmiennaB.length()>zmiennaC.length()){
            System.out.print("Jest dluzszy: " + zmiennaB);
        }
        else{
            System.out.print("Jest dluzszy: " + zmiennaC);
        }
    }
    }

}
