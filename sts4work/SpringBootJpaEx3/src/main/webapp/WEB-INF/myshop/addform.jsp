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
  <div style="margin: 100px 100px; width: 300px;">
    <form action="insert" method="post">
      <table class="table table-bordered">
        <caption align="top"><b>상품등록</b></caption>
        <tr>
          <th>상품명</th>
          <td>
            <input type="text" name="sangname" class="form-control" style="width: 150px;" required="required">
          </td>
        </tr>
        
        <tr>
          <th>상품가격</th>
          <td>
            <input type="text" name="sangprice" class="form-control" style="width: 150px;" required="required">
          </td>
        </tr>
        
        <tr>
          <th>색상</th>
          <td>
            <input type="color" name="sangcolor" class="form-control" style="width: 150px;" required="required">
          </td>
        </tr>
        
        <tr>
          <th>입고일</th>
          <td>
            <input type="date" name="sangipgo" class="form-control" style="width: 150px;" required="required">
          </td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
            <input type="submit" class="btn btn-outline-success" value="등록">
            <input type="button" class="btn btn-outline-info" value="목록" onclick="location.href='list'"> 
          </td>
        </tr>
      </table>
    </form>
  </div>
</body>
</html>