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
</head>
<body>
  <div style="margin: 100px 100px; width: 300px;">
    <form action="insert" method="post">
      <table class="table table-bordered">
        <caption align="top"><b>학생정보</b></caption>
        <tr>
          <th>학생명</th>
          <td>
            <input type="text" name="stuname" class="form-control" style="width: 150px;" required="required">
          </td>
        </tr>
        
        <tr>
          <th>연락처</th>
          <td>
            <input type="text" name="stuhp" class="form-control" style="width: 150px;" required="required">
          </td>
        </tr>
        
         <tr>
          <th>주소</th>
          <td>
            <input type="text" name="stuaddr" class="form-control" style="width: 150px;" required="required">
          </td>
        </tr>
        
        <tr>
          <th>사진</th>
          <td>
           <select name="stuphoto">
             <option value="9.jpg" selected="selected">이미지1</option>
             <option value="10.jpg">이미지2</option>
             <option value="11.jpg">이미지3</option>
             <option value="12.jpg">이미지4</option>
             <option value="13.jpg">이미지5</option>
             <option value="14.jpg">이미지6</option>
             <option value="15.jpg">이미지7</option>
             <option value="16.jpg">이미지8</option>
             <option value="17.jpg">이미지9</option>
             <option value="18.jpg">이미지10</option>
             
           </select>
          </td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
            <input type="submit" class="btn btn-outline-success" value="등록">
            <input type="button" class="btn btn-outline-info" value="목록" onclick="location.href='list'"> 
          </td>
        </tr>
      </table>
    </form>
  </div>
</body>
</html>