<%@page import="simpleboardanswer.model.simpleAnswerDao"%>
<%@page import="simpleboardanswer.model.simpleAnswerDto"%>
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
 request.setCharacterEncoding("utf-8");
 
 String num = request.getParameter("num");
 String nickname = request.getParameter("nickname");
 String content = request.getParameter("content");
 
 simpleAnswerDto dto = new simpleAnswerDto();
 dto.setNum(num);
 dto.setNickname(nickname);
 dto.setContent(content);
 
 simpleAnswerDao dao = new simpleAnswerDao();
 dao.insertAnswer(dto);
 %>

</body>
</html>