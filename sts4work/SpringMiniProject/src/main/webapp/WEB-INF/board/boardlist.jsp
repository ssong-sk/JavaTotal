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
  <div style="width: 1000px; margin: 50px 0px;">
    <table class="table table-bordered" style="width: 1000px;">
      
      <!-- 로그인 하면 버튼 생성 -->
      <c:if test="${sessionScope.loginok!=null }">
        <button type="button" class="btn btn-outline-info" onclick="location.href='form'">글쓰기</button>
        <hr>
      </c:if>
      <caption align="top"><h2><b>총 ${totalCount}개의 글이 있습니다</b></h2></caption>
      <tr class="table-info">
        <th width="60">번호</th>
        <th width="300">제목</th>
        <th width="100">작성자</th>
        <th width="80">조회</th>
        <th width="250">등록일</th>
      </tr>
      
      <c:if test="${totalCount==0 }">
        <tr>
          <td colspan="5" align="center">
            <h5><b>등록된 글이 없습니다</b></h5>
          </td>
        </tr>
      </c:if>
    </table>
  </div>    
</body>
</html>