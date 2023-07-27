package Entities;

public abstract class IncomeTax {

	private String name;

	private Double annualIncome;

	public IncomeTax() {

	}

	public IncomeTax(String name, Double annualIncome) {

		super();

		this.name = name;

		this.annualIncome = annualIncome;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public Double getAnnualIncome() {

		return this.annualIncome;

	}

	public void setAnnualIncome(Double annualIncome) {

		this.annualIncome = annualIncome;

	}

	public abstract double incomeTax();

	public String toString() {

		return name + ": $ " + String.format("%.2f", incomeTax());

	}

}
