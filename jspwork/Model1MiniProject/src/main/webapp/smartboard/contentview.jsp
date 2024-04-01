<%@page import="data.dao.smartDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.smartDto"%>
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
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
  span.aday{
    float: right;
    font-size: 0.8em;
    color: gray;
  }
  
  div.alist{
    margin-left: 20px;
    font-size: 0.8em;
    color: gray;
  }
  
  span.day{
    color: gray;
    font-size: 0.8em;
  }

span.icon{
   margin-left: 20px;
   color: green;
}
</style>

<script type="text/javascript">
   $(function(){
	  //처음 시작시 댓글 호출
	  list();
	  
	  
	  var num = $("#num").val();
	  //alert(num);
	  
	  $("#btnsend").click(function(){
		 var nick = $("#nickname").val().trim();
		 var content = $("#content").val().trim();
		 
		 //null일경우 안넘어가도록
		 if(nickname.trim().length==0) {
			 alert("닉네임 입력 후 저장해주세요");
			 return;
		 }
		 if(content.trim().length==0) {
			 alert("댓글 입력 후 저장해주세요");
			 return;
		 }
		 
		 $.ajax({
			
			 type : "get",
			 url : "smartanswer/insertanswer.jsp",
			 datatype : "html",
			 data : {"num":num, "nickname":nick, "content":content},
			 success : function () {
				
				 //alert("success!!");
				 
				 //댓글,닉네임  쓰고나면 초기화
				 
				 $("#nickname").val('');
				 $("#content").val('');
				 
				 
				 //댓글추가후 댓글목록 다시 출력하기
				 list();
			}
		 })
	  });
	  
	  //삭제
	   $(document).on("click","i.adel",function(){
		   
		   var idx=$(this).attr("idx");
		   //alert(idx);
		   
		   var ans=confirm("댓글을 삭제하려면 [확인]을 눌러주새요");
		   
		   if(ans){
			   $.ajax({
				   
				   type:"get",
				   url:"smartanswer/deleteanswer.jsp",
				   dataType:"html",
				   data:{"idx":idx},
				   success:function(){
					   swal("삭제성공!", "삭제가 성공했어요", "success");
					   list();
				   }
			   });
		   }
	   });
	  
	  //수정폼에 데이터 띄우기
	    $(document).on("click","i.amod",function(){
		   
		  idx=$(this).attr("idx");
		   //alert(idx);
		   
		   $.ajax({
			   type:"get",
			   url:"smartanswer/jsonupdateform.jsp",
			   dataType:"json",
			   data:{"idx":idx},
			   success:function(res){
				   
				   $("#unickname").val(res.nickname);
				   $("#ucontent").val(res.content);
			   }
		   });
		   
		   $("#myModal").modal("show");
	   });
	  
	  //수정
	    $(document).on("click","#btnupdate",function(){
			  
			   var nickname=$("#unickname").val();
			   var content=$("#ucontent").val();
			   //alert(nickname+","+content);
			   
			   $.ajax({
				   type:"get",
				   url:"smartanswer/updateanswer.jsp",
				   dataType:"html",
				   data:{"idx":idx,"nickname":nickname,"content":content},
				   success:function(){
					   
					   list();
				   }
			   })
			   
			   
		   });
		   
	  
   });


   function funcdel(num,currentPage){
	   
	   //alert(num+","+currentPage);
	   
	   var ans=confirm("삭제하려면 [확인]을 눌러주세요");
	   
	   if(ans){
		   location.href='smartboard/delete.jsp?num='+num+"&currentPage="+currentPage;
	   }
   }
   
   
   function list() {
	   console.log("list num="+$("#num").val());
	   
	   $.ajax ({
		   type : "get",
		   url : "smartansewr/listanswer.jsp",
		   dataType : "json",
		   data : {"num":$("#num").val()},
		   success : function (res) {
			   //alert(res.length);
			   
			   //댓글 갯수 출력
			   $("b.acount>span").text(res.length);
			   
			   var s = "";
			   $.each(res,function(idx,item){
				   s+="<div>"+item.nick+": "+item.content;
				   s+="<span class='aday'>"+item.writeday+"</span>";
				   s+="<span class='icon'><i class='bi bi-trash adel' idx="+item.idx+"></i>";
				   s+="<i class='bi bi-pencil-square amod' idx="+item.idx+"></i></span>";
				   s+="</div>";
			   });
			   
			   $("div.alist").html(s);
		}
	   }) 
   }
