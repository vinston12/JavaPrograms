package Coding;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class HigherOrLower {
public static void main(String[] args) throws InterruptedException {
	Scanner scanner = new Scanner(System.in);
	LinkedList a = new LinkedList();
	LinkedList b = new LinkedList();
	String yesOrNo, higherOrLower;
	String higher = "higher";
	String lower = "lower";
	int rounds;
	int answer;
	int score = 0;
	Random generator = new Random();
	System.out.println("Do you want to play game? [y/n]");
	yesOrNo = scanner.next();
	if (yesOrNo.equals("y")) {
		System.out.println("How many rounds you want to play?");
		rounds = scanner.nextInt();
		System.out.println();
		for (int i=0;i<rounds;i++) {
			int d = generator.nextInt(11);
			int c = generator.nextInt(11);
			System.out.println("The number is: " + d);
			System.out.println("Is the next number Higher or Lower?");
			higherOrLower = scanner.next();
			if (higherOrLower.equals("higher") || higherOrLower.equals("lower")) {
				System.out.println("Your Answer: " + higherOrLower);
				if (higherOrLower.equals(higher)) {
					if (c>d) {
						System.out.println();
						System.out.println("CORRECT!");
						score+=10;
						System.out.println("Your score is: " + score);
						System.out.println();
						
					}else if (c<d){
						System.out.println();
						System.out.println("INCORRECT");
						score-=10;
					}
				}else if (higherOrLower.equals(lower)) {
						if (d>c) {
							System.out.println();
							System.out.println("CORRECT!");
							score+=10;
							System.out.println("Your score is: " + score);
							System.out.println();
							
						}else if (c>d){
							System.out.println();
							System.out.println("INCORRECT");
							score-=10;
						}
				}
			}else {
				System.out.println("Wtf, bye");
				return;
			}
		}
		System.out.println();
		System.out.println("That was nice game, your score: " + score);
		
	}else if (yesOrNo.equals("n")){
		System.out.println("Are you sure?");
		Thread.sleep(1000);
		System.out.println("Joking, bye");
		return;
	}
}
}
