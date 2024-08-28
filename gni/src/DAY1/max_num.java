package DAY1;

import java.util.Scanner;

public class max_num {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter num1:");
		int a=scanner.nextInt();
		System.out.print("enter num2:");
		int b=scanner.nextInt();
		if(a>b)
		{
			System.out.println("a is maximum");
		}
		else if(a<b)
		{
			System.out.println("b is maximum");
			
		}
		else
		{
			System.out.println("both are equal");
		}
		scanner.close();
	}

}
