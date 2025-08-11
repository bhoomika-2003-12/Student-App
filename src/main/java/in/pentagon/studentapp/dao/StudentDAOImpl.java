package in.pentagon.studentapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import in.pentagon.studentapp.connection.connector;
import in.pentagon.studentapp.dto.Student;
//ALL JDBC LOGIC WRITTEN HERE
public class StudentDAOImpl implements StudentDAO {
	private Connection con;
	public StudentDAOImpl() {
		this.con=connector.requestConnection();
	}

	@Override
	public boolean insertstudent(Student s) {
		// TODO Auto-generated method stub
		PreparedStatement ps=null;
		String query="INSERT INTO STUDENT VALUES(0,?,?,?,?,?,?,SYSDATE())";
		int i=0;
		try {
			ps=con.prepareStatement(query);
			ps.setString(1,s.getName());
			ps.setLong(2,s.getPhone());
			ps.setString(3,s.getMail());
			ps.setString(4,s.getBranch());
			ps.setString(5,s.getLoc());
			ps.setString(6,s.getPassword());
			i=ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}else
		{
			return false;
	}
	}

	@Override
	public boolean updatestudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletestudent(Student id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getstudent(String mail, String password) {
		PreparedStatement ps=null;
		 Student s=null;
		 String query="SELECT * FROM STUDENT WHERE MAIL=? AND PASSWORD=?";
		 try {
		 ps=con.prepareStatement(query);
		 ps.setString(1, mail);
		 ps.setString(2, password);
		 ResultSet rs=ps.executeQuery();
		 while(rs.next()) {
		 s=new Student();
		 //int id=rs.getInt("id");
		 //s.setId(id);
		 s.setId(rs.getInt("id"));
		 s.setName(rs.getString("name"));
		 s.setPhone(rs.getLong("phone"));
		 s.setMail(rs.getString("mail"));
		 s.setBranch(rs.getString("branch"));
		 s.setLoc(rs.getString("loc"));
		 s.setPassword(rs.getString("password"));
		 s.setDate(rs.getString("date"));
		 }
		 }catch (SQLException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 }
			 
		return s;
	}

	@Override
	public Student getstudent(long phone, String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> getstudent(String name) {
		// TODO Auto-generated method stub
		ArrayList<Student> s1 =new ArrayList<>();
		Student s = null;
		PreparedStatement ps=null;
		String query = "SELECT * FROM STUDENT WHERE NAME=?";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				s=new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setPhone(rs.getLong("phone"));
				s.setMail(rs.getString("mail"));
				s.setBranch(rs.getString("branch"));
				s.setLoc(rs.getString("loc"));
				s.setPassword(rs.getString("password"));
				s.setDate(rs.getString("date"));
				
				s1.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return s1;
		
	}

	@Override
	public ArrayList<Student> getstudent() {
		ArrayList<Student> studentList=new ArrayList<>();//arraylist obj
		Student s=null; //s
		String query="SELECT * FROM STUDENT";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				s=new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setPhone(rs.getLong("phone"));
				s.setMail(rs.getString("mail"));
				s.setBranch(rs.getString("branch"));
				s.setLoc(rs.getString("loc"));
				s.setPassword(rs.getString("password"));
				s.setDate(rs.getString("date"));
				studentList.add(s);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return studentList;
	}

	@Override
	public boolean loginstudent(String mail, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudent(String mail, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

}
