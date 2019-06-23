package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet32", urlPatterns = "/servlet32")
public class Servlet32 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String binaryNumber = request.getParameter("number");
        try {
            int number = Integer.parseInt(binaryNumber, 2);
            response.getWriter().println(number);
        } catch (NumberFormatException e) {
            response.setStatus(400);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext()
                .getRequestDispatcher("/servlet32.html")
                .forward(request, response);
    }
}
