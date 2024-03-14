<%@page import="java.text.SimpleDateFormat"%>
<%@page import="simpleboard.model.simpleBoardDto"%>
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
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<title>Insert title here</title>
<style type="text/css">
  body * {
    font-family: 'Nanum Brush Script';
    font-size: 18pt;
  }
  
  span.day {
    color: #ccc;
    font-size: 0.8em;
  }
</style>
</head>

 <%
   String num = request.getParameter("num");
   simpleBoardDao dao = new simpleBoardDao();
   
   //dto 가져오는
   simpleBoardDto dto = dao.getContent(num);
   
   //조회수 가져오는
   dao.updateReadCount(num);
   
   //날따
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
   
 %>
<body>
 <div style="margin: 50px 100px; width: 500px;">
   <table class="table table-bordered">
     <caption align="top"><b style="font-size: 15pt;"><%=dto.getSubject() %></b></caption>
     <tr>
       <td>
         <b>작성자 : <%=dto.getWriter() %></b><br>
         <span class="day"><%=sdf.format(dto.getWriteday()) %></span>
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         조회 : <%=dto.getReadcount() %>
       </td>
     </tr>
     
     <tr height="250">
       <td>
         <%=dto.getContent().replace("\n", "<br>") %>
       </td>
     </tr>
     
     <tr>
       <td align="center">
         <button type="button" class="btn btn-outline-info btn-sm" onclick="location.href='addForm.jsp'">
         <i class="bi bi-pencil-square"></i>글쓰기</button>
         <button type="button" class="btn btn-outline-success btn-sm" onclick="location.href='boardList.jsp'">
         <i class="bi bi-view-list"></i>목록</button>
         <button type="button" class="btn btn-outline-warning btn-sm" onclick="location.href='updatePassForm.jsp?num=<%=dto.getNum()%>'">
         <i class="bi bi-save"></i>수정</button>
         <button type="button" class="btn btn-outline-danger btn-sm" onclick="location.href='deletePassForm.jsp?num=<%=dto.getNum()%>'">
         <i class="bi bi-x-square"></i>삭제</button>
       </td>
     </tr>
   </table>
 </div>

</body>
</html>