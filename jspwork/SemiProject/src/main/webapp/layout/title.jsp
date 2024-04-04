<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&family=Stylish&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
    <link href="https: //fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">
<title>Insert title here</title>
<style type="text/css">

#primary_nav_wrap
{
	margin-top: 40px;
	margin-left: 10%;
}

#primary_nav_wrap ul
{
	list-style:none;
	position:relative;
	float:left;
	margin:0;
	padding:0;
	z-index: 9999;
}

#primary_nav_wrap ul a
{
	display:block;
	color:#333;
	text-decoration:none;
	font-weight:700;
	font-size:14px;
	line-height:32px;
	padding:0 15px;
	margin-left: 20px;
}

#primary_nav_wrap ul li
{
	position:relative;
	float:left;
	margin:0;
	padding:0
}



#primary_nav_wrap ul ul
{
	display:none;
	position:absolute;
	top:100%;
	left:0;
	background:#fff;
	padding:0
}

#primary_nav_wrap ul ul li
{
	float:none;
	width:140px
}

#primary_nav_wrap ul ul a
{
	line-height:120%;
	padding:10px 15px; 
}


#primary_nav_wrap ul li:hover > ul
{
	display:block
}




</style>
</head>
  <%
    //1.프로젝트 절대 경로 설정
    String root = request.getContextPath();
    
  %>
<body>
  <!-- 1. title 상부 만들기 -->
    <div class="d-inline-flex" style="width: 100%;">
       <!-- 이미지 로고 -->
       <a href="<%=root%>" style="color: #618E6E; text-decoration: none; display: flex; align-items: center;"">
       <img src="<%=root%>/image/logo1.png" style="width: 100px; margin-top: 5%; margin-left: 100%;">
       
       <div style="margin-top: 35px;line-height:100%">
            <span style="font-size: 20px;" ><b>HUEAT</b></span><br>
            <span style="font-size: 10px;">[머무르는곳]</span>
        </div>
      </a>
      
      <nav id="primary_nav_wrap">
		<ul>
		  <li><a href="#">소개</a>
		    <ul>
		      <li><a href="index.jsp?main=noticeboard/noticeList.jsp">공지사항</a></li>
		      <li><a href="#">소개글</a></li>
		      <li><a href="#">이벤트</a></li>
		    </ul>
		  </li>
		  
		  <li><a href="#">휴게소정보</a>
		    <ul>
		      <li><a href="#">휴게소찾기</a></li>
		      <li><a href="#">휴게소목록</a></li>
		    </ul>
		  </li>
		  
		  <li><a href="#">게시판</a>
		    <ul>
		      <li class="dir"><a href="#">고객문의</a></li>
		      <li class="dir"><a href="#">고객후기</a>
		    </ul>
		  </li>
		  
		  <li style="padding-left: 880px;"><a href="#">로그인</a></li>
		  <li><a href="#">회원가입</a></li>
		  
		</ul>
		</nav>
      
      
    </div>
    

</body>
</html>