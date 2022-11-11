package com.shop.controller;

import java.util.Arrays;

import com.shop.dto.Item;
import com.shop.dto.ItemCategory;
import com.shop.dto.ShopOperation;
import com.shop.service.ShopService;
import com.shop.service.ShopServiceImpl;
import com.shop.util.ShopUtil;

public class ShopController {
	private ShopService service;
	public ShopController(){
		service=ShopServiceImpl.getInstance();
	}
	public void start() {
		doOperation(ShopOperation.values()[showMenu()-1]);
		
		}

	
	private void doOperation(ShopOperation ope) {
		switch(ope) {
		case Add -> addOrUpdate(true);
		case Update -> addOrUpdate(false);
		case Delete -> delete();
		case ShowAll -> showAll();
		case Search -> search();
		default -> throw new IllegalArgumentException("Unexpexted value: "+ope);
	}
	}
	private void search() {
		service.search(0, null, 0, 0, null);
	}
	private void showAll() {
		service.showAll();
	}
	
	private void delete() {
		service.delete(0);
	}
	private void addOrUpdate(boolean status) {
		Item item=new Item();
		item.setName(ShopUtil.readString("Product Name: "));
		item.setPrice(ShopUtil.readInt("Price : "));
		item.setQuantity(ShopUtil.readInt("Quantity : "));
//		for(ItemCategory category : ItemCategory.values()) {
//			if(category==ItemCategory.valueOf(ShopUtil.readString("Select Category:"))) {
//				item.setCategory(category);
//			}
//		}
		item.setCategory(ItemCategory.values()[ShopUtil.readInt("Select Category "+
		Arrays.asList(ItemCategory.values()))-1]);
		item.setRemark(ShopUtil.readString("Remark : "));
		service.addOrUpdate(item);
	}
	private int showMenu() {
		for(ShopOperation ope : ShopOperation.values()) {
			System.out.println(ope);
		}
		return ShopUtil.readInt("Enter Menu : ");
	}
	
}

