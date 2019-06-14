package pl.coderslab.a_Dzien_3.d_Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "Sess02", urlPatterns = "/sess02")
public class Sess02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        List<Integer> marks = new ArrayList<>();
        Optional<Integer> optionalMark = intParameterParser(request.getParameter("mark"));
        if (optionalMark.isPresent()) {
            if (httpSession.getAttribute("marks") == null) {
                marks.add(optionalMark.get());
                httpSession.setAttribute("marks", marks);
            } else {
                marks = (List<Integer>) httpSession.getAttribute("marks");
                marks.add(optionalMark.get());
                httpSession.setAttribute("marks", marks);
            }
        } else {
            response.setStatus(400);
        }
        response.sendRedirect("sess02");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println("<form action='sess02' method='post'>");
        writer.println("<input type='number' name='mark'>");
        writer.println("<input type='submit'>");
        printMarks(httpSession, writer);
    }

    private void printMarks(HttpSession httpSession, PrintWriter writer) {
        writer.println("<br>");
        if (httpSession.getAttribute("marks") == null) {
            writer.println("No marks yet");
        } else {
            List<Integer> marks = (List<Integer>) httpSession.getAttribute("marks");
            writer.println("List of marks: ");
            marks.forEach(writer::println);
            printAvg(marks, writer);
        }

    }

    private void printAvg(List<Integer> marsk, PrintWriter writer) {
        int sum = marsk.stream().mapToInt(Integer::intValue).sum();
        writer.println("<br>");
        writer.println("Avg: " + (double) sum / marsk.size());
    }
}
