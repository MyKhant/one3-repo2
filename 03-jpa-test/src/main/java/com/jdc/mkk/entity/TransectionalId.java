package com.jdc.mkk.entity;

import java.io.Serializable;
import java.util.Objects;

public class TransectionalId implements Serializable {
	private static final long serialVersionUID = 1L;
	private String color;
	private PSize size;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public PSize getSize() {
		return size;
	}

	public void setSize(PSize size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransectionalId other = (TransectionalId) obj;
		return Objects.equals(color, other.color) && size == other.size;
	}

}
