package pl.coderslab.a_Dzien_3.d_Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "Sess03_All",urlPatterns = "/showAllSession")
public class Sess03_All extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Map<String,String> sessionData = getSessionData(httpSession);
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        printSessionData(sessionData,writer);
    }

    private Map<String,String> getSessionData(HttpSession httpSession){
        Map<String,String> sessionData = new HashMap<>();
        Enumeration<String> keyEnumeration = httpSession.getAttributeNames();
        while (keyEnumeration.hasMoreElements()){
            String key = keyEnumeration.nextElement();
            sessionData.put(key,httpSession.getAttribute(key).toString());
        }
        return sessionData;
    }

    private void printSessionData(Map<String,String> sessionData, PrintWriter writer){
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<th>Key</th>");
        writer.println("<th>Value</th>");
        writer.println("</tr>");
        Set<String> keySet = sessionData.keySet();
        for (String key:keySet) {
            writer.println("<tr>");
            writer.println("<th>"+key+"</th>");
            writer.println("<th>"+sessionData.get(key)+"</th>");
            writer.println("</tr>");
        }
        writer.println("</table>");
    }

}
