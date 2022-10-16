package web.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AdminController", value = "/AdminController")
public class AdminController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/admin.do")) {
            request.getRequestDispatcher("/views/admin/adminView.jsp").forward(request, response);
        } else if(path.equals("/reda.do")){
            request.getRequestDispatcher("/views/admin/reda.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
