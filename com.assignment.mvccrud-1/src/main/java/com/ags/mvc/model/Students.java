package com.ags.mvc.model;


public class Students {

	private String Id;
	private String name;
	private String department;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Students(String id, String name, String department) {
		super();
		Id = id;
		this.name = name;
		this.department = department;
	}
	
}
