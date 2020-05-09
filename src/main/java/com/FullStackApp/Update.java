package com.FullStackApp;

import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Update 
{
	@Autowired
	Login value;
	public Login getValue() {
		return value;
	}

	public void setValue(Login value) {
		this.value = value;
	}
	@RequestMapping(value="/change")
	public String change()
	{
		return "change";
	}
	@RequestMapping(value="/Update")
	public String update(HttpServletRequest request,HttpServletResponse response ) throws Exception
	{
		try {
	   PrintWriter out=response.getWriter();
	   System.out.println(value.a);
	   String Password=request.getParameter("text1");
	   String ConfirmPassword=request.getParameter("text2");
	   String url="jdbc:mysql://localhost:3306/Database";
	   String Username="root";
	   String Passworddb="password";
	   String query="Update Usertable SET UserPassword=?,ConfirmPassword= ? WHERE ID = ?";
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection con=DriverManager.getConnection(url, Username, Passworddb);
	   PreparedStatement st=con.prepareStatement(query);
	   st.setString(1, Password);
	   st.setString(2,ConfirmPassword);
	   st.setInt(3,value.a);
	   int count=st.executeUpdate();
	   if(count>0)
	   {
		   System.out.println(count+"row affected");
		   System.out.println("Password updated Successfully");
    	   out.println("<script type=\"text/javascript\">");
    	   out.println("alert('Password changed Successfully');");
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
