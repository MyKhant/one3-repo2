package com.jdc.mkk.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderBy;

@Entity
public class CollectionData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String name;
	@ElementCollection
	@CollectionTable(name = "col_list")
	private Map<Integer, String> map;
	@ElementCollection
	@CollectionTable(joinColumns = @JoinColumn(name = "fk_list"))
	@OrderBy("name asc")
	private List<Integer> list;

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

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

}
