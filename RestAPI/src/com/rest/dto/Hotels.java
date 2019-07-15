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
public class Hotels implements Serializable
{
	@Id@GeneratedValue
	public int hotelId;
	public String hotelName;
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
	
	public Hotels() {
		super();
	}


	public Hotels(int hotelId, String hotelName, String address, String description, float rating, int cityId) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.address = address;
		this.description = description;
		this.rating = rating;
		this.phone = phone;
	}




	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public int getHotelId() {
		return hotelId;
	}


	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
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


	public void setRating(float rating) {
		this.rating = rating;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}





	
	
}

