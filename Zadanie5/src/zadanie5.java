public class zadanie5 {
    public static void main(String[] args) {
        String imie1 = "Pierd", imie2 = "Stary szymka";
        int wiek1 = 18, wiek2 = 68;
        if (imie1.length() > imie2.length()) {
            wiek1 = wiek1 - wiek2;
            System.out.print("Pies o imieniu: " + imie1 + ", jest dluzsze niz " + imie2 + ", i ma wiecej o " + wiek1 + " lat.");
        } else {
            wiek2 = wiek2 - wiek1;
            System.out.print("Pies o imieniu: " + imie2 + ", jest dluzsze niz " + imie1 + ", i ma wiecej o " + wiek2 + " lat.");
        }
    }
}
