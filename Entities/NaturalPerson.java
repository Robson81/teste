package Entities;

public class NaturalPerson extends IncomeTax {

	private Double healthExpenditures;

	public NaturalPerson() {

		super();

	}

	public NaturalPerson(String name, Double annualIncome, Double healthExpenditures) {

		super(name, annualIncome);

		this.healthExpenditures = healthExpenditures;

	}

	public Double getHealthExpenditures() {

		return healthExpenditures;

	}

	public void setHealthExpenditures(Double healthExpenditures) {

		this.healthExpenditures = healthExpenditures;

	}

	@Override

	public final double incomeTax() {

		double tax;

		if (super.getAnnualIncome() <= 20000.0)

			tax = super.getAnnualIncome() * 0.15;

		else

			tax = super.getAnnualIncome() * 0.25;

		return tax - (healthExpenditures / 2);

	}

	@Override

	public String toString() {

		return super.getName() + ": $ " + String.format("%.2f", incomeTax());

	}

}
