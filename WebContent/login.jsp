<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Registration Page</title>
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
          <form action="ActionIndex" method="post">
          	<li><button type="submit">Home</button></li>
          </form>
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
                    Login Form
                  </h3>
                  <form action="LoginServlet" method="post">
                    <div class="row">
                      <div class="col-md-12 mb-4 pb-2">
                        <div class="form-outline">
                          <input
                            type="email"
                            id="emailAddress"
                            class="form-control form-control-lg"
                            name="email"
                          />
                          <label class="form-label" for="emailAddress"
                            >Email</label
                          >
                        </div>
                      </div>
                    </div>

                    <div class="row">
                      <div class="col-md-12 mb-4 pb-2">
                        <div class="form-outline">
                          <input
                            type="password"
                            id="pass"
                            class="form-control form-control-lg"
                            name="password"
                          />
                          <label class="form-label" for="pass">Password</label>
                        </div>
                      </div>
                    </div>
                    

                    <div class="mt-4 pt-2">
			<button type="submit" class="btn btn-primary">Login</button>
                    </div>
                    <p style="text-align:center;color:red;">${param.message}</p>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <footer class="footer text-center pb-2">
        <div class="col-md-12">s
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
