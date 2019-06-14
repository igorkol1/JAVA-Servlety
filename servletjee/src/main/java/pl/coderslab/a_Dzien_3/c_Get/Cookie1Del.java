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

@WebServlet(name = "Cookie1Del", urlPatterns = "/deleteCookie")
public class Cookie1Del extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Optional<Cookie> optionalCookie = Arrays.stream(cookies).filter(cookie -> cookie.getName().equals("User")).findFirst();
        if (optionalCookie.isPresent()) {
            Cookie expiredCookie = optionalCookie.get();
            expiredCookie.setMaxAge(0);
            response.addCookie(expiredCookie);
            response.getWriter().println("Cookie User was deleted");
        } else {
            response.getWriter().println("No User cookie was found");
        }
    }

}
