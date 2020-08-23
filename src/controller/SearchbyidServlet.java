package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;

@WebServlet(urlPatterns = "/searchbyid")
public class SearchbyidServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int rollno = Integer.parseInt(req.getParameter("rollno"));
		
		Student s = new Student();
		s.setRoll_no(rollno);
		
		try 
		{
			ResultSet res = s.showStudentByRollno();
			
			//Get details from Database
			while(res.next())
			{
				String n1 = res.getString("name");
				String l1 = res.getString("lang");
				String p1 = res.getString("password");
				String g1 = res.getString("gender");
				String s1 = res.getString("state");
				
				RequestDispatcher rd =req.getRequestDispatcher("update.jsp");
				req.setAttribute("rollno", rollno);
				req.setAttribute("name", n1 );
				req.setAttribute("lang", l1);
				req.setAttribute("password", p1);
				req.setAttribute("gender", g1);
				req.setAttribute("state", s1);
				rd.forward(req, resp);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
