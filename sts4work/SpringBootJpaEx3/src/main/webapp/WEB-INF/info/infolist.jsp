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
<style type="text/css">
  .stuimg {
   width: 50px;
   height: 50px;
  }
</style>
</head>
<body>
  <div style="margin: 100px 100px; width: 800px;">
    <button type="button" class="btn btn-outline-warning" onclick="location.href='addform'">학생정보입력</button>
  <hr>
  <h5 class="alert alert-warning">${totalCount }명의 학생정보가 있습니다.</h5>

  <table class="table table-bordered">
    <tr class="table-warning">
      <td width="80">번호</td>
      <td width="120">학생명</td>
      <td width="180">사진</td>
      <td width="200">연락처</td>
      <td width="200">주소</td>
      <td width="150">편집</td>
    </tr>
    
    <c:forEach var="dto" items="${list }" varStatus="i">
      <tr>
        <td>${i.count }</td>
        <td>${dto.stuname }</td>
        <td>
           <img src="../${dto.stuphoto }" class="stuimg">
          </td>
        <td>${dto.stuhp }</td>
        <td>${dto.stuaddr }</td>
        <td>
          <button type="button" class="btn btn-outline-info btn-sm" 
          onclick="location.href='updateform?num=${dto.num}'">수정</button>
          <button type="button" class="btn btn-outline-danger btn-sm" 
          onclick="location.href='delete?num=${dto.num}'">삭제</button>
        </td>
      </tr>
    </c:forEach>
  </table>
  </div>
</body>
</html>