package DAY1;
import java.util.Scanner;

public class marriage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter female age:");
		int fage=scanner.nextInt();
		System.out.print("enter male age:");
		int mage=scanner.nextInt();
		if(fage>=21) {
			System.out.println("female marriage is eligible");
		}
		if(mage>=23) {
			System.out.println("male marriage is eligible");
		}
	}

}
