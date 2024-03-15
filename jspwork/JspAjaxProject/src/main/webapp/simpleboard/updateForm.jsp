<%@page import="simpleboard.model.simpleBoardDto"%>
<%@page import="simpleboard.model.simpleBoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&family=Stylish&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>

 <%
  String num = request.getParameter("num");
  simpleBoardDao dao = new simpleBoardDao();
  simpleBoardDto dto = dao.getContent(num);
 
 %>
<body>
	<div style="margin: 50px 100px; width: 500px;">
		<form action="updateAction.jsp" method="post">
		    <input type="hidden" name="num" value="<%=num%>">
			<table class="table table-bordered">
			 <caption align="top"><b>글 수정</b></caption>
				<tr>
					<th width="100" class="table-info">작성자</th>
					<td><input type="text" name="writer" class="form-control"
						style="width: 120px;" required="required" value="<%=dto.getWriter()%>"></td>
				</tr>

				<tr>
					<th width="100" class="table-info">제목</th>
					<td><input type="text" name="subject" class="form-control"
						style="width: 300px;" required="required" value="<%=dto.getSubject()%>"></td>
				</tr>


				<tr>
					<td colspan="2"><textarea style="width: 480px; height: 100px;"
							class="form-control" name="content" required="required"><%=dto.getContent() %></textarea>
					</td>
				</tr>

				<tr>
					<td colspan="2" align="center">
						<button type="submit" style="width: 100px;"
							class="btn btn-outline-success btn-md">
							<i class="bi bi-save"></i>수정
						</button>
						<button type="button" style="width: 100px;"
							class="btn btn-outline-warning btn-md"
							onclick="location.href='boardList.jsp'">
							<i class="bi bi-view-list"></i>목록
						</button> <!-- 이미지로 버튼만드는 로직  <input type="image" src="../image/logoImg/dog.jpg" style="width: 60px"> -->
					</td>

				</tr>

			</table>
		</form>
	</div>

</body>
</html>