package pl.coderslab.a_Dzien_3.b_Post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import static pl.coderslab.commons.Parsers.doubleParameterParser;

@WebServlet(name = "Post3", urlPatterns = "/post3")
public class Post3 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String aParameter = request.getParameter("a");
        String bParameter = request.getParameter("b");
        String cParameter = request.getParameter("c");
        Optional<Double> aOptional = doubleParameterParser(aParameter);
        Optional<Double> cOptional = doubleParameterParser(bParameter);
        Optional<Double> bOptional = doubleParameterParser(cParameter);
        if (aOptional.isPresent() && bOptional.isPresent() && cOptional.isPresent()) {
            double a = aOptional.get();
            double b = bOptional.get();
            double c = cOptional.get();
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                writer.println("No solution in R");
            } else {
                writer.println("x1 = " + (-b - Math.sqrt(delta)) / (2 * a));
                writer.println("x2 = " + (-b + Math.sqrt(delta)) / (2 * a));
            }
        } else {
            response.setStatus(400);
        }
    }

}
