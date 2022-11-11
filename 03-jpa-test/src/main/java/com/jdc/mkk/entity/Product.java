package com.jdc.mkk.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(value = TransectionalId.class)
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private PSize size;
	@Id
	private String color;
	@Column(name = "p_name", nullable = false, length = 40)
	private String name;
	private int price;
	private LocalDate crd_dt;

	@ElementCollection
	private List<String> descriptions;

	public Product() {
		super();
	}

	public Product(String name, int price, LocalDate crd_dt, PSize size, List<String> descriptions) {
		super();
		this.name = name;
		this.price = price;
		this.crd_dt = crd_dt;
		this.size = size;
		this.descriptions = descriptions;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public LocalDate getCrd_dt() {
		return crd_dt;
	}

	public void setCrd_dt(LocalDate crd_dt) {
		this.crd_dt = crd_dt;
	}

	public PSize getSize() {
		return size;
	}

	public void setSize(PSize size) {
		this.size = size;
	}

	public List<String> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
	}

}
