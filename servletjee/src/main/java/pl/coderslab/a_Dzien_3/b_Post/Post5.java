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

@WebServlet(name = "Post5", urlPatterns = "/post5")
public class Post5 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String textTemperature = request.getParameter("degrees");
        String conversionType = request.getParameter("convertionType");
        Optional<Double> optionalTemperature = doubleParameterParser(textTemperature);
        if (optionalTemperature.isPresent()) {
            PrintWriter writer = response.getWriter();
            switch (conversionType) {
                case "celcToFahr":
                    writer.println(32 + (((double) 9 / (double) 5) * optionalTemperature.get()));
                    break;
                case "FahrToCelc":
                    writer.println(((double) 5 / (double) 9) * (optionalTemperature.get() - 32));
                    break;
                default:
                    response.setStatus(400);
            }
        } else {
            response.setStatus(400);
        }
    }
}
