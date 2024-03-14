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
  
  %>
<body>
  <div style="margin: 200px 200px;">
    <form action="deleteAction.jsp" method="post">
      <table class="table table-bordered" style="width: 300px;">
         <caption align="top"><b>삭제확인 창</b></caption>
         <tr>
           <td>
             비밀번호를 입력해주세요 <br><br>
             <input type="password" class="form-control" name="pass" required="required" 
             placeholder="숫자 4자리 입력" style="width: 150px;">
             <input type="hidden" name="num" value="<%=num%>">
             <br><br>
             <button type="submit" class="btn btn-outline-danger">삭제</button>
             <button type="button" class="btn btn-outline-success" onclick="history.back()">이전</button>
           </td>
         </tr>
      </table>
    </form>
  </div>
</body>
</html>