

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletVanShadi
 */
@WebServlet("/ServletVanShadi")
public class ServletVanShadi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVanShadi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println("<html> <body>" + "<h1>Made by shadi</h1>" + "<br>" + today + "<h2></h2>" 
		
				+ "<form name=\"input\" action=\"TweedeServlet\" method=\"POST\"><input type=\"text\" name=\"test\"/><select name=\"mydropdown\" ><option value=1>java</option><option value=2>Asp</option><option value=3>.net</option></select> <input type=\"submit\"/></form>" + "</body>" + "</html>"
				
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
			
			PrintWriter out = response.getWriter();
			
			String test = request.getParameter("test");
			String mydropdown = request.getParameter("mydropdown");
			
			out.println( "<html> <body>" + test +"<br>"+ mydropdown +"</body> </html>");
		
		
		
		
	}

}
