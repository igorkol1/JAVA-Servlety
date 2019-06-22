package pl.coderslab.a_Dzien_4.c_JDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "MvcJdbc02", urlPatterns = "/delete-book")
public class MvcJdbc02 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Optional<Integer> idOptional = intParameterParser(request.getParameter("id"));
        if (idOptional.isPresent()) {
            BookDao bookDao = new BookDao();
            bookDao.delete(idOptional.get());
            getServletContext()
                    .getRequestDispatcher("/all-books")
                    .forward(request, response);
        } else {
            response.setStatus(400);
        }
    }

}
