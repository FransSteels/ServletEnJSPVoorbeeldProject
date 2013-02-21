import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Any fool can write code that a computer can understand. Good programmers write code that humans can understand.
 */
public class EersteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 PrintWriter out = response.getWriter();
		 
		 String param1 = request.getParameter("param1");
		 out.println("<html> " + "<body>" + "<h1>Een Eerste Servlet</h1>" + "<br>" + param1 + "<h2><h2>" + "</body>" + "</html>");
		
	}
	public static void main(String[] args) {
		System.out.println("lennert is de beste");
	}

}
