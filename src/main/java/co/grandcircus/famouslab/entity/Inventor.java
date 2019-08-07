package co.grandcircus.famouslab.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Inventor {

	private String name;
	@JsonProperty("invented")
	private String invention;
	private Integer year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvention() {
		return invention;
	}
	public void setInvention(String invention) {
		this.invention = invention;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	
	
	
}
