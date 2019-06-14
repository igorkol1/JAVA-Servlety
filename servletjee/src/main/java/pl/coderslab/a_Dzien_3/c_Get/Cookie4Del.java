package pl.coderslab.a_Dzien_3.c_Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebServlet(name = "Cookie4Del",urlPatterns = "/removeCookie")
public class Cookie4Del extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cookieName = request.getParameter("name");
        Cookie[] cookies = request.getCookies();
        Optional<Cookie> optionalCookie = Arrays.stream(cookies).filter(cookie -> cookie.getName().equals(cookieName)).findFirst();
        if (optionalCookie.isPresent()) {
            Cookie expiredCookie = optionalCookie.get();
            expiredCookie.setMaxAge(0);
            response.addCookie(expiredCookie);
            response.getWriter().println("Cookie " + cookieName + " was deleted");
        } else {
            response.getWriter().println("No " + cookieName + " cookie was found");
        }
    }
}
