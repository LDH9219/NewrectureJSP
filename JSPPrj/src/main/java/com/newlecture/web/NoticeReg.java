package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg") //Annotation : 클래스나 메서드에 붙여지는 주석
public class NoticeReg extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//request.setCharacterEncoding("UTF-8");
		
		  PrintWriter out = response.getWriter();
		  
		  String title = request.getParameter("title");
		  String content = request.getParameter("content");
		  
		  out.print("제목 : " + title + "</br>");
		  out.print("내용 : " + content);
	}
}