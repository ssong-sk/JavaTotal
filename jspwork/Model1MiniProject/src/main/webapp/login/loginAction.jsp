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
<body>
 <%
   String id = request.getParameter("id");
   String pass = request.getParameter("pass");
   String cbsave = request.getParameter("cbsave"); //체크안하면 null
   
   MemberDao dao = new MemberDao();
   boolean b = dao.isEqualIdPass(id, pass);
   
   //아이디 비번 맞으면 세션 3개 저장 , 로그인 메인으로 이동
   if(b) {
	   session.setMaxInactiveInterval(60*60*8); //8시간동안 세션유지 / 생략시 30분
	   
	   session.setAttribute("loginok", "yes");
	   session.setAttribute("myid", id);
	   session.setAttribute("saveok", cbsave==null?null:"yes");
	   
	   response.sendRedirect("../index.jsp?main=login/loginMain.jsp");
   }
   
   else {%>
	   <script type="text/javascript">
	   alert("아이디 또는 비밀번호가 맞지 않습니다");
	   history.back();
	   </script>  
   <%}
 
 %>

</body>
</html>