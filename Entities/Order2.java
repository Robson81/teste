package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import EntititesEnum.OrderStatus;

public class Order2 {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> orderItem = new ArrayList<>();
	
	private Client client;

	public Order2() {
		
	}
	public Order2(OrderStatus status, Client client) {
		this.moment = new Date();
		this.status = status;
		this.client = client;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem orderItem) {
		
	this.orderItem.add(orderItem);
		
	}
	public void removeItem(OrderItem orderItem) {
		
		this.orderItem.remove(orderItem);
		
	}
	
	public Double total() {
		Double sum = 0.0;
		for (OrderItem order : orderItem) {
			
			sum += order.subTotal();
		}
		
		return sum;
	}

	public String toString() {
	
	StringBuilder sb = new StringBuilder();
	
	sb.append("ORDER SUMMARY:\n");
	sb.append("Order moment: " + sdf.format(moment) + "\n");
	sb.append("Order status: " + status + "\n");
	sb.append("Client: " + client.toString() + "\n");
	sb.append("Order Itens: \n");
	for (OrderItem order : orderItem) {
		
		sb.append(order + "\n");
	}
	sb.append(String.format("Total Price: %.2f", total()));
	
	return sb.toString();
}


}
