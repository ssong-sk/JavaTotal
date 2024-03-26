<%@page import="data.dao.MemberDao"%>
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
   //프로젝트 경로 -> //root라는 절대 경로 설정(절대경로 테스트는 webapp에 index.jsp에 오른쪽마우스로 run as해서 확인가능)
   String root = request.getContextPath();  
%>
<body>
  <!-- a태그안을 클릭하면 메인페이지로 이동 -->
  <div class="d-inline-flex">
  <a href="<%=root %>" style="color: black; text-decoration: none;"><img alt="" src="<%=root%>/image/logo1.PNG" style="width: 280px; margin: 20px 1050px;">
  </a>
  </div>
  
  <div style="float: right; padding-right: 100px; margin: -120px 100px;">
     <%
       //로그인 세션얻기
       String loginok=(String)session.getAttribute("loginok");
       //아이디 얻기
       String myid=(String)session.getAttribute("myid");
       
       MemberDao dao=new MemberDao();
       String name=dao.getName(myid);
       
       if(loginok==null){%>
    	   <button type="button" class="btn btn-outline-info"
    	   style="width: 100px;"
    	   onclick="location.href='index.jsp?main=login/loginForm.jsp'">Login</button>
       <%}else{%>
    	   
    	   <b><%=name %>님 로그인중..</b>
    	   <button type="button" class="btn btn-outline-danger"
    	   style="width: 100px;"
    	   onclick="location.href='login/logoutAction.jsp'">Logout</button>
       <%}
     %>
   </div>
</body>
</html>