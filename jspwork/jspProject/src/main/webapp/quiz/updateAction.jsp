<%@page import="quiz.model.QuizDao"%>
<%@page import="quiz.model.QuizDto"%>
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
  //한글엔 코딩
  request.setCharacterEncoding("utf-8");
 
  //데이터 읽어서 dto담기
  String no = request.getParameter("no");
  String name = request.getParameter("name");
  String age = request.getParameter("age");
  String hp = request.getParameter("hp");
  String driver = request.getParameter("driver");
  
  
  QuizDto dto = new QuizDto();
  dto.setNo(no);
  dto.setName(name);
  dto.setAge(age);
  dto.setHp(hp);
  dto.setDriver(driver);
  
  //db에 저장
  QuizDao dao = new QuizDao();
  dao.infoUpdate(dto);
  
  
  //목록
  response.sendRedirect("list.jsp");
  
  %>
</body>
</html>