<%@page import="simpleguest.model.GuestDto"%>
<%@page import="simpleguest.model.GuestDao"%>
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
    request.setCharacterEncoding("utf-8");
  
    String num = request.getParameter("num");
    String pass = request.getParameter("pass");
    String nickname = request.getParameter("nickname");
    String content = request.getParameter("content");
    String image = request.getParameter("image");
    
    GuestDao dao = new GuestDao();
    
    //비밀번호가 맞으면 수정 후 목록으로 이동
    if(dao.isEqualPass(num, pass)) {
    	GuestDto dto = new GuestDto();
    	dto.setNum(num);
    	dto.setNickname(nickname);
    	dto.setContent(content);
    	dto.setImage(image);
    	
    	//수정 메서드 호출
    	dao.updateGuest(dto);
    	
    	response.sendRedirect("guestList.jsp");
    }
    else {%>
    	<script type="text/javascript">
    	  alert("비밀번호가 맞지 않습니다");
    	  history.back(); //앞으로 이동
    	</script>
    <%}
    
  %>
</body>
</html>