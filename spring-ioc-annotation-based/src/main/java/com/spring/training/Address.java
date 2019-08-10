package com.spring.training;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
	
	private Integer id;
	private String addressLine;
	private String city;
	private Integer pin;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [" + (id != null ? "id=" + id + ", " : "")
				+ (addressLine != null ? "addressLine=" + addressLine + ", " : "")
				+ (city != null ? "city=" + city + ", " : "") + (pin != null ? "pin=" + pin : "") + "]";
	}
	
}
