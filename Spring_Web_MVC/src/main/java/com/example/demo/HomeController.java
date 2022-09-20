package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //req and response from web
public class HomeController 
{
	@RequestMapping("/admin")
	public String home(HttpServletRequest req,HttpServletResponse res)
	{
		
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		System.out.println("Hello world " + name);
		session.setAttribute("name", name);
		return "home.jsp";
	}
	

}