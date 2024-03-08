<%@page import="org.json.simple.JSONObject"%>
<%@page import="netscape.javascript.JSObject"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="myworld.model.worldDto"%>
<%@page import="myworld.model.worldDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  worldDao dao = new worldDao();

  String num = request.getParameter("num");
  
  worldDto dto = dao.getData(num);
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  
  JSONObject ob = new JSONObject();
  ob.put("num", dto.getNum());
  ob.put("writer", dto.getWriter());
  ob.put("content", dto.getContent());
  ob.put("avata", dto.getAvata());
  ob.put("writeday",sdf.format(dto.getWriteday()));
  
%>

<%=ob.toString()%>