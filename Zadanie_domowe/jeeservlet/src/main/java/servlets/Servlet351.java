package servlets;

import commons.CartItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static commons.Parsers.doubleParameterParser;
import static commons.Parsers.intParameterParser;

@WebServlet(name = "Servlet351", urlPatterns = "/servlet351")
public class Servlet351 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product_name = request.getParameter("product_name");
        Optional<Double> priceOptional = doubleParameterParser(request.getParameter("price"));
        Optional<Integer> quantityOptional = intParameterParser(request.getParameter("quantity"));
        if (product_name != null && priceOptional.isPresent() && quantityOptional.isPresent()) {
            List<CartItem> cartItems = new ArrayList<>();
            CartItem cartItem = new CartItem(product_name, priceOptional.get(), quantityOptional.get());
            HttpSession httpSession = request.getSession();
            if (httpSession.getAttribute("cartItems") == null) {
                cartItems.add(cartItem);
                httpSession.setAttribute("cartItems", cartItems);
            } else {
                cartItems = (List<CartItem>) httpSession.getAttribute("cartItems");
                cartItems.add(cartItem);
                httpSession.setAttribute("marks", cartItems);
            }
            request.setAttribute("product_name",cartItem.getProductName());
            getServletContext().getRequestDispatcher("/jspFiles/servlet351_summury.jsp").forward(request,response);
//            printCartItems(writer, cartItems);
//            printSum(writer, cartItems);
        } else {
            response.setStatus(400);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jspFiles/servlet351_add.jsp").forward(request,response);
    }
}
