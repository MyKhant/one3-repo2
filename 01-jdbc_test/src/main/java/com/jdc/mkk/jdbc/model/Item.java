package com.jdc.mkk.jdbc.model;

public class Item {
	private int id;
	private String name;
	private ItemSize size;
	private int prize;

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

	public ItemSize getSize() {
		return size;
	}

	public void setSize(ItemSize size) {
		this.size = size;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

}
