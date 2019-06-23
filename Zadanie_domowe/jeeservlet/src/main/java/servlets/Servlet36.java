package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

import static commons.Parsers.doubleParameterParser;
import static commons.Parsers.intParameterParser;

@WebServlet(name = "Servlet36", urlPatterns = "/servlet36")
public class Servlet36 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String[] numValues = request.getParameterValues("num");
        int[] nums = new int[4];
        for (int i = 0;i<4;i++){
            Optional<Integer> optionalInteger = intParameterParser(numValues[i]);
            if(optionalInteger.isPresent()){
                nums[i] = optionalInteger.get();
            }else {
                response.setStatus(400);
                return;
            }
        }
        int sum = Arrays.stream(nums).sum();
        double avg = Arrays.stream(nums).average().orElse(Double.NaN);
        int product = Arrays.stream(nums).reduce(1, (a, b) -> a * b);
        request.setAttribute("nums",nums);
        request.setAttribute("sum",sum);
        request.setAttribute("avg",avg);
        request.setAttribute("product",product);
        getServletContext().getRequestDispatcher("/jspFiles/servlet36.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/servlet36.html").forward(request, response);
    }
}
