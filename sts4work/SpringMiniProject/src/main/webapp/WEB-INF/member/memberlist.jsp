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
	
	  //전체선택
	  $("#allcheck").click(function () {
		
		 var chk = $(this).is(":checked");
		 
		 //전체 체크값을 모든 체크에 일괄 전달
		 $(".del").prop("checked",chk);
	});
	  
	  $("#btnmemberdel").click(function () {
		
		var cnt = $(".del:checked").length;
		//alert(cnt);
		
		if(cnt == 0) {
			alert("삭제할 회원을 선택해주세요");
			return;
		}
		
		$(".del:checked").each(function (i, elt) {
			
			var num = $(this).attr("num");
			console.log(num); //선택한 num만 나오는지 확인
			
			//선택한 회원 모두 삭제
			$.ajax({
				
			    type : "get",
			    url : "delete",
			    dataType : "html",
			    data : {"num":num},
			    success : function () {
					
			    	alert("삭제되었습니다");
			    	location.reload();
				}
			})
			
		})
	})
	  
})
</script>
</head>
<body>
  <div style="width: 500px; margin: 50px 0px;">
    <table class="table table-bordered" style="width: 1000px;">
      <caption align="top"><h2><b>총 ${mcount}명의 회원이 있습니다</b></h2></caption>
      <tr class="table-info">
        <th width="80">
          <input type="checkbox" id="allcheck">선택
        </th>
        <th width="60">번호</th>
        <th width="120">번호</th>
        <th width="120">아이디</th>
        <th width="150">핸드폰</th>
        <th width="200">이메일</th>
        <th width="200">주소</th>
      </tr>
      
      <c:forEach var="dto" items="${list }" varStatus="i">
        <tr>
          <td valign="middle">
            <input type="checkbox" num="${dto.num }" class="del">
          </td>
          <td>${i.count }</td>
          <td>
            <img alt="" src="../memberimage/${dto.photo }" style="width: 30px; height: 30px;">&nbsp;&nbsp;&nbsp;
            ${dto.name }
          </td>
          <td>${dto.id }</td>
          <td>${dto.hp }</td>
          <td>${dto.email }</td>
          <td>${dto.addr }</td>
        </tr>
      </c:forEach>
    </table>
    
    <button type="button" class="btn btn-outline-danger" id="btnmemberdel">삭제</button>
  </div>
</body>
</html>