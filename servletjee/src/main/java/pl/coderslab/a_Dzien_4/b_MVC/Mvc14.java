package pl.coderslab.a_Dzien_4.b_MVC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "Mvc14", urlPatterns = "/mvc14")
public class Mvc14 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title1 = request.getParameter("title1");
        String author1 = request.getParameter("author1");
        Optional<Integer> isbn1Optional = intParameterParser(request.getParameter("isbn1"));
        String title2 = request.getParameter("title2");
        String author2 = request.getParameter("author2");
        Optional<Integer> isbn2Optional = intParameterParser(request.getParameter("isbn2"));
        List<Book> books = new ArrayList<>();
        if (title1 != null && author1 != null && isbn1Optional.isPresent() && title2 != null && author2 != null && isbn2Optional.isPresent()) {
            Book book1 = new Book(title1, author1, isbn1Optional.get());
            Book book2 = new Book(title2, author2, isbn2Optional.get());
            books.add(book1);
            books.add(book2);
            request.setAttribute("books", books);
            getServletContext()
                    .getRequestDispatcher("/jspFiles/result.jsp")
                    .forward(request, response);
        } else {
            response.setStatus(400);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jspFiles/form.jsp")
                .forward(request, response);
    }
}
