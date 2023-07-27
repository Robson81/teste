package Program;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import EntititesEnum.Order;
import EntititesEnum.OrderStatus;

public class OrderProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	Order order =  new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
	
	System.out.println(order);
	
	sc.close();
	}

}
