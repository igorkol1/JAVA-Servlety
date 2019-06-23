package servlets;

import commons.CartItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet352",urlPatterns = "/servlet352")
public class Servlet352 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isEmpty;
        double sum = 0;
        List<CartItem> cartsItems = new ArrayList<>();
        HttpSession httpSession = request.getSession();
        Object sessionAttribute = httpSession.getAttribute("cartItems");
        if(sessionAttribute!=null&&sessionAttribute instanceof List){
            cartsItems = (List<CartItem>) sessionAttribute;
            isEmpty = false;
            for (CartItem cartItem : cartsItems) {
                sum += cartItem.getSum();
            }
        }else {
            isEmpty = true;
        }
        request.setAttribute("isEmpty",isEmpty);
        request.setAttribute("sum",sum);
        request.setAttribute("cartItems",cartsItems);
        getServletContext().getRequestDispatcher("/jspFiles/servlet352_basket.jsp").forward(request,response);
    }
}
