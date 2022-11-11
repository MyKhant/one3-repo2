package com.shop.service;

import java.util.List;

import com.shop.dto.Item;
import com.shop.dto.ItemCategory;
import com.shop.repositry.ShopRepositry;
import com.shop.repositry.ShopRepositryImpl;

public class ShopServiceImpl implements ShopService{
	private static ShopServiceImpl instance;
	private ShopRepositry repo;
	private ShopServiceImpl() {
		repo = ShopRepositryImpl.getInstance();
	}
	public static ShopServiceImpl getInstance() {
		return instance=instance==null?new ShopServiceImpl() : instance;
	}

	@Override
	public void addOrUpdate(Item item) {
		repo.addOrUpdate(item);
	}

	@Override
	public void delete(int id) {
		
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
