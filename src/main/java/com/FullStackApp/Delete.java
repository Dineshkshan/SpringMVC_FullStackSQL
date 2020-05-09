package com.FullStackApp;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Delete 
{
	@Autowired
	Login value;
	public Login getValue() {
		return value;
	}

	public void setValue(Login value) {
		this.value = value;
	}
	@RequestMapping(value="/delete")
	public String delete(HttpServletResponse response) throws Exception
	{
		try
		{
		PrintWriter out=response.getWriter();
		String url="jdbc:mysql://localhost:3306/Database";
		String Username="root";
		String Passworddb="password";
		String query="Delete from Usertable where id=?";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,Username,Passworddb);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1,value.a);
		int count=st.executeUpdate();
		if(count>0)
		{
			System.out.println(count+"row affected");
			System.out.println("Deleted Successfully");
     	   out.println("<script type=\"text/javascript\">");
     	   out.println("alert('Account deleted Successfully');");
     	   out.println("location='/FullStackApp/';");
     	   out.println("</script>");
		}
	}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
}
}

