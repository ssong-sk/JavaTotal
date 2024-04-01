<%@page import="data.dao.SmartAnswerDao"%>
<%@page import="data.dao.smartDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.smartDto"%>
<%@page import="java.util.List"%>
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

<style type="text/css">
  a:link, a:visited {
    text-decoration: none;
    color: black;
  
  }
  
  a:hover {
    text-decoration: none;
    color: gray;
  }

</style>

<script type="text/javascript">
  $(function(){
	  
	  //전체체크 클릭시 체크값 얻어서 모든체크값 에 전달
	  $(".alldelcheck").click(function(){
		  
		  //전체 체크값 얻기
		  var chk=$(this).is(":checked");
		  console.log(chk);
		  
		  //전체체크값을 글앞에 체크에 일괄 전달하기
		  $(".alldel").prop("checked",chk);
	  });
	  
	  //삭제버튼 클릭시 삭제
	  $("#btndel").click(function(){
		  
		  var len=$(".alldel:checked").length;
		  //alert(len);
		  
		  if(len==0){
			  alert("최소 1개이상의 글을 선택해 주세여");
		  }else{
			  
			  var a=confirm(len+"개의 글을 삭제하려면 [확인]을 눌러주세요");
			  
			  //체크된 곳의 value값(num)얻기
			  var n="";
			  $(".alldel:checked").each(function(idx){
				  n+=$(this).val()+",";
			  });
			  
			  //마지막 컴마 제거
			  n=n.substring(0,n.length-1);
			  console.log(n);
			  
			  //삭제파일로 전송
			  location.href="smartboard/alldelete.jsp?nums="+n;
		  }
	  })
	  
  })

</script>

</head>
  <%
   //로그인상태확인
   String loginok=(String)session.getAttribute("loginok");

	smartDao dao=new smartDao();
	
	//전체갯수
	int totalCount=dao.getTotalCount();
	int perPage=5; //한페이지당 보여질 글의 갯수
	int perBlock=5; //한블럭당 보여질 페이지 갯수
	int startNum; //db에서 가져올 글의 시작번호(mysql은 첫글이0번,오라클은 1번);
	int startPage; //각블럭당 보여질 시작페이지
	int endPage; //각블럭당 보여질 끝페이지
	int currentPage;  //현재페이지
	int totalPage; //총페이지수
	int no; //각페이지당 출력할 시작번호
	
	//현재페이지 읽는데 단 null일경우는 1페이지로 준다
	if(request.getParameter("currentPage")==null)
		currentPage=1;
	else
		currentPage=Integer.parseInt(request.getParameter("currentPage"));
	
	//총페이지수 구한다
	//총글갯수/한페이지당보여질갯수로 나눔(7/5=1)
	//나머지가 1이라도 있으면 무조건 1페이지 추가(1+1=2페이지가 필요)
	totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);
	
	//각블럭당 보여질 시작페이지
	//perBlock=5일경우 현재페이지가 1~5일경우 시작페이지가1,끝페이지가 5
	//현재가 13일경우 시작:11 끝:15
	startPage=(currentPage-1)/perBlock*perBlock+1;
	endPage=startPage+perBlock-1;
	
	//총페이지가 23일경우 마지막블럭은 끝페이지가 25가 아니라 23
	if(endPage>totalPage)
		endPage=totalPage;
	
	//각페이지에서 보여질 시작번호
	//1페이지:0, 2페이지:5 3페이지: 10.....
	startNum=(currentPage-1)*perPage;
	
	//각페이지당 출력할 시작번호 구하기
	//총글개수가 23  , 1페이지:23 2페이지:18  3페이지:13
	no=totalCount-(currentPage-1)*perPage;
	
	//페이지에서 보여질 글만 가져오기
	List<smartDto> list = dao.getList(startNum, perPage);
		
	//날짜변경
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	//댓글 갯수 넣기
	SmartAnswerDao adao = new SmartAnswerDao();
	
	for(smartDto dto:list) {
		//댓글 변수에 댓글 총 갯수 넣기
		int acount = adao.getAnswerList(dto.getNum()).size();
		dto.setAnswercount(acount);
 	}
	%>
	
