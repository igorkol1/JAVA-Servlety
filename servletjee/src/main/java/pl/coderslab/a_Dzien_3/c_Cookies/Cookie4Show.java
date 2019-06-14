package pl.coderslab.a_Dzien_3.c_Cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "Cookie4Show", urlPatterns = "/showAllCookies")
public class Cookie4Show extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<ul>");
        Arrays.stream(cookies).forEach(cookie -> printCookie(cookie, writer));
        writer.println("</ul>");
    }

    private void printCookie(Cookie cookie, PrintWriter writer) {
        writer.println("<li>" + cookie.getName() + " " + cookie.getValue() + " " + generateLinkToDelete(cookie) + "</li>");
    }

    private String generateLinkToDelete(Cookie cookie) {
        return "<a href='removeCookie?name=" + cookie.getName() + "'>Delete cookie</a>";
    }
}
