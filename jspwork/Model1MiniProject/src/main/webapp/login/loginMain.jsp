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
   //세션에 저장된 loginok 가져오기
   String loginok=(String)session.getAttribute("loginok"); //오브젝트이기때문에 타입 맞춰줘야한다.
   
   if(loginok==null) //로그아웃상태 
   {%>
	   <jsp:include page="loginForm.jsp"/>  
   <%}
   
   else {%>
	   <jsp:include page="logoutForm.jsp"/>    
   <%}

%>

</body>
</html>