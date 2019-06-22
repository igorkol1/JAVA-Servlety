package pl.coderslab.a_Dzien_4.d_Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter(filterName = "UserAgentInfoFilter")
public class UserAgentInfoFilter implements Filter {

    UserRequestInfoDao userRequestInfoDao;

    public void destroy() {
        userRequestInfoDao = null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        String userAgent = request.getHeader("User-Agent");
        LocalDateTime currentTime = LocalDateTime.now();
        long startTime = System.currentTimeMillis();
        chain.doFilter(req, resp);
        long stopTime = System.currentTimeMillis();
        int requestTime =(int)(stopTime - startTime);
        UserRequestInfo userRequestInfo = new UserRequestInfo(currentTime,userAgent,requestTime);
        userRequestInfoDao.create(userRequestInfo);
    }

    public void init(FilterConfig config) throws ServletException {
        userRequestInfoDao = new UserRequestInfoDao();
    }

}
