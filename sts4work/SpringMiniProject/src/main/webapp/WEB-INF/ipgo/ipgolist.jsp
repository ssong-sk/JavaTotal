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
  <div style="width: 500px; margin: 50px 250px;">
    <h4><b>${totalCount }개의 공고가 있습니다</b></h4><br>
    <button type="button" class="btn btn-outline-info" onclick="location.href='writeform'">상품추가</button>
    <hr>
    <table class="table table-bordered">

      <c:forEach var="dto" items="${list }">
        <tr>
          <td width="200" rowspan="4">
            <c:if test="${dto.photoname != 'no'}">
              <c:forTokens var="pn" items="${dto.photoname }" delims="," begin="0" end="0">
                <a>
                  <img alt="" src="../ipgoimage/${pn }" style="width: 150px;">
                </a>
              </c:forTokens>
            </c:if>
            
            <c:if test="${dto.photoname == 'no'}">
                  <img alt="" src="../image/no.jpg" style="width: 150px;">
            </c:if>
          </td>
          
          <td>
            <b>공고명 : ${dto.sangpum }</b>
          </td>
        </tr>
        
        <tr>
          <td>
            <b>단가: <fmt:formatNumber value="${dto.price }" type="currency"/></b>
          </td>
        </tr>
        
        <tr>
          <td>
            <b>등록일: <fmt:formatDate value="${dto.ipgoday }" pattern="yyyy-MM-dd"/></b>
          </td>
        </tr>
        
        <tr>
          <td>
            <button type="button" class="btn btn-outline-warning" onclick="location.href='updateform?num=${dto.num}'">수정</button>
            <button type="button" class="btn btn-outline-danger" onclick="location.href='delete?num=${num}'">삭제</button>
          </td>
        </tr>
      </c:forEach>
    </table>
  </div>
</body>
</html>