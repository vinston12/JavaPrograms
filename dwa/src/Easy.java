import java.util.Scanner;

public class Easy {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int maxV;
	System.out.println("Enter the number ?");
	maxV =scanner.nextInt();
	for (int i=0;i<(maxV);i++) {
		for (int j=i;j<(maxV);j++) 
			System.out.print(" ");
		for (int k=1;i<(i*2);k++)
			System.out.print("*");
		System.out.print("\n");
		
		}
}
}
