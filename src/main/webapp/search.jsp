<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Search</title>

<link rel="stylesheet" href="search.css"/>

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
		<li><a href="requestSal.jsp">MANAGE</a></li>
		<li><a href="#">CLIENTS</a></li>
		<li><a href="desti/desti.html">PORTFOLIO</a></li>
		<li><a href="support.html">CAREERS</a></li>
		<li><a href="#">CONTACT US</a></li>
	 </ul>
</div>

<br>
<br>
<br>

    <c:forEach var="search" items="${staffDetail}">
       
       
       <c:set var="name" value="${search.name}"/>
       <c:set var="nic" value="${search.nic}"/>
       <c:set var="phone" value="${search.phone}"/>
       <c:set var="department" value="${search.department}"/>
      
          
        
            
       	<h5> Name:${search.name}</h5><br>
		<h5>NIC :${search.nic}</h5><br>
	    <h5>Phone :${search.phone}</h5><br>
		<h5>Department : ${search.department}</h5><br>
			
		
	</c:forEach>
<br>
<br>	


<footer>
<img src="icon.png" alt="GLOBINC"  height = "50px" width = "50px"  style= margin-top:40px;></img>
<h4>2021|ALL RIGHTS RESERVED</h4>
</footer>

</body>
</html>