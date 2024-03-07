<%@page import="myworld.model.worldDto"%>
<%@page import="myworld.model.worldDao"%>
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
  worldDao dao = new worldDao();
  
  request.setCharacterEncoding("utf-8");
  
  //데이터 읽기(writer,content,avata)
  String writer = request.getParameter("writer");
  String content = request.getParameter("content");
  String avata = request.getParameter("avata");
  
  worldDto dto = new worldDto();
  dto.setWriter(writer);
  dto.setContent(content);
  dto.setAvata(avata);
  
  dao.insertWorld(dto);
%>

</body>
</html>