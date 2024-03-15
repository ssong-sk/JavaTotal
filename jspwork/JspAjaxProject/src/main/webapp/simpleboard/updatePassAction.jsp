<%@page import="simpleboard.model.simpleBoardDao"%>
<%@page import="simpleboard.model.simpleBoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&family=Stylish&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
  <%
 
  String num = request.getParameter("num");
  String pass = request.getParameter("pass");
  
  simpleBoardDao dao = new simpleBoardDao();
  
  boolean flag = dao.isEqualPass(num, pass);
  
  
//비번이 맞으면 업데이트 폼으로 이동
  //비번이 틀리면 스크립트로 경고
  if(flag) {
	  
  	response.sendRedirect("updateForm.jsp?num="+num);
  }
  
  else {%>
  	<script type="text/javascript">
  	  alert("비밀번호가 틀렸어요");
  	  history.back();
  	</script>
  <%}
  
  
  %>

</body>
</html>