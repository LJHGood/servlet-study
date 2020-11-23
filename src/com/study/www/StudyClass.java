package com.study.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/study11")
public class StudyClass extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 받, 보
		 PrintWriter out =  response.getWriter();
		 
		 out.println("Hello<br />");
		 out.println("Hello");
		 out.println("Hello");
		 out.println("Hello");
		 out.println("Hello");
		 out.println("Hello");
		 
	}
}
