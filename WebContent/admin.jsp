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
  </head>
  <body>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <div class="home">
      <nav>
        <img class="logo" src="../Images/logo.jpg" />
        <ul>
         	 <li><a href="../main/admin.html">Home</a></li>
         	<form action="AdminHome" method="post">
	  			<li><button type="submit">Bill Updates</button></li>
	  		</form>
	  		<form action="AdminBill" method="post">
	  			<li><button type="submit">Complaint Status</button></li>
	  		</form>
        </ul>
        <img src="../Images/moon.png" id="icon" />
      </nav>

      <div>


        <section class="main-section vh-100 gradient-custom">
          <div class="container h-100">
            <div class="row align-items-center h-100">
              <div class="col-md-6">
                <div class="text-content">
                  <h2>Easy Online Payments</h2>
                  <p>
                    Make payments with just a few clicks. It's quick and
                    hassle-free. Enjoy the convenience of paying your bills from
                    the comfort of your home or on the go.
                  </p>
                  <a href="#" class="btn btn-primary">Get Started</a>
                </div>
              </div>
              <div class="col-md-6">
                <div class="image-content">
                  <img src="../Images/easyPayment.jpg" alt="Your Image" />
                </div>
              </div>
            </div>
          </div>
        </section>

        <section class="main-section vh-100 gradient-custom">
          <div class="container h-100">
            <div class="row align-items-center h-100">
              <div class="col-md-6">
                <div class="image-content">
                  <img src="../Images/securePayment.jpg" alt="Your Image" />
                </div>
              </div>
              <div class="col-md-6">
                <div class="text-content">
                  <h2>Secure Transactions</h2>
                  <p>
                    Your payment information is safe and secure with us. We use
                    the latest encryption technology to protect your data,
                    ensuring that your transactions are private and secure.
                  </p>
                  <a href="#" class="btn btn-primary">Get Started</a>
                </div>
              </div>
            </div>
          </div>
        </section>

        <section class="main-section vh-100 gradient-custom">
          <div class="container h-100">
            <div class="row align-items-center h-100">
              <div class="col-md-6">
                <div class="text-content">
                  <h2>24/7 Customer Support</h2>
                  <p>
                    Our team is available around the clock to assist you.
                    Whether you have questions, need help with a payment, or
                    encounter any issues, our customer support team is here to
                    provide prompt assistance and solutions.
                  </p>
                  <a href="#" class="btn btn-primary">Get Started</a>
                </div>
              </div>
              <div class="col-md-6">
                <div class="image-content">
                  <img src="../Images/24By7.jpg" alt="Your Image" />
                </div>
              </div>
            </div>
          </div>
        </section>

        <section class="main-section vh-100 gradient-custom">
          <div class="container h-100">
            <div class="row align-items-center h-100">
              <div class="col-md-6">
                <div class="image-content">
                  <img src="../Images/billRemainders.jpg" alt="Your Image" />
                </div>
              </div>
              <div class="col-md-6">
                <div class="text-content">
                  <h2>Quick Bill Reminders</h2>
                  <p>
                    Receive timely reminders to avoid late payments. We'll
                    ensure you never miss a payment by sending you alerts and
                    reminders ahead of your due dates.
                  </p>
                  <a href="#" class="btn btn-primary">Get Started</a>
                </div>
              </div>
            </div>
          </div>
        </section>

        <section class="main-section vh-100 gradient-custom">
          <div class="container h-100">
            <div class="row align-items-center h-100">
              <div class="col-md-6">
                <div class="text-content">
                  <h2>Multi-Payment Options</h2>
                  <p>
                    Choose from various payment methods for your convenience.
                    Whether you prefer credit cards, debit cards, net banking,
                    or digital wallets, we offer a range of payment options to
                    suit your needs.
                  </p>
                  <a href="#" class="btn btn-primary">Get Started</a>
                </div>
              </div>
              <div class="col-md-6">
                <div class="image-content">
                  <img src="../Images/MultiPayment.jpg" alt="Your Image" />
                </div>
              </div>
            </div>
          </div>
        </section>

        <section class="main-section vh-100 gradient-custom">
          <div class="container h-100">
            <div class="row align-items-center h-100">
              <div class="col-md-6">
                <div class="image-content">
                  <img src="../Images/autopay.jpg" alt="Your Image" />
                </div>
              </div>
              <div class="col-md-6">
                <div class="text-content">
                  <h2>Auto Pay Options</h2>
                  <p>
                    Set up automatic bill payments for peace of mind. With our
                    auto-pay feature, you can schedule recurring payments and
                    relax, knowing your bills will be paid on time without
                    manual intervention.
                  </p>
                  <a href="#" class="btn btn-primary">Get Started</a>
                </div>
              </div>
            </div>
          </div>
        </section>
      </div>

      <section
        class="main-section vh-100 gradient-custom"
      >
        <div class="container h-100 d-flex justify-content-center">
          <div class="row align-items-center h-100 pt-4">
            <div class="col-md-12">
              <div class="text-content">
                <h3>How to Pay Your Electricity Bill?</h3>
                <p>
                  Our electricity bill payment service offers numerous
                  advantages, making it the preferred choice for customers. Here
                  are some compelling reasons to choose our service:
                </p>
                <ol>
                  <li>
                    Log in to your account or sign up if you are a new user.
                  </li>
                  <li>
                    Enter your billing details and the amount you wish to pay.
                  </li>
                  <li>
                    Select your preferred payment method (credit card, debit
                    card, net banking, etc.).
                  </li>
                  <li>
                    Review your payment details and confirm the transaction.
                  </li>
                  <li>
                    You will receive a payment confirmation and a receipt.
                  </li>
                </ol>
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
            <li class="col-3"><a href="../main/About page/About.html">About Us</a></li>
            <li class="col-3"><a href="../main/ContactUs.html">Contact Us</a></li>
          </ul>
        </div>
      </footer>

      <!-- <nav>
        <img class="logo" src="../Images/logo.jpg" />
        <ul>
          <li><a href="../main/index.html">Home</a></li>
          <li><a href="../main/register.html">Register</a></li>
          <li><a href="../main/login.html">Login</a></li>
        </ul>
        <img src="../Images/moon.png" id="icon" />
      </nav> -->
    </div>

    <script src="script.js"></script>
  </body>
</html>



    