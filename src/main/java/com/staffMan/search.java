package com.staffMan;

public class search {
	
	//assign variables
	private int id;
	private String name;
	private String nic;
	private String phone;
	private String department;
	
	//search constructor
	public search(int id, String name, String nic, String phone, String department) {
	
		this.id = id;
		this.name = name;
		this.nic = nic;
		this.phone = phone;
		this.department = department;
	}
	
	//generate getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getNic() {
		return nic;
	}
	public String getPhone() {
		return phone;
	}
	public String getDepartment() {
		return department;
	}

}
