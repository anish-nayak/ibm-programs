package com.LambdaExpressions;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class assignment2 {

	public static void main(String[] args) 
	{
		List<Order> allOrders=OrderList.getOrders();
		OrderList.printOrders(allOrders);
		OrderPredicate predicatePrice=(Order o)->o.getPrice()>10000;
		System.out.println("\n\n filtered list");
		
		Consumer <List<Order>>c= (List<Order> x)->System.out.println(x);
		List<Order> filteredOrders=filterOrders(allOrders,predicatePrice,c);
		//OrderList.printOrders(filteredOrders);
	}
	
	
	public static List<Order> filterOrders(List<Order> orders, OrderPredicate predicate,Consumer <List<Order>>c) {
		List<Order> filteredOrders = new ArrayList<Order>();
		for(Order o: orders) {
			if (predicate.test(o)) {
				filteredOrders.add(o);
			}
		}
		
		c.accept(filteredOrders);
		return filteredOrders;
	}
}
