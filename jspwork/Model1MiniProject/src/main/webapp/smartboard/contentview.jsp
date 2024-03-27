<%@page import="data.dao.smartDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.smartDto"%>
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
 <%
 String num = request.getParameter("num");
 smartDao dao = new smartDao();
 
 smartDto dto = dao.getData(num);
 
 //조회수 가져오기
 dao.updateReadcount(num);
 
 //날짜
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
 
 %>
<body>

  <!-- 1. 상세페이지 2.조회수 증가 3.맨아래에 목록, 글쓰기, 수정, 삭제 버튼 만들기-->
  
  <input type="hidden" id="num" value="<%=num%>">

  
  <div style="margin: 50px 100px; width: 700px;">
  <h6 style="font-size: 25pt;"><b>상세내용보기</b></h6>
   <table class="table table-bordered">
     <caption align="top"><b style="font-size: 16pt;"><%=dto.getSubject() %></b></caption>
     <tr>
       <td>
         <b>작성자 : <%=dto.getWriter() %></b><br>
         <span class="day"><%=sdf.format(dto.getWriteday()) %></span><br>
         조회 : <%=dto.getReadcount() %>
       </td>
     </tr>
     
      <tr height="250" >
       <td>
         <%=dto.getContent().replace("\n", "<br>") %>
       </td>
     </tr>
     
      <!-- 댓글 -->
     <tr>
       <td>
         <b class="acount">댓글<span>0</span></b>
         <div class="alist" id="alist">
           댓글목록
         </div>
         
       
       <!-- 버튼 -->
       
       <tr>
       <td align="center">
         <button type="button" class="btn btn-outline-info btn-sm" onclick="location.href='index.jsp?main=smartboard/smartform.jsp'">
         <i class="bi bi-pencil-square"></i>글쓰기</button>
         <button type="button" class="btn btn-outline-success btn-sm" onclick="location.href='index.jsp?main=smartboard/boardlist.jsp'">
         <i class="bi bi-view-list"></i>목록</button>
         <button type="button" class="btn btn-outline-warning btn-sm" onclick="location.href=''">
         <i class="bi bi-save"></i>수정</button>
         <button type="button" class="btn btn-outline-danger btn-sm" onclick="location.href=''">
         <i class="bi bi-x-square"></i>삭제</button>
       </td> 
  
  </div>

</body>
</html>