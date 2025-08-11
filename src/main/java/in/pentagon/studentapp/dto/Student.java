package in.pentagon.studentapp.dto;
//pojo class
public class Student {
	//columns or attributies/instance variables
	private int id;
	private String name;
	private String mail;
	private long phone;
	private String branch;
	private String loc;
	private String date;
	private String password;
	
	//getters and setters
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", mail=" + mail + ", phone=" + phone + ", branch=" + branch
				+ ", loc=" + loc + ", date=" + date + ", password=" + password + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	}