<body>
  <div>
  
    <h6><b><%=totalCount %>개의 게시글이 있습니다</b></h6>
    <table class="table table-bordered">
      <caption align="top"><b>스마트게시판 목록</b></caption>
      <tr class="table-bordered">
        <th width="80">번호</th>
        <th width="380">제목</th>
        <th width="120">작성자</th>
        <th width="200">작성일</th>
        <th width="80">조회</th>
      </tr>
      
      <%
        if(totalCount==0) {%>
          <tr>
            <td colspan="4" align="center">
              <h6><b>등록된 게시글이 없습니다</b></h6>
            </td>
          </tr>
        	
        <%}
        else {
        	for(smartDto dto:list) {%>
        		<tr>
        		  <td>
        		  <input type="checkbox" value="<%=dto.getNum()%>" class="alldel">&nbsp;&nbsp;
        		  <%=no-- %></td>
      
        		  <td><a href="index.jsp?main=smartboard/contentview.jsp?num=<%=dto.getNum()%>
        		  &currentPage=<%=currentPage%>">
        		  <span style="text-overflow: ellipsis; white-space: nowrap; overflow: hidden;
        		  width: 250px; display: block;"><%=dto.getSubject() %></a></span>
        		  
        		  <%
        		    if (dto.getAnswercount()>0) {%>
        		    
        		    	  <a href="index.jsp?main=smartboard/contentview.jsp?num=<%=dto.getNum()%>
        		          &currentPage=<%=currentPage%>" style="color: gray;">[<%=dto.getAnswercount() %>]</a>
        		    <%}
        		  %>
        		  
        		  </td>
        		  <td><a><%=dto.getWriter() %></a></td>
        		  <td><a><%=sdf.format(dto.getWriteday()) %></a></td>
        		  <td><%=dto.getReadcount() %></td>
        		</tr>
        	<%}%>
        	
        	<tr>
        	  <td colspan="5">
        	    <input type="checkbox" class="alldelcheck"> 전체선택
        	    <span style="float: right;">
        	      <button type="button" class="btn btn-outline-info btn-sm" id=btndel>
        	      <i class="bi bi-trash3"></i> 삭제</button>
        	      <button type="button" class="btn btn-outline-info btn-sm" 
                   onclick="location.href='index.jsp?main=smartboard/smartform.jsp'">
                   <i class="bi bi-pencil"></i> 글쓰기</button>
        	    </span>
        	  </td>
        	</tr>
        <%}
      %>
    </table>
  </div>
  
  <div style="width: 580px; text-align: center; margin: 50px 100px;">
  
  <!-- 페이지 번호 출력 -->
  <ul class="pagination justify-content-center">
  <%
  //이전
  if(startPage>1)
  {%>
	  <li class="page-item ">
	   <a class="page-link" href="index.jsp?main=smartboard/boardlist.jsp?currentPage=<%=startPage-1%>" style="color: black;">이전</a>
	  </li>
  <%}
    for(int pp=startPage;pp<=endPage;pp++)
    {
    	if(pp==currentPage)
    	{%>
    		<li class="page-item active">
    		<a class="page-link" href="index.jsp?main=smartboard/boardlist.jsp?currentPage=<%=pp%>"><%=pp %></a>
    		</li>
    	<%}else
    	{%>
    		<li class="page-item">
    		<a class="page-link" href="index.jsp?main=smartboard/boardlist.jsp?currentPage=<%=pp%>"><%=pp %></a>
    		</li>
    	<%}
    }
    
    //다음
    if(endPage<totalPage)
    {%>
    	<li class="page-item">
    		<a  class="page-link" href="index.jsp?main=smartboard/boardlist.jsp?currentPage=<%=endPage+1%>"
    		style="color: black;">다음</a>
    	</li>
    <%}
  %>
  
  </ul>
 
  
</div>
</body>
</html>