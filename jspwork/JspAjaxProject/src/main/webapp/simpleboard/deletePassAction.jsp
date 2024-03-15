<%@page import="simpleboard.model.simpleBoardDao"%>
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
   String num = request.getParameter("num");
   String pass = request.getParameter("pass");
   
   simpleBoardDao dao = new simpleBoardDao();
   
   boolean flag = dao.isEqualPass(num, pass);
   
   
   if(flag) {
    
	//db삭제
	dao.deleteSimpleBoard(num);
	
	response.sendRedirect("boardList.jsp");
     
     }

    else {%>
	 <script type="text/javascript">
	   alert("비밀번호가 맞지않습니다");
	   history.back();
	 </script>
    <%}
 
 
 %>

</body>
</html>