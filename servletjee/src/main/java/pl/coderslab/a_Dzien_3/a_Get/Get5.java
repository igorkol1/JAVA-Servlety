package pl.coderslab.a_Dzien_3.a_Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get5", urlPatterns = "/get5")
public class Get5 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] companies = request.getParameterValues("company");
        String[] leanings = request.getParameterValues("learn");
        response.getWriter().println("company:");
        for (String company : companies) {
            response.getWriter().println("  -" + company);
        }
        response.getWriter().println("learn:");
        for (String learn : leanings) {
            response.getWriter().println("  -" + learn);
        }
    }
}
