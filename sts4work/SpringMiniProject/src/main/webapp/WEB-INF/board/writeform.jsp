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
</head>
<body>
  <div style="margin: 50px 300px;">
    <form action="insert" method="post" enctype="multipart/form-data">
      <table class="table table-bordered" style="width: 420px;">
        <caption align="top"><h2><b>글쓰기</b></h2></caption>
          <tr>
            <th>제목</th>
            <td>
              <input type="text" name="subject" class="form-control" required="required" style="width: 300px;">
            </td>
          </tr>
          
          <tr>
            <th>업로드</th>
            <td>
              <input type="file" name="upload" class="form-control" style="width: 250px;">
            </td>
          </tr>
          
          <tr>
            <td colspan="2">
              <textarea style="width: 400px; height: 150px;" class="form-control" name="content" required="required"></textarea>
            </td>
          </tr>
          
          <tr>
            <td colspan="2" align="center">
              <button type="submit" class="btn btn-outline-info">등록</button>
              <button type="button" class="btn btn-outline-warning" onclick="location.href='list'">목록</button>
            </td>
          </tr>
        
        </table>
      </form>
    </div>           
</body>
</html>