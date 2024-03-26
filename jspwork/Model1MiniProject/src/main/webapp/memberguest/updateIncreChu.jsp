<%@page import="org.json.simple.JSONObject"%>
<%@page import="data.dao.GuestDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    //num 읽기
    String num = request.getParameter("num");
    
    GuestDao dao = new GuestDao();
    dao.updateChu(num);
    
    //증가된 chu 값 json 형태로 보내기
    int chu = dao.getData(num).getChu();
    
    JSONObject ob = new JSONObject();
    ob.put("chu", chu);
    
    %>
    
    <%=ob.toString()%>