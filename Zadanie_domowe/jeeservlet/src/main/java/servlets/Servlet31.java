package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

import static commons.CurrencyConverter.convert;
import static commons.Parsers.doubleParameterParser;

@WebServlet(name = "Servlet31", urlPatterns = "/servlet31")
public class Servlet31 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Optional<Double> optionalDouble = doubleParameterParser(request.getParameter("amount"));
        String conversionType = request.getParameter("conversionType");
        if (optionalDouble.isPresent() && conversionType != null) {
            double convertedValue = convert(optionalDouble.get(), conversionType);
            if (convertedValue != -1) {
                response.getWriter().println(convertedValue);
            } else {
                response.setStatus(400);
            }
        } else {
            response.setStatus(400);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext()
                .getRequestDispatcher("/servlet31.html")
                .forward(request, response);
    }
}
