package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.TouristPlaces;
import com.ts.db.HibernateTemplate;


public class TouristPlacesDAO {
	private SessionFactory factory = null;
	
	public List<TouristPlaces> getAllTouristPlaces1() {
		
		List<TouristPlaces> touristplaces = (List)HibernateTemplate.getObjectListByQuery("From TouristPlaces where cityId = 1");
		System.out.println(touristplaces);
		return touristplaces;	
	}
	public List<TouristPlaces> getAllTouristPlaces2() {
		
		List<TouristPlaces> touristplaces1 = (List)HibernateTemplate.getObjectListByQuery("From TouristPlaces where cityId = 2");
		System.out.println(touristplaces1);
		return touristplaces1;	
	}	
	public List<TouristPlaces> getAllTouristPlaces3() {
		
		List<TouristPlaces> touristplaces2 = (List)HibernateTemplate.getObjectListByQuery("From TouristPlaces where cityId = 3");
		System.out.println(touristplaces2);
		return touristplaces2;	
	}
	public List<TouristPlaces> getAllTouristPlaces4() {
	
	List<TouristPlaces> touristplaces3 = (List)HibernateTemplate.getObjectListByQuery("From TouristPlaces where cityId = 4");
	System.out.println(touristplaces3);
	return touristplaces3;	
}
	public List<TouristPlaces> getAllTouristPlaces5() {
	
	List<TouristPlaces> touristplaces4 = (List)HibernateTemplate.getObjectListByQuery("From TouristPlaces where cityId = 5");
	System.out.println(touristplaces4);
	return touristplaces4;	
}

}
