package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UseProduct extends Product {
	
	private Date manufactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	public UseProduct() {
		
		super();
	}

	public UseProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public final String priceTag() {
	
		return super.priceTag() + " (Manufacture date: " + sdf.format(manufactureDate) + ")"; 
		
	}

	@Override
	public String toString() {
	   
	   return priceTag();
   }
	
}
