<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CREATE A SALARY MANAGE ACCOUNT</title>

<link rel="stylesheet" href="create.css"/>

</head>

<body>

<header>

        <img src="icon.png"  height = "200px" width = "200px"></img>
		<div class="log">
		</div>
		
</header>

<div class ="square">
	  
	  
	   <h3>CREATE A SALARY MANAGE PROFILE</h3>


<form action="insertt" method="post">
	    
	   	<h5>Staff ID : <input type ="text" name="staffID"></h5><br>
		<h5>Account Number : <input type ="text" name="accountNum"></h5><br>
		<h5>Bank: <input type ="text" name="bank"></h5><br>
		<h5>Basic salary :<input type ="text" name="basicSal"></h5><br>
		<h5>OT Hours :<input type ="text" name="otHours"></h5><br>
		<h5>Total Salary :<input type ="text" name="totalSalary"></h5><br>
	    
		<br>
		<input type="submit" name ="submit" value= " Create A Salary Manage Profile">
		</form>
</div>

<br>
<br>

<footer>
<img src="icon.png" alt="GLOBINC"  height = "50px" width = "50px"  style= margin-top:40px;></img>
<h4>2021|ALL RIGHTS RESERVED</h4>
</footer>

</body>
</html>