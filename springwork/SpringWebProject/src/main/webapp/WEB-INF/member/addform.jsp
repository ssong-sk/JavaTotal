<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
   href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&display=swap"
   rel="stylesheet">
<link
   href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
   rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
</head>
<script type="text/javascript">
  $(function(){
	
	  //id 중복체크하기
	  $("#btncheck").click(function(){
		  //id 읽기
		  var id = $("#id").val();
		  //alert(id);
		  
		  $.ajax({
			  type : "get",
			  url : "idcheck",
			  dataType : "json",
			  data : {"id":id},
			  success : function(res) {
				  
				  //id 중복일 경우
				  if(res.count==1) {
					  alert("이미 가입된 아이디 입니다\n다시 입력해 주세요");
					  $("#id").val('');
				  }
				  
				  //id 중복이 아닐 경우
				  else {
					  alert("가입이 가능한 아이디 입니다");
				  }
			  }
		  })
	  })
  })
</script>
<body>
  <div style="margin: 100px 100px; width: 500px;">
    <form action="insert" method="post">
      <table class="table table-bordered">
        <caption align="top"><b>회원가입</b></caption>
        <tr>
          <th>회원명</th>
          <td>
            <input type="text" name="name" required="required" style="width: 130px;" class="form-control">
          </td>
        </tr>
        
        <tr>
          <th>아이디</th>
          <td>
          <div class="d-inline-flex">
            <input type="text" name="id" id="id" required="required" style="width: 130px;" class="form-control">&nbsp;
            <button type="button" class="btn btn-outline-danger" id="btncheck">중복체크</button>
          </div>
          </td>
        </tr>
        
        <tr>
          <th>비밀번호</th>
          <td>
            <input type="text" name="pass" required="required" style="width: 130px;" class="form-control">
          </td>
        </tr>
        
        <tr>
          <th>핸드폰</th>
          <td>
            <input type="text" name="hp" required="required" style="width: 130px;" class="form-control">
          </td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
            <button type="submit" class="btn btn-outline-info">회원가입</button>
            <button type="button" class="btn btn-outline-success" onclick="location.href='list'">회원목록</button>
          </td>
        </tr>
      </table>
    </form>
  </div>

</body>
</html>