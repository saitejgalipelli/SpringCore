package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {

	private int id;
	private String name;
	private String catogory;
	private float weight;
    @Required
	public void setId(int id) {
		this.id = id;
	}
   @Required
	public void setName(String name) {
		this.name = name;
	}

	public void setCatogory(String catogory) {
		this.catogory = catogory;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", catogory=" + catogory + ", weight=" + weight + "]";
	}
	

}
