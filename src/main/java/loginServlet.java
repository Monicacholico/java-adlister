import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="LoginServlet", urlPatterns = "/login")
public class loginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/login.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String passowrd = request.getParameter("password");

        String message = "";

        if(username.equals("admin") && passowrd.equals("password")){
            response.sendRedirect("/profile");
        } else{
            message= "Username or password is incorrect. Please try again";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }


    }

}
