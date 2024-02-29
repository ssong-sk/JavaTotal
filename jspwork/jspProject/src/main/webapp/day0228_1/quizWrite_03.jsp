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
    
    String name = request.getParameter("name");
    String date = request.getParameter("ipsa");
    String menu1 = request.getParameter("menu1");
    String []menu2 = request.getParameterValues("menu2");
  
    %>
    
    <h3>
    이름 : <%=name %><br>
    입사날짜 : <%=date %><br>
    오늘 선택 점심메뉴 : <img src="<%=menu1%>" alt="" width="100"><br>
    건의하는 메뉴 :
    <% 
      if(menu2 == null) {%>
        <font color="red">원하는 메뉴 없음</font><br>	
        <%}
      else {
    	  for(int i =0; i < menu2.length; i++) {%>
    		  [<%=menu2[i] %>]&nbsp;&nbsp;
    	  <%}%>
    	  
    	  <b>총 <%=menu2.length %>개 메뉴 선택</b>
      <%}
                
         %>
    </h3>

</body>
</html>