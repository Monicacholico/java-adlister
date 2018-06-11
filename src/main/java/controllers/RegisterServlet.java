package controllers;

import dao.DaoFactory;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
//public class RegisterServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        // TODO: show the registration form
//        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
//        // TODO: ensure the submitted information is valid
//               String username = request.getParameter("username");
//               String email = request.getParameter("email");
//                String password = request.getParameter("password");
//                String passwordConfirmation = request.getParameter("confirm_password");
//
//                boolean validateInput = username.isEmpty() || email.isEmpty() || password.isEmpty() ||
//                        (! password.equals(passwordConfirmation));
//                if (validateInput) {
//                    try {
//                        response.sendRedirect("/register");
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    return;
//                }
//        User user = new User( username, email, password);
//        DaoFactory.getUsersDao().insert(user);
//        try {
//            response.sendRedirect("/login");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//        // TODO: create a new user based off of the submitted information
//
//        // TODO: if a user was successfully created, send them to their profile
//    }

@WebServlet(name="controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");

        boolean inputHasErrors = username.isEmpty()
                || email.isEmpty()
                || password.isEmpty()
                || (! password.equals(passwordConfirmation));

        if(inputHasErrors){
            response.sendRedirect("/register");
            return;
        }

        User user = new User(username, email, password);
        DaoFactory.getUsersDao().insert(user);
        response.sendRedirect("/login");

    }
}

