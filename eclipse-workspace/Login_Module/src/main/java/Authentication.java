

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/auth")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		  
		DbDao db = new DbDao();
		
		
		if(db.check(name, pass))
			
		{
			HttpSession session = request.getSession();
			session.setAttribute("uname", name);
		   response.sendRedirect("Welcome.jsp");
		  
		}
		
		else
		{
			 response.sendRedirect("index.jsp");
		}
	}

}
