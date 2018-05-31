import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Parameter;
import java.util.Timer;
import java.util.TimerTask;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private String message;

    public void init(){
        message = "Hello Monica, you're not awesome at coding!";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

//        String paramName = "Monica!";
//        String paramValue = request.getParameter(paramName);
//        out.write(paramName);
//        out.write(" = ");
//        out.write(paramValue);
//        out.write("Hello World");
//
//        paramName = "UNKNOWN";
//        paramValue = request.getParameter(paramName);
//
//        if(paramValue==null){
//            out.write("Parameter " + paramName + " not found");
//        }
//
//        out.close();

        out.println("<h1>" + message + "</h1>");

        String name = request.getParameter("name");

        if (name == null){
            name = "World";
        }


        response.getWriter().println("<h1 style =\"font-family: fantasy;\">Goodbye " + name + " !</h1>");
        response.getWriter().println("<p>Enter your name:</p>");
        response.getWriter().println("<form action=\"/hello\">");
        response.getWriter().println("<input name=\"name\"/>");
        response.getWriter().println("</form>");
        
    }
}


