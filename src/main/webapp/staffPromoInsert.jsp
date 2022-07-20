<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APPLY SALARY INCREMENT</title>

<link rel="stylesheet" href="increment.css"/> 

</head>

<body>

<header>

        <img src="icon.png"  height = "200px" width = "200px"></img>
		<div class="log">
		</div>
		
		
</header>

<div class = "nav">
	 <ul>
	    <li ><a href="Home.jsp">HOME</a></li>
		<li><a href="bookflight.html">PRODUCTS</a></li>
		<li class ="active"><a href="requestSal.jsp">MANAGE</a></li>
		<li><a href="#">CLIENTS</a></li>
		<li><a href="desti/desti.html">PORTFOLIO</a></li>
		<li><a href="support.html">CAREERS</a></li>
		<li><a href="#">CONTACT US</a></li>
	 </ul>
</div> 

<div class ="square">
	<form action="insert" method="post">
	
		<h5>Name <input type ="text" name="name"></h5><br><br>
		<h5>NIC <input type ="text" name="nic"></h5><br><br>
		<h5>Phone Number <input type ="text" name="phone"></h5><br><br>
		<h5>Department<input type ="text" name="dep"></h5><br><br>
		<h5>Increment <input type ="text" name="inc"></h5><br><br>
	    <h5>Experience Years<input type ="text" name="exp"></h5><br><br>
		<h5>User Name <input type ="text" name="uid"></h5><br><br>
		<h5>Password <input type ="text" name="psw"></h5><br><br>
		
		<input type="submit" name ="submit" value= " Apply A Salary Increment">
		</form>
</div>

<br>
<br>
<br>
<br>
<br>

<footer>
<img src="icon.png" alt="GLOBINC"  height = "50px" width = "50px"  style= margin-top:40px;></img>
<h4>2021|ALL RIGHTS RESERVED</h4>
</footer>

</body>
</html>