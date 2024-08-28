package DAY1;
import java.util.Scanner;

public class oldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter age 1:");
		int a1=scanner.nextInt();
		System.out.print("enter age 2:");
		int a2=scanner.nextInt();
		System.out.print("enter age 3:");
	    int a3=scanner.nextInt();
	    if(a1>a2&&a1>a3)
	    {
	    	   
	    }
	    else if(a2>a1&&a2>a3)
	    {
	    	System.out.println("age 2 is older");
	    }
	    else
	    {
	    	System.out.println("age 3 is older");
	}

}
}
