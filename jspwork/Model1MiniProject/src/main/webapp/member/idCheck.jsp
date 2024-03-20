<%@page import="org.json.simple.JSONObject"%>
<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    
     //아이디 중복 체크 - isIdCheck
     String id = request.getParameter("id");
     MemberDao dao = new MemberDao();
     int count = dao.isIdCheck(id);
     
     JSONObject ob = new JSONObject();
     ob.put("count", count);
    
     
     //json은 반드시 체크해보기
    %>
    <%=ob.toString()%>