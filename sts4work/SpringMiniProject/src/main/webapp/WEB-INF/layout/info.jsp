<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=IBM+Plex+Sans+KR&family=Nanum+Myeongjo&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
  .info {
    text-align: center;
  }
</style>
</head>
   <c:set var="root" value="<%=request.getContextPath() %>"/>
<body>
  <span class="info">
  <i class="bi bi-envelope"></i>&nbsp;&nbsp;saram@gmail.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <i class="bi bi-phone-vibrate"></i>&nbsp;&nbsp;010-3044-4444&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <i class="bi bi-house-door"></i>&nbsp;&nbsp;서울시 강남구 역삼동 444&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <i class="bi bi-instagram"></i>&nbsp;&nbsp;@saramin
  </span>
</body>
</html>