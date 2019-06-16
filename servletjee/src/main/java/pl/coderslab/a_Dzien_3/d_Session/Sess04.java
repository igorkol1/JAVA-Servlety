package pl.coderslab.a_Dzien_3.d_Session;

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

import static pl.coderslab.commons.Parsers.doubleParameterParser;
import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "Sess04", urlPatterns = "/sess04")
public class Sess04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product_name = request.getParameter("product_name");
        Optional<Double> priceOptional = doubleParameterParser(request.getParameter("price"));
        Optional<Integer> quantityOptional = intParameterParser(request.getParameter("quantity"));
        if (product_name != null && priceOptional.isPresent() && quantityOptional.isPresent()) {
            List<CartItem> cartItems = new ArrayList<>();
            CartItem cartItem = new CartItem(product_name, priceOptional.get(), quantityOptional.get());
            HttpSession httpSession = request.getSession();
            PrintWriter writer = response.getWriter();
            if (httpSession.getAttribute("cartItems") == null) {
                cartItems.add(cartItem);
                httpSession.setAttribute("cartItems", cartItems);
            } else {
                cartItems = (List<CartItem>) httpSession.getAttribute("cartItems");
                cartItems.add(cartItem);
                httpSession.setAttribute("marks", cartItems);
            }

            printCartItems(writer, cartItems);
            printSum(writer, cartItems);
        } else {
            response.setStatus(400);
        }
    }

    private void printCartItems(PrintWriter writer, List<CartItem> cartItems) {
        for (CartItem cartItem : cartItems) {
            writer.println(cartItem.toString());
        }
    }

    private void printSum(PrintWriter writer, List<CartItem> cartItems) {
        double sum = 0;
        for (CartItem cartItem : cartItems) {
            sum += cartItem.getSum();
        }
        writer.println("SUMA: " + sum + "zł");
    }

}
