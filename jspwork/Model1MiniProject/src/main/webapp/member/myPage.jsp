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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>

<script type="text/javascript">
  function delfunc(num) {
	  //alert(num);
	  $("#delnum").val(num); 
	  $("#myModal").modal('show');
	  
	  //삭제버튼 이벤트
	  $("button.btndel").click(function(){
		  
		  //num, pass
		  var num = $("#delnum").val();
		  var pass = $("#delpass").val();
		  
		  //alert(num+","+pass);
		  //삭제파일 호출
		  location.href = "member/deleteMyPage.jsp?num="+num+"&pass="+pass;
		  
	  })
	
  }
  
</script>

</head>
<%
  MemberDao dao = new MemberDao();
  List<MemberDto> list = dao.getAllMembers();
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
%>
<body>


<div style="width: 800px;">
    <h4>마이페이지</h4>
      <table class="table table-bordered">
        <%
          for(MemberDto dto:list) {%>
        	  <tr>
        	    <td rowspan="7" align="center" valign="middle">
        	      <img src="image/b1.JPG" id="mainimg" style="width: 250px;">
        	    </td>
        	    <td style="width:300px;">회원명: <%=dto.getName() %></td>
        	    <td rowspan="7" style="width: 200px;"align="center"  valign="middle">
        	      <button type="button" class="btn btn-outline-info">수정</button>
        	      <button type="button" class="btn btn-outline-danger" onclick="delfunc('<%=dto.getNum()%>')">탈퇴</button>
        	    </td>
        	  </tr>  
        	  
        	  <tr>
        	    <td>아이디: <%=dto.getId() %></td>
        	  </tr>
        	  
        	  <tr>
        	    <td>이름: <%=dto.getName() %></td>
        	  </tr>
        	  
        	  <tr>
        	    <td>핸드폰: <%=dto.getHp() %></td>
        	  </tr>
        	  
        	  <tr>
        	    <td>주소: <%=dto.getAddr() %></td>
        	  </tr>
        	  
        	  <tr>
        	    <td>이메일: <%=dto.getEmail() %></td>
        	  </tr>
        	  
        	  <tr>
        	    <td>가입일: <%=sdf.format(dto.getGaipday()) %></td>
        	  </tr>
        	  
          <%}
        %>
      </table>
  </div>
  
  <!-- The Modal -->
<div class="modal" id="myModal">
  <div class="modal-dialog">
    <div class="modal-content modal-sm">

      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title">탈퇴확인</h4>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>

      <!-- Modal body -->
      <div class="modal-body d-inline-flex">
        <input type="hidden" id="delnum">
        <b>탈퇴 비밀번호: </b>
        <input type="password" id="delpass" class="form-control" style="width: 120px; margin-left: 10px;">
      </div>

      <!-- Modal footer -->
      <div class="modal-footer">
        <button type="button" class="btn btn-danger btndel" data-bs-dismiss="modal">탈퇴</button>
      </div>

</body>
</html>