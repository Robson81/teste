package Program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClasseExceptionFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//C:\Windows\Temp
		
		File file = new File("C:\\Windows\\temp\\in.txt");
		Scanner sc = null;
		try {
		sc = new Scanner(file);
		while (sc.hasNextLine()) {
		System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
		System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
		if (sc != null) {
		sc.close();
		
			}
		
		System.out.println("Finally block executed");
		
		}
	
	}

}
