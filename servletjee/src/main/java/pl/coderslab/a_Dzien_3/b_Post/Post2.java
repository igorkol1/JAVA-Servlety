package pl.coderslab.a_Dzien_3.b_Post;

import pl.coderslab.commons.Censor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Post2", urlPatterns = "/post2")
public class Post2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String textToCensor = request.getParameter("textToCensor");
        Boolean isNotCensored = Boolean.valueOf(request.getParameter("isCensor"));
        if (!isNotCensored) {
            Censor censor = new Censor();
            response.getWriter().println(censor.censorString(textToCensor));
        } else {
            response.getWriter().println(textToCensor);
        }
    }

}
