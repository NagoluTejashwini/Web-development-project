package com.ts.dao;

import java.util.List;

import com.rest.dto.Restaurants;
import com.ts.db.HibernateTemplate;

public class RestaurantsDAO {
	public List<Restaurants> getAllRestaurants1() {
		
		List<Restaurants> restaurants = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 1");
		
		return restaurants;
		
	}
	public List<Restaurants> getAllRestaurants2() {
		
		List<Restaurants> restaurants1 = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 2");
		
		return restaurants1;
		
	}
public List<Restaurants> getAllRestaurants3() {
		
		List<Restaurants> restaurants2 = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 3");
		
		return restaurants2;
		
	}
public List<Restaurants> getAllRestaurants4() {
	
	List<Restaurants> restaurants3 = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 4");
	
	return restaurants3;
	
}
public List<Restaurants> getAllRestaurants5() {
	
	List<Restaurants> restaurants4 = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 5");
	
	return restaurants4;
	
}

}
