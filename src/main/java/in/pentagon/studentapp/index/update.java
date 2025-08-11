package in.pentagon.studentapp.index;

import java.sql.SQLException;
import java.util.Scanner;

import in.pentagon.studentapp.dao.StudentDAO;
import in.pentagon.studentapp.dao.StudentDAOImpl;
import in.pentagon.studentapp.dto.Student;

public class update {
	public static void update(Student s) throws SQLException {
		Scanner sc = new Scanner(System.in);
		StudentDAO sdao = new StudentDAOImpl();
		int choice = 0;
		//student s = new student();
		do {
			System.out.println("Enter the fields to be updated");
			System.out.println("1.Update Name");
			System.out.println("2.Update Phone");
			System.out.println("3.Update Branch");
			System.out.println("4.Update Location");
			System.out.println("5. Go to dashboard");
			choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("enter the new name");
			s.setName(sc.next());
			break;
			case 2:System.out.println("enter the new phone number");
			s.setPhone(sc.nextLong());
			break;
			case 3:System.out.println("enter the new branch");
			s.setBranch(sc.next());
			break;
			case 4:System.out.println("enter the new location");
			s.setLoc(sc.next());
			break;
			case 5:System.out.println("dashboard loading.......");
			break;
			default:System.out.println("Invalid choice enter the valid choice");
			}
		}while(choice!=5);
		boolean res = sdao.updatestudent(s);
		if(res) {
			System.out.println("Updated successfully");
		}
		else {
			System.out.println("Updated failed");
		}
		}
		
	}


