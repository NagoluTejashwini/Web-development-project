package com.rest.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;


@XmlRootElement
@Entity
 public class TouristPlaces implements Serializable {
	@Id@GeneratedValue
	public int placeId;
	public String placeName;
	@Column(columnDefinition="text")
	public String address;
	@Column(columnDefinition="text")
	public String description;
	public String timings;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="cityId")
	private City city;

	public TouristPlaces() {
		super();
	}
	public TouristPlaces(int placeId, String placeName, String address, String description, int cityId) {
		super();
		this.placeId = placeId;
		this.placeName = placeName;
		this.address = address;
		this.description = description;
	}
	
	public int getPlaceId() {
		return placeId;
	}
	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}
	public String getPlaceName() {
		return placeName;
	}



	public void setPlaceName(String placeName) {
		this.placeName = placeName;
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
	
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
}
