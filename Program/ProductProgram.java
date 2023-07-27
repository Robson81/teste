package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entities.Product;
import Entities.UseProduct;
import Entities.ImportedProduct;

public class ProductProgram {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		List<Product> list = new ArrayList<>();

		for (int j = 0; j < n; j++) {

			System.out.println("Product #" + (j + 1) + " data: ");
			System.out.print("Common, used or imported (c/u/i)?: ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			if (type == 'i') {
				
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();

				list.add(new ImportedProduct(name, price, customsFee));
			}
			
			if (type == 'c') {
				
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();

				list.add(new Product(name, price));
			}
			
			if (type == 'u') {
				
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manofactureDate = sdf.parse(sc.next());

				list.add(new UseProduct(name, price, manofactureDate));
			}

			System.out.println();
			}
			System.out.println();
		

		for (Product p : list) {
			
			System.out.println(p);
		}

		sc.close();
	}

}
