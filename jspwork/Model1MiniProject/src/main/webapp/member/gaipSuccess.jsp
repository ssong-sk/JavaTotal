<%@page import="data.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.MemberDao"%>
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
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>

<%
//프로젝트 경로
String root = request.getContextPath();

MemberDao dao = new MemberDao();
List<MemberDto> list = dao.allDataMember();
%>
<body>
	<!-- 1.회원가입이 성공되면 gaipSuccess 페이지로 가기
       2-1.dao (id보내서 name 리턴 받는) ex) 김연아님의 회원가입이 성공되었습니다. 같이 성공이미지 띄우기 
       2-2. dao 만들기 귀찮으면 angel님의 회원가입이 성공되었습니다. 성공이미지-->


	<%
	if (list != null && !list.isEmpty()) { // list가 비어있지 않고 null이 아닐 때
		MemberDto member = list.get(0); // 첫 번째 MemberDto 객체를 가져옴
	%>
	<div style="margin: 50px 100px; width: 500px;">
	<table class="table table-bordered">
		<b><%=member.getName()%>님의 회원가입을 축하드립니다</b> 
		<img alt="" src="<%=root%>/image/travel7.JPG">
		
		<tr>
        <td colspan="1" align="center">
          <button type="button" class="btn btn-outline-info" style="width: 100px;"
          onclick="location.href='<%=root%>/index.jsp?main=login/loginForm.jsp'">로그인</button>
          <button type="button" class="btn btn-outline-danger" style="width: 100px;"
          onclick="location.href='<%=root%>'">메인</button>
        </td>
      </tr>
       </table>
	</div>
	<%
	}
	%>

   
</body>
</html>