package com.shop.dto;

import java.io.Serializable;

public class Item implements Serializable{
	private int id;
	private String name;
	private int price;
	private int quantity;
	private ItemCategory category;
	private String remark;
	
//	public Item(int id, String name, int price, int quantity, ItemCategory category, String remark) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
//		this.quantity = quantity;
//		this.category = category;
//		this.remark = remark;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ItemCategory getCategory() {
		return category;
	}
	public void setCategory(ItemCategory category) {
		this.category = category;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", category="
				+ category + ", remark=" + remark + "]";
	}
	
}
