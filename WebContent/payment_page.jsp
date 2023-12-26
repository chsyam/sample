<%@page import="java.util.ArrayList"%>
<%@page import="Model.Bill"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Payment Page</title>
	<link rel="stylesheet" href="styles.css">
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />s
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

 
 
.Home{
    padding:2px;
    margin-left: 10px;
	
}
 
.Paybill{
    padding:2px;
}
.RegisterComplaint{
    padding:2px;
}
.ComplaintStatus{
 
    padding:2px;
}
.logout{
    width: 80px;
    height: 30px;
    background-color: rgba(128,128,128, 0.4) ;
    cursor: pointer;
    border-radius: 4px;
}
.final{
    width: auto;
    height: 40px;
    background-color: rgba(128,128,128, 0.4) ;
    cursor: pointer;
    padding: 0 20px;
    border-radius: 4px;
}
.parent{
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: flex-end;
    / background-color: yellow; /
}
 
.form{
display:flex;
justify-content: center;
flex-direction: column;
    height: auto;
    padding: 30px;
    background: var(--third-color) ;
    margin: 1px;
    border-radius: 8px;
width: 75%
}
 
.row1{
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 20px;
}
.row{
    display: flex;
    justify-content: space-between;
    margin-bottom:10px;
    background: rgba(128,128,128,0.08) ;
    padding: 0 10px;
    border-radius: 4px;
}
.row0{
    display: flex;
    justify-content: center;
}
 
.temp{
    height: 1px;
    width: 100%;
    background-color: black;
    margin-bottom: 10px;
}
 
.tablerow h4{
    margin: 0px;
    padding: 10px;
    }
.tablerow{
display: flex;
flex-direction: column;
align-items: center;
}
 
.selection{
    display: flex;
}
.row2{
    justify-content: space-around;
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

       <%
                  ArrayList<Bill> payBillData = (ArrayList<Bill>) request.getAttribute("PaybillData");
       %>

	<div class="home">
      <nav>
        <img class="logo" src="../Images/logo.jpg" />
        <ul>
          <li><a href="/index.html">Home</a></li>
<a class="profile-link" href="/profile.html" ><img class="profile-pic mr-3" src="D:\Users\2565441\Downloads\Prac (2)\Prac\Images\profile.jpg"></a>
        </ul>
        <img src="../Images/moon.png" id="icon" />
      </nav>

<div class="d-flex justify-content-center">
		<div class="form mt-3 mb-3">
			<div class="row1">
				<h5 class="username text-content">Welcome</h5>
				<a href="../main/index.html" class="btn btn-primary">Logout</a>
			</div>
			<div class="row row0" style="background:rgb(135,166,224);">
				<h4 class="text-content">Bill Details</h4>
			</div>
			<div class="row">
				<h5 class="BillAmount text-content">Bill Amount</h5>
				<h5 class="rowrow1 BillAmountValue text-content">Rs <%= payBillData.get(0).getAmount() %></h5>
			</div>
			<div class="row">
				<h5 class="PgCharge text-content">PG Charge</h5>
				<h5 class="rowrow1 PgChargeValue text-content">Rs <%= payBillData.get(0).getPaid() %></h5>
			</div>
			<div class="row">
				<h5 class="TotalPayableAmount text-content">Total Payable Amount</h5>
				<h5 class="rowrow1 TotalPayableAmountValue text-content">Rs <%= payBillData.get(0).getAmount() +  payBillData.get(0).getPaid()  %></h5>
			</div>
			<div class="row">
				<div class="tablerow">
					<h5 class="tablecolumn text-content">Consumer Number</h5>
					<h5 class="tablecolumn text-content">$123</h5>
				</div>
				<div class="tablerow">
					<h5 class="tablecolumn text-content">Bill Number</h5>
					<h5 class="tablecolumn text-content">Rs <%= payBillData.get(0).getBillid() %></h5>
				</div>
			</div>
			<div class="row row0" style="background:rgb(135, 166, 224);">
           			<h3>Kindly select your mode of payment</h3>
        		</div>
        		<div class="row row2">
				<input type="radio" value="Debit" name="payment">
				<label for="html"><h5 class="text-content">Debit Card</h5></label>
				<br>
				<input type="radio" value="Credit" name="payment">
				<label for="css"><h5 class="text-content">Credit Card</h5></label>
				<br>
        		</div>
        		<div class="row" style="background: none; justify-content: space-around;">
        		<form action="paymentGateaway" method="post">
        			<button type="submit" class="btn btn-primary" style="background:rgb(135, 166, 224);">Pay Now</button>
        		</form>
				
				<a href="../main/Home Page.html" class="btn btn-primary">Return Home</a>
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
<script src="script.js"></script>
</body>
</html>