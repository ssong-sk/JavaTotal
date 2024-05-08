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
  <div style="margin: 30px 50px;">
    <h3 class="alert alert-info">MyFood 목록</h3>
    <br>
    <h3 class="alert alert-info">총 ${totalCount }개의 상품이 입고되었습니다</h3>
    <table class="table table-bordered" style="width: 1200px;">
      <tr >
        <th width="120">상품번호</th>
        <th width="400">상품명</th>
        <th width="120">가격</th>
        <th width="120">평점</th>
        <th width="150">비고</th>
      </tr>
      
      <c:if test="${totalCount==0 }">
        <tr>
          <td colspan="5" align="center"><b>등록된 상품이 없습니다</b></td>
        </tr>
      </c:if>
      
      <c:if test="${totalCount>0 }">
        <c:forEach var="dto" items="${list }" varStatus="i">
          <tr>
            <td align="center">${i.count }</td>
            <td>
              <img alt="" src="res/food/${dto.f_photo }" width="50" height="50">
              <b>${dto.f_name }</b>
            </td>
            
            <td align="center">
              <fmt:formatNumber value="${dto.f_price }" type="currency"></fmt:formatNumber>
            </td>
            
            <td align="center">${dto.f_grade }</td>
            <td>
              <button class="btn btn-outline-info">수정</button>
              <button class="btn btn-outline-danger">삭제</button>
            </td>
          </tr>
        </c:forEach>
      </c:if>
    </table>
  </div>
</body>
</html>