package servletPractice;

//import jakarta.servlet.*;
//import jakarta.servlet.http.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class server1 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse respo) throws ServletException,IOException{
		respo.setContentType("text/html");
		PrintWriter out = respo.getWriter();
		out.println("<h2>Welcome to my page</h2>");
	}
}
