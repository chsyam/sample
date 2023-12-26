<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Payment Success Page</title>
    <link rel="stylesheet" href="styles.css" />
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    />
    <script>
	function closePop()
	{
		window.open("Home page.html","_self");
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
<a class="profile-link" href="../main/profile.html" ><img class="profile-pic mr-3" src="D:\Users\2565441\Downloads\Prac (2)\Prac\Images\profile.jpg"></a>
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
			<p>Bill Details Added Successfully</p>
			<a href="admin.jsp"><button  >OK</button> </a>
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