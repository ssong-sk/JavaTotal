<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=IBM+Plex+Sans+KR&family=Nanum+Myeongjo&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
  #showimg{
    margin: 10px 10px;
    width: 130px;
    height: 160px;
    border: 0px solid gray;
    
  }
</style>

<script type="text/javascript">
  $(function () {
	  
	//버튼 클릭 시 사진 불러오는 이벤트
	$("#btnphoto").click(function () {
		
		$("#myphoto").trigger("click");
	});
	
	
	//사진을 불러오면 미리보기 하기
	$("#myphoto").change(function () {
		
		if ($(this)[0].files[0]) {
	        var reader = new FileReader();
	        reader.onload = function (e) {
	            $("#showimg").attr('src', e.target.result);
	        }
	        reader.readAsDataURL($(this)[0].files[0]);
	    }

	});
	
	
	//중복체크 버튼 클릭 시 아이디 체크
	$("#btnidcheck").click(function () {

         var id = $("#loginid").val();
        //alert(id);
        
        $.ajax({
        	
        	type : "get",
        	dataType : "json",
        	url : "idcheck",
        	data : {"id":id},
        	success:function(res) {
        		
        		if(res.count == 0) {
        			
        			//alert("가입 가능한 아이디입니다");
        			$("span.idsuccess").text("가입가능");
        			
        		
        		}
        		else {
        			
        			//alert("이미 가입된 아이디 입니다");
        			$("span.idsuccess").text("가입불가능");
        			$("#loginid").val("");
        		}
        	}
        })
	});
	
	//아이디 입력시 idsuccess값 지우기 (가입가능 또는 불가능 부분)
	$("#loginid").keydown(function () {
		$("span.idsuccess").text("");
	});
	
	
	//2번쨰 비밀번호 입력 시 체크
	$("#pass2").keyup(function () {
		
		var p1 = $("#pass").val();
		var p2 = $(this).val();
		
		if(p1==p2) {
			
			$("span.passsuccess").text("OK");
		}
		else {
			
			$("span.passsuccess").text("FAIL");
		}

	});
	
	
  });
  
  
  //submit 전에 호출 -> 내용 기입안하면 회원가입 불가능
  function check() {
	
	  //사진
	  if($("#myphoto").val() == '') {
		  
		  alert("사진을 넣어주세요");
		  
		  return false;
	  }
	  
	  //아이디 중복체크 누르기
	  if($("span.idsuccess").text() != '가입가능') {
		  
		  alert("아이디 중복체크 해주세요");
		  
		  return false;
	  }
	  
	  //비밀번호
	  if($("span.passsuccess").text() != 'OK') {
		  
		  alert("비밀번호가 서로 다릅니다");
		  
		  return false;
	  }
	  
  }
  
</script>
</head>
<body>
  <div style="margin: 50px 250px;">
    <form action="insert" method="post" enctype="multipart/form-data" onsubmit="return check()">
      <table class="table table-bordered" style="width: 600px;">
        <caption align="top"><h2><b>회원가입</b></h2></caption>
          <tr>
            <td style="width: 250px;" rowspan="3">
              <input type="file" name="myphoto" id="myphoto" style="display: none;">
              <button type="button" id="btnphoto" class="btn btn-outline-info" style="margin-left: 10px;">사진선택</button>
              <br>
              <img id="showimg">
            </td>
            
            <td>
              <div class="d-inline-flex">
                <input type="text" placeholder="아이디 입력" name="id" id="loginid" class="form-control"
                style="width: 200px;" required="required">
                <button type="button" class="btn btn-outline-info" id="btnidcheck">중복체크</button>
                &nbsp;&nbsp;
                <span class="idsuccess" style="margin-left: 10px; font-size: 10pt; 
               margin-top: 10px; color: red;"></span>
              </div>
            </td>
          </tr>
          
          <tr>
            <td>
              <div class="d-inline-flex">
                <input type="password" name="pass" id="pass" placeholder="비밀번호 입력[숫자4자리]" style="width: 200px;" 
                class="form-control" required="required" maxlength="4">&nbsp;&nbsp;&nbsp;
                <input type="password" id="pass2" placeholder="비밀번호 재입력[숫자4자리]" style="width: 200px;" 
                class="form-control" required="required" maxlength="4">
                <span class="passsuccess" style="margin-left: 10px; font-size: 10pt; 
               margin-top: 10px; color: red;"></span>
              </div>
            </td>
          </tr>
          
          <tr>
            <td>
              <input type="text" name="name" class="form-control" style="width: 150px;" required="required"
              placeholder="이름">
            </td>
          </tr>
          
           <tr>
            <td colspan="2">
             <div class="d-inline-flex">
              <input type="text" name="hp" class="form-control" style="width: 200px;" required="required"
              placeholder="핸드폰 입력">&nbsp;&nbsp;&nbsp;
              <input type="text" name="email" class="form-control" style="width: 200px;" required="required"
              placeholder="email 입력">
             </div> 
            </td>
          </tr>
          
          <tr>
            <td colspan="2">
              <input type="text" name="addr" class="form-control" style="width: 350px;" required="required"
              placeholder="주소 입력">
            </td>
          </tr>
          
          <tr>
            <td colspan="2" align="center">
              <button type="submit" class="btn btn-outline-info" style="width: 150px;">회원가입</button>
            </td>
          </tr>
          
      </table>
    </form>
  </div>
</body>
</html>