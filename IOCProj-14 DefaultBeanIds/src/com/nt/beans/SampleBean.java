package com.nt.beans;

public class SampleBean {
	private String name;
	private float age;

	public SampleBean() {
		System.out.println("SampleBean:0 param constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "SampleBean [name=" + name + ", age=" + age + "]";
	}
	

}
