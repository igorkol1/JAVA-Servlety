package pl.coderslab.a_Dzien_3.a_Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get4", urlPatterns = "/get4")
public class Get4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberParameter = request.getParameter("number");
        try {
            int number = Integer.parseInt(numberParameter);
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    response.getWriter().println(i);
                }
            }
        } catch (NumberFormatException e) {
            response.setStatus(400);
        }
    }

}