</script>
</head>

 <%
 String num = request.getParameter("num");
 smartDao dao = new smartDao();
 
 smartDto dto = dao.getData(num);
 String currentPage=request.getParameter("currentPage");
 
 //조회수 가져오기
 dao.updateReadcount(num);
 
 //날짜
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
 
 %>
<body>

  <!-- 1. 상세페이지 2.조회수 증가 3.맨아래에 목록, 글쓰기, 수정, 삭제 버튼 만들기-->
  
  <input type="hidden" id="num" value="<%=num%>">

  
  <div style="margin: 50px 100px; width: 700px;">
  <h6 style="font-size: 25pt;"><b>상세내용보기</b></h6>
   <table class="table table-bordered">
     <caption align="top"><b style="font-size: 16pt;"><%=dto.getSubject() %></b></caption>
     <tr>
       <td>
         <b>작성자 : <%=dto.getWriter() %></b><br>
         <span class="day"><%=sdf.format(dto.getWriteday()) %></span><br>
         조회 : <%=dto.getReadcount() %>
       </td>
     </tr>
     
      <tr height="250" >
       <td>
         <%=dto.getContent().replace("\n", "<br>") %>
       </td>
     </tr>
     
      <!-- 댓글 -->
     <tr>
       <td>
         <b class="acount">댓글<span>0</span></b>
         <div class="alist">
           댓글목록
         </div>
         
         <div class="aform d-inline-flex">
           <input type = "text" id="nickname" class="form-control" style="width: 100px;"
           placeholder="닉네임">
           <input type = "text" id="content" class="form-control" style="width: 300px;"
           placeholder="댓글메세지">
           <button type="button" id="btnsend" class="btn btn-outline-info">저장</button>
         </div>
         
       
       <!-- 버튼 -->
       
       <tr>
       <td align="center">
         <button type="button" class="btn btn-outline-info btn-sm" onclick="location.href='index.jsp?main=smartboard/smartform.jsp'">
         <i class="bi bi-pencil-square"></i>글쓰기</button>
         <button type="button" class="btn btn-outline-success btn-sm" onclick="location.href='index.jsp?main=smartboard/boardlist.jsp'">
         <i class="bi bi-view-list"></i>목록</button>
         <button type="button" class="btn btn-outline-warning btn-sm" onclick="location.href='index.jsp?main=smartboard/updateform.jsp?num=<%=num%>&currentPage=<%=currentPage%>'">
         <i class="bi bi-save"></i>수정</button>
         <button type="button" class="btn btn-outline-danger btn-sm" onclick="funcdel(<%=num%>,<%=currentPage%>)">
         <i class="bi bi-x-square"></i>삭제</button>
       </td> 
  
  </div>
  
  <!-- The Modal -->
<div class="modal" id="myModal">
  <div class="modal-dialog">
    <div class="modal-content">

      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title">댓글수정</h4>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>

      <!-- Modal body -->
      <div class="modal-body">
        <input type="text" id="unickname" style="width: 100px;" placeholder="닉네임">
        <input type="text" id="ucontent" style="width: 300px;" placeholder="댓글내용">
      </div>

      <!-- Modal footer -->
      <div class="modal-footer">
        <button type="button" class="btn btn-outline-info" data-bs-dismiss="modal"
        id="btnupdate">댓글수정</button>
      </div>

</body>
</html>