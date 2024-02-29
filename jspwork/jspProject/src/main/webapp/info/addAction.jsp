<%@page import="info.model.infoDao"%>
<%@page import="info.model.infoDto"%>
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
  
    String name = request.getParameter("name");
    String addr = request.getParameter("addr");
    
    //입력데이터를 dto로 묶어서 메서드로 전달
    infoDto dto=new infoDto();
    
    dto.setName(name);
    dto.setAddr(addr);
    
    //insert메서드로 전달
    infoDao dao = new infoDao(); //생성해야 값을 가져올 수 있음
    dao.infoInsert(dto);
    
    //출력 jsp로 이동 -url 주소 바뀜
    response.sendRedirect("list.jsp"); //DB연동과 별개로 URL주소에 값을 입력받으면 list에 있는 내용을 페지지의 내용으로 이동해서 저장
    
   %>
</body>
</html>