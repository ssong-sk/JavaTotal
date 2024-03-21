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
<title>Insert title here</title>
</head>
<%
   //프로젝트 경로
   String root = request.getContextPath();  
%>
<body>
  <img alt="" src="<%=root%>/image/sky2.jpg"  style="width: 790px; height: 300px;">
  <br>
  <br>
  <h4>지역별 여행지 둘러보기</h4>
  <img alt="" src="<%=root%>/image/travel1.JPG" style="width: 390px; height: 200px;">
  <img alt="" src="<%=root%>/image/travel2.JPG" style="width: 390px; height: 200px;"><br>
  <img alt="" src="<%=root%>/image/travel3.JPG" style="width: 390px; height: 200px; margin-bottom: 0px;">
  <img alt="" src="<%=root%>/image/travel4.JPG" style="width: 390px; height: 200px; margin-bottom: -10px;">
  
</body>
</html>