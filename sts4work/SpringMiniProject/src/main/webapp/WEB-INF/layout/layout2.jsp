<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=IBM+Plex+Sans+KR&family=Nanum+Myeongjo&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
   div.layout div{
      border: 0px solid black;
      font-family: 'Dongle';
   }
   
   div.layout div.title{
      position: absolute;
      top: 40px;
      left: 830px;
      height: 70px;
   }
   
   div.layout div.menu{
      position: absolute;
      top: 150px;
      left: 440px;
      height: 100px;
   }
   
   div.layout div.info{
      position: absolute;
      width: 100%;
      top: 1800px;
      background-color : #00D3AB;
      padding: 20px 20px;
      color: white;
   }
   
   div.layout div.main{
   
      position: absolute;
      left: 460px;
      top: 300px;
   
      
   }
</style>
</head>
<body>
  <div class="layout">
     <div class="title">
        <tiles:insertAttribute name="title2"/>
     </div>
     
     <div class="menu">
        <tiles:insertAttribute name="menu2"/>
     </div>

     <div class="info">
        <tiles:insertAttribute name="info"/>
     </div>
     
     <div class="main">
        <tiles:insertAttribute name="main"/>
     </div>
     
  </div>
</body>
</html>