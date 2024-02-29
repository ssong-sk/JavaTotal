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
   <form action="infoWrite.jsp" method="post">
     <table class="table table-bordered" style="width: 50%">
       <caption align="top">Radio & Check</caption>
        <tr height="30">
          <td>
            <b>최종학력선택</b>
            <input type="radio" name="grade" value="고등학교">고등학교&nbsp;
            <input type="radio" name="grade" value="전문대학">전문대학&nbsp;
            <input type="radio" name="grade" value="대학">대학&nbsp;
            <input type="radio" name="grade" value="대학원">대학원&nbsp;
          </td>
        </tr>
        
         <tr height="30">
          <td>
            <b>가능한 컴퓨터 언어</b>
            <input type="checkbox" name="lang" value="C++">C++&nbsp;
            <input type="checkbox" name="lang" value="Java">Java&nbsp;
            <input type="checkbox" name="lang" value="파이썬">파이썬&nbsp;
            <input type="checkbox" name="lang" value="안드로이드">안드로이드&nbsp;
          </td>
        </tr>
        
        <tr>
          <td>
            <b>같은 조 하고 싶은 사람?</b>
              <select name="like">
                <option value="재석">재석</option>
                <option value="종국" selected="selected">종국</option>
                <option value="석진">석진</option>
                <option value="지효">지효</option>
                <option value="하하">하하</option>
              </select>
          </td>
        </tr>
        
        <tr>
          <td>
            <b>당신의 키?</b>
            <input type="number" name="height" max="230" min="150" step="2" value="150">cm
          </td>
        </tr>
        
         <tr>
          <td>
            <b>당신의 몸무게?</b>
            <input type="number" name="weight" max="120" min="50" step="1" value="50">kg
          </td>
        </tr>
        
        <tr>
          <td>
            <b>날짜선택</b>
            <input type="date" name="ipsaday">
          </td>
        </tr>
        
        <tr>
          <td align="center">
            <input type="submit" value="전송">
            <input type="reset" value="초기화">
          </td>
        </tr>
        
     </table>
   </form>
</body>
</html>