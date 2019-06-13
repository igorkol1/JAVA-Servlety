package pl.coderslab.a_Dzien_3.b_Post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;

import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "Post4", urlPatterns = "/post4")
public class Post4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String[] textParameters = request.getParameterValues("numbers");
        List<Integer> numberParameters = new ArrayList<>();
        for (String parameter : textParameters) {
            Optional<Integer> optionalParameter = intParameterParser(parameter);
            optionalParameter.ifPresent(numberParameters::add);
        }
        Collections.sort(numberParameters);
        numberParameters.forEach(writer::println);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int numbersOfParametrs = 4 + random.nextInt(6);
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println("<form action='post4' method='post'>");
        IntStream.rangeClosed(1, numbersOfParametrs).forEach(parameter -> printParameter(parameter, writer));
        writer.println("<input type='submit'/></form>");
    }

    private void printParameter(int parameter, PrintWriter writer) {
        writer.println("<input name='numbers' type='number'  placeholder='" + parameter + "'/><br/>");
    }
}
