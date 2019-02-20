package com.cafecalledencapsulationDAO.cafe;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cafecalledencapsulation.cafe.Items;
import com.cafecalledencapsulation.cafe.Users;


//package com.cafecalledencapsulationDAO.cafe;

		


		@Repository
		public class ItemDao {
			
			
			@Autowired
			private JdbcTemplate jdbc;

			public List<Items> findAll() {
				
				String sql = "SELECT * FROM item";
				return jdbc.query(sql, new BeanPropertyRowMapper<>(Items.class));
			}
			
			public Items findById(Long id) {				
				
				String sql = "SELECT * FROM item WHERE id=?";				
				return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Items.class), id);
			}
			
			public void update(Items item) {
			
				String sql = "UPDATE Item SET name=?, description=?, quantity=?, price=? WHERE id = ?";
				jdbc.update(sql, item.getName(), item.getDescription(), item.getQuantity(), item.getPrice(),item.getId());
			}
			
			public void create(Items item) {
				String sql = "INSERT INTO Item (name, description, quantity, price) VALUES (?,?,?,?)";
				
				jdbc.update(sql, item.getName(), item.getDescription(), item.getQuantity(), item.getPrice(),item.getId());
			}
			
			public void delete(Long id) {
				
				
				String sql = "DELETE FROM Item WHERE id = ?";
		        jdbc.update(sql, id);
				
			}
		

	}