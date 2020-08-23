package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin 
{
	private String adminid,name,password;

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public ResultSet checkAdmin() throws SQLException
	{ 
		//Register Driver
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				
				//Connection(url,user,password)
				String url="jdbc:mysql://localhost:3306/student_db";
				String user="root";
				String pass="";
				
				Connection con=DriverManager.getConnection(url,user,pass);
				
				//Sql Query
				String sql="select *from admin where adminid = ? and password = ?";
				
				//PrepareStatement
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, adminid);
				ps.setString(2, password);
				
				
				//Execute
				
				ResultSet res=ps.executeQuery();
				
				return res;
	}

}
