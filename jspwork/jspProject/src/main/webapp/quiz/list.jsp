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
       <th width="120">이름</th>
       <th width="100">나이</th>
       <th width="250">핸드폰</th>
       <th width="150">운전면허</th>
       <th width="350">날짜</th>
       <th width="200">수정/삭제</th>
     </tr>
     
      <%
     for(int i = 0; i <list.size(); i++) {
    	 QuizDto dto= list.get(i);
    	 %>
    	 <tr>
    	   <td align="center"><%=i+1 %></td>
    	   <td><%=dto.getName() %></td>
    	   <td><%=dto.getAge() %></td>
    	   <td><%=dto.getHp() %></td>
    	   <td><%=dto.getDriver() %></td>
    	   <td><%=dto.getWriteday() %></td>
    	   <td>
    	     <button type="button" class="btn btn-info btn-sm" onclick="location.href='updateForm.jsp?no=<%=dto.getNo()%>'">수정</button>
    	     <button type="button" class="btn btn-danger btn-sm" onclick="location.href='deleteQuiz.jsp?no=<%=dto.getNo()%>'">삭제</button>
    	   </td>
    	 </tr> 
     <%}
    %>
   </table>
   
   
 </div>
  

</body>
</html>