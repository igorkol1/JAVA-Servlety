package servlets;

import commons.RandomNumbers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "Servlet25", urlPatterns = "/servlet25")
public class Servlet25 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RandomNumbers randomNumbers = new RandomNumbers(100);
        int[] numbers = randomNumbers.getRandomNumbers();
        int[] sortedNumbers = randomNumbers.getRandomNumbersSorted();
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<table>");
        response.getWriter().println("<tr>");
        response.getWriter().println("<th>Random number</th>");
        response.getWriter().println("<th>Sorted random number</th>");
        response.getWriter().println("</tr>");
        for (int i = 0; i < numbers.length; i++) {
            response.getWriter().println("<tr>");
            response.getWriter().println("<td>" + numbers[i] + "</td>");
            response.getWriter().println("<td>" + sortedNumbers[i] + "</td>");
            response.getWriter().println("</tr>");
        }
        response.getWriter().println("</table>");

    }
}
