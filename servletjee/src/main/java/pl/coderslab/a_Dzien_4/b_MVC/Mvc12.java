package pl.coderslab.a_Dzien_4.b_MVC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Mvc12", urlPatterns = "/mvc12")
public class Mvc12 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String startParameter = request.getParameter("start");
        String endParameter = request.getParameter("end");
        if (startParameter != null && endParameter != null) {
            try {
                int start = Integer.parseInt(startParameter) + 10;
                int end = Integer.parseInt(endParameter) + 10;
                request.setAttribute("start", start);
                request.setAttribute("end", end);
                getServletContext()
                        .getRequestDispatcher("/jspFiles/jsp12.jsp")
                        .forward(request, response);

            } catch (NumberFormatException e) {
                response.setStatus(400);
            }
        }
    }

}
