package DAY1;
import java.util.Scanner;

public class age {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
		System.out.print("enter your age:");
		int age=input.nextInt();
		if(age>=18) {
			System.out.println("you are eligible to vote");
		}
		else
		{
			System.out.println("you are not eligible to vote");
		}
		input.close();
	}

}
