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
  <h3>oneInclude_07.jsp를 include하기</h3>
  <%
    request.setCharacterEncoding("utf-8");  //한글이나 포스트 방식으로 할 때 쓰면 깨짐현상 방지
  %>
  
  <jsp:include page="oneInclude_07.jsp">
    <jsp:param value="오늘은 좋은날!!!" name="msg"/>
    <jsp:param value="../image/Food/1.jpg" name="imgname"/>
  </jsp:include>
</body>
</html>