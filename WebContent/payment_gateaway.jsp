<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Gateaway</title>
    <link rel="stylesheet" href="styles.css">
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    />
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

 
.parent{
    width: 100%;
height: 100%;
    display: flex;
    align-items: center;
    /* background-color: yellow; */
}
.form{
    padding: 30px;
    width: 75%;
    margin: 0 auto;
    display: flex;
    flex-direction: column;
    background-color: var(--third-color);
    border-radius: 4px;
}
 
.row{
    display: flex;
    justify-content: flex-start;
    padding: 10px;
    border-radius: 4px;
    padding-left: 0;
}
 
h4{
    margin: 0;
}
 
input{
    height: 30px;
}
 
 
.payment{
    background-color: rgba(255,165,0,0.7);
    padding: 10px;
    cursor: pointer;
    border-radius: 4px;
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
    <div class="home">
      <nav>
        <img class="logo" src="../Images/logo.jpg" />
        <ul>
          <li><a href="../main/Home Page.html">Home</a></li>
	  <a class="profile-link" href="../main/profile.html" ><img class="profile-pic mr-3" src="D:\Users\2565441\Downloads\Prac (2)\Prac\Images\profile.jpg"></a>

        </ul>
        <img src="../Images/moon.png" id="icon" />
      </nav>
    <div class="form mt-3 mb-3">
        <div class="row" style="background-color: rgb(135, 166, 224); justify-content: center;"><h3 class="text-content" style="margin: 0;padding: 10px 0;">Pay by Credit Card</h3></div>
        <div class="row"><img src="" alt=""></div>
        <div class="row"><h4 class="text-content">Card Number</h4></div>
        <div class="row"><input type="text" placeholder="Enter Card Number" size="50"></div>
        <div class="row" style="justify-content: space-between;"><h4 class="text-content">Expiration Date</h4><h4 class="text-content">CVV/CVC</h4></div>
        <div class="row" style="justify-content: space-between;"><input type="text" placeholder="Month" size="10"><input type="text" placeholder="Year" size="10"><input type="text" size="5"></div>
    <div class="row"><h4 class="text-content">Card Holder Name</h4></div>
    <div class="row"><input type="text" placeholder="Enter Card Holder Name" size="50"></div>
    <div class="row" style="justify-content: center;"><h4 class="PaymentAmount text-content">Payment Amount: 2020.56/-</h4></div>
    <form action="successPayment" method="post">
    	<button type="submit" class="btn btn-primary">Pay Bill</button>
    </form>
    
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
<script src="script.js"></script>
</body>
</html>