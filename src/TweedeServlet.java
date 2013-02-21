

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TweedeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TweedeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println("<html> <body>" + "<h1>Een Tweede Servlet</h1>" + "<br>" + today + "<h2>Bekijk de DD van dit project ! (kevin)<h2>" 
		
				+ "<form name=\"input\" action=\"TweedeServlet\" method=\"POST\"><input type=\"text\" name=\"test\"/> <input type=\"submit\"/></form>" + "</body>" + "</html>"
				
				);

		
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String test = request.getParameter("test");
		
		out.println( "<html> <body>" + test + "</body> </html>");
	
	}

}
