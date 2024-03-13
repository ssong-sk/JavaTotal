<%@page import="log.model.logDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&family=Stylish&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
  <%
    String id = request.getParameter("id");
    String pass = request.getParameter("pass");
    String save = request.getParameter("savechk"); //아이디 저장 버튼
    
    //아이디와 비번이 맞는지 확인
    logDao dao = new logDao();
    boolean flag = dao.isLogin(id, pass);
    
    //맞으면 세션저장 후 로그인 메인으로 이동
    if(flag) {
    	//로그인 중인지 알수 있는 세션 저장
    	session.setAttribute("loginok", "yes"); //session 사용시 key와 value 값 가져와야함. (현재는 형식적으로 적용)
    	//아이디와 체크값 저장
    	session.setAttribute("idok", id);
    	//체크하면 on, 체크안하면 null (항상 null인값 먼저 지정하기)
    	session.setAttribute("saveok", save);
    	
    	//세션유지시간
    	session.setMaxInactiveInterval(60*60*8); //8시간유지
    	//로그인 메인으로 감
    	response.sendRedirect("loginMain.jsp");
    }
    
    else {%>
    	<script type="text/javascript">
    	   alert("아이디와 비밀번호가 맞지 않습니다");
    	   history.back();
    	</script>
    <%}
  %>
</body>
</html>