<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="uploadboard.data.UploadBoardDto"%>
<%@page import="uploadboard.data.UploadBoardDao"%>
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
 <%
 String num = request.getParameter("num");
 UploadBoardDao dao = new UploadBoardDao();
 List<UploadBoardDto> list = dao.getAllDatas();
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

  %>
<head>
  <style>
    .album-grid {
      display: grid;
      grid-template-columns: repeat(5, 200px); /* 5개의 열로 구성 */
      
    }
  </style>
</head>
<body>
  <div>
    <button type="button" class="btn btn-info" onclick="location.href='addForm.jsp'">게시글 추가</button>
    
    <button type="button" class="btn btn-warning" onclick="location.href='boardList.jsp'">글 목록</button>
    
    <br><br>
    <h6 class="alert alert-info">총 <%=list.size() %>개의 게시글이 있습니다</h6>
  </div>
  <div class="album-grid">
    <% for (int i = 0; i < list.size(); i++) {
      UploadBoardDto dto = list.get(i);
      %>
      
      <div style="border: 1px solid gray; margin: 10px" align="center">
        <a href="content.jsp?num=<%=dto.getNum()%>">
          <img alt="" src="../save/<%=dto.getImgname()%>" style="width: 150px;">
        </a>
        <div><%=dto.getSubject()%></div>
        <div><%=dto.getWriter()%></div>
        <div><%=sdf.format(dto.getWriteday())%></div>
        <div>조회:<%=dto.getReadcount()%></div>
      </div>
    <% } %>
  </div>
</body>
</html>