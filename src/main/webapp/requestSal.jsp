<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

	<title>Request Salary Invoice</title>
	
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->

</head>

<body>


<div class="bg-contact100" style="background-image: url('images/bg-01.jpg');">
<div class="container-contact100">
<div class="wrap-contact100">
<div class="contact100-pic js-tilt" data-tilt>
	<img src="images/img-01.jpg" alt="IMG">
</div>
				

<!--Salary account log form-->	
		<form class="contact100-form validate-form" action="request" method="post">
		
			<span class="contact100-form-title">
						Request Salary Invoice
			</span>

<div class="wrap-input100 validate-input" data-validate = "Input Valid Account Number">
					
		      Account Number<input class="input100" type="text" name="accnum" placeholder="Account Number">
		      
</div>

<div class="wrap-input100 validate-input" data-validate = "Input Your Bank">
					
		      Bank<input  class="input100" type="text"  type="text" name="bank" placeholder="Bank">
		      
</div>
					
<div class="container-contact100-form-btn">
					
				  <button class="contact100-form-btn">
						My Salary
				  </button>
</div>
		    
		     
		</form>
		
<!--End of Salary account log form-->	

</div>
</div>
</div>


<!--JS link-->
	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/tilt/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

<!-- Global site tag (gtag.js) - Google Analytics -->

<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

</body>
</html>
<!--end-->	