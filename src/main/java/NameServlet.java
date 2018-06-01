import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;



@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            request.getRequestDispatcher("/greeting.jsp").forward(request, response);



        }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // get the name value from the form and save it to a variable
        // forward the user to another page, sending that name variable
        String name = request.getParameter("name");

        if(name.isEmpty()) {
            name = "Bob";
        }
        name = StringUtils.capitalize(name);





        // set the name attribute to the request
       request.setAttribute("name", name);
       // forward the user to another page, sending that name variable
        request.getRequestDispatcher("/username.jsp").forward(request, response);

    }


}

