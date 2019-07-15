package com.rest.RestAPI;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.City;
import com.rest.dto.Employee;
import com.rest.dto.TouristPlaces;
import com.rest.dto.User;
import com.ts.dao.EmployeeDAO;
import com.ts.dao.MallsDAO;
import com.ts.dao.TouristPlacesDAO;
import com.ts.dao.UserDAO;
import com.rest.dto.Malls;

@Path("touristplaces")
public class MyTouristPlaces {
	@Path("getTouristPlaces1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TouristPlaces> getTouristPlaces1() {
		TouristPlacesDAO touristplaceDAO = new TouristPlacesDAO();
		List<TouristPlaces> tpList = touristplaceDAO.getAllTouristPlaces1();
		return tpList;
		
	}
	@Path("getTouristPlaces2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TouristPlaces> getTouristPlaces2() {
		TouristPlacesDAO touristplaceDAO = new TouristPlacesDAO();
		List<TouristPlaces> tpList = touristplaceDAO.getAllTouristPlaces2();
		return tpList;
		
	}
	@Path("getTouristPlaces3")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TouristPlaces> getTouristPlaces3() {
		TouristPlacesDAO touristplaceDAO = new TouristPlacesDAO();
		List<TouristPlaces> tpList = touristplaceDAO.getAllTouristPlaces3();
		return tpList;
		
	}
	@Path("getTouristPlaces4")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TouristPlaces> getTouristPlaces4() {
		TouristPlacesDAO touristplaceDAO = new TouristPlacesDAO();
		List<TouristPlaces> tpList = touristplaceDAO.getAllTouristPlaces4();
		return tpList;
		
	}
	@Path("getTouristPlaces5")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TouristPlaces> getTouristPlaces() {
		TouristPlacesDAO touristplaceDAO = new TouristPlacesDAO();
		List<TouristPlaces> tpList = touristplaceDAO.getAllTouristPlaces5();
		return tpList;
		
	}
	
	@Path("registerJ")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void registerJ(User user) {
    	System.out.println("Inside REST...");
    	UserDAO userDAO = new UserDAO();
    	userDAO.register(user); //send to database code 
    	System.out.println(user.getUserId()+" "+user.getUserName()+" "+user.getPhoneNo());
    }
    

	

}
