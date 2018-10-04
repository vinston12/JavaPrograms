package meta1;
import java.util.Scanner;

public class zadanie4 
{
	public static void main(String[] args) 
	{
		Scanner liczby = new Scanner(System.in);
		 
		String[][] grid = {
				{"6","*","1","=","6"},
				{"1","*","1","=","1"},
		        {"6","*","1","=","6"}
		};
		
		String[][] texts = new String[4][4];

		for (int i = 0; i <grid.length; i++)
		{
			for(int k = 0; k < grid[i].length;k++)
			{
				System.out.print(grid[i][k]+ "\t");
				
			}
			System.out.println();
		}
		
		}
		
	}
