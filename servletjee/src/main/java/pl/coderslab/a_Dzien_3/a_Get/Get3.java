package pl.coderslab.a_Dzien_3.a_Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get3", urlPatterns = "/get3")
public class Get3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String widthParameter = request.getParameter("width");
        String heightParameter = request.getParameter("height");
        int width = 5;
        int height = 10;
        if (widthParameter != null) {
            try {
                width = Integer.parseInt(widthParameter);
            } catch (NumberFormatException e) {
                response.setStatus(400);
            }
        }
        if (heightParameter != null) {
            try {
                height = Integer.parseInt(heightParameter);
            } catch (NumberFormatException e) {
                response.setStatus(400);
            }
        }
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                response.getWriter().append((i * j) + " | ");

            }
            response.getWriter().println("\n-\n");
        }
    }

}
