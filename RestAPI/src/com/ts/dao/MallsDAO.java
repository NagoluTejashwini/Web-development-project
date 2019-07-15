package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import com.rest.dto.Malls;
import com.ts.db.HibernateTemplate;


public class MallsDAO {
	private SessionFactory factory = null;
		
		public List<Malls> getAllMalls1() {
			
			List<Malls> malls = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 1");
			
			return malls;
			
		}
		public List<Malls> getAllMalls2() {
			
			List<Malls> malls1 = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 2");
			
			return malls1;
			
		}
		public List<Malls> getAllMalls3() {
	
	List<Malls> malls2 = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 3");
	
	return malls2;
	
}
		public List<Malls> getAllMalls4() {
	
	List<Malls> malls4 = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 4");
	
	return malls4;
	
}
		public List<Malls> getAllMalls5() {
	
	List<Malls> malls5 = (List)HibernateTemplate.getObjectListByQuery("From Malls where cityId = 5");
	
	return malls5;
	
}

}

	