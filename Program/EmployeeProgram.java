package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsourcedEmployee;

public class EmployeeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		
		for (int i = 0; i < n ; i++) {
			
			System.out.println("Employee #" + (i+1) + " data: ");
			System.out.print("Outsourced (y/n)?: ");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value Per Hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(outsourced == 'y') {
				System.out.print("Additional Charge: ");
				
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				
				list.add(emp);
			}else {
				
				Employee emp = new Employee(name, hours, valuePerHour);
			
				list.add(emp);
			}
			System.out.println();
		}
		
		for (Employee emp : list) {
			
			System.out.println(emp);
			
		}
		
		
	
		sc.close();
	}

}
