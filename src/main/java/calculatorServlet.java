import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

@WebServlet(name = "calculatorServlet", urlPatterns = "/pickcolor")
public class calculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/addition.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        // set the name attribute to the request
        request.setAttribute("num1", num1);
        int num2 = Integer.parseInt(request.getParameter("num2"));
        // forward the user to another page, sending that name variable
        request.getRequestDispatcher("/additionresult.jsp").forward(request, response);

    }


}