package pl.coderslab.a_Dzien_3.d_Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;
import java.util.Random;

import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "Sess05", urlPatterns = "/sess05")
public class Sess05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        PrintWriter writer = response.getWriter();
        Optional<Integer> controlSumOptional = intParameterParser(request.getParameter("controlSum"));
        if (controlSumOptional.isPresent()) {
            if (controlSumOptional.get() == (int) httpSession.getAttribute("controlSum")) {
                writer.println("Welcome human");
            } else {
                writer.println("You're robot");
            }
        } else {
            writer.println("Proof you are human");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println("<form action='sess05' method='post'>");
        writer.println("<input type='text' name='name' placeholder='name'>");
        writer.println("<input type='text' name='surname' placeholder='surname'>");
        writer.println("<input type='text' name='email' placeholder='email'>");
        generateCaptcha(writer, httpSession);
        writer.println("<input type='submit'></form>");
    }

    private void generateCaptcha(PrintWriter writer, HttpSession httpSession) {
        Random random = new Random();
        int numberA = random.nextInt(100);
        int numberB = random.nextInt(100);
        int sum = numberA + numberB;
        httpSession.setAttribute("controlSum", sum);
        writer.println("<input type='number' name='controlSum' placeholder='" + numberA + " + " + numberB + "'>");
    }
}
