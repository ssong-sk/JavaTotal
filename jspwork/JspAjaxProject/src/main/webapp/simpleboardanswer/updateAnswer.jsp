<%@page import="simpleboardanswer.model.simpleAnswerDao"%>
<%@page import="simpleboardanswer.model.simpleAnswerDto"%>
<%@page import="ajaxboard.AjaxBoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    request.setCharacterEncoding("utf-8");
    
    String idx = request.getParameter("idx");
    String nickname = request.getParameter("nickname");
    String content = request.getParameter("content");
    
    simpleAnswerDto dto = new simpleAnswerDto();
    dto.setIdx(idx);
    dto.setNickname(nickname);
    dto.setContent(content);
    
    simpleAnswerDao dao = new simpleAnswerDao();
    dao.updateSimpleAnswer(dto);
    %>