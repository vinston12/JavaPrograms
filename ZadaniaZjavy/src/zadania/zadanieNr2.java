package zadania;

import java.util.Random;

public class zadanieNr2 {
public static void main(String[] args) {
	Random r = new Random();
	
	int tab[] = new int[5];
	for (int i=0;i<tab.length;i++)
	{tab[i]=r.nextInt(10)+1;
	System.out.print(tab[i]+" ");
	}
	int powtorzenie = 0;
	for (int i=0;i<tab.length;)
	{
		for (int j=0;j<tab.length;j++) {
		if (tab[i]==tab[j])
		{
			powtorzenie++;
	
		}
		i++;
		}
	}System.out.println(powtorzenie);
	
}
}
