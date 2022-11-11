package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkk.jdbc.model.Customer;
import com.jdc.mkk.jdbc.service.CustomerService;

public class CustomerTestCase {

	private static CustomerService service;

	@BeforeAll
	static void init() {
		service = new CustomerService();
	}

	@Test
	void findCustomer() {
		List<Customer> list = service.findAllCustomer();

		Customer cu = list.get(0);
		assertEquals("Aung Aung", cu.getName());
		assertEquals("mandalay", cu.getAddress().getCity());
		assertEquals("pineapple", cu.getItems().getName());
	}

	@AfterAll
	static void close() {
		System.out.println("close");
	}

}
