package com.rest.dto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.cfg.Configuration;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "cityId")
@XmlRootElement
@Entity
 public class City implements Serializable
{
	@Id
	public int cityId;
	public String cityName;
	@JsonManagedReference
	@OneToMany(mappedBy="city",fetch=FetchType.LAZY)
	private List<TouristPlaces> touristPlaces=new ArrayList<TouristPlaces>();
	@JsonManagedReference
	@OneToMany(mappedBy="city",fetch=FetchType.LAZY)
	private List<Hotels> Hotels = new ArrayList<Hotels>();
	@JsonManagedReference
	@OneToMany(mappedBy="city",fetch=FetchType.LAZY)
	private List<Restaurants> restaurants = new ArrayList<Restaurants>();
	@JsonManagedReference
	@OneToMany(mappedBy="city",fetch=FetchType.LAZY)
	private List<Malls> malls = new ArrayList<Malls>();
	public City() {
		super();
	}
	

	public City(int cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}


	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public List<TouristPlaces> getTouristPlaces() {
		return touristPlaces;
	}


	public void setTouristPlaces(List<TouristPlaces> touristPlaces) {
		this.touristPlaces = touristPlaces;
	}


	public List<Hotels> getHotels() {
		return Hotels;
	}


	public void setHotels(List<Hotels> Hotels) {
		this.Hotels = Hotels;
	}


	public List<Restaurants> getRestaurants() {
		return restaurants;
	}


	public void setRestaurants(List<Restaurants> restaurants) {
		this.restaurants = restaurants;
	}


	public List<Malls> getMalls() {
		return malls;
	}


	public void setMalls(List<Malls> malls) {
		this.malls = malls;
	}


	
}
