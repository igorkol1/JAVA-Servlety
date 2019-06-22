package pl.coderslab.a_Dzien_4.c_JDBC;

import pl.coderslab.a_Dzien_4.b_MVC.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MvcJdbc03", urlPatterns = "/all-books")
public class MvcJdbc03 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookDao bookDao = new BookDao();
        List<Book> books = bookDao.findAll();
        request.setAttribute("books", books);
        getServletContext()
                .getRequestDispatcher("/jspFiles/all-books.jsp")
                .forward(request, response);
    }

}
