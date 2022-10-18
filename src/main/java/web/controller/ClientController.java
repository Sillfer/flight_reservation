package web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

//@WebServlet(name = "ClientController", value = "/ClientController")
public class ClientController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/reservation.client")) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if (path.equals("/login.client")) {
            request.getRequestDispatcher("/views/client/login.jsp").forward(request, response);
        } else if (path.equals("/signup.client")) {
            request.getRequestDispatcher("/views/client/signup.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/go.client")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String emailPassager = request.getParameter("emailPassager");
            String passwordPassager = request.getParameter("passwordPassager");
            String phonePassager = request.getParameter("phonePassager");
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
            request.setAttribute("emailPassager", emailPassager);
            request.setAttribute("passwordPassager", passwordPassager);
            request.setAttribute("phonePassager", phonePassager);

            request.getRequestDispatcher("index.jsp").forward(request, response);

        } else if (path.equals("/showFlights.client")) {
            String villeDepart = request.getParameter("villeDepart");
            String villeArrivee = request.getParameter("villeArrivee");
            LocalDateTime heureDepart = LocalDateTime.parse(request.getParameter("heureDepart"));
            request.setAttribute("villeDepart", villeDepart);
            request.setAttribute("villeArrivee", villeArrivee);
            request.setAttribute("heureDepart", heureDepart);
            request.getRequestDispatcher("/views/trip/flightSearch.jsp").forward(request, response);
        } else if (path.equals("/loginClient.client")) {
            String emailPassager = request.getParameter("emailPassager");
            String passwordPassager = request.getParameter("passwordPassager");
            request.setAttribute("emailPassager", emailPassager);
            request.setAttribute("passwordPassager", passwordPassager);
            Cookie ck = new Cookie("email", emailPassager);//creating cookie object
            Cookie ck2 = new Cookie("password", passwordPassager);
            ck.setMaxAge(24 * 60 * 60);//setting cookie to expiry in 1 day
            ck2.setMaxAge(24 * 60 * 60);
            response.addCookie(ck);//adding cookie in the response
            response.addCookie(ck2);//adding cookie in the response
            request.getRequestDispatcher("/views/client/login.jsp").forward(request, response);
        }
    }
}

