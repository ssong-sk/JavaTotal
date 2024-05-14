<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
  <div style="margin: 100px 100px; width: 500px;">
    <form action="update" method="post" enctype="multipart/form-data">
      <!-- hidden 5개 -->
      <input type="hidden" name="num" value="${dto.num }">
      <input type="hidden" name="currentPage" value="${currentPage }">
      
      <table class="table table-bordered">
        <caption align="top"><b>수정폼</b></caption>
        
        <tr>
          <th class="table-info" style="width: 100px;">작성자</th>
          <td>
            <input type="text" name="writer" required="required" class="form-control" style="width: 150px;" value="${dto.writer }">
          </td>
        </tr>
        
        <tr>
          <th class="table-info" style="width: 100px;">제목</th>
          <td>
            <input type="text" name="subject" required="required" class="form-control" style="width: 300px;" value="${dto.subject }">
          </td>
        </tr>
        
        <tr>
          <th class="table-info" style="width: 100px;">사진</th>
          <td>
            <input type="file" name="upload" class="form-control" style="width: 250px;" multiple="multiple">
          </td>
        </tr>
        
        <tr>
          <td colspan="2">
            <textarea name="content" class="form-control style="width: 500px; height: 200px;" required="required">${dto.content }</textarea>
          </td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
            <input type="submit" class="btn btn-outline-info" value="수정">
          </td>
        </tr>
      </table>
    </form>
  </div>
</body>
</html>