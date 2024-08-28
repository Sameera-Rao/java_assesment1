package DAY1;

import java.util.Scanner;

public class vowel_cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter alphabet:");
		char alp=scanner.next().charAt(0);
		if(alp=='a'||alp=='e'||alp=='i'||alp=='o'||alp=='u'||alp=='A'||alp=='E'||alp=='I'||alp=='O'||alp=='U')
		{
			System.out.println("alphabet is vowel");

	}
		else
		{
			System.out.println("alphabet is consonent");
		}
		scanner.close();
}
}
