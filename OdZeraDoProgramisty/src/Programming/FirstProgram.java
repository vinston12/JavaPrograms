package Programming;

import java.util.Scanner;

import javafx.scene.control.Tab;

public class FirstProgram {
	static Scanner scanner = new Scanner(System.in);
	public static class Data{
		String name;
		int grades;
		int Payment;
	}
	public static void TypetoTable(Data tab[]) {
		int gradeCheck;
		int PaymentCheck;
		for (int i = 0; i<tab.length;i++) {
			System.out.println("Type your name");
			tab[i]=new Data();
			tab[i].name = scanner.next();
			System.out.println("Type your grade");
			gradeCheck = scanner.nextInt();
			while(gradeCheck < 1 || gradeCheck > 6)
			{
				System.out.println("Type your grade");
				gradeCheck = scanner.nextInt();
			}
			 tab[i].grades = gradeCheck;
			 System.out.println("Payment?(Type '1' to YES or '0' to NO)");
			 PaymentCheck=scanner.nextInt();
			 while (PaymentCheck > 1 || PaymentCheck < 0) {
				 System.out.println("Payment?(Type '1' to YES or '0' to NO)");
				 PaymentCheck=scanner.nextInt();
			 }
			 tab[i].Payment=PaymentCheck;
		}
	}
	public static void WriteArray(Data tab[]) {
		for (int i = 0; i<tab.length;i++) {
			System.out.print("Name: " + tab[i].name + ", Your grade: " + tab[i].grades + ", Payment");
			if (tab[i].Payment == 1) {
				System.out.println(" yes");
			}
				else {
					System.out.println(" no");
				}
			}
		}
	
	public static void BestGradeGuy(Data tab[]) {
		int tempGrade = tab[0].grades;
		String tempName = tab[0].name;
		for (int i =0; i<tab.length;i++) {
			if (tempGrade < tab[i].grades) {
				tempGrade = tab[i].grades;
				tempName = tab[i].name;
						
			}
		}
		System.out.println("Best grades have: " + tempName);
	}
	public static void BestThreeGuys(Data tab[]) {
		int tempGrade;
		String tempName = null;
			for (int j = (tab.length-1);j>=1;j--) {
				if (tab[j].grades > tab[j-1].grades) {
					tempGrade = tab[j].grades;
					tempName = tab[j].name;
					tab[j].grades = tab[j-1].grades;
					tab[j].name = tab[j-1].name;
					 tab[j-1].grades = tempGrade;
					tab[j-1].name = tempName;
					
				}
				
			}
			System.out.println("Sorted: ");
		for (int x = 0; x<tab.length; x++) {
			System.out.println((x+1) + ". Person is: " + tab[x].name + ", Grade: " + tab[x].grades);
		}
		
	}
	public static void Payment(Data tab[]) {
		for (int i=0;i<tab.length;i++) {
			if (tab[i].Payment == 1) {
				System.out.println(tab[i].name + " paid payment");
			}
		}
	}
	public static void FirstPersonK(Data tab[]) {
		for (int i= 0; i<tab.length;i++) {
			char first = tab[i].name.charAt(0);
			char kLetter = 'K';
			if (first == kLetter) {
				System.out.println("Name on 'K' letter: " + tab[i].name);
			}
		}
	}
	public static void Fibonacci() {
		System.out.println("Fibonacci Sequence\n-------------------------");
		int n = 0;
		int x = 0;
		int x1 = 1;
		int x2;
		System.out.println("Wpisz do jakiej liczby ma obliczac program");
		n = scanner.nextInt();
		for (int i = 0; i<n;i++)
		{
			x2 = x1 + x;
			x = x1;
			x1 = x2;
			 System.out.println(x2);
		}
	}
	
	
	public static void main(String[] args) {	
		
		
		
		
		Data[] tab = new Data[3];
		TypetoTable(tab);
		WriteArray(tab);
		BestGradeGuy(tab);
		BestThreeGuys(tab);
		Payment(tab);
		FirstPersonK(tab);
		 Fibonacci();
		 /* 
		* jakby mi sie kurwa nudzilo to bym to napisal
		*/
		
		
	}

}
