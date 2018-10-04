package Coding;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		String question, seccondQuestion;
		String arrayMan[] = new String[10];
		String arrayWoman[] = new String[10];
		arrayMan[0] = "Dominik";
		arrayMan[1] = "Kamil";
		arrayMan[2] = "Kacper";
		arrayMan[3] = "Micha³";
		arrayMan[4] = "Dawid";
		arrayMan[5] = "Konrad";
		arrayMan[6] = "Daniel";
		arrayMan[7] = "Szczepan";
		arrayMan[8] = "Mateusz";
		arrayMan[9] = "Wojtek";
		arrayWoman[0] = "Natalia";
		arrayWoman[1] = "Basia";
		arrayWoman[2] = "Katarzyna";
		arrayWoman[3] = "Emilia";
		arrayWoman[4] = "Aleksandra";
		arrayWoman[5] = "Kamila";
		arrayWoman[6] = "El¿bieta";
		arrayWoman[7] = "Olga";
		arrayWoman[8] = "Oliwia";
		arrayWoman[9] = "Tosia";
		System.out.println("Do you want to generate a random name?");
		question = scanner.next();
		if (question.equals("yes") || question.equals("YES") || question.equals("Yes")) {
		System.out.println("Male or Female?");
		seccondQuestion = scanner.next();
		if (seccondQuestion.equals("Male") || seccondQuestion.equals("male") || seccondQuestion.equals("MALE")) {
			int num = (int)(Math.random()*10);
			System.out.println("Random male name is: " + arrayMan[num]);
		}
		if (seccondQuestion.equals("Female") || seccondQuestion.equals("female") || seccondQuestion.equals("FEMALE")) {
			int num = (int)(Math.random()*10);
			System.out.println("Random female name is: " + arrayWoman[num]);
		}
		}
	}

}
