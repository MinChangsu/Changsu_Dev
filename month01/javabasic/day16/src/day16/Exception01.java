package day16;
import java.util.Scanner;
public class Exception01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		int a =sc.nextInt();
		System.out.println(4/a);}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("fdfd");
	sc.close();
		}

}
