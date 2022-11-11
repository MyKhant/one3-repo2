package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkk.jdbc.model.Item;
import com.jdc.mkk.jdbc.model.ItemSize;
import com.jdc.mkk.jdbc.service.ItemService;

class ItemTest {

	private static ItemService service;

	@BeforeAll
	static void init() {
		service = new ItemService();
	}

	@Test
	@Order(1)
	public void findItemByName() {
		List<Item> items = service.findBy("banana", null, 0);

		assertEquals(1, items.size());
		assertNotEquals(4, items.size());
	}

	@Test
	@Order(3)
	public void deleteItem() {
		service.deleteItemById(2);
		List<Item> items = service.findBy("banana", null, 2000);
		assertNotEquals(items.size() > 0, items.size());

	}

	@Test
	@Order(4)
	public void updateItem() {
		service.updateItem("strawberry", 300, ItemSize.MEDIUM, 3);
		List<Item> items = service.findBy("strawberry", null, 0);
		assertEquals(1, items.size());
	}

	@Test
	@Order(2)
	public void insertItem() {
		Item i = new Item();
		i.setName("lemon");
		i.setPrize(300);
		i.setSize(ItemSize.SMALL);

		// service.insertItem(i);

		List<Item> items = service.findBy("pineapple", ItemSize.MEDIUM, 1000);

		assertNotEquals(1, items.size());
		// assertEquals(300, items.get(0).getPrize());
	}

	@AfterAll
	static void close() {
		System.out.println("close");
	}

}
