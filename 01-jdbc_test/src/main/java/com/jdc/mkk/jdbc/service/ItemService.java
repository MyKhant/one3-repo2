package com.jdc.mkk.jdbc.service;

import static com.jdc.mkk.jdbc.util.ConnectionManager.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkk.jdbc.model.Item;
import com.jdc.mkk.jdbc.model.ItemSize;

public class ItemService {

	public void insertItem(Item item) {
		String sql = "insert into items_tbl (i_name,i_size,price) values(?,?,?)";
		try (Connection con = getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, item.getName());
			stmt.setString(2, item.getSize().name());
			stmt.setInt(3, item.getPrize());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Item> findBy(String name, ItemSize size, int price) {
		StringBuffer sb = new StringBuffer("select * from items_tbl where 1=1");
		List<Item> list = new ArrayList<>();
		List<Object> tmp = new ArrayList<>();
		if (null != name && !name.isEmpty()) {
			sb.append(" and i_name=?");
			tmp.add(name);
		}
		if (size != null) {
			sb.append(" and i_size=?");
			tmp.add(size.name().toLowerCase());
		}
		if (price > 0) {
			sb.append(" and price=?");
			tmp.add(price);
		}
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sb.toString())) {
			for (int i = 0; i < tmp.size(); i++) {
				stmt.setObject(i + 1, tmp.get(i));
			}

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt("i_id"));
				item.setName(rs.getString("i_name"));
				item.setPrize(rs.getInt("price"));
				item.setSize(ItemSize.valueOf(rs.getString("i_size").toUpperCase()));
				list.add(item);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("size :" + list.size());
		return list;
	}

	public void deleteItemById(int id) {
		String sql = "delete from items_tbl where i_id=?";
		try (Connection conn = getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateItem(String name, int price, ItemSize size, int id) {
		String sql = "update items_tbl set i_name=?, price=? and i_size=? where i_id=?;";
		try (Connection conn = getConnection(); var stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.setInt(2, price);
			stmt.setString(3, size.name());
			stmt.setInt(4, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
