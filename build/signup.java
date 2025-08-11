package in.pentagon.studentapp.servlets;


	import java.io.IOException;
	import java.io.PrintWriter;
import java.sql.SQLException;

import in.pentagon.studentapp.dao.studentdao;
import in.pentagon.studentapp.dao.studentdaoimpl;
import in.pentagon.studentapp.dto.student;
import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	@WebServlet("/signup")
	public class signup extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//creating a object of POJO class
			student s= new student();
			//creating the ref object of StudentDAO
			studentdao sdao = null;
			try {
				sdao = new studentdaoimpl();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//creating
			
			PrintWriter out=resp.getWriter();
			
			//getting data from the UI
			//String name=req.getParameter("name");
			//s.setName(name);
			s.setName(req.getParameter("username"));
			
			String s_p=req.getParameter("phone");
			long phone=Long.parseLong(s_p);
			s.setPhone(Long.parseLong(req.getParameter("phone")));
			s.setMail(req.getParameter("mail"));
			s.setBranch(req.getParameter("branch"));
			s.setLoc(req.getParameter("loc"));
			if(req.getParameter("password").equals(req.getParameter("confirm"))) {
				s.setPassword(req.getParameter("password"));
				boolean res=sdao.insertstudent(s);
				if(res) {
					out.println("<h1>Data Added Successfully</h1>");
				}
				else {
					out.println("<h1>Failed to signup</h1>");
				}
				
			}
			else {
				out.println("<h1>Password Mismatch</h1>");
			}
			
			
		}

	}


