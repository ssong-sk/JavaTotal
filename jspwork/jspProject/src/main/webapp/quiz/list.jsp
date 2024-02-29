<%@page import="quiz.model.QuizDto"%>
<%@page import="java.util.Vector"%>
<%@page import="quiz.model.QuizDao"%>
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

  <%
   QuizDao dao = new QuizDao();
   Vector<QuizDto> list = dao.getAllDatas();
   
  %>
<body>
 <div style="margin: 50px 50px">
   <button type="button" class="btn btn-info" onclick="location.href='insertForm.jsp'">입력폼</button>
   
   <hr>
   
   <table class="table table-bordered" style="width: 800px">
     <caption align="top"><b>quizinfo 전체목록</b></caption>
     
     <tr>
       <th width="80">번호</th>
       <th width="80">이름</th>
       <th width="80">나이</th>
       <th width="80">핸드폰</th>
       <th width="80">운전면허</th>
       <th width="80">날짜</th>
     </tr>
   </table>
   
   
 </div>
  

</body>
</html>