package com.rest.RestAPI;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.Restaurants;
import com.ts.dao.RestaurantsDAO;

@Path("restaurants")
public class MyRestaurants {
	@Path("getRestaurants1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Restaurants> getRestaurants1() {
		RestaurantsDAO mallsDAO = new RestaurantsDAO();
		List<Restaurants> tpList1 = mallsDAO.getAllRestaurants1();
		return tpList1;
		
	}
	@Path("getRestaurants2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Restaurants> getRestaurants2() {
		RestaurantsDAO mallsDAO = new RestaurantsDAO();
		List<Restaurants> tpList1 = mallsDAO.getAllRestaurants2();
		return tpList1;
		
	}
	@Path("getRestaurants3")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Restaurants> getRestaurants3() {
		RestaurantsDAO mallsDAO = new RestaurantsDAO();
		List<Restaurants> tpList1 = mallsDAO.getAllRestaurants3();
		return tpList1;
		
	}
	@Path("getRestaurants4")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Restaurants> getRestaurants4() {
		RestaurantsDAO mallsDAO = new RestaurantsDAO();
		List<Restaurants> tpList1 = mallsDAO.getAllRestaurants4();
		return tpList1;
		
	}
	@Path("getRestaurants5")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Restaurants> getRestaurants5() {
		RestaurantsDAO mallsDAO = new RestaurantsDAO();
		List<Restaurants> tpList1 = mallsDAO.getAllRestaurants5();
		return tpList1;
		
	}

}
