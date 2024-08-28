package DAY1;

import java.util.Scanner;

public class pos_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter num:");
		int a=scanner.nextInt();
		if(a>0)
		{
			System.out.println("a is positive");
			}
		else if(a<0)
		{
			System.out.println("a is negative");
		}
		else
		{
			System.out.println("a is neither pos nor neg");
		}
		scanner.close();

	}
}
