package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static commons.Parsers.intParameterParser;

@WebServlet(name = "Servlet33",urlPatterns = "/servlet33")
public class Servlet33 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        int[] numbers = new int[5];
        for (int i=0;i<5;i++){
            Optional<Integer> optionalInteger = intParameterParser(request.getParameter("number"+i));
            if(optionalInteger.isPresent()){
                numbers[i] = optionalInteger.get();
            }else {
                response.setStatus(400);
                return;
            }
        }
        httpSession.setAttribute("numbers",numbers);
        response.sendRedirect("servlet33");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int[] numbers;
        boolean isFilled;
        HttpSession httpSession = request.getSession();
        Object sessionAttribute = httpSession.getAttribute("numbers");
        if(sessionAttribute!=null && sessionAttribute instanceof int[]){
            numbers = (int[]) sessionAttribute;
            isFilled = true;
        }else {
            numbers = new int[5];
            httpSession.setAttribute("numbers",numbers);
            isFilled = false;
        }
        request.setAttribute("numbers",numbers);
        request.setAttribute("isFilled",isFilled);
        getServletContext()
                .getRequestDispatcher("/jspFiles/servlet33.jsp")
                .forward(request,response);
    }
}
