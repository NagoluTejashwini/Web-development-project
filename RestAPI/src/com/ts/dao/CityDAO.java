package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.City;
import com.rest.dto.Department;
import com.ts.db.HibernateTemplate;

public class CityDAO {
		private SessionFactory factory = null;
		
		public City getCity(int cityId) {
			return (City)HibernateTemplate.getObject(City.class,cityId);
		}

		public List<City> getAllCities() {
			List<City> cities = (List)HibernateTemplate.getObjectListByQuery("From City");
			return cities;	
		}

}
