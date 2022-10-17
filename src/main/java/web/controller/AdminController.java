package web.controller;

import dao.adminDao.AdminDaoImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import metier.entities.admin;
import web.model.AdminModel;

import java.io.IOException;
import java.util.Objects;

//
public class AdminController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/admin.do")) {

            request.getRequestDispatcher("/views/admin/adminView.jsp").forward(request, response);
        } else if(path.equals("/reda.do")){
            AdminModel a = new AdminModel();
            admin admin = new admin();
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            AdminDaoImpl d = new AdminDaoImpl();
            admin = d.loginAdmin(email,password);

            if(Objects.isNull(admin)){
                String alert = "Your Password or Email is Incorrect";
                request.setAttribute("alert",alert);
                request.getRequestDispatcher("/views/admin/adminView.jsp").forward(request,response);
            }else{
                a.setIdAdmin(admin.getIdAdmin());
                a.setEmailAdmin(admin.getEmailAdmin());
                a.setMotCle(admin.getEmailAdmin());
                request.setAttribute("result",admin);
                request.getRequestDispatcher("/views/admin/reda.jsp").forward(request,response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
