package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Student 
{
	int roll_no;
	String name,lang,password,gender, state;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public int addStudent() throws SQLException
	{
		//Register Driver
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		//Connection(url,user,password)
		String url="jdbc:mysql://localhost:3306/student_db";
		String user="root";
		String pass="";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		//Sql Query
		String sql="insert into student values(?,?,?,?,?,?)";
		
		//PrepareStatement
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, roll_no);
		ps.setString(2, name);
		ps.setString(3, lang);
		ps.setString(4, password);
		ps.setString(5, gender);
		ps.setString(6, state);
		
		//Execute
		
		int res=ps.executeUpdate();
		
		return res;
	}
	
	public int updateStudent() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		//Connection(url,user,password)
		String url="jdbc:mysql://localhost:3306/student_db";
		String user="root";
		String pass="";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		//Sql Query
		String sql="update student set name=?, lang=?,password=?,gender=?,state=? where roll_no=?";
		
		//PrepareStatement
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1, name);
		ps.setString(2, lang);
		ps.setString(3, password);
		ps.setString(4,gender);
		ps.setString(5, state);
		ps.setInt(6, roll_no);
		
		//Execute
		
		int res=ps.executeUpdate();
		
		return res;
	}
	public int deleteStudent() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		//Connection(url,user,password)
		String url="jdbc:mysql://localhost:3306/student_db";
		String user="root";
		String pass="";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		//Sql Query
		String sql="delete from student where roll_no=?";
		
		//PrepareStatement
		PreparedStatement ps=con.prepareStatement(sql);
		
		//ps.setString(1, name);
		//ps.setString(2, branch);
		ps.setInt(1, roll_no);
		
		//Execute
		
		int res=ps.executeUpdate();
		
		return res;
	}
	
	public ResultSet showStudent() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		//Connection(url,user,password)
		String url="jdbc:mysql://localhost:3306/student_db";
		String user="root";
		String pass="";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		//Sql Query
		String sql="select *from student";
		
		//PrepareStatement
		PreparedStatement ps=con.prepareStatement(sql);
		
	
		
		//Execute
		
		ResultSet res=ps.executeQuery();
		
		return res;
	}
	
	public ResultSet showStudentByRollno() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		//Connection(url,user,password)
		String url="jdbc:mysql://localhost:3306/student_db";
		String user="root";
		String pass="";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		//Sql Query
		String sql="select *from student where roll_no=?";
		
		//PrepareStatement
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, roll_no);
	
		
		//Execute
		
		ResultSet res=ps.executeQuery();
		
		return res;
	}
	
	public ArrayList<Student> showAll() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		//Connection(url,user,password)
		String url="jdbc:mysql://localhost:3306/student_db";
		String user="root";
		String pass="";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		//Sql Query
		String sql="select *from student";
		
		//PrepareStatement
		PreparedStatement ps=con.prepareStatement(sql);
			
		
		//Execute
		
		ResultSet res=ps.executeQuery();
		
		ArrayList<Student> allStudents = new ArrayList<>();
		
		while(res.next())
		{
			Student s = new Student();
			
			//Get details from Database
			int r1 = res.getInt("roll_no");
			String n1 = res.getString("name");
			String l1 = res.getString("lang");
			String p1 = res.getString("password");
			String g1 = res.getString("gender");
			String s1 = res.getString("state");
			
			//Set details in the object of Student
			s.setRoll_no(r1);
			s.setName(n1);
			s.setLang(l1);
			s.setPassword(p1);
			s.setGender(g1);
			s.setState(s1);
			
			
			allStudents.add(s);
		}
		
		return allStudents;
	}
	
	public ResultSet checkStudent() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		//Connection(url,user,password)
		String url="jdbc:mysql://localhost:3306/student_db";
		String user="root";
		String pass="";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		//Sql Query
		String sql="select *from student where rollno=? and name=?";
		
		//PrepareStatement
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, roll_no);
		ps.setString(2, name);
		
		//Execute
		
		ResultSet res=ps.executeQuery();
		
		return res;
	}
}
