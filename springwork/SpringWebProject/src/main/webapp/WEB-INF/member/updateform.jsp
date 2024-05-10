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
  <div style="margin: 100px 100px; width: 500px;">
    <form action="update" method="post">
     <input type="hidden" name="num" value="${dto.num }">
      <table class="table table-bordered">
        <caption align="top"><b>회원정보 수정</b></caption>
        <tr>
          <th>회원명</th>
          <td>
            <input type="text" name="name" required="required" style="width: 130px;" class="form-control" value="${dto.name }">
          </td>
        </tr>
        
        <tr>
          <th>아이디</th>
          <td><b>${dto.id }</b></td>
        </tr>
        
        <tr>
          <th>핸드폰</th>
          <td>
            <input type="text" name="hp" required="required" style="width: 130px;" class="form-control" value="${dto.hp }">
          </td>
        </tr>
        
        <tr>
          <th>비밀번호</th>
          <td>
            <input type="text" name="pass" required="required" style="width: 130px;" class="form-control">
          </td>
        </tr>
        
        
        <tr>
          <td colspan="2" align="center">
            <button type="submit" class="btn btn-outline-info">회원수정</button>
            <button type="button" class="btn btn-outline-success" onclick="location.href='list'">회원목록</button>
          </td>
        </tr>
      </table>
    </form>
  </div>

</body>
</html>