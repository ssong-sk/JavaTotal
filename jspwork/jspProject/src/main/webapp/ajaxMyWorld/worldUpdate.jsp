<%@page import="myworld.model.worldDao"%>
<%@page import="myworld.model.worldDto"%>
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
    //한글 엔코딩
    request.setCharacterEncoding("utf-8");
  
    //num, writer, content, avata
    String num = request.getParameter("unum");
    String writer = request.getParameter("uwriter");
    String content = request.getParameter("ucontent");
    String avata = request.getParameter("uavata");
    
    //dto 담기
    worldDto dto = new worldDto();
    dto.setNum(num);
    dto.setWriter(writer);
    dto.setContent(content);
    dto.setAvata(avata);
    
    //dao선언
    worldDao dao = new worldDao();
    
    //수정 메서드 호출
    dao.worldUpdata(dto);
  %>
</body>
</html>