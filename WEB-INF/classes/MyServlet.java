import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet extends GenericServlet
{
public void service(ServletRequest sr,ServletResponse sr) throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<html><body>");
out.println(<b>Welcome to servlet programming</b>);
out.println("</body></html>");
out.close();
}
}



//jaavc -classpath D:\bankapp\WEB-INF\lib\servlet-api.jar MyServlet.java