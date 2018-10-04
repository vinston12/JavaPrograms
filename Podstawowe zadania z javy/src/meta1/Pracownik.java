package meta1;
	public class Pracownik{
		String imie, nazwisko;
		int wiek;
		
	
public class Firma {

	public void main(String[] args) {
		Pracownik pracownik1=new Pracownik();
		Pracownik pracownik2=new Pracownik();
		pracownik1.imie="Jarek";
		pracownik1.nazwisko="Dupa";
		pracownik1.wiek=51;
		pracownik2.imie="Marek";
		pracownik2.nazwisko="Jadczak";
		pracownik2.wiek=41;
		System.out.println("Pracownicy w tej firmie to: ");
		System.out.println();
		System.out.println(pracownik1.imie+", "+pracownik1.nazwisko+", "+pracownik1.wiek);
		System.out.println(pracownik2.imie+", "+pracownik2.nazwisko+", "+pracownik2.wiek);
	}

}
}
	