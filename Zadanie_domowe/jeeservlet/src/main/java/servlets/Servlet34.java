package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;

import static commons.Parsers.intParameterParser;

@WebServlet(name = "Servlet34", urlPatterns = "/servlet34")
public class Servlet34 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        int visits;
        Cookie[] cookies = request.getCookies();
        Optional<Cookie> optionalCookie = Arrays.stream(cookies).filter(cookie -> cookie.getName().equals("visits")).findFirst();
        if (optionalCookie.isPresent()) {
            Optional<Integer> visitsOptional = intParameterParser(optionalCookie.get().getValue());
            if (visitsOptional.isPresent()) {
                writer.println("Witaj, odwiedziłeś nas już " + visitsOptional.get() + " razy");
                visits = visitsOptional.get() + 1;
            } else {
                response.setStatus(500);
                return;
            }
        } else {
            writer.println("Witaj pierwszy raz na naszej stronie");
            visits = 1;
        }
        Cookie cookie = new Cookie("visits", String.valueOf(visits));
        cookie.setMaxAge(86400);
        response.addCookie(cookie);
    }

}
