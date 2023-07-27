package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order2;
import Entities.OrderItem;
import Entities.Product;
import EntititesEnum.OrderStatus;

public class Order2Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Cliente Data:");
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Email: ");
	String email = sc.nextLine();
	System.out.print("Birth Date: ");
	Date birthDate = sdf.parse(sc.next());
	Client client = new Client(name, email, birthDate);
	System.out.println("Enter Order Data: ");
	System.out.print("Status: ");
	String status = sc.next().toUpperCase();	
	Order2 order2 = new Order2(OrderStatus.valueOf(status), client);
	System.out.print("How many items to this order? ");
	int n = sc.nextInt();
	System.out.println();
	
	for (int i = 0; i < n; i++) {
		
		sc.nextLine();
		System.out.println("Enter #" + (i+1) + " item data: ");
		System.out.print("Product name: ");
		String productName = sc.nextLine();
		System.out.print("Product price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		order2.addItem(new OrderItem(quantity, price, new Product(productName, price)));
	}
	
	System.out.println();
	System.out.println(order2);
	
	sc.close();
	}

}
