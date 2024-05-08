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
  <form action="mwrite" method="post">
    <table class="table table-bordered" style="width: 400px;">
      <tr>
        <th class="table-light">이름</th>
        <td>
          <input type="text" name="name" style="width: 120px;" required="required" class="form-control">
        </td>
      </tr>
      
       <tr>
        <th class="table-light">핸드폰번호</th>
        <td>
          <input type="text" name="hp" style="width: 150px;" required="required" class="form-control">
        </td>
      </tr>
      
       <tr>
        <th class="table-light">addr</th>
        <td>
          <input type="text" name="addr" style="width: 200px;" required="required" class="form-control">
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
</body>
</html>