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
</head>
<body>
  <div style="width: 300px; margin: 50px 350px;">
    <form action="loginprocess" method="post">
      <table class="table table-bordered">
       <caption align="top"><h2><b>로그인</b></h2></caption>
        <tr>
          <td align="center">
            <input type="text" name="id" class="form-control" style="width: 250px;" required="required"
            placeholder="id 입력" value="${sessionScope.saveok==null?"":sessionScope.myid }"><br>
            <input type="password" name="pass" class="form-control" style="width: 250px;" required="required"
            placeholder="password 입력"><br>
            <input type="checkbox" name="cbsave" ${sessionScope.saveok==null?"":"checked" }>  아이디저장<br>
            <button type="submit" class="btn btn-outline-info" style="width: 100px;">login</button>
          </td>
        </tr>
      </table>
    </form>
  </div>
</body>
</html>