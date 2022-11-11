package com.jdc.mkk.jdbc;

import com.jdc.mkk.jdbc.model.Item;
import com.jdc.mkk.jdbc.model.ItemSize;
import com.jdc.mkk.jdbc.service.ItemService;

public class Main {

	public static void main(String[] args) {
		ItemService service = new ItemService();
		Item item = new Item();
		item.setName("greatFruit");
		item.setPrize(1000);
		item.setSize(ItemSize.SMALL);
		service.insertItem(item);
	}

}
