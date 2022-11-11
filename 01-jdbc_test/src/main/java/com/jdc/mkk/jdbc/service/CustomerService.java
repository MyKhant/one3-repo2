package com.jdc.mkk.jdbc.service;

import static com.jdc.mkk.jdbc.util.ConnectionManager.getConnection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkk.jdbc.model.Address;
import com.jdc.mkk.jdbc.model.Customer;
import com.jdc.mkk.jdbc.model.Item;
import com.jdc.mkk.jdbc.model.ItemSize;

public class CustomerService {
	public List<Customer> findAllCustomer() {
		List<Customer> list = new ArrayList<>();
		String sql = """
				select c.c_name,
				i.i_name,i.i_size,
				i.price,a.street_name,a.township,
				a.city from customer_tbl c join
				items_tbl i on c.item_id=i.i_id join
				address_tbl a on c.address_id=a.i_id;
				""";
		try (Connection conn = getConnection(); var stmt = conn.prepareStatement(sql)) {
			var rs = stmt.executeQuery();
			while (rs.next()) {
				Customer c = new Customer();
				Item item = new Item();
				Address address = new Address();
				c.setName(rs.getString("c.c_name"));
				item.setName(rs.getString("i.i_name"));
				item.setSize(ItemSize.valueOf(rs.getString("i.i_size").toUpperCase()));

				address.setStreet_name(rs.getString("a.street_name"));
				address.setTownship(rs.getString("a.township"));
				address.setCity(rs.getString("a.city"));

				c.setAddress(address);
				c.setItems(item);

				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
