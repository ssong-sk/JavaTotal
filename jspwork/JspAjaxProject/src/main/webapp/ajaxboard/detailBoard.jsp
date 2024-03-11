<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ajaxboard.AjaxBoardDao"%>
<%@page import="ajaxboard.AjaxBoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    
    //dao
    AjaxBoardDao dao = new AjaxBoardDao();
    
    //num읽기
    String num = request.getParameter("num");
    
    //num에 해당하는 dto값 어기
    AjaxBoardDto dto = dao.getData(num);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    
    //dto를 json으로 변환
    JSONObject ob = new JSONObject();
    
    //json에 데이터 추가
    ob.put("num", dto.getNum());
    ob.put("writer", dto.getWriter());
    ob.put("subject", dto.getSubject());
    ob.put("content", dto.getContent());
    ob.put("avata", dto.getAvata());
    ob.put("writeday", sdf.format(dto.getWriteday()));

    %>
    
    <%=ob.toString()%>