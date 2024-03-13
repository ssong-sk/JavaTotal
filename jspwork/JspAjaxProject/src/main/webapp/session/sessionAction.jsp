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
    request.setCharacterEncoding("utf-8"); //post 방식으로 한글꺠짐 방지
    
    //세션이 있는지 확인, 확인 후 없으면 선물 꽝!!!
    String msg = (String)session.getAttribute("msg"); //object 이므로 맞춰줘야 하기 때문에 String으로 맞춰줌.
    String gift = request.getParameter("gift");
    
    if(msg==null || !msg.equals("happy")) {%>
    	<h3 style="color: red;">시간초과로 꽝입니다</h3>
    <%}
    else {%>
    	<h3 style="color: blue;">축하합니다. <%=gift %>선물에 당첨 되셨습니다.!!</h3>
    <%}
  %>
  
  <a href="sessionMain.jsp">다시 선택</a>
</body>
</html>