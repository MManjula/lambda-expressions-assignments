package com.training.lambdaexpressions.testprintorders;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.training.lambdaexpressions.printorders.Order;

/**
 * 
 * @author MManjula
 *
 */
public class TestPrintOrders {

	Map<Integer, Order> orders;
	Map<Integer, Order> resultMap;

	@Before
	public void setUp() {
		orders = new HashMap<Integer, Order>();
		resultMap = new HashMap<Integer, Order>();
	}

	@Test
	public void testOrders() {
		Order order1 = new Order(30000, "Confirmed");
		Order order2 = new Order(9800, "Pending");
		Order order3 = new Order(11597, "Confirmed");
		Order order4 = new Order(14900, "Confirmed");
		Order order5 = new Order(5000, "Confirmed");
		Order order6 = new Order(8900, "Pending");
		Order order7 = new Order(15050, "Pending");
		Order order8 = new Order(10000, "Confirmed");

		orders.put(3000, order1);
		orders.put(9800, order2);
		orders.put(11597, order3);
		orders.put(14900, order4);
		orders.put(5000, order5);
		orders.put(8900, order6);
		orders.put(15050, order7);
		orders.put(10000, order8);

	}

}
