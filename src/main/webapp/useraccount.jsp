<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>SALARY INVOICE</title>

<link rel="stylesheet" href="login.css"/> 

</head>

<body>

<header>

        <img src="icon.png"  height = "200px" width = "200px"></img>
		<div class="log">
		</div>
		
</header>
	
<div class ="square">
	  
	  
	   <h3> SALARY INVOICE</h3>
	  
		<c:forEach var="staff" items="${staffDetail}">
       
      		<c:set var="salaryID" value="${staff.salaryID}"/>
       		<c:set var="staffID" value="${staff.staffID}"/>
       		<c:set var="accountNum" value="${staff.accountNum}"/>
       		<c:set var="bank" value="${staff.bank}"/>
       		<c:set var="basicSal" value="${staff.basicSal}"/>
       		<c:set var="otHours" value="${staff.otHours}"/>
       		<c:set var="totalSalary" value="${staff.totalSalary}"/>
          
        
            <h5>Salary ID :  ${staff.salaryID}</h5><br> 
       		<h5>Staff ID :${staff.staffID}</h5><br>
			<h5>Account Number : ${staff.accountNum}</h5><br>
	    	<h5>Bank : ${staff.bank}</h5><br>
			<h5>Basic salary : Rs. ${staff.basicSal}</h5><br>
			<h5>OT Hours : ${staff.otHours} Hours</h5><br>
			<h5>Total Salary : Rs. ${staff.totalSalary}</h5><br>
		
		</c:forEach>

    
   		<c:url value="updateSalAc.jsp" var="updateAC">
        	<c:param name="salaryID" value="${salaryID}"/>
        	<c:param name="staffID" value="${staffID}"/>
        	<c:param name="accountNum" value="${accountNum}"/> 
       		<c:param name="bank" value="${bank}"/>
         	<c:param name="basicSal" value="${basicSal}"/>
        	<c:param name="otHours" value="${otHours}"/>
         	<c:param name="totalSalary" value="${totalSalary}"/>
    	</c:url>
    
    	<a href="${updateAC}">
    	<input type="button" name="update" value="Update Account Number Details"><br>
    	</a>
    
    
<br>
    	<c:url value="deleteIn.jsp" var="deleteInv">
    	
    		<c:param name="salaryID" value="${salaryID}"/>
    		<c:param name="staffID" value="${staffID}"/>
        	<c:param name="accountNum" value="${accountNum}"/>
        	<c:param name="bank" value="${bank}"/>
        	<c:param name="basicSal" value="${basicSal}"/>
        	<c:param name="otHours" value="${otHours}"/>
        	<c:param name="totalSalary" value="${totalSalary}"/>
    	
    	</c:url>
    	
    	<a href ="${deleteInv}">
    	<input type = "button" name="delete" value="Remove Salary Invoice"> 
   	</a>
    
</div> 
 
<br>
<br>

<footer>
<img src="icon.png" alt="GLOBINC"  height = "50px" width = "50px"  style= margin-top:40px;></img>
<h4>2021|ALL RIGHTS RESERVED</h4>
</footer>

</body>
</html>