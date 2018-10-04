package Coding;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EncryptionDecryption {
public static void main(String[] args) {
	String tab[][] = new String[3][3];
	Scanner scaner = new Scanner(System.in);
			
			
	for (int i =0;i<tab.length;i++) {
		tab[i][0] = scaner.next();
		}
	for (int i =0;i<tab.length;i++) {
		System.out.println(i+1 +".Nazwisko: " + tab[i]);
		System.out.println(i+1 + " nazwisko, ma liter "+ tab[i].length);
	}
	int zliczanie =0;
	char a = 'a';
	for (int i=0;i<10;i++){
		for (int j=0;j<tab[i].length;j++){
			if (tab[i][j].equals((char)a)){
				zliczanie++;
			}
			System.out.println("W "+ i+1 + "nazwisku liter a wystapilo: " + zliczanie);
	}
}
}
}


