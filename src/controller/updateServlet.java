package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;

@WebServlet(urlPatterns = "/update")
public class updateServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int rollno = Integer.parseInt(req.getParameter("rollno"));
		String password = req.getParameter("psw");
		String name = req.getParameter("yourname");
		String gender = req.getParameter("gender");
		String lang = "";
		String bengali = req.getParameter("Bengali");
		String english = req.getParameter("English");
		String hindi = req.getParameter("Hindi");
		if(bengali!=null)
		{
			lang = lang + " bengali";
		}
		if(english!=null)
		{
			lang = lang + " english";
		}
		if(hindi!=null)
		{
			lang = lang + " hindi";
		}
		String state = req.getParameter("state");
		
		PrintWriter out = resp.getWriter();
		/*
		 * out.println("Roll is "+rollno); out.println("password is "+password);
		 * out.println("name is "+name); out.println("gender is "+gender);
		 * out.println("language is "+lang); out.println("state is "+state);
		 */
		
		Student s = new Student(); 
		s.setRoll_no(rollno);
		s.setPassword(password);
		s.setName(name);
		s.setGender(gender);
		s.setLang(lang);
		s.setState(state);
		
		try 
		{
			int res = s.updateStudent();
			
			//show msg in saame page
			
			RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
			
			if(res == 1)
			{
				//out.println("success");
				req.setAttribute("msg", "Successfully Registred");
			}
			else
			{
				req.setAttribute("msg", "Registration faileed");
			}
			
			rd.forward(req, resp);
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
