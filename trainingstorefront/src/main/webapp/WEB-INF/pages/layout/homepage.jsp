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
<body>
<div class="main"> 
  <!-- HEADER START -->
  	<c:import url="/layout/header"/>
  <!-- HEADER END --> 

  <!-- BANNER STRAT -->
  <div class="banner">
    <div class="main-banner">
      <div class="banner-1"> 
        <img src="${pageContext.request.contextPath}/static/images/banner1.jpg" alt="Pioneer"> 
        <div class="banner-detail">
          <div class="container">
            <div class="row">
              <div class="col-sm-7 col-xs-8">
                <div class="banner-detail-inner">
                  <span class="slogan">Super Sale 2017 </span>
                  <h1 class="banner-title"><span>Farm Fresh</span> <br> vegetables</h1>
                </div>
              </div>
              <div class="col-sm-5 col-xs-4"></div>
            </div>
          </div>
        </div>
      </div>
      <div class="banner-2"> 
        <img src="${pageContext.request.contextPath}/static/images/banner2.jpg" alt="Pioneer">
        <div class="banner-detail">
          <div class="container">
            <div class="row">
              <div class="col-sm-6 col-xs-4"></div>
              <div class="col-sm-6 col-xs-8">
                <div class="banner-detail-inner">
                  <span class="slogan">Real taste at home</span>
                  <h1 class="banner-title"><span>Extra hot</span> <br> Malsika chillis</h1>
                </div>
              </div>
            </div>
          </div> 
        </div>
      </div>
      <div class="banner-3"> 
        <img src="${pageContext.request.contextPath}/static/images/banner3.jpg" alt="Pioneer">
        <div class="banner-detail">
          <div class="container">
            <div class="row">
              <div class="">
                <div class="banner-detail-inner">
                  <span class="slogan">Organic and healthy food</span>
                  <h1 class="banner-title"><span>Buy daily vedetables</span> <br> At best price in pioneer</h1>
                </div>
              </div>
            </div>
          </div> 
        </div>
      </div>
    </div>
  </div>
  <!-- BANNER END --> 
  
  <!-- CONTAIN START -->
  <section>
    <div class="container">
      <div class="sub-banner-block center-xs">
        <div class="row m-0">
          <div class="col-sm-4 p-0">
            <div class="sub-banner sub-banner1 " style="visibility: visible; animation-name: zoomIn;">
              <a>
                <img alt="Pioneer" src="${pageContext.request.contextPath}/static/images/sub-banner1.jpg">
                <div class="sub-banner-detail">
                  <div class="sub-banner-title">Organic Foods</div>
                  <div class="sub-banner-subtitle">Shop More Variety</div>
                </div>
              </a>
            </div>
          </div>
          <div class="col-sm-4 p-0">
            <div class="sub-banner sub-banner2 " style="visibility: visible; animation-name: zoomIn;">
              <a>
                <img alt="Pioneer" src="${pageContext.request.contextPath}/static/images/sub-banner2.jpg">
                <div class="sub-banner-detail">
                  <div class="sub-banner-title">Flavor of the week</div>
                  <div class="sub-banner-subtitle">40% Discount</div>
                </div>
              </a>
            </div>
          </div>
          <div class="col-sm-4 p-0">
            <div class="sub-banner sub-banner3 " style="visibility: visible; animation-name: zoomIn;">
              <a>
                <img alt="Pioneer" src="${pageContext.request.contextPath}/static/images/sub-banner3.jpg">
                <div class="sub-banner-detail">
                  <div class="sub-banner-title">Delicious-Fruits</div>
                  <div class="sub-banner-subtitle">Order Today!</div>
                </div>
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!--  Featured Products Slider Block Start  -->
  <section class="ptb-95">
    <div class="container">
      <div class="featured-product">
        <div class="row">
          <div class="col-xs-12">
            <div class="heading-part align-center mb-40">
              <h2 class="main_title">Featured Products</h2>
            </div>
          </div>
        </div>
        <div class="row mlr_-20">
          <div class="product-slider-main position-r">
            <div class="col-md-3 col-sm-4 col-xs-6 plr-20 mb-30">
              <div class="product-item">
                <div class="product-image">
                  <div class="sale-label"><span>Sale</span></div>
                  <a href="product-page.html">
                    <img src="${pageContext.request.contextPath}/static/images/1.jpg" alt="Pioneer">
                  </a>
                </div>
                <div class="product-item-details">
                  <div class="rating-summary-block">
                    <div title="53%" class="rating-result">
                      <span style="width:53%"></span>
                    </div>
                    <span class="label-review"><span>( 2 review )</span></span>
                  </div>
                  <div class="product-item-name">
                    <a href="product-page.html">Defyant Reversible Dot Shorts</a>
                  </div>
                  <div class="price-box">
                    <span class="price">$80.00</span>
                    <del class="price old-price">$100.00</del>
                  </div>
                </div>
                <div class="product-detail-inner">
                  <div class="detail-inner-left right-side">
                    <ul>
                      <li class="pro-wishlist-icon active"><a href="#"></a></li>
                      <li class="pro-compare-icon"><a href="#"></a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-4 col-xs-6 plr-20 mb-30">
              <div class="product-item">
                <div class="product-image">
                  <a href="product-page.html">
                    <img src="${pageContext.request.contextPath}/static/images/2.jpg" alt="">
                  </a>
                </div>
                <div class="product-item-details">
                  <div class="rating-summary-block">
                    <div title="53%" class="rating-result">
                      <span style="width:53%"></span>
                    </div>
                  </div>
                  <div class="product-item-name">
                    <a href="product-page.html">Defyant Reversible Dot Shorts</a>
                  </div>
                  <div class="price-box">
                    <span class="price">$80.00</span>
                  </div>
                </div>
                <div class="product-detail-inner">
                  <div class="detail-inner-left right-side">
                    <ul>
                      <li class="pro-wishlist-icon"><a href="#"></a></li>
                      <li class="pro-compare-icon"><a href="#"></a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-4 col-xs-6 plr-20 mb-30">
              <div class="product-item">
                <div class="product-image">
                  <a href="product-page.html">
                    <img src="${pageContext.request.contextPath}/static/images/3.jpg" alt="">
                  </a>
                </div>
                <div class="product-item-details">
                  <div class="rating-summary-block">
                    <div title="53%" class="rating-result">
                      <span style="width:53%"></span>
                    </div>
                  </div>
                  <div class="product-item-name">
                    <a href="product-page.html">Defyant Reversible Dot Shorts</a>
                  </div>
                  <div class="price-box">
                    <span class="price">$80.00</span>
                  </div>
                </div>
                <div class="product-detail-inner">
                  <div class="detail-inner-left right-side">
                    <ul>
                      <li class="pro-wishlist-icon"><a href="#"></a></li>
                      <li class="pro-compare-icon"><a href="#"></a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-4 col-xs-6 plr-20 mb-30">
              <div class="product-item">
                <div class="product-image">
                  <a href="product-page.html">
                    <img src="${pageContext.request.contextPath}/static/images/4.jpg" alt="">
                  </a>
                </div>
                <div class="product-item-details">
                  <div class="rating-summary-block">
                    <div title="53%" class="rating-result">
                      <span style="width:53%"></span>
                    </div>
                  </div>
                  <div class="product-item-name">
                    <a href="product-page.html">Defyant Reversible Dot Shorts</a>
                  </div>
                  <div class="price-box">
                    <span class="price">$80.00</span>
                  </div>
                </div>
                <div class="product-detail-inner">
                  <div class="detail-inner-left right-side">
                    <ul>
                      <li class="pro-wishlist-icon"><a href="#"></a></li>
                      <li class="pro-compare-icon"><a href="#"></a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-4 col-xs-6 plr-20 mb-30">
              <div class="product-item">
                <div class="product-image">
                  <a href="product-page.html">
                    <img src="${pageContext.request.contextPath}/static/images/5.jpg" alt="Pioneer">
                  </a>
                </div>
                <div class="product-item-details">
                  <div class="rating-summary-block">
                    <div title="53%" class="rating-result">
                      <span style="width:53%"></span>
                    </div>
                    <span class="label-review"><span>( 2 review )</span></span>
                  </div>
                  <div class="product-item-name">
                    <a href="product-page.html">Defyant Reversible Dot Shorts</a>
                  </div>
                  <div class="price-box">
                    <span class="price">$80.00</span>
                  </div>
                </div>
                <div class="product-detail-inner">
                  <div class="detail-inner-left right-side">
                    <ul>
                      <li class="pro-wishlist-icon active"><a href="#"></a></li>
                      <li class="pro-compare-icon"><a href="#"></a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-4 col-xs-6 plr-20 mb-30">
              <div class="product-item">
                <div class="product-image">
                  <a href="product-page.html">
                    <img src="${pageContext.request.contextPath}/static/images/6.jpg" alt="">
                  </a>
                </div>
                <div class="product-item-details">
                  <div class="rating-summary-block">
                    <div title="53%" class="rating-result">
                      <span style="width:53%"></span>
                    </div>
                  </div>
                  <div class="product-item-name">
                    <a href="product-page.html">Defyant Reversible Dot Shorts</a>
                  </div>
                  <div class="price-box">
                    <span class="price">$80.00</span>
                  </div>
                </div>
                <div class="product-detail-inner">
                  <div class="detail-inner-left right-side">
                    <ul>
                      <li class="pro-wishlist-icon"><a href="#"></a></li>
                      <li class="pro-compare-icon"><a href="#"></a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-4 col-xs-6 plr-20 mb-30">
              <div class="product-item">
                <div class="product-image">
                  <div class="sale-label"><span>Sale</span></div>
                  <a href="product-page.html">
                    <img src="${pageContext.request.contextPath}/static/images/7.jpg" alt="">
                  </a>
                </div>
                <div class="product-item-details">
                  <div class="rating-summary-block">
                    <div title="53%" class="rating-result">
                      <span style="width:53%"></span>
                    </div>
                  </div>
                  <div class="product-item-name">
                    <a href="product-page.html">Defyant Reversible Dot Shorts</a>
                  </div>
                  <div class="price-box">
                    <span class="price">$80.00</span>
                    <del class="price old-price">$100.00</del>
                  </div>
                </div>
                <div class="product-detail-inner">
                  <div class="detail-inner-left right-side">
                    <ul>
                      <li class="pro-wishlist-icon"><a href="#"></a></li>
                      <li class="pro-compare-icon"><a href="#"></a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-4 col-xs-6 plr-20 mb-30">
              <div class="product-item">
                <div class="product-image">
                  <a href="product-page.html">
                    <img src="${pageContext.request.contextPath}/static/images/8.jpg" alt="">
                  </a>
                </div>
                <div class="product-item-details">
                  <div class="rating-summary-block">
                    <div title="53%" class="rating-result">
                      <span style="width:53%"></span>
                    </div>
                  </div>
                  <div class="product-item-name">
                    <a href="product-page.html">Defyant Reversible Dot Shorts</a>
                  </div>
                  <div class="price-box">
                    <span class="price">$80.00</span>
                  </div>
                </div>
                <div class="product-detail-inner">
                  <div class="detail-inner-left right-side">
                    <ul>
                      <li class="pro-wishlist-icon"><a href="#"></a></li>
                      <li class="pro-compare-icon"><a href="#"></a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!--  Featured Products Slider Block End  -->

  <section class="bg">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="client-main client-bg">
            <div class="client-inner mtb-60 align-center">
              <div id="client" class="owl-carousel">
                <div class="item client-detail">
                  <div class="client-img ">
                    <img alt="Pioneer" src="${pageContext.request.contextPath}/static/images/testimonial_img1.jpg">
                  </div>
                  <div class="quote">
                    <p>"Majority have suffered alteration in aome from, by injected believable.There  varation words able s, but also the leap into electronic typesetting, 1960s with the release of Letraset sheetpassage."
                    </p>
                    <h4 class="sub-title client-title">- Joseph deboungawer - </h4>
                    <div class="designation">Maneger</div>
                  </div>
                </div>
                <div class="item client-detail">
                  <div class="client-img ">
                    <img alt="Pioneer" src="${pageContext.request.contextPath}/static/images/testimonial_img2.jpg">
                  </div>
                  <div class="quote">
                    <p>"Vivamus dignissim lacinia sem dictum commodo dui ultrices eget phasellus id nunc iaculis rutrum felis porttitor tempus sapien. unchanged. It was make a type specimen book. It has survived not only five centuries."
                    </p>
                    <h4 class="sub-title client-title">- Joseph deboungawer -</h4>
                    <div class="designation">Maneger</div>
                  </div>
                </div>
                <div class="item client-detail">
                  <div class="client-img ">
                    <img alt="Pioneer" src="${pageContext.request.contextPath}/static/images/testimonial_img3.jpg">
                  </div>
                  <div class="quote">
                    <p>"Nullam fermentum sem nec urna faucibus ultrices Maecenas Morbi orci in lorem nibh Morbi ac vulputate mi remaining essentially unchanged. It was make a type specimen book. It has survived not only five centuries."</p>
                    <h4 class="sub-title client-title">- Joseph deboungawer -</h4>
                    <div class="designation">Maneger</div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <section class="ptb-95">
    <div class="cat-block">
      <div class="container">
        <div class="row mlr_-25">
          <div class="col-sm-6 plr-25">
            <div class="product-slider owl-slider mb-xs-30">
              <div class="row">
                <div class="col-xs-12">
                  <div class="heading-part mb-40">
                    <h2 class=""><span></span>Best seller</h2>
                  </div>
                </div>
              </div>
              <div class="row mlr_-20">
                <div class="owl-carousel best-seller-pro">
                  <div class="item  plr-20">
                    <div class="cat-box">
                      <div class="cat-box-inner">
                        <ul>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/2.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/6.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                  <div class="item  plr-20">
                    <div class="cat-box">
                      <div class="cat-box-inner">
                        <ul>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/4.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/13.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                  <div class="item  plr-20">
                    <div class="cat-box">
                      <div class="cat-box-inner">
                        <ul>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/1.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/14.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                  <div class="item  plr-20">
                    <div class="cat-box">
                      <div class="cat-box-inner">
                        <ul>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/3.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/12.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-sm-6 plr-25">
            <div class="product-slider owl-slider">
              <div class="row">
                <div class="col-xs-12">
                  <div class="heading-part mb-40">
                    <h2 class=""><span></span>Special Products</h2>
                  </div>
                </div>
              </div>
              <div class="row mlr_-20">
                <div class="owl-carousel best-seller-pro">
                  <div class="item  plr-20">
                    <div class="cat-box">
                      <div class="cat-box-inner">
                        <ul>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/2.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/6.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                  <div class="item  plr-20">
                    <div class="cat-box">
                      <div class="cat-box-inner">
                        <ul>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/4.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/13.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                  <div class="item  plr-20">
                    <div class="cat-box">
                      <div class="cat-box-inner">
                        <ul>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/1.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/14.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                  <div class="item  plr-20">
                    <div class="cat-box">
                      <div class="cat-box-inner">
                        <ul>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/3.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                          <li>
                            <div class="pro-media"> 
                              <a><img src="${pageContext.request.contextPath}/static/images/12.jpg" alt="T-shirt"></a> 
                            </div>
                            <div class="pro-detail-info">
                              <div class="rating-summary-block">
                                <div title="53%" class="rating-result">
                                  <span style="width:53%"></span>
                                </div>
                              </div>
                              <a>Jersey Top with Design</a>
                              <div class="price-box">
                                <span class="price">$80.00</span>
                              </div>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <section class="">
    <div class="container">
      <div class="center-xs"> 
        <div class="row m-0">
          <div class="col-lg-3 col-sm-6 p-0">
            <div class="ser-feature-block">
              <div class="feature-box feature1">
                <div class="ser-title">24/7 Support</div>
                <div class="ser-subtitle">We Support online 24 hours a day</div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-sm-6 p-0">
            <div class="ser-feature-block">
              <div class="feature-box feature2">
                <div class="ser-title">Free Return</div>
                <div class="ser-subtitle">30 days moneyback Guarantee</div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-sm-6 p-0">
            <div class="ser-feature-block">
              <div class="feature-box feature3">
                <div class="ser-title">Perfect Quality</div>
                <div class="ser-subtitle">Delivery with Satisfaction</div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-sm-6  p-0">
            <div class="ser-feature-block">
              <div class="feature-box feature4">
                <div class="ser-title">Member Discount</div>
                <div class="ser-subtitle">Open 9.00AM-Close 21.00PM</div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <section>
    <div class="blog-main pt-95">
      <div class="container">
        <div class="row">
          <div class="col-xs-12">
            <div class="heading-part align-center mb-40">
              <h2 class="main_title">From Our Blog</h2>
            </div>
          </div>
        </div>
        <div class="owl-slider">
          <div class="row blog_slider owlcarousel m-0">
            <div class="item p-0">
              <div class="blog-item ">
                <div class="blog-media">
                  <img src="${pageContext.request.contextPath}/static/images/blog_img1.jpg" alt="Pioneer">
                </div>
                <div class="blog-detail">
                  <div class="blog-detail-inner">
                    <div class="blog-contant">
                      <span>01 jan 2017</span>
                      <h4 class="blog-title"><a href="single-blog.html">This is paper spring Summer 2015 Linen</a></h4>
                      <div class="post-info">
                        <ul>
                          <li><a href="single-blog.html">Read more...</a></li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="item p-0">
              <div class="blog-item ">
                <div class="blog-media">
                  <img src="${pageContext.request.contextPath}/static/images/blog_img2.jpg" alt="Pioneer">
                </div>
                <div class="blog-detail">
                  <div class="blog-detail-inner">
                    <div class="blog-contant">
                      <span>01 jan 2017</span>
                      <h4 class="blog-title"><a href="single-blog.html">This is paper spring Summer 2015 Linen</a></h4>
                      <div class="post-info">
                        <ul>
                          <li><a href="single-blog.html">Read more...</a></li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="item p-0">
              <div class="blog-item ">
                <div class="blog-media">
                  <img src="${pageContext.request.contextPath}/static/images/blog_img3.jpg" alt="Pioneer">
                </div>
                <div class="blog-detail">
                  <div class="blog-detail-inner">
                    <div class="blog-contant">
                      <span>01 jan 2017</span>
                      <h4 class="blog-title"><a href="single-blog.html">This is paper spring Summer 2015 Linen</a></h4>
                      <div class="post-info">
                        <ul>
                          <li><a href="single-blog.html">Read more...</a></li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="item p-0">
              <div class="blog-item ">
                <div class="blog-media">
                  <img src="${pageContext.request.contextPath}/static/images/blog_img4.jpg" alt="Pioneer">
                </div>
                <div class="blog-detail">
                  <div class="blog-detail-inner">
                    <div class="blog-contant">
                      <span>01 jan 2017</span>
                      <h4 class="blog-title"><a href="single-blog.html">This is paper spring Summer 2015 Linen</a></h4>
                      <div class="post-info">
                        <ul>
                          <li><a href="single-blog.html">Read more...</a></li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="item p-0">
              <div class="blog-item ">
                <div class="blog-media">
                  <img src="${pageContext.request.contextPath}/static/images/blog_img5.jpg" alt="Pioneer">
                </div>
                <div class="blog-detail">
                  <div class="blog-detail-inner">
                    <div class="blog-contant">
                      <span>01 jan 2017</span>
                      <h4 class="blog-title"><a href="single-blog.html">This is paper spring Summer 2015 Linen</a></h4>
                      <div class="post-info">
                        <ul>
                          <li><a href="single-blog.html">Read more...</a></li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
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
