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
  <div style="margin: 50px 250px; width: 500px;">
    <form action="insert" method="post" enctype="multipart/form-data">
      <table class="table table-bordered">
       <caption align="top"><h4><b>공고등록</b></h4></caption>
        <tr>
          <th class="table-light">공고명</th>
          <td>
            <input type="text" name="sangpum" class="form-control" style="width: 150px;" required="required">
          </td>
        </tr>
        
         <tr>
          <th class="table-light">단가</th>
          <td>
            <input type="text" name="price" class="form-control" style="width: 150px;" required="required">
          </td>
        </tr>
        
         <tr>
          <th class="table-light">공고이미지</th>
          <td>
            <input type="file" name="upload" class="form-control" style="width: 300px;" multiple="multiple">
          </td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
            <button type="submit" class="btn btn-outline-info">저장</button>
            <button type="button" class="btn btn-outline-success" onclick="location.href='list'">목록</button>
          </td>
        </tr>
      </table>
    </form>
  </div>
</body>
</html>