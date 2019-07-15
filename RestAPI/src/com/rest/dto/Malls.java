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
public class Malls implements Serializable
{
	@Id@GeneratedValue
	public int mallId;
	public String mallName;
	@Column(columnDefinition="mediumtext")
	public String address;
	@Column(columnDefinition="mediumtext")
	public  String description;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="cityId")
	private City city;
	
	
	public Malls() {
		super();
	}
	public Malls(int mallId, int cityId, String mallName, String address, String description) {
		super();
		this.mallId = mallId;
		this.mallName = mallName;
		this.address = address;
		this.description = description;
	}
	

	public int getMallId() {
		return mallId;
	}
	public void setMallId(int mallId) {
		this.mallId = mallId;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	public String getMallName() {
		return mallName;
	}



	public void setMallName(String mallName) {
		this.mallName = mallName;
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



	
	
}