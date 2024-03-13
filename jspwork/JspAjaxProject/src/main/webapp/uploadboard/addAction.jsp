<%@page import="java.sql.SQLException"%>
<%@page import="uploadboard.data.UploadBoardDao"%>
<%@page import="uploadboard.data.UploadBoardDto"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.mysql.cj.protocol.a.MultiPacketReader"%>
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
  <%
    request.setCharacterEncoding("utf-8");
    
    //이미지 업로드에 필요한 변수 선언
    //업로드할 경로(톰캣에 올라가는 프로젝트 경로)
    String realFolder = getServletContext().getRealPath("/save");
    System.out.println(realFolder);
    
    //업로드 사이즈
    int uploadSize = 1024 * 1024 * 3; //3mb -> 3메가바이트 이하의 이미지만 저장 가능!!!!!!
    
    //생성자 파라메터(request, 업로드 폴더, 업로드 사이즈, 한글, 같은 이름일경우 1,2,3)
    try{
    	
    	MultipartRequest multi = new MultipartRequest(request, realFolder, uploadSize, "utf-8",
        		new DefaultFileRenamePolicy());
        
        //입력 값 읽기
        String writer = multi.getParameter("writer");
        String subject = multi.getParameter("subject");
        String content = multi.getParameter("content");
        String pass = multi.getParameter("pass");
        
        //실제 업로드 이미지 이름 읽어오기
        String imgname = multi.getFilesystemName("photo");
        
        //dto에 담가
        UploadBoardDto dto = new UploadBoardDto();
        
        dto.setWriter(writer);
        dto.setSubject(subject);
        dto.setContent(content);
        dto.setPass(pass);
        dto.setImgname(imgname);
        
        //dao생성
        UploadBoardDao dao = new UploadBoardDao();
        
        //insert호출
        dao.insertUploadBoard(dto);
        
        //목록이동
        response.sendRedirect("boardList.jsp");
        
    	
    }catch (Exception e) {
    
    }
    
  %>
</body>
</html>