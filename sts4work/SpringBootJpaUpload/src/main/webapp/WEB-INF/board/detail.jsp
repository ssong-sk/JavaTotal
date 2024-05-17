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
    <table class="table table-bordered">
      <caption align="top"><b>상세보기</b></caption>
      <tr>
        <td><h5><b>${dto.subject }</b></h5><br>
        <span><b>${dto.writer }</b></span>
        <span style="float: right;">
         <fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd"/>
        </span>
        </td>
      </tr>
      
      <tr>
        <td>${dto.content }</td>
      </tr>
      
      <tr>
        <td>
          <button type="button" class="btn btn-outline-info">수정</button>
          <button type="button" class="btn btn-outline-danger">삭제</button>
          <button type="button" class="btn btn-outline-success" onclick="location.href='list'">목록</button>
        </td>
      </tr>
    </table>
  </div>
</body>
</html>