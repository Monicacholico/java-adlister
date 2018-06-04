import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        counter += 1;
//        if(request.getParameter("reset").equals("true")){
        if("true".equals(request.getParameter("reset"))){
            counter = 0;
            request.getSession().removeAttribute("counter");
            request.getSession().invalidate();
        }

        HttpSession session = request.getSession();
        session.setAttribute("counter", counter);

        if (counter != 0){
            counter = ((int) session.getAttribute("counter"));
        }
            counter ++;

        //sets the counter on the session (counter value lastas past one page load)


            //sets that a variable to the view
       request.setAttribute("counter", counter);

        request.getRequestDispatcher("/counter.jsp").forward(request, response);

//        response.getWriter().println("<h1>The count is " + counter + ".</h1>");
    }
}
