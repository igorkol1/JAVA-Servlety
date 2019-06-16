package pl.coderslab.a_Dzien_3.d_Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Sess03_Add",urlPatterns = "/addToSession")
public class Sess03_Add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        httpSession.setAttribute(key,value);
        response.sendRedirect("showAllSession");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println("<form action=\"addToSession\" method=\"POST\">");
        writer.println("<label>Klucz:<input type=\"text\" name=\"key\"></label>");
        writer.println("<label>Wartość:<input type=\"text\" name=\"value\"></label>");
        writer.println("<input type=\"submit\">");
        writer.println("</form>");
    }

}
