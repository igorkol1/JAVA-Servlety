package pl.coderslab.a_Dzien_3.c_Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie1Set", urlPatterns = "/setCookie")
public class Cookie1Set extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("User", "Coders_Lab");
        cookie.setMaxAge(86400);
        response.addCookie(cookie);
        response.getWriter().println("Cookie set");
    }

}
