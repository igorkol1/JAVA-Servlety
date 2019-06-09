package servlets;

import commons.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet242", urlPatterns = "/servlet242")
public class Servlet242 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.getWriter().println("Details for product with id: " + request.getParameter("product_id") + "\n");
            int productId = Integer.parseInt(request.getParameter("product_id"));
            Products products = new Products();
            String[] productsArray = products.getProducts();
            if (productId>=0 && productId < productsArray.length) {
                response.getWriter().println(productsArray[productId]);
            } else {
                response.getWriter().println("There is no product with this id");
            }

        } catch (NumberFormatException e) {
            response.sendError(400);
        }
    }
}
