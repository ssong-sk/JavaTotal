<%@page import="java.text.SimpleDateFormat"%>
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

<script type="text/javascript">
 function delfunc(num) { //getnum을 가지고 와서 num값을 통해 delete가 진행되기 때문에 num을 넘겨서 받아줌
	
	 var yes = confirm("정말 강퇴처리 하시겠어요?");
	 
	 if(yes) {
		 location.href ='member/memberDelete.jsp?num='+num;
	 }
}

</script>

</head>
<%
 
 MemberDao dao = new MemberDao();
 List<MemberDto> list = dao.getAllMembers();
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

%>
<body>
  <div style=" width: 900px;">
    <h3 class="alert alert-light">총 <%=list.size() %>명의 회원이있습니다.</h3>
    <table class="table table-bordered">
      <caption align="top"><b>전체 회원 명단</b></caption>
        <tr class="table-gray">
          <th width="80px;">번호</th>
          <th width="100px;">이름</th>
          <th width="150px;">아이디</th>
          <th width="220px;">핸드폰</th>
          <th width="300px;">주소</th>
          <th width="150px;">이메일</th>
          <th width="200px;">가입일</th>
          <th width="120px;">비고</th>
        </tr>
        
        <%
        int no = 1;
        for (MemberDto dto:list) {%>
             <tr>
               <td><%=no++ %></td>
               <td><%=dto.getName() %></td>
               <td><%=dto.getId() %></td>
               <td><%=dto.getHp() %></td>
               <td><%=dto.getAddr() %></td>
               <td><%=dto.getEmail() %></td>
               <td><%=sdf.format(dto.getGaipday()) %></td>
               <td>
                 <button type="button" class="btn btn-outline-info btn-sm"
                 onclick="delfunc(<%=dto.getNum()%>)">강퇴</button>
               </td>
             </tr>
            	
        <%}
        
        %>
    </table>
  </div>

</body>
</html>