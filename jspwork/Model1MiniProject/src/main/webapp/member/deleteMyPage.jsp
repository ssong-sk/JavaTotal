<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&family=Stylish&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>

 <!-- 탈퇴버튼 -->
 <%
  String num = request.getParameter("num");
  String pass = request.getParameter("pass");
  
  MemberDao dao = new MemberDao();
  
  //비번 체크해서 맞으면 삭제
  boolean b = dao.isEqualPass(num, pass);
  
  if(b) {
	  dao.deleteMeber(num);
	  
	  //세션삭제
	  session.removeAttribute("loginok");
	  session.removeAttribute("myid");
	  session.removeAttribute("saveok");
	  
	  %>
	  <script type="text/javascript">
	  alert("회원탈퇴되었습니다.")
	  location.href="../index.jsp";
	  </script>
  <%}
  else {%>
	  <script type="text/javascript">
	  alert("비밀번호가 맞지 않습니다");
	  history.back();
	  </script>  
  <%}
  
 %>

</body>
</html>