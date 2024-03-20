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
  $(function(){
	  //아이디 중복체크
	  $("#btnIdCheck").click(function(){
		
		  //id읽기
		  var id = $("#id").val();
		  //alert(id);
		  $.ajax({
			  type : "get",
			  url : "member/idCheck.jsp",
			  dataType : "json",
			  data : {"id":id},
			  success : function(res) {
				  //alert(res.count);
				  if(res.count==1) {
					  alert ("이미 가입된 아이디입니다\n다시 입력해주세요");
					  $("span.idsuccess").text("가입불가");
					  $("#id").val("");
				  }
				  else {
					  alert("가입이 가능한 아이디입니다");
					  $("span.idsuccess").text("가입가능");
				  }
			  }
		  })
	  })
	  
	  //이메일 선택 이벤트
	  $("#selemail").change(function () {
		if($(this).val()=='-') {
			$("#email2").val('');
		}
		else {
			 $("#email2").val($(this).val());
		}
		
	})
  })
  
  function check(f) {
	  if(f.pass.value!=f.pass2.value) {
		  alert("비밀번호가 서로 다릅니다");
		  //초기화
		  f.pass.value = "";
		  f.pass2.value = "";
		  return false; //액션 호출하지 않는다.
	  }
	
}
</script>
</head>
<body>

<div style="width: 500px;">
  <form action="member/addAction.jsp" method="post" onsubmit="return check(this)">
    <table class="table table-bordered">
      <caption align="top">회원가입</caption> 
      
      <tr>
        <th width="100" class="table-info">아이디</th>
        <td>
          <div class="d-inline-flex">
            <input type="text" name="id" id="id" maxlength="8" class="form-control" required="required"
              style="width: 120px;">
            <button type="button" class="btn btn-outline-info" id="btnIdCheck" style="margin-left: 10px;">중복체크</button>
            <span class="idsuccess" style="margin-left: 10px; color: gray;"></span>
          </div>  
        </td>
      </tr>
      
      <tr>
        <th width="100" class="table-info">비밀번호</th>
        <td>
        <div class="d-inline-flex">
          <input type="password" name="pass" class="form-control" required="required"
          style="width: 130px;" placeholder="비밀번호">
          <input type="password" name="pass2" class="form-control" required="required"
          style="width: 130px; margin-left: 10px;" placeholder="비밀번호 확인">
        </div>  
        </td>
      </tr>
      
      <tr>
        <th width="100" class="table-info">이름</th>
        <td>
          <input type="text" name="name" class="form-control" required="required" style="width: 120px;">
        </td>
      </tr>
      
      <tr>
        <th width="100" class="table-info">핸드폰</th>
        <td>
          <input type="text" name="hp" class="form-control" required="required" style="width: 180px;">
        </td>
      </tr>
      
      <tr>
        <th width="100" class="table-info">주소</th>
        <td>
          <input type="text" name="addr" class="form-control" required="required" style="width: 350px;">
        </td>
      </tr>
      
      <tr>
         <th width="100" class="table-info">이메일</th>
         <td>
          <div class="d-inline-flex">
           <input type="text" name="email1" class="form-control" required="required" style="width: 80px;">
           <b style="margin-left: 10px">@</b>
           <input type="text" name="email2" id="email2" class="form-control" required="required" style="width: 120px; margin-left: 10px;">
           <select id="selemail" class="form-control" style="margin-left: 10px;">
             <option value="-">직접입력</option>
             <option value="naver.com">네이버</option>
             <option value="gmail.com">구글</option>
             <option value="nate.com">네이트</option>
             <option value="hanmail.net">다음</option>
           </select>
          </div>
         </td>
      </tr>
      
      <tr>
        <td colspan="2" align="center">
          <button type="submit" class="btn btn-outline-info" style="width: 100px;">가입</button>
          <button type="reset" class="btn btn-outline-danger" style="width: 100px;">초기화</button>
        </td>
      </tr>
      
    </table>
  </form>
</div>  
</body>
</html>