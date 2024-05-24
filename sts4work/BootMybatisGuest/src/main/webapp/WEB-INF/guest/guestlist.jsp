<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
  div {
    font-family: 'Gowun Dodum';
  }

</style>
<script type="text/javascript">
  $(function() {
	
	  //카메라 아이콘 누르면 파일 창 뜨게 하기
	  $("i.photo").click(function(){
		
		  $("#photos").trigger("click");
		  
	  });
	  
	  //각 항목별 입력 체크하기
	  $("#btnsave").click(function () {
		
	  if($("#nick").val()=='') {
		  
      alert ("닉네임을 입력해주세요");
	  return;
		  
	  }
	  
	  if($("#pass").val()=='') {
	  
	  alert ("비밀번호를 입력해주세요");
	  return;
	  
      }
  
      if($("#content").val()=='') {
	  
	  alert ("내용을 입력해주세요");
	  return;
	  
      }
      
      
      //데이터 전송 -> serialize는 객체에 저장된 데이터를 스트림에 쓰기위해 연속적인 데이터를 변환하는것
      var s = $("#frm").serialize();
	  
	  //insert ajax
	  $.ajax({
		 
		  type : "post",
		  url : "insert",
		  data : s,
		  dataType : "json",
		  success : function(res) {
			  
			  alert(res.msg);
			  
			  location.reload();
			  
			  $("#nick").val('');
			  $("#pass").val('');
			  $("#content").val('');
		  }
		  
	  })
	   
    });
	  
	  $("#photos").change(function () {
		
		  var fdata = new FormData();
		  var inputFile = $("#photos");
		  var files = inputFile[0].files;
		  
		  if(files.length==0) {
			  
			  return false;
		  }
		  
		  for(var i=0; i<files.length; i++) {
			  
			  console.log(i);
			  fdata.append("photos",files[i]);
		  }
		  
		  $.ajax({
			  
		    
			  url : "upload",
			  processData : false, /*서버전달 데이터는 query String 이라는 형태로 전달됨. 파일 전송의 경우에는 이를 하지 않아야함.*/
			  contentType : false, /*enctype 원래 기본 설정이 application/x.www 이거 인데 multipart/form-data 로 변경하는 것이 false*/
			  type:"post",
	          dataType:"json",
	          data:fdata,
	          success:function(res){
	 
	        	  console.log("파일명들 확인:"+res.photoname);
	         }
		  })
		  
		  
	})
  
  })
</script>
</head>
<body>
 <div style="margin: 200px 200px;">
   <h4>원하는 사진들을 등록하세요
   <input type="file" name="photos" id="photos" multiple="multiple" style="display: none;">
   &nbsp;
   <i class="bi bi-camera photo" style="font-size: 30px;"></i></h4>
   
   <form id="frm">
     <table class="table table-bordered" style="width: 700px;">
       <tr>
         <th width="100">닉네임</th>
          <td>
            <input type="text" class="form-control input-sm" style="width: 150px;" id="nick" name="nick">
          </td>
          
          <th width="100">비밀번호</th>
          <td>
            <input type="password" class="form-control input-sm" style="width: 150px;" id="pass" name="pass">
          </td>
       </tr>
       
       <tr>
         <td colspan="4">
          <div class="d-inline-flex">
           <textarea style="width: 600px; height: 100px;" class="form-control" name="content" id="content"></textarea>&nbsp;
           <button type="button" style="height: 100px; width: 100px;" class="btn btn-outline-info" id="btnsave">저장</button>
          </div>
         </td>
       </tr>
     </table>
   </form>
   
   
   <!-- list 출력하기 -->
   <br>
   <br>
   <h5>list 내역</h5>
   <hr>
   <c:forEach var="a" items="${list}">
     <table class="table table-bordered" style="width: 500px;">
       <tr>
         <td>
           <b>${a.nick }</b><br>
           작성일 : <fmt:formatDate value="${a.writeday }"/>
         </td>
       </tr>
     
       <tr>
         <td>
           <c:if test="${a.photo!='no' }">
             <c:forTokens var="imp" items="${a.photo }" delims=",">
               <a href="../guestphoto/${imp }"><img alt="" src="../guestphoto/${imp }" style="width: 100px; border-radius: 20px;"></a>
             </c:forTokens>
           </c:if>
           
           <pre style="font-family: 'Gowun Dodum';">
             <h6>${a.content }</h6>
           </pre>
           
           <hr>
           <button type="button" class="btn btn-outline-info btn-sm" onclick="location.href=''">수정</button>
           <button type="button" class="btn btn-outline-danger btn-sm" onclick="del(${a.num})">삭제</button>
           
           <script type="text/javascript">
             function del(num) {
            	 
            	 alert(num);
            	 
            	 //비밀번호 입력받기
            	 let pass = prompt("비밀번호를 입력해주세요");
            	 
            	 $.ajax({
            		
            		 type : "get",
            		 dataType : "json",
            		 url : "delete",
            		 data : {"num":num, "pass":pass},
            		 success: function(data) {
            			 
            			 if(data.status==1) {
            				 alert("삭제되었습니다");
            				 location.reload();
            			 }
            			 
            			 else {
            				 alert("비밀번호가 맞지 않습니다");
            			 }
            		 }
            	 })
				
			}
           </script>
         </td>
       </tr>
     </table>
   </c:forEach>
   
 </div>
</body>
</html>