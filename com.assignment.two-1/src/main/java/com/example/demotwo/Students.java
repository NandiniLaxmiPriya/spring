package com.example.demotwo;

public class Students {
	private Long id;
	private String fname;
	private String lname;
	public Students(Long id, String fname,String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}

}
