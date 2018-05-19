package it.dan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dan.service.ReverseService;

@SuppressWarnings("serial")
@WebServlet(name = "/annotated-reverse")
public class AnnotatedController extends HttpServlet {

   	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
   			throws ServletException, IOException 
   	{
   		String param1 = (String) request.getParameter("param1");
   		String param2 = (String) request.getParameter("param2");
   		
   		PrintWriter out = response.getWriter();
   		out.write("<h1>METHOD GET</h1>");
   		out.write("Your inputed parameters are \n");
   		out.write("param1 - " + param1 + "\n");
   		out.write("param2 - " + param2 + "\n");
   		out.write("Your reversed parameters are \n");
   		out.write("param1 - " + ReverseService.reverseString(param1) + "\n");
   		out.write("param2 - " + ReverseService.reverseString(param2));
   	
   	}

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
   			throws ServletException, IOException 
   	{
   		String param1 = (String) request.getParameter("param1");
   		String param2 = (String) request.getParameter("param2");
   		
   		PrintWriter out = response.getWriter();
   		out.write("<h1>METHOD POST</h1>");
   		out.write("Your inputed parameters are \n");
   		out.write("param1 - " + param1 + "\n");
   		out.write("param2 - " + param2 + "\n");
   		out.write("Your reversed parameters are \n");
   		out.write("param1 - " + ReverseService.reverseString(param1) + "\n");
   		out.write("param2 - " + ReverseService.reverseString(param2));
   	
	}
}
