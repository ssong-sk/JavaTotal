<!DOCTYPE html>
<html>
<head>
<style>
  .slideshow-container {
    width: 100%;
   /*  position: relative; */
    margin: auto;
    border: 0px solid yellow;
    object-fit:cover;
  }
  .mySlides {
    display: none;
    width :100%;
    height: 30%;
    object-fit:cover;
  }
 
</style>
<%
    //1.프로젝트 절대 경로 설정
    String root = request.getContextPath();
    
%>
</head>
<body>

<div class="slideshow-container">
  <div class="mySlides">
  <img style="width: 100%; height: 550px; display: block;" src="<%=root%>/image/banner2.PNG">  
  </div>
  <div class="mySlides">
    <img style="width: 100%; height: 550px; display: block;" src="<%=root%>/image/banner3.jpg">
  </div>
  <div class="mySlides">
     <img style="width: 100%; height: 550px; display: block;" src="<%=root%>/image/banner4.jpg">  
  </div>
</div>

<script>


	var slideIndex = 0;

	function showSlides() {
		var i;
		var slides = document.getElementsByClassName("mySlides"); //img 불러오기
		
		for (i = 0; i < slides.length; i++) {
			slides[i].style.display = "none"; //화면에 숨겨놓음
		}
		slideIndex++; //증가
		
		if (slideIndex > slides.length) {
			
			slideIndex = 1
		}
		slides[slideIndex - 1].style.display = "block"; //화면에 나타나게함
		setTimeout(showSlides, 1500); // 2초마다 다음 사진으로 전환
	}

	window.onload = function() {
		showSlides(); //실행
	};
</script>

</body>
</html>
