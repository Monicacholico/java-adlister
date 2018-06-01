//import javax.servlet.Servlet;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name="ExampleServlet", urlPatterns = "/example")
//public class ExampleServlet extends HTTPServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        request.setAttribute("theAnswer", 42);
//
//        request.getRequestDispatcher("/some-example-jsp-file.jsp").forward(request, response);
//    }
//
//}


// RESTFULL patern


//ShowMovieServlet
// GET /movies -> get all movies -> doGet

// GET /movies -> show the movies w/ the id of 1
// POST /movies -> save a new movie
// GET / movies/create -> loaded the page w/ the form to add a new movie...
// POST /movies/1/edit -> update the movie info for movie #1 w/ the info from the edit form.

// GET / movies/ 1/ edit -> load the info for movie #1 into a form.


//Movies Edit form loaded by the doGet on EditMovieServlet
// <form method = "POST" action = "/movies/${movie.id}/edit">
// <input type ="text" name = "title" value ="${movie.title}">
// <input type ="text name = "review" value = "${movie.rating}">
// <button type = "submit">Save new movie</button>



