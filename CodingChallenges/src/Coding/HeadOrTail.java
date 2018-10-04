package Coding;

import java.util.Random;
import java.util.Scanner;

public class HeadOrTail {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random gen = new Random();
	String yesOrNo;
	String headOrTailAnswer;
	String headAnswer = "head";
	String tailAnswer = "tail";
	int rounds;
	int score = 0;
	String y = "y";
	System.out.println("Welcome, do you want to play game with me? [y/n]");
	yesOrNo = scanner.next();
	if (yesOrNo.equals(y)) {
		System.out.println("Okay, we are gonna play in 'Head or tail'");
		System.out.println();
		System.out.println("How many rounds you want to play?");
		rounds = scanner.nextInt();
		for (int i = 0;i<rounds;i++) {
		int headOrTail = (gen.nextInt(2)+1);
			System.out.println();
			System.out.println("Head or Tail?");
			headOrTailAnswer = scanner.next();
			if (headOrTailAnswer.equals(headAnswer)) {
				if (headOrTail == 1) {
					System.out.println("Nice, correct answer");
					score++;
					System.out.println("Your score: " + score);
					System.out.println();
				}else {
					System.out.println("Sorry, wrong answer");
					score--;
					System.out.println("Your score: " + score);
					System.out.println();
				}
				
			}else if (headOrTailAnswer.equals(tailAnswer)) {
				if (headOrTail == 2) {
					System.out.println("Nice, correct answer");
					score++;
					System.out.println("Your score: " + score);
					System.out.println();
				}else {
					System.out.println("Sorry, wrong answer");
					score--;
					System.out.println("Your score: " + score);
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("Thanks for game, your score is " + score);
	}
	else {
		System.out.println(":(");
	}
	
}
}
