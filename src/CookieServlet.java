import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
      java.util.Date today = new java.util.Date();
      response.getWriter().write("<html> " + "<body>" + "<h1>Cookie Servlet</h1>");
      doGet(request, response);
      response.getWriter().write("<br><small>" + today + "<br/>&copy; 2013 Tom Causs</small></body>" + "</html>");
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String parameter = request.getParameter("username");
		String userName = (String) session.getAttribute("userName");

	      if(parameter != null) {
	    	  session.setAttribute("userName", parameter);
	    	  session.setMaxInactiveInterval(3600);
	          response.getWriter().write(
	            "<br/>Thank you " + parameter + "! I will remember your name forever ;)");
	      } else if (userName != null) {
	    	  response.getWriter().write(
	  	            "<br/>Welcome " + userName + "! I know your name, because it is stored in your cookies.<br/>");
	      } else {
	    	  response.getWriter().write(
		  	            "<br/>Welcome user! I don't know your name yet, but you can enter it below, and I will remember it forever.");
	    	  response.getWriter().write(
	    			  "<br/><form method='post'><input type='text' name='username'/></form>");
	      }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
