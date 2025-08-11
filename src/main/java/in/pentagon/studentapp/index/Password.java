package in.pentagon.studentapp.index;

import java.sql.SQLException;
import java.util.Scanner;

import in.pentagon.studentapp.dao.StudentDAOImpl;
import in.pentagon.studentapp.dto.Student;

public class Password {
	public static void reset(Student s) throws SQLException {
		Scanner sc=new Scanner(System.in);
		StudentDAOImpl sdao = new StudentDAOImpl();
		System.out.println("enter the phone number");
		long phone = sc.nextLong();
		System.out.println("enter the mail id");
		String mail = sc.next();
		if(s.getPhone()==phone && s.getMail().equals(mail))//validation
		{
			System.out.println("set the new Password");
			String pass = sc.next();
			
			System.out.println("confirm the  Password");
			String confirm = sc.next();
			
			if(pass.equals(confirm))
			{
				s.setPassword(pass);
				boolean res = sdao.updatestudent(s);
				if(res) {
					System.out.println("Updated successfully");
				}
				else
				{
					System.out.println("failed to update password");
				}
			}
			else {
				System.out.println("password mismatched");
			}
		}
		else {
			System.out.println("Invalid user!!");
		}
	}

}
