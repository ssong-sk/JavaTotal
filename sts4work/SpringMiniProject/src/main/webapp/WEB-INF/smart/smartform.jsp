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
  <script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<c:set var="root" value="<%=request.getContextPath() %>"/>
<!-- se2 폴더에서 js 파일 가져오기 -->
<script type="text/javascript" src="${root }/se2/js/HuskyEZCreator.js"
	charset="utf-8"></script>
<script type="text/javascript" src="${root }/se2/photo_uploader/plugin/hp_SE2M_AttachQuickPhoto.js"
	charset="utf-8"></script>	

</head>
<body>
  <div style="margin: 50px 300px;">
    <form action="insert" method="post" enctype="multipart/form-data">
      <table class="table table-bordered" style="width: 420px;">
        <caption align="top"><h2><b>상품등록</b></h2></caption>
          <tr>
            <th class="table-info">상품명</th>
            <td>
              <input type="text" name="sangpum" class="form-control" required="required" style="width: 150px;">
            </td>
          </tr>
          
          <tr>
            <th class="table-info">색상</th>
            <td>
              <input type="color" name="color" class="form-control" required="required" style="width: 150px;">
            </td>
          </tr>
          
          <tr>
            <th class="table-info">단가</th>
            <td>
              <input type="text" name="price" class="form-control" required="required" style="width: 200px;">
            </td>
          </tr>
          
          <tr>
            <th class="table-info">입고일</th>
            <td>
              <input type="date" name="ipgoday" class="form-control" value="2024-01-01" style="width: 150px;">
            </td>
          </tr>
          
          <tr>
            <td colspan="2">
              <textarea id="content" style="width: 400px; height: 150px;" class="form-control" name="content" required="required"></textarea>
            </td>
          </tr>
          
          <tr>
            <td colspan="2" align="center">
              <button type="button" class="btn btn-outline-info" onclick="submitContents(this)">등록</button>
              <button type="button" class="btn btn-outline-warning" onclick="location.href='list'">목록</button>
            </td>
          </tr>
        
        </table>
      </form>
    </div> 
    
    <!-- 스마트게시판에 대한 스크립트 코드 넣기 -->
	<script type="text/javascript">
	var oEditors = [];
	nhn.husky.EZCreator.createInIFrame({
	   oAppRef: oEditors,
	   elPlaceHolder: "content",
	   sSkinURI: "${root}/se2/SmartEditor2Skin.html",
	   fCreator: "createSEditor2"
	});
	//‘저장’ 버튼을 누르는 등 저장을 위한 액션을 했을 때 submitContents가 호출된다고 가정한다.
	function submitContents(elClickedObj) {
	   // 에디터의 내용이 textarea에 적용된다.
	   oEditors.getById["content"].exec("UPDATE_CONTENTS_FIELD", [ ]);
	   // 에디터의 내용에 대한 값 검증은 이곳에서
	   // document.getElementById("textAreaContent").value를 이용해서 처리한다.
	   try {
	       elClickedObj.form.submit();
	   } catch(e) {
	   }
	}
	// textArea에 이미지 첨부
	function pasteHTML(filepath){
	   var sHTML = '<img src="${root}/save/'+filepath+'">';
	   oEditors.getById["content"].exec("PASTE_HTML", [sHTML]);
	}
	</script>
              

</body>
</html>