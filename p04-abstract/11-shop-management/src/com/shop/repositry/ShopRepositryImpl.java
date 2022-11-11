package com.shop.repositry;

import java.util.List;

import com.shop.dto.Item;
import com.shop.dto.ItemCategory;

public class ShopRepositryImpl implements ShopRepositry{
	private static ShopRepositryImpl instance;
	
	private ShopRepositryImpl() {
		
	}
	public static ShopRepositryImpl getInstance() {
		return instance = instance==null?new ShopRepositryImpl():instance;
	}

	@Override
	public void addOrUpdate(Item item) {
		System.out.println(item.toString());
	}

	@Override
	public void delete(int id) {
		System.out.println("delete");
	}

	@Override
	public List<Item> showAll() {
		return null;
	}

	@Override
	public Item search(int id, String name, int price, int quantity, ItemCategory category) {
		return null;
	}

	@Override
	public Item findById(int id) {
		return null;
	}

}
