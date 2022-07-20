package com.staffMan;

public class StaffMember {
	
	//assign variables
	private int salaryID;
	private int staffID;
	private String accountNum;
	private String bank;
	private String basicSal;
	private String otHours;
	private String totalSalary;
	
	//create constructor
	public StaffMember(int salaryID, int staffID, String accountNum, String bank, String basicSal, String otHours,
			String totalSalary) {
	
		this.salaryID = salaryID;
		this.staffID = staffID;
		this.accountNum = accountNum;
		this.bank = bank;
		this.basicSal = basicSal;
		this.otHours = otHours;
		this.totalSalary = totalSalary;
	}
	
	//generate getters
	public int getSalaryID() {
		return salaryID;
	}
	public int getStaffID() {
		return staffID;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public String getBank() {
		return bank;
	}
	public String getBasicSal() {
		return basicSal;
	}
	public String getOtHours() {
		return otHours;
	}
	public String getTotalSalary() {
		return totalSalary;
	}

}
