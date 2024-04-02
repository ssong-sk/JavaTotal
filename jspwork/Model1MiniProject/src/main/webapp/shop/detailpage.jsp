<%@page import="java.text.NumberFormat"%>
<%@page
	import="com.oreilly.servlet.multipart.MacBinaryDecoderOutputStream"%>
<%@page import="data.dao.MemberDao"%>
<%@page import="data.dto.ShopDto"%>
<%@page import="data.dao.ShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&family=Stylish&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
img.large {
	width: 300px;
	height: 400px;
}
</style>

</head>
<%
String shopnum = request.getParameter("shopnum");
String loginok = (String) session.getAttribute("loginok");
String myid = (String) session.getAttribute("myid");

//아이디에 해당하는 멤버 시퀀스
MemberDao mdao = new MemberDao();
String num = mdao.getNum(myid);

ShopDao sdao = new ShopDao();
ShopDto dto = sdao.getData(shopnum);

NumberFormat nf = NumberFormat.getCurrencyInstance();
%>
<body>

	<div style="margin: 50px 100px; width: 800px;">
		<form id="frm">
			<!-- hidden : 장바구니 db에 넣기 -->
			<input type="hidden" name="shopnum" value="<%=shopnum%>"> <input
				type="hidden" name="num" value="<%=num%>">

			<table class="table">

				<tr>
					<td><img alt="" src="shopsave/<%=dto.getPhoto()%>"
						class="large img-thumbnail"></td>

					<td style="width: 300px;">
						<h3>
							카테고리 :
							<%=dto.getCategory()%></h3>
						<h3>
							상품명 :
							<%=dto.getSangpum()%></h3>
						<h3>
							가격 :
							<%=nf.format(dto.getPrice())%></h3> <!--  갯수  -->
						<h3>
							갯수 : <input type="number" min="1" max="10" value="1" step="1"
								name="cnt">
						</h3>

						<div style="margin-top: 100px; margin-left: 60px;">
							<button type="button" class="btn btn-outline-info" id="btncart">장바구니</button>
							<button type="button" class="btn btn-outline-info"
								onclick="location.href='index.jsp?main=shop/shoplist.jsp'">상품목록</button>
						</div>
					</td>
				</tr>
			</table>
		</form>

		<script type="text/javascript">
			$(function() {

				$("#btncart").click(function() {

				    var login = "<%=loginok%>";
				    
				    if(login=="null") {
				    	alert("먼저 로그인을 해주세요");
				    	return;
				    }
				    
					
				    //form태그 가져오기
					var cartdata = $("#frm").serialize();
					//alert(cartdata);
					
					//insertcart 처리 하기
					$.ajax({
						type : "post",
						dataType : "html",
						data : cartdata,
						url : "shop/detailprocess.jsp",
						success : function() {
							//alert ("success");
							
							var a = confirm("장바구니에 저장하였습니다\n장바구니로 이동하려면 [확인]을 눌러주세요");
							
							if(a) {
								location.href="index.jsp?main=shop/mycart.jsp";
							}
						}
					})
				})
			})
		</script>
	</div>

</body>
</html>