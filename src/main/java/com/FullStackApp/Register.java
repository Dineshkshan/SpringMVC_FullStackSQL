package com.FullStackApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register 
{
	@RequestMapping(value="/Login")
	public String add(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		String UserName=request.getParameter("text1");
		String PhoneNumber=request.getParameter("text2");
		String UserPassword=request.getParameter("text3");
		String ConfirmPassword=request.getParameter("text4");
		String url="jdbc:mysql://localhost:3306/Database";
		String Username="root";
		String Passworddb="password";
		String query="INSERT INTO Usertable (UserName, Phonenumber, UserPassword,ConfirmPassword) VALUES (?,?,?,?);";
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection(url,Username,Passworddb);
        PreparedStatement st=cn.prepareStatement(query);
        st.setString(1,UserName);
        st.setString(2,PhoneNumber);
        st.setString(3,UserPassword);
        st.setString(4,ConfirmPassword);
        int count=st.executeUpdate();
        System.out.println(count+"row affected");
        st.close();
        cn.close();
        return "Login"; 
}

}
