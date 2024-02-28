<%@page import="test.Student"%>
<%@page import="java.util.Vector"%>
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
   <h3>request에 Vector 저장 후 불러오는 연습</h3>
   
   <%
     Vector<Student> list = new Vector<>();
     list.add(new Student("이미영","강남구",88));
     list.add(new Student("김미영","종로구",90));
     list.add(new Student("박미영","영등포구",75));
     list.add(new Student("최미영","송파구",80));
     list.add(new Student("송미영","서초구",92));
     
     //데이터 vector를 request에 저장
     request.setAttribute("list", list);
     
     //페이지 이동 방법 2개 : forward(url주소안바뀜), redirect(url주소 바뀜)
   %>
   
   <jsp:forward page="stuForward_10.jsp"/>
</body>
</html>