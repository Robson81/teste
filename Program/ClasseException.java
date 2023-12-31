package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasseException {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");

	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 E N D***");		
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");

			int position = sc.nextInt();

			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace();
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid Data!");
		}
		System.out.println("***METHOD2 E N D***");

		sc.close();
	}

}
