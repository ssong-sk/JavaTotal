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
<body>
    <form action="quizWrite_03.jsp" method="post">
    
    <table class="table table-bordered" style="width:500px">
      <tr>
        <th width="100" class="table-info">이름</th>
        <th>
          <input type="text" name="name" placeholder="이름" required="required" class="form-control"
          style="width: 120px">
        </th>      
      </tr>
      
       <tr>
        <th width="100" class="table-info">입사날짜</th>
        <th>
          <input type="date" name="ipsa" placeholder="입사날짜" required="required" class="form-control"
          style="width: 120px">
        </th>      
      </tr>
      
      <tr>
        <th width="200" class="table-info">오늘 선택 점심메뉴</th>
        <th>
          <input type="radio"  name="menu1" value="../image/Food/1.jpg">
          <img src="../image/Food/1.jpg" width="100px">
          <input type="radio"  name="menu1" value="../image/Food/2.jpg">
          <img src="../image/Food/2.jpg" width="100px">
        </th>      
      </tr>
      
      
       <tr>
        <th width="170" class="table-info">건의메뉴</th>
        <td>
          <select name="menu2" class="form-control" style="width: 100px" multiple="multiple">
            <option value="쌀국수">쌀국수</option>
            <option value="마라탕">마라탕</option>
            <option value="탕수육">탕수육</option>
            <option value="짬뽕">짬뽕</option>
          </select>
        </td>
      </tr>
      
      
      <tr>
        <td colspan="2" align="center">
          <input type="submit" class="btn btn-success" value="출력" style="width: 100px">
          <input type="reset" class="btn btn-warning" value="초기화" style="width: 100px">
        </td>
      </tr>
      </table>
      
</body>
</html>