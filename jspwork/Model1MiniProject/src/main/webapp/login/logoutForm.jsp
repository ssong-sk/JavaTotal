<%@page import="data.dto.MemberDto"%>
<%@page import="java.util.List"%>
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
<%
  String root = request.getContextPath();
  
     //dao.list 쓸 때 로직
//   String id = (String)session.getAttribute("myid");
  
//   MemberDao dao = new MemberDao();
//   List<MemberDto> list = dao.getDataMember(id);
  
  
//   String name = "";
//   if (id != null && !list.isEmpty()) {
//       // id가 null이 아니고, list가 비어있지 않은 경우에만 회원 정보를 조회하여 이름을 가져옵니다.
//       name = list.get(0).getName(); // 첫 번째 회원의 이름을 가져와서 name에 할당합니다.
//   }

   
   String myid=(String)session.getAttribute("myid");
   MemberDao dao=new MemberDao();
   String name=dao.getName(myid);
   
   %>

</head>
<body>
   
  <div style="margin: 100px 250px;">
    <table class="table table-bordered">
      <h3><%=name %>님이 로그인 중입니다</h3><br>
      <img alt="" src="<%=root %>/image/travel7.JPG"><br><br>
      
      <button type="button" class="btn btn-outline-info" style="margin-left: 150px; width: 200px;"
          onclick="location.href='login/logoutAction.jsp'">로그아웃</button>
    </table>
  </div>
  
  
  
</body>
</html>