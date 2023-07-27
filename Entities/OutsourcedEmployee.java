package Entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {

	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, double additionalCharge) {
		super(name, hours, valuePerHours);

		this.additionalCharge = additionalCharge;
	}
	@Override
	public final double payment() {
		return 		super.payment() + this.additionalCharge * 1.1;
	}
}
