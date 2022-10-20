package web.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "HomePageController", value = "/HomePageController")
public class HomePageController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if(path.equals("/")){
                Cookie[] cookies = request.getCookies();
                String log = "0";
                if(cookies!=null){
                    for (Cookie cookie : cookies) {
                        if (cookie.getName().equals("id")) {
                            log = cookie.getValue();
                        }
                    }
                }
                request.setAttribute("log",log);
            request.getRequestDispatcher("/views/home/index.jsp").forward(request, response);
    }
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
