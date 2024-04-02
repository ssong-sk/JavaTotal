<%@page import="data.dto.CartDto"%>
<%@page import="data.dao.ShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <% 
    
      request.setCharacterEncoding("utf-8");
    
      String shopnum = request.getParameter("shopnum"); //히든처리함.
      String num = request.getParameter("num");  //히든처리함
      int cnt = Integer.parseInt(request.getParameter("cnt"));
      
      
      ShopDao dao = new ShopDao();
      CartDto dto = new CartDto();
      
      dto.setShopnum(shopnum);
      dto.setNum(num);
      dto.setCnt(cnt);
      
      dao.insertCart(dto);
      
    %>
    