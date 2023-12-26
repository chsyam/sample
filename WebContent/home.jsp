<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Team11</title>
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    />
    <link rel="stylesheet" href="styles.css" />
    <style>
:root {
  --primary-color: #edf2fc;
  --secondary-color: #212121;
  --third-color: #ccdbee;
  --shadow-color: rgba(0, 0, 0, 0.2);
}

.dark-theme {
  --primary-color: #000106;
  --secondary-color: #fff;
  --third-color: #1c1d25;
  --shadow-color: rgba(0, 0, 0, 0.2);
}

	.navbar {
    background-color: #0072C6; 
    color: #fff;
    text-align: center;
    padding: 30px 0; 
    margin-bottom: 10px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); 
}

.navbar h1 {
    margin: 0;
    font-size: 28px; 
}

.navbar p {
    margin: 0;
    font-size: 16px; 
}

/* Styles for the Logout button */
.logout-button {
    position: absolute;
    top: 10px; 
    right: 10px;
}

#logout-link {
    color: #fff;
    text-decoration: none;
    margin-right: 10px;
}

#logout-icon {
    font-size: 20px; 
    color: #fff;
}

/* Homepage Functionality Styles */
.background-image {
    background-size: cover;
    background-position: center;
    min-height: 100vh;
    display: flex;
    flex-direction:column;
    justify-content:center;
    align-items: center;
}

.content {
    color: #fff;
}

.functionality {
    padding: 20px;
    border-radius: 10px;
    margin: 20px;
}

.functionality h2 {
    font-size: 24px;
    margin: 0;
}

.functionality p {
    font-size: 16px;
    margin: 10px 0;
}

.functionality a {
    display: inline-block;
    padding: 10px 20px;
    text-decoration: none;
    border-radius: 5px;
    margin-top: 10px;
}

.functionality a:hover {
    background: #555;
}

.functionality{
	background: var(--third-color) !important;
}

.profile-link{
cursor: pointer;
}

.profile-pic{
height: 38px;
width: 38px;
border-radius: 50%;
}
    </style>
  </head>
  <body>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <div class="home">
      <nav>
        <img class="logo" src="../Images/logo.jpg" />
        <ul>
        <form action="ActionHome" method="post">
        	<li><button type="submit">Home</button></li>
        </form>
        
        <form action="ActionProfile" method="post">
        	<li>
	        	<button class="profile-link" type="submit">
	        	<img class="profile-pic mr-3" src="/profile.jpg">
	        	</button>
        	</li>
        </form>
          
        </ul>
        <img src="../Images/moon.png" id="icon" />
      </nav>

    <div class="background-image">
        <div class="content">
            <div class="functionality">
                <h2 class="text-content">View Bill</h2>
                <p>View and track your electricity bills conveniently online. Stay informed about your energy usage.</p>
				<form method="post" action="ViewBill">
					<button type="submit" class="btn btn-primary">View Bill</button>
				</form>
            </div>
            <div class="functionality">
                <h2 class="text-content">Pay Bill</h2>
                <p>Securely pay your electricity bills online. Choose from various payment options for your convenience.</p>
                <form action="payBill" method="post">
                	<button type="submit" class="btn btn-primary">Pay Bill</button>
                </form>

            </div>
            <!-- Add more functionalities as needed -->

            <div class="functionality">
                <h2 class="text-content">Raise Complaint</h2>
                <p>Raise a complaint and give the details about problem you are experiencing.</p>
		<p>Submitted information is processed by the department to address and resilve the reoprted complaints.</p>
		<form action="HomeServ" method="post">
			<button type="submit" class="btn btn-primary">Raise Complaint</button>
		</form>
		

            </div>
            <form action="ViewCompSer" method="post">
	    <div class="functionality">
                <h2 class="text-content">View Complaint</h2>
                <p>View the status of your complaints.</p>
		<p>The status of the complaint is presented.</p>
		<button type="submit" class="btn btn-primary">View Complaint</button>

            </div>
            </form>

            <div class="functionality">
                <h2 class="text-content">Feedback and Surveys</h2>
                <p>We value your feedback. Take a moment to share your thoughts, suggestions, and experiences with us through our feedback and surveys portal.</p>
<a href="../main/Home Page.html" class="btn btn-primary">Feedback and Surveys</a>

            </div>

            <div class="functionality">
                <h2 class="text-content">News and Updates</h2>
                <p>Stay informed about the latest news and updates from the Telangana Department of Electricity. Get important announcements and information here.</p>
		<a href="../main/Home Page.html" class="btn btn-primary">News and Updates</a>
            </div>
        </div>
    </div>

      <footer class="footer text-center pb-2">
        <div class="col-md-12">
          <img class="logo" src="../Images/logo.jpg" alt="Footer Logo" />
        </div>
        <div class="col-md-12">
          <ul class="footer-links d-flex justify-content-center">
            <li class="col-3"><a href="../main/About page/About.html">About Us</a></li>
            <li class="col-3"><a href="../main/ContactUs.html">Contact Us</a></li>
          </ul>
        </div>
      </footer>
    </div>

    <!--  <script src="script.js"></script>-->
  </body>
</html>
