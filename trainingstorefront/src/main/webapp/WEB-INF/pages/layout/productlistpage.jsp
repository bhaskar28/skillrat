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
  	<section class="pb-95">
    <div class="container">
      <div class="row">
        <div class="col-md-3 col-sm-4 mb-xs-30">
          <div class="sidebar-block">
            <div class="sidebar-box listing-box mb-40">
              <span class="opener plus"></span>
              <div class="main_title sidebar-title">
                <h3><span>Categories</span> Products</h3>
              </div>
              <div class="sidebar-contant">
                <ul>
                  <li><a>Clothing <span>(21)</span></a></li>
                  <li><a>Shoes <span>(05)</span></a></li>
                  <li><a>Jewellery <span>(10)</span></a></li>
                  <li><a>Home & Furniture <span>(12)</span></a></li>
                  <li><a>Bags <span>(18)</span></a></li>
                  <li><a>Accessories <span>(70)</span></a></li>
                </ul>
              </div>
            </div>
            <div class="sidebar-box filter-sidebar mb-40">
              <span class="opener plus"></span>
              <div class="main_title sidebar-title">
                <h3><span>Products</span> Filter</h3>
              </div>
              <div class="sidebar-contant">
                <div class="price-range mb-30">
                  <div class="inner-title">Price range</div>
                  <input class="price-txt" type="text" id="amount">
                  <div id="slider-range"></div>
                </div>
                <div class="filter-inner-box mb-20">
                  <div class="inner-title">Manufacture</div>
                  <ul>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="apple-brand"></span>
                      <label for="apple-brand">Apple  <span>(15)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="prada-brand"></span>
                      <label for="prada-brand">Prada <span>(05)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="canon-brand"></span>
                      <label for="canon-brand">Canon <span>(10)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="htc-brand"></span>
                      <label for="htc-brand">HTC <span>(10)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="palm-brand"></span>
                      <label for="palm-brand">Palm <span>(10)</span></label>
                    </li>
                  </ul>
                </div>
                <div class="filter-inner-box mb-20">
                  <div class="inner-title">Color</div>
                  <ul>
                    <li class="active">
                      <span><input type="checkbox" class="checkbox" id="black-color"></span>
                      <label for="black-color">Black  <span>(15)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="blue-color"></span>
                      <label for="blue-color">Blue <span>(05)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="brown-color"></span>
                      <label for="brown-color">Brown <span>(10)</span></label>
                    </li>
                  </ul>
                </div>
                <div class="filter-inner-box mb-20">
                  <div class="inner-title">Size</div>
                  <ul>
                    <li class="active">
                      <span><input type="checkbox" class="checkbox" id="s-size"></span>
                      <label for="s-size">S  <span>(15)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="m-size"></span>
                      <label for="m-size">M <span>(05)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="l-size"></span>
                      <label for="l-size">L <span>(10)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="xl-size"></span>
                      <label for="xl-size">XL <span>(05)</span></label>
                    </li>
                    <li>
                      <span><input type="checkbox" class="checkbox" id="xxl-size"></span>
                      <label for="xxl-size">XXL <span>(10)</span></label>
                    </li>
                  </ul>
                </div>
                <a href="#" class="btn btn-black">Refine</a>
              </div>
            </div>
            <div class="sidebar-box mb-40 visible-sm visible-md visible-lg">
              <a href="#">
                <img src="images/left-banner.jpg" alt="Pioneer">
              </a>
            </div>
            <div class="sidebar-box sidebar-item">
              <span class="opener plus"></span>
              <div class="main_title sidebar-title">
                <h3><span>Best</span> Seller</h3>
              </div>
              <div class="sidebar-contant">
                <ul>
                  <li>
                    <div class="pro-media"> 
                      <a><img alt="T-shirt" src="images/1.jpg"></a> 
                    </div>
                    <div class="pro-detail-info">
                      <a>Black African Print</a>
                      <div class="rating-summary-block">
                        <div class="rating-result" title="53%">
                          <span style="width:53%"></span>
                        </div>
                      </div>
                      <div class="price-box">
                        <span class="price">$80.00</span>
                      </div>
                      <div class="cart-link">
                        <form>
                          <button title="Add to Cart">Add To Cart</button>
                        </form>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="pro-media"> 
                      <a><img alt="T-shirt" src="images/2.jpg"></a> 
                    </div>
                    <div class="pro-detail-info">
                      <a>Black African Print</a>
                      <div class="rating-summary-block">
                        <div class="rating-result" title="53%">
                          <span style="width:53%"></span>
                        </div>
                      </div>
                      <div class="price-box">
                        <span class="price">$80.00</span>
                      </div>
                      <div class="cart-link">
                        <form>
                          <button title="Add to Cart">Add To Cart</button>
                        </form>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="pro-media"> 
                      <a><img alt="T-shirt" src="images/3.jpg"></a> 
                    </div>
                    <div class="pro-detail-info">
                      <a>Black African Print</a>
                      <div class="rating-summary-block">
                        <div class="rating-result" title="53%">
                          <span style="width:53%"></span>
                        </div>
                      </div>
                      <div class="price-box">
                        <span class="price">$80.00</span>
                      </div>
                      <div class="cart-link">
                        <form>
                          <button title="Add to Cart">Add To Cart</button>
                        </form>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-9 col-sm-8">
          <div class="shorting mb-30">
            <div class="row">
              <div class="col-md-6">
                <div class="view">
                  <div class="list-types grid">
                    <a href="shop.html">
                      <div class="grid-icon list-types-icon"></div>
                    </a> 
                  </div>
                  <div class="list-types list active ">
                    <a href="shop-list.html">
                      <div class="list-icon list-types-icon"></div>
                    </a> 
                  </div>
                </div>
                <div class="short-by float-right-sm">
                  <span>Sort By</span>
                  <div class="select-item">
                    <select>
                      <option value="" selected="selected">Name (A to Z)</option>
                      <option value="">Name(Z - A)</option>
                      <option value="">price(low&gt;high)</option>
                      <option value="">price(high &gt; low)</option>
                      <option value="">rating(highest)</option>
                      <option value="">rating(lowest)</option>
                    </select>
                  </div>
                </div>
              </div>
              <div class="col-md-6">
                <div class="show-item right-side float-left-sm">
                  <span>Show</span>
                  <div class="select-item">
                    <select>
                      <option value="" selected="selected">24</option>
                      <option value="">12</option>
                      <option value="">6</option>
                    </select>
                  </div>
                  <span>Per Page</span>
                  <div class="compare float-right-sm">
                    <a href="#" class="btn btn-black">Compare (0)</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="product-listing">
            <div class="row">
              <div class="col-xs-12">
                <div class="shop-list-view">
                  <div class="product-item">
                    <div class="product-image">
                      <div class="sale-label"><span>Sale</span></div>
                      <a href="product-page.html">
                        <img src="images/1.jpg" alt="">
                      </a>
                    </div>
                  </div>
                  <div class="product-item-details">
                    <div class="rating-summary-block">
                      <div title="53%" class="rating-result">
                        <span style="width:53%"></span>
                      </div>
                    </div>
                    <div class="product-item-name">
                      <a href="product-page.html">Cross Colours Camo Print Tank half mengo</a>
                    </div>
                    <div class="price-box">
                      <span class="price">$80.00</span>
                      <del class="price old-price">$100.00</del>
                    </div>
                    <p>Proin lectus ipsum, gravida et mattis vulputate, tristique ut lectus. Sed et lorem nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean eleifend laoreet congue.</p>
                    <div class="detail-inner-left">
                      <ul>
                        <li class="pro-cart-icon">
                          <form>
                            <button title="Add to Cart"><span></span>Add to Cart</button>
                          </form>
                        </li>
                        <li class="pro-wishlist-icon active"><a href="#"></a></li>
                        <li class="pro-compare-icon"><a href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-xs-12">
                <div class="shop-list-view">
                  <div class="product-item">
                    <div class="product-image">
                      <a href="product-page.html">
                        <img src="images/2.jpg" alt="">
                      </a>
                    </div>
                  </div>
                  <div class="product-item-details">
                    <div class="rating-summary-block">
                      <div title="53%" class="rating-result">
                        <span style="width:53%"></span>
                      </div>
                      <span class="label-review"><span>( 2 review )</span></span>
                    </div>
                    <div class="product-item-name">
                      <a href="product-page.html">Cross Colours Camo Print Tank half mengo</a>
                    </div>
                    <div class="price-box">
                      <span class="price">$80.00</span>
                    </div>
                    <p>Proin lectus ipsum, gravida et mattis vulputate, tristique ut lectus. Sed et lorem nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean eleifend laoreet congue.</p>
                    <div class="detail-inner-left">
                      <ul>
                        <li class="pro-cart-icon">
                          <form>
                            <button title="Add to Cart"><span></span>Add to Cart</button>
                          </form>
                        </li>
                        <li class="pro-wishlist-icon"><a href="#"></a></li>
                        <li class="pro-compare-icon"><a href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-xs-12">
                <div class="shop-list-view">
                  <div class="product-item">
                    <div class="product-image">
                      <a href="product-page.html">
                        <img src="images/3.jpg" alt="">
                      </a>
                    </div>
                  </div>
                  <div class="product-item-details">
                    <div class="rating-summary-block">
                      <div title="53%" class="rating-result">
                        <span style="width:53%"></span>
                      </div>
                    </div>
                    <div class="product-item-name">
                      <a href="product-page.html">Cross Colours Camo Print Tank half mengo</a>
                    </div>
                    <div class="price-box">
                      <span class="price">$80.00</span>
                    </div>
                    <p>Proin lectus ipsum, gravida et mattis vulputate, tristique ut lectus. Sed et lorem nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean eleifend laoreet congue.</p>
                    <div class="detail-inner-left">
                      <ul>
                        <li class="pro-cart-icon">
                          <form>
                            <button title="Add to Cart"><span></span>Add to Cart</button>
                          </form>
                        </li>
                        <li class="pro-wishlist-icon"><a href="#"></a></li>
                        <li class="pro-compare-icon"><a href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-xs-12">
                <div class="shop-list-view">
                  <div class="product-item">
                    <div class="product-image">
                      <div class="sale-label"><span>Sale</span></div>
                      <a href="product-page.html">
                        <img src="images/4.jpg" alt="">
                      </a>
                    </div>
                  </div>
                  <div class="product-item-details">
                    <div class="rating-summary-block">
                      <div title="53%" class="rating-result">
                        <span style="width:53%"></span>
                      </div>
                    </div>
                    <div class="product-item-name">
                      <a href="product-page.html">Cross Colours Camo Print Tank half mengo</a>
                    </div>
                    <div class="price-box">
                      <span class="price">$80.00</span>
                      <del class="price old-price">$100.00</del>
                    </div>
                    <p>Proin lectus ipsum, gravida et mattis vulputate, tristique ut lectus. Sed et lorem nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean eleifend laoreet congue.</p>
                    <div class="detail-inner-left">
                      <ul>
                        <li class="pro-cart-icon">
                          <form>
                            <button title="Add to Cart"><span></span>Add to Cart</button>
                          </form>
                        </li>
                        <li class="pro-wishlist-icon"><a href="#"></a></li>
                        <li class="pro-compare-icon"><a href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-xs-12">
                <div class="shop-list-view">
                  <div class="product-item">
                    <div class="product-image">
                      <a href="product-page.html">
                        <img src="images/5.jpg" alt="">
                      </a>
                    </div>
                  </div>
                  <div class="product-item-details">
                    <div class="rating-summary-block">
                      <div title="53%" class="rating-result">
                        <span style="width:53%"></span>
                      </div>
                      <span class="label-review"><span>( 2 review )</span></span>
                    </div>
                    <div class="product-item-name">
                      <a href="product-page.html">Cross Colours Camo Print Tank half mengo</a>
                    </div>
                    <div class="price-box">
                      <span class="price">$80.00</span>
                      <del class="price old-price">$100.00</del>
                    </div>
                    <p>Proin lectus ipsum, gravida et mattis vulputate, tristique ut lectus. Sed et lorem nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean eleifend laoreet congue.</p>
                    <div class="detail-inner-left">
                      <ul>
                        <li class="pro-cart-icon">
                          <form>
                            <button title="Add to Cart"><span></span>Add to Cart</button>
                          </form>
                        </li>
                        <li class="pro-wishlist-icon"><a href="#"></a></li>
                        <li class="pro-compare-icon"><a href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-xs-12">
                <div class="pagination-bar">
                  <ul>
                    <li><a href="#"><i class="fa fa-angle-left"></i></a></li>
                    <li class="active"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#"><i class="fa fa-angle-right"></i></a></li>
                  </ul>
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
