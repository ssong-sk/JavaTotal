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
  <div style="margin: 200px 50px;">
    <button class="btn btn-outline-info btn-lg" style="width: 200px;"
    onclick="location.href='shop/form1'">각각읽기</button>
    <br><br>
    <button class="btn btn-outline-info btn-lg" style="width: 200px;"
    onclick="location.href='shop/form2'">dto 읽기</button>
    <br><br>
    <button class="btn btn-outline-info btn-lg" style="width: 200px;"
    onclick="location.href='shop/form3'">map 읽기</button>
    <br><br>
    <button class="btn btn-outline-info btn-lg" style="width: 200px;"
    onclick="location.href='board/uploadform1'">1개 이미지 업로드</button>
    <br><br>
    <button class="btn btn-outline-info btn-lg" style="width: 200px;"
    onclick="location.href='board/uploadform2'">여러개 이미지 업로드</button>
    <br><br>
  </div>
</body>
</html>