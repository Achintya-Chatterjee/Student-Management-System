package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int rollno = Integer.parseInt(req.getParameter("rollno"));
		
		Student s = new Student(); 
		s.setRoll_no(rollno);
	
		
		try 
		{
			int res = s.deleteStudent();
			
			//show msg in saame page
			
			RequestDispatcher rd = req.getRequestDispatcher("delete.jsp");
			
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
