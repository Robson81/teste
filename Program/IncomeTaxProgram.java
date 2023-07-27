package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.IncomeTax;
import Entities.JuridicalPerson;
import Entities.NaturalPerson;

public class IncomeTaxProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");

		int n = sc.nextInt();

		sc.nextLine();

		List<IncomeTax> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.println("Tax payer #" + (i + 1) + " data: ");

			System.out.print("Individual or company (i/c)?: ");

			char type = sc.next().charAt(0);
			sc.nextLine();
			if (type == 'i') {

				System.out.print("Name: ");

				String name = sc.nextLine();

				System.out.print("Annual Income: ");

				double annualIncome = sc.nextDouble();

				System.out.print("Health expenditures: ");

				Double healthExpenditures = sc.nextDouble();

				list.add(new NaturalPerson(name, annualIncome, healthExpenditures));

			} else {

				System.out.print("Name: ");

				String name = sc.nextLine();

				System.out.print("Annual Income: ");

				double annualIncome = sc.nextDouble();

				System.out.print("Number of employees: ");

				int employeeQuatity = sc.nextInt();

				list.add(new JuridicalPerson(name, annualIncome, employeeQuatity));

			}

			System.out.println();

		}

		System.out.println();

		double sum = 0;

		System.out.println("TAXES PAID:");

		for (IncomeTax payers : list) {

			System.out.println(payers);

			sum += payers.incomeTax();

		}

		System.out.printf("TOTAL TAXES: %.2f", sum);

		sc.close();

	}

}
