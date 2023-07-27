package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Department;
import Entities.HourContract;
import Entities.Worker;
import EntititesEnum.WorkerLevel;

public class WorkerProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.print("Enter department's name: ");
	String department = sc.nextLine().toUpperCase();
	System.out.println("Enter worker data:");
	System.out.print("Name: ");
	String name = sc.nextLine().toUpperCase();
	System.out.print("Level: ");
	String level = sc.nextLine().toUpperCase();
	System.out.print("Base Salary: ");
	double baseSalary = sc.nextDouble();
	
	Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
	
	System.out.print("How many contracts to this worker? ");
	int n = sc.nextInt();
	sc.nextLine();
	System.out.println();
	for (int i = 0; i < n ; i++) {
	
		System.out.println("Enter contract #" + (i+1) + " data:");
		System.out.print("Date (DD/MM/YYYY): ");
		Date contractDate = sdf.parse(sc.next()); 
		System.out.print("Value per hour: ");
		double valuePerHour = sc.nextDouble();
		System.out.print("Duration (hours): ");
		int hours = sc.nextInt();
		
		worker.addContract(new HourContract(contractDate, valuePerHour, hours));
		
		System.out.println();
	}
	
	System.out.print("Enter month and year to calculate income (MM/YYYY): ");
	//Date incomeDate = sdf2.parse(sc.next());
	String monthYaer = sc.next();
	int month = Integer.parseInt(monthYaer.substring(0, 2));
	int year = Integer.parseInt(monthYaer.substring(3));
	
	System.out.println("Name: " + worker.getName());
	System.out.println("Department: " + worker.getDepartment().getDepartment());
	System.out.println("Income for: " + monthYaer + ": " + worker.income(year, month));
	
	
	
	
	sc.close();
	}

}
