import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EersteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 PrintWriter out = response.getWriter();
		 java.util.Date today = new java.util.Date();
		 out.println("<html> " + "<body>" + "<h1>Een Eerste Servlet</h1>" + "<br>" + today + "<h2>Bekijk de DD van dit project ! (kevin)<h2>" + "</body>" + "</html>");

	}

}
