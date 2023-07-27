package Entities;

public class JuridicalPerson extends IncomeTax{

	private Integer employeeQuantity;

	public JuridicalPerson() {

	}

	public JuridicalPerson(String name, Double annualIncome, Integer employeeQuantity) {

		super(name, annualIncome);

		this.employeeQuantity = employeeQuantity;

	}

	public Integer getEmployeeQuantity() {

		return employeeQuantity;

	}

	public void setEmployeeQuantity(Integer employeeQuantity) {

		this.employeeQuantity = employeeQuantity;

	}

	@Override

	public final double incomeTax() {

		double tax;

		if (employeeQuantity <= 10)
			tax = super.getAnnualIncome() * 0.16;

		else
			tax = super.getAnnualIncome() * 0.14;

		return tax;

	}

	@Override

	public String toString() {

		return super.getName() + ": $ " + String.format("%.2f", incomeTax());

	}

}
