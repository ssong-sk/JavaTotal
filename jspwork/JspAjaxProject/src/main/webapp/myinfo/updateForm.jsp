<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="myinfo.db.myInfoDto"%>
<%@page import="myinfo.db.myInfoDao"%>
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
<script type="text/javascript">
  function goFocus(hp) {
	if(hp.value.length==4) {
		frm.hp3.focus();   //form name을 주어서 위치 지정해야 입력 후 다음 값으로 넘어감
	}
}
</script>
<%
 String num = request.getParameter("num");
 myInfoDao dao = new myInfoDao();
 myInfoDto dto = dao.getData(num);

%>

</head>
<body>
  <div style="margin: 100px 100px; width: 400px;">
    <form action="updateAction.jsp" method="post" name="frm">
      <input type="hidden" name="num" value="<%=num%>">
      <table class="table table-bordered">
        <caption align="top"><b>개인신상정보 수정</b></caption>
        
        <tr>
          <th width="100" class="table-info">이름</th>
          <td>
            <input type="text" name="name" class="form-control" style="width: 120px" 
            required="required" value="<%=dto.getName()%>">
          </td>
        </tr>
        
        <tr>
          <th width="100" class="table-info">혈액형</th>
          <td>
            <select name="blood" class="form-control" style="width: 100px"> 
              <option value="A" <%=dto.getBlood().equals("A")?"selected":"" %>>A형</option>
              <option value="B" <%=dto.getBlood().equals("B")?"selected":"" %>>B형</option>
              <option value="O" <%=dto.getBlood().equals("O")?"selected":"" %>>O형</option>
              <option value="AB" <%=dto.getBlood().equals("AB")?"selected":"" %>>AB형</option>
              
              
            </select>
          </td>
        </tr>
        
        <tr>
        <%
         //하이픈(-)을 구분자로 분리
         StringTokenizer st = new StringTokenizer(dto.getHp(),"-");
         String hp1 = st.nextToken();
         String hp2 = st.nextToken();
         String hp3 = st.nextToken();
        %>
        
        
          <th width="100" class="table-info">연락처</th>
          <td class="d-inline-flex"> 
            <select name="hp1" class="form-control" style="width: 80px"> 
              <%
                String [] strHp = {"011","010", "031", "016"};
                for (int i = 0; i < strHp.length; i++) {
                	if(hp1.equals(strHp[i])) {%>
                		<option value="<%=strHp[i]%>" selected="selected"><%=strHp[i] %></option>
                	<%}
                	else {%>
                		<option value="<%=strHp[i]%>" selected="selected"><%=strHp[i] %></option>
                	<%}
                }
              
              %>
            
              <option value="011">011</option>
              <option value="010">010</option>
              <option value="031">031</option>
              <option value="016">016</option>
            </select>
            <b>-</b>
            <input type="text" name="hp2" required="required" class="form-control" style="width: 100px;"
            onkeyup="goFocus(this)" value="<%=hp2%>">
            <b>-</b>
            <input type="text" name="hp3" required="required" class="form-control" style="width: 100px;"
            value="<%=hp3%>">
          </td>
        </tr>
        
        <tr>
          <th width="100" class="table-info">생년월일</th>
          <td>
            <input type="date" name="birth" required="required" class="form-control" style="width: 150px"
            value=<%=dto.getBirth()%>>
          </td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
            <input type="submit" value="수정" class="btn btn-outline-info">
            <input type="button" value="목록" class="btn btn-outline-success">
          </td>
        </tr>
        
      </table>
    </form>
  </div>
</body>
</html>