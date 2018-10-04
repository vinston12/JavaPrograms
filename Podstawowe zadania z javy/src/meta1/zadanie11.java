package meta1;

public class zadanie11 {
public static void main(String[] args) {
	int tab[] = new int[5];
	tab[0] = 15;
	tab[1] = 22;
	tab[2] = 31;
	tab[3] = 41;
	tab[4] = 25;
	for (int i=0;i<tab.length;i++)
	{
		System.out.println("Zwykla" + tab[i]);
	}
	for (int x : tab)
	{
		System.out.println(x);
	}
	int n = 10;
	 while (n>0)
	 {
		 System.out.println("Cokolwiek " + n);
		n--;
	 }
	 do 
	 {
		 System.out.println("Du111");
		 n++;
	 }while (n<5);
	 {
		 System.out.println("Koniec");
	 }
	int tab1[][] = {{15,22}, {5,33,11,223,41,55}} ;
	 
	 for (int i= 0; i<tab1.length; i++)
	 {
		 for (int j=0; j<tab1[i].length;j++)
		 {
			 System.out.println(tab1[i][j]);
		 }
	 }
}

}
