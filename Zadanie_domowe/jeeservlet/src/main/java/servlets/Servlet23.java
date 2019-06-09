package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static commons.fileUtils.readFromFile;

@WebServlet(name = "Servlet23", urlPatterns = "/servlet23")
public class Servlet23 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> languages = readFromFile("/Users/igorkolodziejczyk/Projects/WAR_JEE_W_09_Servlety/Zadanie_domowe/jeeservlet/src/main/resources/oop.txt");
        response.getWriter().println("Servlet23, List of languages:");
        response.getWriter().append(String.valueOf(languages.size()));
        for (String language : languages) {
            response.getWriter().println(language);
        }

    }

}
