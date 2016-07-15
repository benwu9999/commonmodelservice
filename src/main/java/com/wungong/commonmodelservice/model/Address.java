package com.wungong.commonmodelservice.model;

import java.util.UUID;

import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "commonmodelservice",name = "addresses")
public class Address {
	
	private UUID addressId;
	private State state;
	private Country country;
	private String aptNumber;
	private String streeAddress;
	private String city;
	private Integer zipCode;
	
	public Address(UUID addressId, State state, Country country, String aptNumber, 
			String streeAddress, String city, Integer zipCode) {
		this.addressId = addressId;
		this.state = state;
		this.country = country;
		this.aptNumber = aptNumber;
		this.streeAddress = streeAddress;
		this.city = city;
		this.zipCode = zipCode;
	}

	public UUID getAddressId() {
		return addressId;
	}

	public void setAddressId(UUID addressId) {
		this.addressId = addressId;
	}

	public State getState() {
		return state;
	}

	public Country getCountry() {
		return country;
	}

	public String getAptNumber() {
		return aptNumber;
	}

	public String getStreeAddress() {
		return streeAddress;
	}

	public String getCity() {
		return city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setAptNumber(String aptNumber) {
		this.aptNumber = aptNumber;
	}

	public void setStreeAddress(String streeAddress) {
		this.streeAddress = streeAddress;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

}
