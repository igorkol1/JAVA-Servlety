package pl.coderslab.a_Dzien_3.c_Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Optional;

@WebServlet(name = "Cookie52", urlPatterns = "/cookie52")
public class Cookie52 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Optional<Cookie> optionalCookie = Arrays.stream(cookies).filter(cookie -> cookie.getName().equals("Cookie51")).findFirst();
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        if (optionalCookie.isPresent()) {
            writer.println("<h1>Witamy na stornie cookie52</h1>");
        } else {
            String message = "Nie odwiedziles jeszcze tej strony";
            response.sendRedirect("cookie51?msg=" + URLEncoder.encode(message));
        }
    }
}
