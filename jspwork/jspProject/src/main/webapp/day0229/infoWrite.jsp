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
  
    String grade = request.getParameter("grade");
    String []lang = request.getParameterValues("lang");
    String like = request.getParameter("like");
    String height = request.getParameter("height");
    String weight = request.getParameter("weight");
    String ipsaday = request.getParameter("ipsaday");
  %>
  
  <h3 class="alert alert-success">***사원정보***<br><br>
  
  최종학력은 : <%=grade %><br>
  사용 가능한 컴퓨터언어는 :
   <% 
      if(lang == null) {%>
        <font color="red">할 수 있는 언어가 없습니다.</font><br>	
        <%}
      else {
    	  for(int i =0; i < lang.length; i++) {%>
    		  [<%=lang[i] %>]&nbsp;
    	  <%}%>
    	  
    	  <b>총 <%=lang.length %>개 가능</b>
      <%}
                
         %><br>
  같은 조를 하고싶은 사람은 : <%=like %><br>
  나의 키는 : <%=height %><br>
  나의 몸무게는 : <%=weight %><br>
  나의 입사날짜는 : <%=ipsaday %>
  </h3>
  
</body>
</html>