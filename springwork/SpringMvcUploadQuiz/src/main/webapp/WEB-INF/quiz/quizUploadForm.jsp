<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
   href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&display=swap"
   rel="stylesheet">
<link
   href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
   rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
</head>
<body>
  <form action="quizupload" method="post" enctype="multipart/form-data">
    <caption><h3>상품 등록</h3></caption>
    <table class="table table-bordered" style="width: 600px;">
        <tr>
          <th>제목</th>
          <td>
            <input type="text" name="title" class="form-control" style="width: 150px;">
          </td>
        </tr>
        
        <tr>
          <th>업로드</th>
          <td>
            <input type="file" name="photo" class="form-control" style="width: 400px;" multiple="multiple">
          </td>
        </tr>
        
        <tr>
          <th>가격</th>
          <td>
            <input type="text" name="price" class="form-control" style="width: 150px;">
          </td>
        </tr>
        
        <tr>
          <th>입고일</th>
          <td>
            <input type="date" name="ipgo" class="form-control" style="width: 150px;">
          </td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
            <button type="submit" class="btn btn-outline-success">등록</button>
          </td>
        </tr>
    </table>
  </form>
</body>
</html>