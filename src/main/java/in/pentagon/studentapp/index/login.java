package in.pentagon.studentapp.index;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import in.pentagon.studentapp.dao.StudentDAOImpl;
import in.pentagon.studentapp.dto.Student;

public class login {

	public static void  login() throws SQLException{
		Scanner sc=new Scanner(System.in);
		 StudentDAOImpl sdao=new StudentDAOImpl();
		 System.out.println("<--Login Page-->");
		 System.out.println("Enter the mail ID:");
		 String mail=sc.next();
		 System.out.println("Enter the password:");
		 String pass=sc.next();
		 Student a=sdao.getstudent(mail,pass);
		 if(a!=null) {
		 System.out.println("Login successful!Welcome "+a.getName());
		 int choice;
		do {
			 System.out.println("1. View data");
			 System.out.println("2. Search users");
			 System.out.println("3. Update account");
			 System.out.println("4. Reset password");
			 System.out.println("5. Back to main menu");
			 if(a.getId()==2) {//admin
				 System.out.println("6. view all users");
				 System.out.println("7. delete the user");
			 }
			 choice=sc.nextInt();
			 switch(choice) {
			 case 1:System.out.println(a);
			 break;
			 case 2:System.out.println("enter the student name:");
			        String name=sc.next();
			        ArrayList<Student> sL1=sdao.getstudent(name);
			        for(Student s3 : sL1) {
			        	System.out.println("Student id: "+s3.getId());
			        	System.out.println("Student name: "+s3.getName());
			        	System.out.println("Student branch: "+s3.getBranch());
			        	System.out.println("Student location: "+s3.getLoc());
			        	System.out.println("----------------------------------------------");
			        }
				 break;
			 case 3:update.update(a);
				 break;
			 case 4:Password.reset(a);
				 break;
			 case 5:System.out.println("going to back to main menu....");
				 break;
			 case 6://view all user logic
				 break;
			 case 7://delete user logic
				 break;
				 default:System.out.println("Invalid choice! try again");
				 }
			 
		 }while(choice!=5);
		 
		 }
		 else {
		 System.out.println("Failed to login!");
		 }
	}

}
