<%@page import="quiz.model.QuizDao"%>
<%@page import="info.model.infoDao"%>
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
  <!-- 3-3.입력폼의 데이터를 읽어서 db에 저장 후 목록으로 이동 -->
  
  <%
    request.setCharacterEncoding("utf-8");
  
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String hp = request.getParameter("hp");
    String driver = request.getParameter("driver");
    
    QuizDto dto = new QuizDto();
    
    dto.setName(name);
    dto.setAge(age);
    dto.setHp(hp);
    dto.setDriver(driver);
    
    QuizDao dao = new QuizDao();
    dao.infoInsert(dto);
    
    response.sendRedirect("list.jsp");
  
  %>

</body>
</html>