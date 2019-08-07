package co.grandcircus.famouslab.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FamousResponse {

	@JsonProperty("tiny")
	private List<Inventor> inventors;
	@JsonProperty("complete")
	private List<Innovators> innovators;
	
	public List<Inventor> getInventors() {
		return inventors;
	}
	public void setInventors(List<Inventor> inventors) {
		this.inventors = inventors;
	}

	public List<Innovators> getInnovators() {
		return innovators;
	}
	public void setInnovators(List<Innovators> innovators) {
		this.innovators = innovators;
	}
	@Override
	public String toString() {
		return "FamousResponse [inventors=" + inventors + ", innovators=" + innovators + "]";
	}
	
}
