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
    <button type="button" class="btn btn-outline-info" onclick="location.href='addform'">상품등록</button>
  
  <hr>
  <c:if test="${totalCount==0 }">
    <div class="alert alert-info">
      <b>저장된 상품정보가 없습니다</b>
    </div>
  </c:if>
  
  <c:if test="${totalCount>0 }">
    <div class="alert alert-info">
      <b>${totalCount }개의 상품정보가 있습니다</b>
    </div>
  </c:if>
  
  <hr>
  <c:forEach var="a" items="${list }">
    <table class="table table-bordered" style="width: 500px;">
      <tr>
        <td>
          <c:if test="${a.photoname!=null }">
            <img alt="" src="../photo/${a.photoname }" style="width: 200px; height: 120px;" align="left">
          </c:if>
          
          <c:if test="${a.photoname==null }">
            <img alt="" src="../photo/noimage.jpg" style="width: 200px; height: 120px;" align="left">
          </c:if>

	        <h5>상품명 : ${a.sang }</h5>
	        <h5>상품단가 : 
	        <fmt:formatNumber value="${a.dan }" type="currency"></fmt:formatNumber>
	        </h5>
	        <h5>입고일 :
	        <fmt:formatDate value="${a.ipgoday }" pattern="yyyy-MM-dd HH:mm"/>
	        </h5>
	        
	        <button type="button" class="btn btn-outline-info" onclick="location.href='updateform?num=${a.num}'">수정</button>
	        <button type="button" class="btn btn-outline-danger" onclick="location.href='delete?num=${a.num}'">삭제</button>

        </td>
      </tr>
    </table>
  </c:forEach>
  </div>
</body>
</html>