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
  request.setCharacterEncoding("utf-8");
  
  String writer = request.getParameter("writer");
  String subject = request.getParameter("subject");
  String content = request.getParameter("content");
  String pass = request.getParameter("pass");
  
  
  simpleBoardDto dto = new simpleBoardDto();
  
  dto.setWriter(writer);
  dto.setSubject(subject);
  dto.setContent(content);
  dto.setPass(pass);
  
  simpleBoardDao dao = new simpleBoardDao();
  dao.insertSimpleBoard(dto);
  
  
  //목록
  //response.sendRedirect("boardList.jsp");
  
  //insert 후 내용보기로 이동하려면 방금insert된 num값을 알아야함.
  int num = dao.getMaxNum();
  response.sendRedirect("contentView.jsp?num="+num);
 
  
  %>

</body>
</html>