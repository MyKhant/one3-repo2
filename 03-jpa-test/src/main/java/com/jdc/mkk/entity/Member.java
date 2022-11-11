package com.jdc.mkk.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "member_tbl")

@SecondaryTable(name = "address_tbl")
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Contact contact;
	@Column(name = "user_name")
	private String name;

	@Column(table = "address_tbl")
	private String st_name;
	@Column(table = "address_tbl")
	private String township;
	@Column(table = "address_tbl")
	private String city;

	public Member() {
		super();
	}

	public Member(String name, String email, String st_name, String township, String city) {
		super();
		this.name = name;
		this.st_name = st_name;
		this.township = township;
		this.city = city;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public String getTownship() {
		return township;
	}

	public void setTownship(String township) {
		this.township = township;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
