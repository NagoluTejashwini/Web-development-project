package com.rest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;
@XmlRootElement
@Entity
public class Restaurants implements Serializable
{
	@Id@GeneratedValue
	public int restaurantId;
	public String restaurantName;
	@Column(columnDefinition="text")
	public String address;
	@Column(columnDefinition="text")
	public String description;
	public float rating;
	public String phone;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="cityId")
	private City city;
	
	
	
	public Restaurants() {
		super();
	}
	public Restaurants(int restaurantId, String restaurantName, String address, String description, float rating,
			int cityId) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.address = address;
		this.description = description;
		this.rating = rating;
	}



	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	
	public String getRestaurantName() {
		return restaurantName;
	}



	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public float getRating() {
		return rating;
	}



	
	public void setRating(double rating) {
		this.rating = (float) rating;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	

	

}