<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:green;">Complaint  Registered Successfully...</h3>
	<h4>${coid}</h4>
</body>
</html>-->
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Register Success</title>
    <link rel="stylesheet" href="styles.css" />
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    />
    <script>
	function closePop()
	{
		window.open("home.html","_self");
	}
    </script>
  </head>
  <body>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <div class="home">
      <nav>
        <img class="logo" src="../Images/logo.jpg" />
        <ul>
          <li><a href="../main/index.html">Home</a></li>
          <form action="ActionHome" method="post">
          	<li><button type="submit">Register</button></li>
          </form>
           <form action="ActionLogin" method="post">
				<li><button type="submit">Login</button></li>
          </form>
        </ul>
        <img src="../Images/moon.png" id="icon" />
      </nav>
      <section class="vh-100">
        <div class="container py-3 h-100">
          <div class="row justify-content-center align-items-center h-100">
            <div class="col-12 col-lg-9 col-xl-7">
              <div
                class="card shadow-2-strong card-registration"
                style="border-radius: 15px"
              >
               <div class="container" id="pop" style="padding-top:60px;padding-bottom:60px">
			<div class="popup">
			<img src="tick.jpg">
			<h2>Thank You!</h2>
			<p>Your Complaint has been registered successfully.Your Complaint ID is <h4>${coid}</h4></p>
			<button type="button" onclick="closePop()">OK</button> 
		</div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <footer class="footer text-center pb-2">
        <div class="col-md-12">
          <img class="logo" src="../Images/logo.jpg" alt="Footer Logo" />
        </div>
        <div class="col-md-12">
          <ul class="footer-links d-flex justify-content-center">
            <li class="col-3"><a href="about.html">About Us</a></li>
            <li class="col-3"><a href="contact.html">Contact Us</a></li>
          </ul>
        </div>
      </footer>
    </div>

    <script src="script.js"></script>
  </body>
</html>