package pl.coderslab.a_Dzien_3.d_Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Sess01Get", urlPatterns = "/sess01Get")
public class Sess01Get extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Object sessionAttribute = httpSession.getAttribute("counter");
        if (sessionAttribute != null) {
            response.getWriter().println(sessionAttribute.toString());
            int counter = (int) httpSession.getAttribute("counter") + 1;
            httpSession.setAttribute("counter", counter);
        } else {
            response.getWriter().println("EMPTY");
        }
    }

}
