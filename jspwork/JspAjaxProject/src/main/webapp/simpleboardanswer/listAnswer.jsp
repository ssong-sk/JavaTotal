<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.util.List"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.mysql.cj.xdevapi.JsonArray"%>
<%@page import="simpleboardanswer.model.simpleAnswerDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="simpleboardanswer.model.simpleAnswerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

  <%
  String num = request.getParameter("num");
  simpleAnswerDao dao = new simpleAnswerDao();
  
  List<simpleAnswerDto> list = dao.getAllData(num);
  
  JSONArray arr = new JSONArray();
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
  
  for(simpleAnswerDto dto:list) {
	  JSONObject ob = new JSONObject();
	  
	  ob.put("idx", dto.getIdx());
	  ob.put("num", dto.getNum());
	  ob.put("nickname", dto.getNickname());
	  ob.put("content", dto.getContent());
	  ob.put("writeday", sdf.format(dto.getWirteday()));
	  
	  arr.add(ob);
  }

  %>
  
  <%=arr.toString()%>