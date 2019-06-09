package servlets;

import commons.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet241", urlPatterns = "/servlet241")
public class Servlet241 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Products products = new Products();
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("Number of products:" + products.getProductsNumber());
        String[] productsArray = products.getProducts();
        for (int i = 0; i < productsArray.length; i++) {
            response.getWriter().println("<p><a href=\"servlet242?product_id=" + i + "\">" + productsArray[i] + "</a></p>");
        }

    }
}
