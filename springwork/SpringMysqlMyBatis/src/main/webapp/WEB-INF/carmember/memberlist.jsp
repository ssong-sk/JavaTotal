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
  <div style="margin: 50px  100px; width: 1000px;">
		<button type="button" class="btn btn-outline-info"
			onclick="location.href='mwriteform'" style="margin-top: 20px;">고객정보
			입력</button>
		<br><br>

		<c:if test="${totalCount==0 }">
			<h5 class="alert alert-info">저장된 고객 정보가 없습니다.</h5>
		</c:if>

		<c:if test="${totalCount>0 }">
			<h5 class="alert alert-info">총 ${totalCount }개의 고객 정보가 있습니다.</h5>

			<hr>
			<table class="table table-bordered">
				<tr class="table-success">
					<th width="80">번호</th>
					<th width="180">고객명</th>
					<th width="180">핸드폰번호</th>
					<th width="180">주소</th>
					<th width="180">가입날짜</th>
					<th width="180">편집</th>
				</tr>
				
			<c:forEach var="dto" items="${list }" varStatus="i">
              <tr>
               <td align="center" valign="middle">${i.count }</td>
               <td align="center" valign="middle">${dto.name }</td>
               <td align="center" valign="middle">${dto.hp }</td>
               <td align="center" valign="middle">${dto.addr }</td>
               <td align="center" valign="middle">${dto.gaipday }</td>
             
               <td align="center" valign="middle">
                <button type="button" class="btn btn-outline-info"
                onclick="location.href='updateform?num=${dto.num}'">수정</button>
                <button type="button" class="btn btn-outline-danger"
                onclick="location.href='delete?num=${dto.num}'">삭제</button>
               </td>
             </tr>
            </c:forEach>
			</table>
		</c:if>
	</div>

</body>
</html>