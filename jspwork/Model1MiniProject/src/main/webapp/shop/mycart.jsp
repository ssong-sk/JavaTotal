<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.ShopDao"%>
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
<style type="text/css">

    img.photo {
      width: 80px;
      height: 100px;
      border: 2px solid gray;
     
    }
    
    div.sangpum {
      cursor: pointer;
    }
</style>

<script type="text/javascript">
   $(function(){
	 
	   $("#allcheck").click(function(){
		   
		   var chk = $(this).is(":checked");
		   
		   $(".idx").prop("checked",chk);
		   
	   });
	   
	   //상품클릭 시 디테일 페이지로 이동
	   $("div.sangpum").click(function(){
		   
		   var shopnum = $(this).attr("shopnum");
		  // alert(shopnum);
		  
		  location.href = "index.jsp?main=shop/detailpage.jsp?shopnum="+shopnum;
	   });
	   
	   
	   $("#btncartdel").click(function(){
		   var cnt = $(".idx:checked").length;
		   //alert(cnt);
		   
		   if(cnt == 0) {
			   alert("삭제 할 상품을 1개이상 선택해주세요");
			   return;
		   }
		   
		   $(".idx:checked").each(function(i,elt){
			   var idx = $(this).attr("idx");
			   //alert(idx);
			   
			   //선택한 장바구니 상품 모두 삭제하기
			   del(idx);
		   });
		   
		   //현제페이지 새로고침
		   location.reload();
	   });
	   
	   //i태그 한개 삭제 이벤트
	   $("i.del").click(function(){
		   var idx = $(this).attr("idx");
		   //alert(idx);
		   //console.log(idx);
		   var a = confirm("삭제하려면 [확인]을 눌러주세요");
		   
		   if(a) {
			   del(idx);
			   location.reload(); //현 페이지에 머무는것
		   }
	   })
   })
   
   //사용자 함수
   function del (idx) {
	   $.ajax({
		 
		   type : "get",
		   url : "shop/cartdelete.jsp",
		   data : {"idx":idx},
		   dataType : "html",
		   success : function(){
			   
			   
		   }
	   })
   }
   
</script>
</head>

  <%
   String id = (String)session.getAttribute("myid");
   ShopDao dao = new ShopDao();
   List<HashMap<String, String>> list = dao.getCartList(id);
   NumberFormat nf = NumberFormat.getInstance();
    
  %>
<body>

   <h4 class="alert alert-info" style="width: 800px;"><%=id %>님의 장바구니</h4>
   
   <table class="table table-striped" style="width: 800px;">
     <tr>
       <th  style="width: 30px;" ><input type="checkbox" id="allcheck"></th>
       <th style="width: 200px;">상품정보</th>
       <th style="width: 200px;">상품금액</th>
     </tr>
     
     
     <%
     //선택한 상품 총 금액 변수
       int totalmoney = 0;
     
       for(int i = 0; i<list.size(); i++) {
    	 
    	   HashMap<String, String> map = list.get(i);
    	   
    	   //사진얻기
    	   String photo = map.get("photo"); //저장된 값을 불러옴
    	   
    	   %>
    	   
    	   <tr>
    	     <td>
    	       <input type="checkbox" name="idx" idx="<%=map.get("idx")%>" class="idx">
    	     </td>
    	     
    	     <td>
    	       <div class="sangpum" shopnum="<%=map.get("shopnum")%>">
    	         <img alt="" src="shopsave/<%=photo%>" class="photo" align="left" hspace="20">
    	         <b>상품명  <%=map.get("sangpum") %></b><br>
    	         <b>갯수  <%=map.get("cnt") %></b><br>
    	         <b>가격  <%=map.get("price") %></b><br>
    	         <b>날짜  <%=map.get("cartday") %></b>
    	       </div>
    	     </td>
    	     
    	     <td style="vertical-align: middle;">
    	       <% 
    	        
    	         
    	       
    	         int price = Integer.parseInt(map.get("price"));
    	         int cnt = Integer.parseInt(map.get("cnt"));
    	         price *= cnt;
    	         totalmoney += price;
    	       %>
    	       
    	       <h5><%=nf.format(price)%>원
    	         <i class="bi bi-trash3 del" idx="<%=map.get("idx")%>" style="color: red; margin-left: 20px;"></i></h5>
    	       
    	     </td>
    	   </tr>
       <%}
     
     %>
     
     <tr>
       <td colspan="3">
         <button class="btn btn-outline-danger" style="width: 120px; float: right;" id="btncartdel">선택상품 삭제</button><br><br>
         <%
           
         %>
         <span style="font-size: 1.2em; float: right;">총 주문금액 <%=nf.format(totalmoney) %>원 </span>
       </td>
     </tr>
   </table>

</body>
</html>