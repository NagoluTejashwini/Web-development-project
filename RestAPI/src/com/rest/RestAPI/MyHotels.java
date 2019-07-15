package com.rest.RestAPI;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.Hotels;
import com.ts.dao.HotelsDAO;

@Path("hotels")
public class MyHotels {
	
		@Path("getHotels1")
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Hotels> getHotels1() {
			HotelsDAO hotelsDAO = new HotelsDAO();
			List<Hotels> tpList1 = hotelsDAO.getAllhotels1();
			return tpList1;
			
		}
		@Path("getHotels2")
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Hotels> getHotels2() {
			HotelsDAO hotelsDAO = new HotelsDAO();
			List<Hotels> tpList1 = hotelsDAO.getAllhotels2();
			return tpList1;
			
		}
		@Path("getHotels3")
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Hotels> getHotels3() {
			HotelsDAO hotelsDAO = new HotelsDAO();
			List<Hotels> tpList1 = hotelsDAO.getAllhotels3();
			return tpList1;
			
		}
		@Path("getHotels4")
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Hotels> getHotels4() {
			HotelsDAO hotelsDAO = new HotelsDAO();
			List<Hotels> tpList1 = hotelsDAO.getAllhotels4();
			return tpList1;
			
		}
		@Path("getHotels5")
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Hotels> getHotels5() {
			HotelsDAO hotelsDAO = new HotelsDAO();
			List<Hotels> tpList1 = hotelsDAO.getAllhotels5();
			return tpList1;
			
		}

}
