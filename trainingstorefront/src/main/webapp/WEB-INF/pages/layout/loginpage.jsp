<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<!-- Basic Page Needs
  ================================================== -->
<meta charset="utf-8">
<title>Pioneer Index</title>
<!-- SEO Meta
  ================================================== -->
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="distribution" content="global">
<meta name="revisit-after" content="2 Days">
<meta name="robots" content="ALL">
<meta name="rating" content="8 YEARS">
<meta name="Language" content="en-us">
<meta name="GOOGLEBOT" content="NOARCHIVE">
<!-- Mobile Specific Metas
  ================================================== -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<!-- CSS
  ================================================== -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/font-awesome.min.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/fotorama.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/magnific-popup.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/custom.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/responsive.css">

<link rel="shortcut icon" href="${pageContext.request.contextPath}/static/images/favicon.png">
<link rel="apple-touch-icon" href="${pageContext.request.contextPath}/static/images/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72" href="${pageContext.request.contextPath}/static/images/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114" href="${pageContext.request.contextPath}/static/images/apple-touch-icon-114x114.png">
</head>
<body >
<div class="se-pre-con"></div>
<div class="main"> 
  <!-- HEADER START -->
  	<c:import url="/layout/header"/>
  <!-- HEADER END -->


  <!-- Bread Crumb STRAT -->
  <div class="container">
    <div class="bread-crumb mtb-30 center-xs">
      <div class="page-title">Login</div>
      <div class="bread-crumb-inner right-side float-none-xs">
        <ul>
          <li><a href="index.html">Home</a><i class="fa fa-angle-right"></i></li>
          <li><span>Login</span></li>
        </ul>
      </div>
    </div>
  </div>
  <!-- Bread Crumb END --> 
  
  <!-- CONTAIN START -->
  <section class="checkout-section pb-95">
    <div class="container">
      <div class="row">
        <div class="col-xs-12">
          <div class="row">
            <div class="col-lg-6 col-md-8 col-sm-8 col-lg-offset-3 col-sm-offset-2">
              <form class="main-form full" action="j_spring_security_check" method="POST">
                <div class="row">
                  <div class="col-xs-12 mb-20">
                    <div class="heading-part heading-bg">
                      <h2 class="heading">Customer Login</h2>
                    </div>
                  </div>
                  <div class="col-xs-12">
                    <div class="input-box">
                      <label for="login-email">Email address</label>
                      <input id="login-email" type="email" required="" placeholder="Email Address" name="j_username">
                    </div>
                  </div>
                  <div class="col-xs-12">
                    <div class="input-box">
                      <label for="login-pass">Password</label>
                      <input id="login-pass" type="password" required="" placeholder="Enter your Password" name="j_password">
                    </div>
                  </div>
                  <div class="col-xs-12">
                    <div class="check-box left-side">
                      <span>
                        <input type="checkbox" name="remember_me" id="remember_me" class="checkbox">
                      </span>
                      <label for="remember_me">Remember Me</label>
                    </div>
                    <button name="submit" type="submit" class="btn-black right-side">Log In</button>
                  </div>
                  <div class="col-xs-12">
                    <a title="Forgot Password" class="forgot-password mtb-20" href="#">Forgot your password?</a>
                    <hr>
                  </div>
                  <div class="col-xs-12">
                    <div class="new-account align-center mt-20">
                      <span>New to Pioneer?</span>
                      <a class="link" title="Register with Pioneer" href="/trainingstorefront/register">Create New Account</a>
                    </div>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- CONTAINER END --> 

  <!-- FOOTER START -->
  	<c:import url="/layout/footer"/>
  <!-- FOOTER END --> 
</div>
<script src="${pageContext.request.contextPath}/static/js/jquery-1.12.3.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath}/static/js/fotorama.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.magnific-popup.js"></script>
<script src="${pageContext.request.contextPath}/static/js/owl.carousel.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/custom.js"></script>

</body>
</html>
