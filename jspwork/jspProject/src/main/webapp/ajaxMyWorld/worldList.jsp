<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="myworld.model.worldDto"%>
<%@page import="java.util.List"%>
<%@page import="myworld.model.worldDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  worldDao dao = new worldDao();

  //목록 가져오기
  List<worldDto> list = dao.getAllmyWorld();
  
  JSONArray arr = new JSONArray();
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  
  for(worldDto dto:list) {
	  JSONObject ob = new JSONObject();
	  ob.put("num", dto.getNum());
	  ob.put("writer", dto.getWriter());
	  ob.put("content", dto.getContent());
	  ob.put("avata", dto.getAvata());
	  ob.put("writeday", sdf.format(dto.getWriteday()));
	  
	  //arr에 추가
	  arr.add(ob);
  }
%>

<%=arr.toString()%>