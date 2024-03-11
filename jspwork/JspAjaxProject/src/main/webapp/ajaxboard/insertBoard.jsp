<%@page import="ajaxboard.AjaxBoardDto"%>
<%@page import="ajaxboard.AjaxBoardDao"%>
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
 //post
 request.setCharacterEncoding("utf-8");
 
 String writer = request.getParameter("writer");
 String subject = request.getParameter("subject");
 String content = request.getParameter("content");
 String avata = request.getParameter("avata");
 
 
 //dto 받은값 넣기
 AjaxBoardDto dto = new AjaxBoardDto();
 dto.setWriter(writer);
 dto.setSubject(subject);
 dto.setContent(content);
 dto.setAvata(avata);
 
 //dao
 AjaxBoardDao dao = new AjaxBoardDao();
 
 //insert
 dao.insertBoard(dto);
%>
  
</body>
</html>