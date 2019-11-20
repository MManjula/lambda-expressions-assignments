package com.training.lambdaexpressions.printorders;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FinalOrder {

	public Map<Integer, Order> finalStatus(Map<Integer, Order> orders) {
//		Map<Integer, Order> finalOrder = new HashMap<Integer, Order>();
//		orders.forEach(e->
//		{if(e.getValue().getPrice()>10000 && e.getValue().getStatus().equalsIgnoreCase("Confirmed")		
//				finalOrder
//		});
//		return finalOrder;
		Map<Integer, Order> result = orders.entrySet().stream()
				.filter(e -> e.getValue().getPrice() > 10000 && e.getValue().getStatus().equals("Confirmed"))
				.collect(Collectors.toMap(keyMapper, valueMapper));

	}

}
