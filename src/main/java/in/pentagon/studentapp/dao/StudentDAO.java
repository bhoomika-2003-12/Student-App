package in.pentagon.studentapp.dao;

import java.util.ArrayList;

import in.pentagon.studentapp.dto.Student;

public interface StudentDAO {
	//JDBC declarations
	public boolean insertstudent(Student s);
	public boolean updatestudent(Student s);
	public boolean deletestudent(Student id);
	public Student getstudent(String mail,String password);
	public Student getstudent(long phone,String mail);
	public ArrayList<Student> getstudent(String name);
	public ArrayList<Student> getstudent();
	public boolean loginstudent(String mail, String password);
	public Student getStudent(String mail, String pass);
	}
