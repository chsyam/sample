<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Complaint Registration</title>
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
          <li><a href="../main/Home Page.html">Home</a></li>
	  <li><a href="../main/bill_update.html">Bill Updates</a></li>
	  <li><a href="../main/complaint_status.html">Complaint Status</a></li>
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
                <div class="card-body p-4 p-md-5">
                  <h3
                    class="mb-4 pb-2 pb-md-0 mb-md-5"
                    style="color: var(--secondary-color)"
                  >
                    Add Bills
                  </h3>

                  <form action="AdminBillUpdate" method="post">
			<div class="row">
                      <div class="col-md-12 mb-4">
                        <div class="form-outline">
                          <input
                            type="text"
                            id="consumerId"
                            class="form-control form-control-lg"
			    required="" placeholder="Enter Customer ID"
			    name="id"
                          />
                        </div>
                      </div>
			</div>


		       <div class="row">
                      <div class="col-md-12 mb-4">
                        <div class="form-outline">
                          <select name="month" style="height:47px;border-radius:4px;width:535px;border:0px" placeholder="month">
						
						<option value="month" style="color:#808080;">Select Month</option>
						<option value="Jan">January</option>
						<option value="Feb">February</option>
					        <option value="Mar">March</option>
						<option value="Apr">April</option>
						<option value="May">May</option>
						<option value="June">June</option>
						<option value="Jul">July</option>
						<option value="Aug">August</option>
						<option value="Sep">September</option>
						<option value="Oct">October</option>
						<option value="Nov">November</option>
						<option value="Dec">December</option>
					</select>
                        </div>
                      </div>
		      </div>
		      
		      
			<div class="row">
                      <div class="col-md-12 mb-4">
                        <div class="form-outline">
                          <input
                            type="text"
                            id="Amount"
                            class="form-control form-control-lg"
			    required="" placeholder="Enter Amount"
			    name="amount"
                          />
                        </div>
                      </div>
			</div>
                    <div class="row">
                    <div class="col-md-3 mt-4 pt-2">
                      <button type="submit" class="btn btn-primary">Submit</button> 
                  </form>
                </div>
              </div>
              <pre style="text-align:center;color:blue;font-size:20px">${param.message}</pre>
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

	
				