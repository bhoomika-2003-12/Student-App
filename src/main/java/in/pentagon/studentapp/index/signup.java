package in.pentagon.studentapp.index;

import java.sql.SQLException;
import java.util.Scanner;

import in.pentagon.studentapp.dao.StudentDAO;
import in.pentagon.studentapp.dao.StudentDAOImpl;
import in.pentagon.studentapp.dto.Student;

public class signup {

	public static void signup() throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Engine e=new Petrol();
		StudentDAO sdao=new StudentDAOImpl();//creating implements
		//creation of pojo class object
		Student s=new Student();
		System.out.println("<---Student signup--->");
		System.out.println("enter the name:");
		//String name=sc.next();
		//s.setName(name);
		s.setName(sc.next());
		System.out.println("enter the phone");
		s.setPhone(sc.nextLong());
		System.out.println("enter the mail");
		s.setMail(sc.next());
		System.out.println("enter the branch");
		s.setBranch(sc.next());
		System.out.println("enter the loc");
		s.setLoc(sc.next());
		System.out.println("enter the password");
		String password=sc.next();
		System.out.println("confirm the password");
		String confirmPassword=sc.next();
		//validating password
		if(password.equals(confirmPassword)) {
			s.setPassword(confirmPassword);
			boolean res=sdao.insertstudent(s);
			if(res) {
				System.out.println("data added sucessfully");
			}
			else {
				System.out.println("failed to create account");

			}
		}
		else {
			System.out.println("password mismatched");
			}
		}
}
