package com.jdc.mkk.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	private String st_name;
	private String city;
	private String township;

	public Address() {
		super();
	}

	public Address(String st_name, String city, String township) {
		super();
		this.st_name = st_name;
		this.city = city;
		this.township = township;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTownship() {
		return township;
	}

	public void setTownship(String township) {
		this.township = township;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, st_name, township);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(st_name, other.st_name)
				&& Objects.equals(township, other.township);
	}

}
