package pl.coderslab.a_Dzien_4.c_JDBC;

import pl.coderslab.a_Dzien_4.b_MVC.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MvcJdbc04", urlPatterns = "/search-book")
public class MvcJdbc04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchTitle = request.getParameter("title");
        BookDao bookDao = new BookDao();
        List<Book> books = bookDao.findAllWithTitle(searchTitle);
        request.setAttribute("books", books);
        getServletContext()
                .getRequestDispatcher("/jspFiles/all-books.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jspFiles/search-form.jsp")
                .forward(request, response);
    }
}
