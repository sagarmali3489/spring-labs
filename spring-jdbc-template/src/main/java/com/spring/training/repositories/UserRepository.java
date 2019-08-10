package com.spring.training.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.training.models.User;


public class UserRepository {

	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	} 
	
	public int createUser(Integer id, String name, Integer age, String addressLine) {
		System.out.println("UserRepository: createUser");
		String sql = "insert into USER (id, name,age) values(" + id +",'" + name + "'," + age + ")";
		return template.update(sql);
	}

	public int updateUser(Integer id, String name, Integer age, String addressLine) {
		System.out.println("UserRepository: updateUser");
		String sql="update USER set name='"+name+"', age="+age+ " where id="+id;    
	    return template.update(sql);    
	}

	public int removeUser(Integer id) {
		System.out.println("UserRepository: removeUser");
		String sql="delete from USER where id="+id+"";    
	    return template.update(sql);    
	}

	public User getUser(Integer id) {
		System.out.println("UserRepository: getUser");
		String sql="select * from USER where id=?";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<User>(User.class));    
	}

	public List<User> getUsers() {
		System.out.println("UserRepository: getUsers");
		return template.query("select * from USER",new RowMapper<User>(){    
	        public User mapRow(ResultSet rs, int row) throws SQLException {    
	        	User e=new User();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setAge(rs.getInt(3));    
	                
	            return e;    
	        }    
	    });    
	}
}