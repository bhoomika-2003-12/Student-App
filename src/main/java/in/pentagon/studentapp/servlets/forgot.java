package in.pentagon.studentapp.servlets;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import in.pentagon.studentapp.dao.StudentDAOImpl;
import in.pentagon.studentapp.dto.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/forgot")
public class forgot extends HttpServlet{
 @Override
 	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 	StudentDAOImpl sdao = null;
		
	 	//PrintWriter out=resp.getWriter();
	 	Student s=sdao.getstudent(Long.parseLong(req.getParameter("phone")), req.getParameter("mail"));
	 	if(s!=null) {
	 		if(req.getParameter("password").equals(req.getParameter("confirm"))){
	 			s.setPassword(req.getParameter("password"));
	 			boolean res=sdao.updatestudent(s);
	 			if(res) {
	 				//out.println("<h1>Password Updated</h1>");
	 				req.setAttribute("success", "Password Updated Successfully");
					RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
					rd.forward(req, resp);
	 			}
	 			else {
	 				//out.println("<h1>Failed to Update");
	 				req.setAttribute("error", "Failed to Upadate Password");
	 				RequestDispatcher rd=req.getRequestDispatcher("forgot.jsp");
	 				rd.forward(req, resp);
	 			}
	 		}
	 		else {
	 			//out.println("<h1>Password mismatch</h>");
	 			req.setAttribute("error", "Password Mismatch");
 				RequestDispatcher rd=req.getRequestDispatcher("forgot.jsp");
 				rd.forward(req, resp);
	 		}
	 	}
	 	else {
	 		//out.println(" Can't reset your password");
	 		req.setAttribute("error", "Student Not Available");
			RequestDispatcher rd=req.getRequestDispatcher("Forgot.jsp");
			rd.forward(req, resp);
	 	}
 	}
}