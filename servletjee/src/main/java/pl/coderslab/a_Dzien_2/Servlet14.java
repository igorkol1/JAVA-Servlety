package pl.coderslab.a_Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "Servlet14",urlPatterns = "/servlet14")
public class Servlet14 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Request from ip: "+request.getRemoteAddr()+"\n");
        response.getWriter().append("Request from browser: "+request.getHeader("User-Agent")+"\n");
        response.getWriter().append("Current date: "+LocalDateTime.now().toString());
    }
}
