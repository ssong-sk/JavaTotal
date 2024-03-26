<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="data.dto.GuestDto"%>
<%@page import="data.dao.GuestDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
   href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&display=swap"
   rel="stylesheet">
<link
   href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
   rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.0/font/bootstrap-icons.css">
<title>Insert title here</title>
  <body>
<%
  String myid=(String)session.getAttribute("myid");

  String realPath=getServletContext().getRealPath("/save");
  System.out.println(realPath);
  
  int uploadSize=1024*1024*3;
  
  MultipartRequest multi=null;
  try{
  multi=new MultipartRequest(request,realPath,uploadSize,"utf-8",new DefaultFileRenamePolicy());
  
       String num = multi.getParameter("num");
       String currentPage = multi.getParameter("currentPage");
       String content=multi.getParameter("content");
       String photoname=multi.getFilesystemName("photo"); 
       
       //기존포토명 가져오기 -> 기존에 사진값을 가져오기 위해서 dao 먼저 선언
       GuestDao dao = new GuestDao();
       String old_photoName = dao.getData(num).getPhotoname();
       
       //dto에 저장
       GuestDto dto=new GuestDto();
       
       dto.setNum(num);
       dto.setMyid(myid);
       dto.setContent(content);
       
       //사진 선택을 안하면 기존의 사진으로 저장
       dto.setPhotoname(photoname==null?old_photoName:photoname);
       
       //update
       dao.updateGuest(dto);
       
       //방명록 목록으로 이동(수정했던 페이지로 이동)
       response.sendRedirect("../index.jsp?main=memberguest/guestlist.jsp?currentPage="+currentPage);
  
  }catch(Exception e){
	  
  }
%>
</head>
<body>

</body>
</html>