

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter(servletNames = { "Welcome_pg" })
public class Chkauth extends HttpFilter implements Filter {
       
   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		
		
		if(name.equals("pavan")&& pass.equals("pass"))
		{
			
		  chain.doFilter(request, response);
		  
		}
		
		else
		{
			response.getWriter().println("<h1> Your Request is not vliad</h1>");
		}
	}

	
}
