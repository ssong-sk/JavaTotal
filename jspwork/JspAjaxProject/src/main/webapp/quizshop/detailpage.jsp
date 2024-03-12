<%@page import="quizshop.model.QuizShopDao"%>
<%@page import="java.util.List"%>
<%@page import="quizshop.model.QuizShopDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&family=Stylish&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<%
 String num = request.getParameter("num");
 QuizShopDao dao = new QuizShopDao();
 QuizShopDto dto = dao.getDate(num);
%>

<body>
  <!-- 이미지가 크게 나오고 옆에 설명 추가 
    상품명    가격    입고일
    
    맨아래 목록, 수정, 삭제 버튼3개 추가-->
    
     <div style="margin: 50px 100px; width: 500px">
      <form action="shoplist.jsp" method="post">
         <input type="hidden" name="num" value="<%=num%>">
         <h3>QuizShop 디테일 정보</h3>
            <table class="table table-bordered" style="width: 500px;">               
               <tr>
                  <th rowspan="3" style="width: 250px;"><img src="../image/쇼핑몰사진/<%=dto.getPhoto()%>.jpg" width="250"></th>
                  <th class="table-info" width="80" valign="middle" style="text-align: center;">상품명</th>
                  <td valign="middle"  style="text-align: center;"><%=dto.getSang_name() %></td>
               </tr>
               <tr>
                  <th class="table-info" width="80" valign="middle" style="text-align: center;">가격</th>
                  <td valign="middle" style="text-align: center;"><%=dto.getPrice() %>원</td>
               </tr>
               <tr>
                  <th class="table-info" width="80" valign="middle" style="text-align: center;">입고일</th>
                  <td valign="middle" style="text-align: center;"><%=dto.getIpgoday()%></td>
               </tr>
               <tr>
                  <td colspan="3" align="right">
                     <button type="submit" class="btn btn-outline-info">목록</button>
                     <button type="button" class="btn btn-outline-success">수정</button>
                     <button type="button" class="btn btn-outline-danger">삭제</button>
                  </td>
               </tr>

            </table>
      </form>
   </div>
    

    
</body>
</html>