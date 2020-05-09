package com.FullStackApp;

import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login
{
	int a;
	@RequestMapping(value="/Main",method = RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		PrintWriter out = response.getWriter();
		String UserName=request.getParameter("text1");
		String Password=request.getParameter("text2");
		String url="jdbc:mysql://localhost:3306/Database";
		String Username="root";
		String Passworddb="password";
		String query="select * from Usertable where UserName=? && UserPassword=?";
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection(url,Username,Passworddb);
        PreparedStatement st=cn.prepareStatement(query);
        st.setString(1,UserName);
        st.setString(2,Password);
        ResultSet rs=st.executeQuery();
        try {
        rs.next();
        String value=rs.getString("UserName");
        a=rs.getInt("id");
        System.out.println(value);
        System.out.println(a);
        if(value!=null)
        {
        	ModelAndView mv=new ModelAndView();
        	mv.setViewName("Main");
        	mv.addObject("user",value);
        	return mv;
        }
        }
        catch(Exception e)
        {
        	System.out.println(e);
        	   out.println("<script type=\"text/javascript\">");
        	   out.println("alert('User or password incorrect');");
        	   out.println("location='/FullStackApp/';");
        	   out.println("</script>");
        }
        st.close();
        cn.close();
		return null;
}

}
