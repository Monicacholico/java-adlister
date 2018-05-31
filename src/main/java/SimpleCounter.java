import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;




@WebServlet(name = "SimpleCounter", urlPatterns = "/count")
public class SimpleCounter extends HttpServlet {

    protected int counter = 0;


    public void doGet(HttpServletRequest request, HttpServletResponse
            response)throws ServletException, IOException {

        counter++;

        response.getWriter().println("<h1>The count is " + counter + ".</h1>");

    }
}
