package com.staffMan;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StaffMemDBUtill {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
//search bar
public static boolean valid(String name, String department) {
		
	    //Exception handling
		try {
			
			//connection to DB
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//sql query
			String sql = "select * from applyinc where name='"+name+"' and department='"+department+"'";
			rs = stmt.executeQuery(sql);
			
			//boolean statement
			if(rs.next()) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		//return value
		return isSuccess;
}

//to display values
public static List<search> getsearch(String Nname){
		
		
		//create array list
		ArrayList<search> staff = new ArrayList<>();
		
		
		//Exception handling
		try {
			
			//connect to DB
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//sql query
			String sql = "select * from applyinc where name='"+Nname+"'";
			rs = stmt.executeQuery(sql);
			
			
			//while loop for get data
			while(rs.next()) {
				int id = rs.getInt(1);
		        String name = rs.getString(2);
				String nic = rs.getString(3);
				String phone = rs.getString(4);
				String department = rs.getString(5);
				
				
				
				search stf = new search(id,name,nic,phone,department);
				staff.add(stf);
				
}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		return staff;
		
		
}



//validate account info
public static boolean validate(String accnum, String bankn) {
		
	    //Exception handling
		try {
			
			//connection to DB
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			
			String sql = "select * from salary_invoice where accountNum='"+accnum+"' and bank='"+bankn+"'";
			rs = stmt.executeQuery(sql);
			
			//boolean statement
			if(rs.next()) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		//return values
		return isSuccess;
	}

//to display values
public static List<StaffMember> getStaffMember(String accnum){
		
	//convert int to String using wrapper class
	int convertedID = Integer.parseInt(accnum);
		
		//create array list
		ArrayList<StaffMember> staff = new ArrayList<>();
		
		
		//Exception handling
		try {
			
			//connect to DB
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//sql query
			String sql = "select * from salary_invoice where accountNum ='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			
			//while loop
			while(rs.next()) {
				int salaryID = rs.getInt(1);
				int staffID = rs.getInt(2);
				String accountNum = rs.getString(3);
				String bank = rs.getString(4);
				String basicSal = rs.getString(5);
				String otHours = rs.getString(6);
				String totalSalary = rs.getString(7);
				
				
				StaffMember stf = new StaffMember(salaryID, staffID, accountNum, bank, basicSal, otHours, totalSalary );
				staff.add(stf);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		return staff;
		
		
	}
	




    //Insert values to DB
public static boolean insertinc(String name, String nic, String phone, String department, String increment, String experience, String username, String password) {
		
	    //boolean value
		boolean isSuccess = false;
		
		//Exception handling
		try {
			
			//connection to DB
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into applyinc values (0,'"+name+"', '"+nic+"', '"+phone+"', '"+department+"', '"+increment+"', '"+experience+"', '"+username+"', '"+password+"')";
		    int rs = stmt.executeUpdate(sql);
		    
		    if(rs > 0) {
		    	
		    	isSuccess = true;
		    }
		    else {
		    	isSuccess = false;
		    }
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//return object
		return isSuccess;
	}
		
	
	
//salary insert	
public static boolean insertsal(String staffID, String accountNum, String bank, String basicSal, String otHours, String totalSalary) {
		//boolean value
		boolean isSuccess = false;
		
		//Exception handling
		try {
			
			//connection to DB
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			//sql query
			String sql = "insert into salary_invoice values (0,'"+staffID+"','"+accountNum+"', '"+bank+"', '"+basicSal+"', '"+otHours+"', '"+totalSalary+"')";
		    int rs = stmt.executeUpdate(sql);
		    
		    if(rs > 0) {
		    	
		    	isSuccess = true;
		    }
		    else {
		    	isSuccess = false;
		    }
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//return object
		return isSuccess;
	}
		
	


	
//update details
public static boolean updateSalAc(String salaryID, String staffID, String accountNum, String bank, String basicSal, String otHours, String totalSalary) {
		
	    //Exception handling
		try {
			
			//connection to DB
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			//sql query
			String sql = "update salary_invoice set accountNum = '"+ accountNum+"', bank='"+bank+"'"
					+ "where salaryID = '"+salaryID+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		//return object
		return isSuccess;
	}

//connect db to diplay update details
public static List<StaffMember> getStaffMemDetails(String salaryid){
		
		//convert int to String using wrapper class
		int convertedID = Integer.parseInt(salaryid);
		
		//create array list
		ArrayList<StaffMember> staff = new ArrayList<>();
		
		
		//Exception handling
		try {
			
			//connect to DB
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//sqlQuery
			String sql = "select * from salary_invoice where salaryID ='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			//while loop for get data
			while(rs.next()) {
				int salaryID = rs.getInt(1);
				int staffID = rs.getInt(2);
				String accountNum = rs.getString(3);
				String bank = rs.getString(4);
				String basicSal = rs.getString(5);
				String otHours = rs.getString(6);
				String totalSalary = rs.getString(7);
				
				//create a object
				StaffMember s = new StaffMember(salaryID, staffID, accountNum, bank, basicSal, otHours, totalSalary );
				staff.add(s);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//return values
		return staff;
		
		
	}
	


//delete data from db
public static boolean deleteIn(String salaryID) {
	
	//convert int to String using wrapper class
	int convID = Integer.parseInt(salaryID);  
	
	//Exception handling
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		//sql query
		String sql = "delete from salary_invoice where salaryID = '"+convID+"'";
		int r = stmt.executeUpdate(sql);
		
		if(r > 0) {
			
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	//return boolean value
	return isSuccess;
	}
}
