package com.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderList {

	private static List<Order> orderList = new ArrayList<Order>();
	static {
		Random random = new Random();
		for(int i=0;i<40;i++) {
			String location = i%2==0 ? "Mumbai" : "Pune";
			int price = random.nextInt(50000);
			Order order = new Order(location, price);
			orderList.add(order);
		}
	}
	public static List<Order> getOrders() {
		return orderList;
	}
	
	public static void printOrders(List<Order> orders) {
		for(Order o: orders) {
			System.out.println(o);
		}
	}
	
	
}