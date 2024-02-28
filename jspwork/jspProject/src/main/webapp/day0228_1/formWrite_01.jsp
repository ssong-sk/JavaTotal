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
   request.setCharacterEncoding("utf-8"); //post 사용시 한글깨짐 방지
  
   String name = request.getParameter("name");
   String pass = request.getParameter("pass");
   String license = request.getParameter("cblic");
  %>
  
  <h3 class="alert alert-danger">결과값 출력</h3>
  이름 : <%=name %><br>
  비밀번호 : <%=pass %><br>
  운전면허 : <%=license==null?"없음":"있음" %>
</body>
</html>