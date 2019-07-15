package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.User;
import com.ts.db.HibernateTemplate;

public class UserDAO {

	private SessionFactory factory = null;
	
	public User getUser(String userName, String password) {

		return (User)HibernateTemplate.getObjectByUser(userName, password);
	}

	public int register(User employee) { 
		return HibernateTemplate.addObject(employee);
	}

	public List<User> getAllEmployees() {
		List<User> employees=(List)HibernateTemplate.getObjectListByQuery("From User");
		System.out.println("Inside All Employees ..."+employees);
		return employees;	
	}

	public User getEmployee(int id) {
		return (User)HibernateTemplate.getObject(User.class,id);
	}
}
