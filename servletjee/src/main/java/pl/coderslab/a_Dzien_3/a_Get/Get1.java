package pl.coderslab.a_Dzien_3.a_Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get1", urlPatterns = "/get1")
public class Get1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String startParameter = request.getParameter("start");
        String endParameter = request.getParameter("end");
        if (startParameter != null && endParameter != null) {
            try {
                int start = Integer.parseInt(startParameter);
                int end = Integer.parseInt(endParameter);
                for (int i = start; i <= end; i++) {
                    response.getWriter().println(i);
                }
            } catch (NumberFormatException e) {
                response.setStatus(400);
            }
        } else {
            response.getWriter().println("No results");
        }
    }

}
