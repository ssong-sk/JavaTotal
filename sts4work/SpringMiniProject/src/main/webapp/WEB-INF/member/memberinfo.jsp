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
<script type="text/javascript">
  $(function () {
	
	  $(".btnnewphoto").click(function () {
		
		  //파일창 띄우기
		  $("#newphoto").trigger("click");
		  
	});
	  
	  $("#newphoto").change(function () {
		
		  var num = $(this).attr("num");
		  //alert(num);
		  
		  //폼데이터 
		  var form = new FormData();
		  
		  form.append("photo",$("#newphoto")[0].files[0]); //선택한 이미지 1개만 선택하겠다는 로직공식
		  form.append("num",num); //위에서 num값 띄운부분 가져오기
		  
		  console.log(form);
		  
		  $.ajax ({
			
			  type : "post",
			  dataType : "html",
			  url : "updatephoto",
			  processData: false,
			  contentType: false,
			  data : form,
			  success : function () {
				
				  location.reload();
			}
		  })
	});
	  
  })
  
</script>
</head>
<body>
  <div style="width: 700px; margin: 50px 150px;">
    <table class="table table-bordered">
      <caption align="top"><h2><b>회원정보</b></h2></caption>
        <c:forEach var="dto" items="${list }">
          <c:if test="${sessionScope.loginok !=null and sessionScope.myid==dto.id }">
          <tr>
            <td style="width: 250px;" align="center" rowspan="5">
              <img alt="" src="../memberimage/${dto.photo }" width="200" height="250">
              <br>
              <input type="file" id="newphoto" num="${dto.num }" style="display: none;"><br>
              <button type="button" class="btn btn-outline-info btnnewphoto">사진수정</button>
            </td>
            
            <td>회원명 : ${dto.name }</td>
            <td rowspan="5" align="center" style="width: 200px;" valign="middle">
              <button type="button" class="btn btn-outline-success" num="${dto.num }">수정</button>
              <button type="button" class="btn btn-outline-danger" num="${dto.num }">삭제</button>
            </td>
          </tr>
          
          <tr>
            <td>아이디 : ${dto.id }</td>
          </tr>
          
          <tr>
            <td>핸드폰 : ${dto.hp }</td>
          </tr>
          
          <tr>
            <td>이메일 : ${dto.email }</td>
          </tr>
          
          <tr>
            <td>주소 : ${dto.addr }</td>
          </tr>
          </c:if>
        </c:forEach>
    </table>  
  </div>
</html>