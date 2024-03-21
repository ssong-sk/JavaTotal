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
<style type="text/css">
  div.layout {
    border: 0px solid gray;
    position: absolute;
  }
  
  div.title {
    width: 100%;
    font-family: 'Nanum Pen Script';
    height: 80px;
    line-height: 10px;
    font-size: 20pt;
    text-align: center;
    
  }
  
  div.menu {
    width: 100%;
    height: 80px;
    font-size: 20px;
    font-family: 'Nanum Pen Script';
    border: 0px solid gray;
    top: 120px;
  }
  
  div.info {
    width: 310px;
    height: 450px;
    line-height: 10px;
    font-size: 15pt;
    font-family: 'Nanum Pen Script';
    left: 130px;
    top: 140px;
    border: 1px solid gray;
    border-radius: 30px;
    padding: 30px 30px;
  }
  
  div.main {
    width: 800px;
    height: 700px;
    font-size: 15pt;
    border: 0px groove purple;
    font-family: 'Nanum Pen Script';
    left: 550px;
    top: 100px;
  }
</style>
</head>
<body>
<%
   //프로젝트 경로 -> root라는 절대 경로 설정(절대경로 테스트는 webapp에 index.jsp에 오른쪽마우스로 run as해서 확인가능)
   //String root = request.getContextPath();  
   String mainPage = "layout/main.jsp"; //기본페이지
   
   //url을 통해서 main값을 읽어서 메인페이지에 출력
   if(request.getParameter("main") != null) {
	   mainPage = request.getParameter("main");
   }
%>

</body>
  <div class="layout title"><jsp:include page="layout/title.jsp"/></div>
  <div class="layout menu"><jsp:include page="layout/menu.jsp"/></div>
  <div class="layout info"><jsp:include page="layout/info.jsp"/></div>
  <div class="layout main"><jsp:include page="<%=mainPage %>"/></div>  
</html>