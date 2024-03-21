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
</head>
<%
  //세션값 얻기
  String saveok = (String)session.getAttribute("saveok");
  String myid = "";
  
  if(saveok !=null) {
	  myid=(String)session.getAttribute("myid");
  }

%>
<body>

  <div style="margin: 100px 300px">
    <form action="login/loginAction.jsp" method="post">
      <table class="table table-bordered" style="width: 200px;">
        <caption align="top"><b>로그인</b></caption>
          <tR>
            <td>
              <input type="text" name="id" class="form-control" required="required" placeholder="id"
              style="width: 200px;" value="<%=myid%>">
            </td>
          </tR>
          
          <tR> 
             <td>
              <input type="password" name="pass" class="form-control" required="required" placeholder="password"
               style="width: 200px;">
            </td>
          </tR>
          
          <tr>
            <td>
              <input type="checkbox" name="cbsave"
              <%=saveok==null?"":"checked" %>>&nbsp;아이디저장
            </td>
          </tr>
          
          <tr>
            <td>
              <button type="submit" class="btn btn-outline-info" style="width: 200px;">로그인</button>
            </td>
          </tr>
          
      </table>
    </form>
  </div>

</body>
</html>