package pl.coderslab.a_Dzien_3.c_Cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "Cookie3", urlPatterns = "/cookie3")
public class Cookie3 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        Optional<Integer> optionalTime = intParameterParser(request.getParameter("time"));
        if (key.length() > 0 && value.length() > 0 && optionalTime.isPresent()) {
            Cookie cookie = new Cookie(key, value);
            cookie.setMaxAge(optionalTime.get()*3600);
            response.addCookie(cookie);
            response.getWriter().println("Set cookie " + key + " with value " + value+" for "+optionalTime.get()+" hours");
        } else {
            response.setStatus(400);
        }
    }
}
