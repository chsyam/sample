<%@page import="Model.Bill"%>
<%@page import="Model.ComplaintRegister"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>View Complaint</title>
    <link rel="stylesheet" href="styles.css" />
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    />
  </head>
  <body>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <div class="home">
      <nav>
        <img class="logo" src="../Images/logo.jpg" />
        <ul>
          <li><a href="../main/index.html">Home</a></li>
          <li><a href="../main/register.html">Register</a></li>
          <li><a href="../main/login.html">Login</a></li>
        </ul>
        <img src="../Images/moon.png" id="icon" />
      </nav>
     <section class="vh-100">
        <div class="container py-5">
          <div class="row justify-content-center align-items-center h-100">
            <div class="col-12 col-lg-9 col-xl-7">
              <div
                class="card shadow-2-strong card-registration"
                style="border-radius: 15px"
              >
                <div class="card-body p-4 p-md-5">
                  <h3
                    class="mb-4 pb-2 pb-md-0 mb-md-5"
                    style="color: var(--secondary-color)"
                  >
                    View bill Dashboard
                  </h3>
                  <%
                  ArrayList<Bill> arr = (ArrayList<Bill>) request.getAttribute("billArr");
                  	if(arr!=null)
                  	{
                  	for(int i=0;i<arr.size();i++)
                  	{
                  		%>
                  		
                  		<div class="row">
                      <div class="col-md-12 mb-4 pb-2">
						<!--  <a href="../main/view_complaint_2.html" style="text-decoration:none;">-->
                        <div class="compcateg" onclick = "compPage()"style="width:100%;height:100%;border:2px solid yellow;padding:10px 0px 20px 10px;border-radius:4px;box-shadow:0 5px 5px yellow;cursor:pointer;">
                          <h3 style="color:#6a5acd">Bill ID :<%= arr.get(i).getBillid()%>
                          <h3 style="color:#6a5acd">Amount :<%= arr.get(i).getAmount()%>
                          <h3 style="color:#6a5acd">Paid :<%= arr.get(i).getPaid()%>
                          <h3 style="color:#6a5acd">Due :<%= arr.get(i).getDue()%>
                        </div>
                      </div>
		   			</div>
                  		
                  <%	}
                  	}
                  %>
                    <!--  <div class="row">
                      <div class="col-md-12 mb-4 pb-2">
			<a href="../main/view_complaint_2.html" style="text-decoration:none;">
                        <div class="compcateg" onclick = "compPage()"style="width:100%;height:100%;border:2px solid yellow;padding:10px 0px 20px 10px;border-radius:4px;box-shadow:0 5px 5px yellow;cursor:pointer;">
                          <h3 style="color:#6a5acd">Complaint ID:System.out.println(c.getComplaintId()); %> -System.out.println(c.getComplaintType()); %> </h3>
			  <p style="color:#6a5acd">DescriptionSystem.out.println(c.getProblem()); </p>
			  <b style="position:absolute;right:50px;color:yellow"> inprogress </b>
			  </a>
                        </div>
                      </div>
		   </div>-->
		  
		  <!--   <div class="row">
                      <div class="col-md-12 mb-4 pb-2">
                        <div class="compcateg"style="width:100%;height:100%;border:2px solid green;padding:20px 20px 20px 20px;border-radius:4px;box-shadow:0 5px 5px green;cursor:pointer;">
                          <h3 style="color:#6a5acd">Complaint ID:125672803 - Voltage Related Issue</h3>
			  <p style="color:#6a5acd">Frequent Fluctuation in Voltage</p>
			  <b style="position:absolute;right:50px;color:green">completed</b>
                        </div>
                      </div>
                    </div>-->
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