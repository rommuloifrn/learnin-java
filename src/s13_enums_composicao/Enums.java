package s13_enums_composicao;

import java.util.Date;

import entities.Order;
import entities.OrderStatus;

public class Enums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		OrderStatus myos = OrderStatus.DELIVERED;
		OrderStatus myos2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(myos);
		System.out.println(myos2);
		
		
	}

}
