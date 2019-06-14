package pl.coderslab.a_Dzien_3.c_Cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cookie51",urlPatterns = "/cookie51")
public class Cookie51 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Witamy na stornie cookie51</h1>");
        writer.println("<a href='cookie52'>Cookie52</a>");
        Cookie cookie = new Cookie("Cookie51","true");
        response.addCookie(cookie);
    }
}
