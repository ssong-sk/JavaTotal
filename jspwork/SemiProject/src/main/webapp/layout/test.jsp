<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Grandiflora+One&family=Gugi&family=Hahmlet:wght@100..900&family=Hi+Melody&family=Sunflower:wght@300&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css" />

<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
$(function () {
	$('.post-wrapper').slick({
		  slidesToShow: 3,
		  slidesToScroll: 1,
		  autoplay: false,
		  autoplaySpeed: 2000,
		  nextArrow:$('.next'),
		  prevArrow:$('.prev'),
	});
});
	

</script>

<style>
.post-slider{
  width:70%;
  margin:0px auto;
  position:relative;
}
.post-slider .silder-title{
  text-align:center;
  margin:30px auto;
}
.post-slider .next{
  position:absolute;
  top:50%;
  right:30px;
  font-size:2em;
  color:gray;
  cursor: pointer;
}
.post-slider .prev{
  position:absolute;
  top:50%;
  left:30px;
  font-size:2em;
  color:gray;
    cursor: pointer;
}
.post-slider .post-wrapper{

  width:84%;
  height:350px;
  margin:0px auto;
  overflow: hidden;
  padding:10px 0px 10px 0px;
}
.post-slider .post-wrapper .post{
  width:300px;
  height:300px;
  margin:0px 10px;
  display:inline-block;
  background:white;
  border-radius: 5px;
}
.post-slider .post-wrapper .post .post-info{
  font-size:15px;
  height:30%;
  padding-left:10px;
}
.post-slider .post-wrapper .post .slider-image{
  width:100%;
  height:175px;
  border-top-left-radius:5px;
  border-top-right-radius:5px;
}	
  </style>
  
</head>

<body>
    <div class="page-wrapper" style="position:relative;">
      <!--page slider -->
      <div class="post-slider">
        <h1 class="silder-title">Trending Posts</h1>
        <i class="fas fa-chevron-left prev">=</i>  
        <i class="fas fa-chevron-right next">=</i>    
        <div class="post-wrapper">
          <div class="post">
            <img src="img/paris.jpg" class="slider-image">
            <div class="post-info">
              <h4><a href="#" class="post-subject">Lorem ipsu eiusmod tempor incididunt ut </a></h4>
              <i class="far fa-user" style="height:10%;">Awa Melvine</i>
            </div>
          </div>
          <div class="post">
            <img src="img/architecture.jpg" class="slider-image">
            <div class="post-info">
              <h4><a href="#"> Commodo odio aenean sed  </a></h4>
              <i class="far fa-user" style="height:10%;">Awa Melvine</i>
            </div>
          </div>
          <div class="post">
            <img src="img/paris.jpg" class="slider-image">
            <div class="post-info">
              <h4><a href="#">Quis hendrerit dolor magna eget est lorem ipsum dolor sit. </a></h4>
              <i class="far fa-user" style="height:10%;">Awa Melvine</i>
            </div>
          </div>
          <div class="post">
            <img src="img/gyungju.jpg" class="slider-image">
            <div class="post-info">
              <h4><a href="#">Elit at imperdiet dui accumsan sit.</a></h4>
              <i class="far fa-user" style="height:10%;">Awa Melvine</i>
            </div>
          </div>
        </div>
      </div>
      <!--post slider-->
    </div>
</body>
</html>