package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.City;
import com.rest.dto.Department;
import com.rest.dto.Hotels;
import com.ts.db.HibernateTemplate;

public class HotelsDAO {
		private SessionFactory factory = null;
		
		
		public List<Hotels> getAllhotels1() {
			List<Hotels> hotels = (List)HibernateTemplate.getObjectListByQuery("From Hotels where cityId = 1");
			return hotels;	
		}
		public List<Hotels> getAllhotels2() {
			List<Hotels> hotels = (List)HibernateTemplate.getObjectListByQuery("From Hotels where cityId = 2");
			return hotels;	
		}
		public List<Hotels> getAllhotels3() {
			List<Hotels> hotels = (List)HibernateTemplate.getObjectListByQuery("From Hotels where cityId = 3");
			return hotels;	
		}
		public List<Hotels> getAllhotels4() {
			List<Hotels> hotels = (List)HibernateTemplate.getObjectListByQuery("From Hotels where cityId = 4");
			return hotels;	
		}
		public List<Hotels> getAllhotels5() {
			List<Hotels> hotels = (List)HibernateTemplate.getObjectListByQuery("From Hotels where cityId = 5");
			return hotels;	
		}

}
