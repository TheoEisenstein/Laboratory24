package com.cafecalledencapsulationDAO.cafe;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cafecalledencapsulation.cafe.Users;


//package com.cafecalledencapsulationDAO.cafe;

		

	

		// DAO stands for Data Access Object.
		// DAOs are used as a layer of code that is responsible for communicating
		// with the database. On the Java side, we use the Room POJO with properties.
		// On the SQL side, there are corresponding rows and columns.
		// The @Repository annotation tells Spring both that this is a component
		// (a.k.a Spring Bean) that can be autowired and that it should be treated like
		// a DAO (which mostly applies to error handling behind the scenes).
		@Repository
		public class CoffeeDao {
			
			// Spring will automatically inject this dependency thanks to @Autowired
			@Autowired
			private JdbcTemplate jdbc;

			public List<Users> findAll() {
				// BeanPropertyRowMapper uses the rows from the SQL result create
				// new Room objects and fill in the values by calling the setters.
				// Use .query for SQL SELECT statements.
				String sql = "SELECT * FROM User";
				return jdbc.query(sql, new BeanPropertyRowMapper<>(Users.class));
			}
			
			public Users findById(Long id) {
				// The last parameters of .query let us specify values for the (?) parameters in our SQL statement.
				// While .query returns a list, .queryForObject assumes only one result. 
				// If nothing matched, match will be null.
				
				String sql = "SELECT * FROM User WHERE id=?";
				//looks for one row, and one room object. Since one blank spot in query, one variable at the end. If two ? ? spots, would use two variables at the end.
				return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Users.class), id);
			}
			
			public void update(Users user) {
				// Use .update for SQL INSERT, UPDATE, and DELETE
				// All the parameters after the first specify values to fill in the ?s in the SQL.
				String sql = "UPDATE User SET firstName=?, lastName=?, socialSecurity=?, shoeSize=?, Roast=?, MyOwn=? WHERE id = ?";
				jdbc.update(sql, user.getFirstName(), user.getLastName(), user.getSocialSecurity(), user.getShoeSize(), user.getMyOwn(), user.getId());
			}
			
			public void create(Users user) {
				String sql = "INSERT INTO User (firstName, lastName, socialSecurity, shoeSize, Roast, MyOwn) VALUES (?,?,?,?,?,?)";
				
				jdbc.update(sql, user.getFirstName(), user.getLastName(), user.getSocialSecurity(), user.getShoeSize(), user.getMyOwn(), user.getId());
			}
			
			public void delete(Long id) {
				
				
				String sql = "DELETE FROM User WHERE id = ?";
		        jdbc.update(sql, id);
				
			}
		

	}


