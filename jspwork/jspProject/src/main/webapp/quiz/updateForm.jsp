<%@page import="quiz.model.QuizDto"%>
<%@page import="quiz.model.QuizDao"%>
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
   String no = request.getParameter("no");
   QuizDao dao = new QuizDao();
   QuizDto dto = dao.getData(no);
   String driver = dto.getDriver();
 
 %>
 
 <script type="text/javascript">
	 
	function test(a){
		if( a == 1 ){ 
			$("input:checkbox[id='driver2']").prop("checked", false);
		}else if( a ==2 ){
			$("input:checkbox[id='driver1']").prop("checked", false); 
		}
	}

</script>
<body>
 
 <div style="margin: 50px 50px">
    <form action="updateAction.jsp" method="post">
      <table class="table table-bordered" style="width: 400px">
        <tr>
            <th class="table success" width="100">이름</th>
          <td>
            <input type="text" name="name" placeholder="이름" required="required"  class="form-control" 
             style="width: 150px" value="<%=dto.getName()%>">
          </td>
        </tr>
        
        <tr>
            <th class="table success" width="100">나이</th>
          <td>
            <input type="text" name="age" placeholder="나이" required="required" class="form-control" 
             style="width: 150px" value="<%=dto.getAge()%>">
          </td>
        </tr>
        
         <tr>
            <th class="table success" width="100">핸드폰번호</th>
          <td>
            <input type="text" name="hp" placeholder="핸드폰번호" required="required" class="form-control" 
             style="width: 150px" value="<%=dto.getHp()%>">
          </td>
        </tr>
        
         <tr>
            <th class="table success" width="100">운전면허</th>
          <td>
           <% if ( "있음".equals(driver)) {%>
        	<input type="checkbox" name="driver" id="driver1" onchange="test(1)" checked="checked" value="있음">있음&nbsp;
            <input type="checkbox" name="driver" id="driver2" onchange="test(2)" value="없음">없음&nbsp;   
           <% }else{ %>
        	<input type="checkbox" name="driver" id="driver1" onchange="test(1)"  value="있음">있음&nbsp;
            <input type="checkbox" name="driver" id="driver2" onchange="test(2)" checked="checked" value="없음">없음&nbsp;   
			<%} %>            
          </td>
        </tr>
        
        <tr>
           <td colspan="2" align="center">
             <input type="hidden" name="no" value="<%=no%>">
             <input type="submit" value="수정" class="btn btn-outline-success">
             <input type="button" value="목록" class="btn btn-outline-warning" onclick="location.href='list.jsp'">
           </td>
        </tr>
            
        
      </table>
    </form>
  </div>
</body>
</html>