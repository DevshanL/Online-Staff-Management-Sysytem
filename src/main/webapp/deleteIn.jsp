<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>DELETE THE SALARY INVOICE ACCOUNT</title>

<!--link to css-->
<link rel="stylesheet" href="delete.css"/>

</head>
<body>

<header>
        <!--logo-->
        <img src="icon.png"  height = "200px" width = "200px"></img>
        
<div class="log">
</div>
		
</header>

<!--invoice delete-->
<div class ="square">
	  
	  
	   <h3>DELETE INVOICE ACCOUNTR</h3>

        <%
    	String salaryID = request.getParameter("salaryID");
    	String staffID = request.getParameter("staffID");
    	String accountNum = request.getParameter("accountNum");
    	String bank = request.getParameter("bank");
    	String basicSal = request.getParameter("basicSal");
    	String otHours= request.getParameter("otHours");
    	String totalSalary= request.getParameter("totalSalary");
    	
    	%>
    	
    	
    	
    	<form action ="delete" method="post">
	    	<h5>Salary ID : <input type="text" name="salID" value="<%= salaryID %>" readonly></h5><br>
	   	 	<h5>Staff ID :<input type="text" name="staffID" value="<%= staffID %>" readonly></h5><br>
			<h5>Account Number :<input type="text" name="acc" value="<%= accountNum %>"readonly></h5><br>
	   		<h5>Bank :<input type="text" name="bank" value="<%= bank %>"readonly></h5><br>
 	  		<h5>Basic salary :<input type="text" name="bsal" value="<%= basicSal %>" readonly></h5><br>
	    	<h5>OT Hours :<input type="text" name="ot" value="<%= otHours %>" readonly></h5><br>
  			<h5>Total Salary :<input type="text" name="totsal" value="<%= totalSalary %>" readonly></h5><br>
  		 
 <br>
 <br>
  		<input type="submit" name="submit" value="Remove Salary Invoice"><br>
    
     	</form>
</div>
     
<br>
<br>

<!--footer-->
<footer>
<img src="icon.png" alt="GLOBINC"  height = "50px" width = "50px"  style= margin-top:40px;></img>
<h4>2021|ALL RIGHTS RESERVED</h4>
</footer>
<!--end of footer-->

</body>
</html>