package com.example.demoo;

public class Employees {

	private int id;
	private String ename;
	private int phone;
	public Employees(int id, String ename, int phone) {
		super();
		this.id = id;
		this.ename = ename;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", ename=" + ename + ", phone=" + phone + "]";
	}
}
