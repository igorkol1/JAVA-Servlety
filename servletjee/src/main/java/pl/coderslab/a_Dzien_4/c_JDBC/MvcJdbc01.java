package pl.coderslab.a_Dzien_4.c_JDBC;

import pl.coderslab.a_Dzien_4.b_MVC.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "MvcJdbc01", urlPatterns = "/add-book")
public class MvcJdbc01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        Optional<Integer> isbnOptional = intParameterParser(request.getParameter("isbn"));
        if (title != null && author != null && isbnOptional.isPresent()) {
            Book book = new Book(title, author, isbnOptional.get());
            BookDao bookDao = new BookDao();
            book = bookDao.create(book);
            if(book!=null){
                request.setAttribute("book", book);
                getServletContext()
                    .getRequestDispatcher("/jspFiles/jsp13.jsp")
                    .forward(request, response);
            }else {
                response.setStatus(500);
            }
        } else {
            response.setStatus(400);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jspFiles/add-book-form.jsp")
                .forward(request, response);
    }
}
