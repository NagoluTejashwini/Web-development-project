package com.rest.RestAPI;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.Malls;
import com.ts.dao.MallsDAO;
@Path("malls")
public class MyMalls {
	@Path("getMalls1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Malls> getMalls1() {
		MallsDAO mallsDAO = new MallsDAO();
		List<Malls> tpList1 = mallsDAO.getAllMalls1();
		return tpList1;
		
	}
	@Path("getMalls2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Malls> getMalls2() {
		MallsDAO mallsDAO = new MallsDAO();
		List<Malls> tpList1 = mallsDAO.getAllMalls2();
		return tpList1;
		
	}
	@Path("getMalls3")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Malls> getMalls3() {
		MallsDAO mallsDAO = new MallsDAO();
		List<Malls> tpList1 = mallsDAO.getAllMalls3();
		return tpList1;
		
	}
	@Path("getMalls4")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Malls> getMalls4() {
		MallsDAO mallsDAO = new MallsDAO();
		List<Malls> tpList1 = mallsDAO.getAllMalls4();
		return tpList1;
		
	}
	@Path("getMalls5")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Malls> getMalls5() {
		MallsDAO mallsDAO = new MallsDAO();
		List<Malls> tpList1 = mallsDAO.getAllMalls5();
		return tpList1;
		
	}
}
