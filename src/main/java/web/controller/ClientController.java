package web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet(name = "ClientController", value = "/ClientController")
public class ClientController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/reservation.client")) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else if(path.equals("/showFlights.client")){
            request.getRequestDispatcher("/views/trip/flightSearch.jsp").forward(request, response);
        }else if (path.equals("/login.client")){
            request.getRequestDispatcher("/views/client/login.jsp").forward(request, response);
        } else if (path.equals("/signup.client")) {
            request.getRequestDispatcher("/views/client/signup.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
