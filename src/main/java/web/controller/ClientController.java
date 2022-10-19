package web.controller;

import dao.reservationDao.IResarvationDao;
import dao.reservationDao.ReservationDaoImpl;
import dao.tripDao.ITripDao;
import dao.tripDao.TripDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.entities.trip;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

//@WebServlet(name = "ClientController", value = "/ClientController")
public class ClientController extends HttpServlet {
    private ITripDao tripDao;
    private IResarvationDao reservationDao;


    public void init() throws ServletException {
        tripDao = new TripDaoImpl();
        reservationDao = new ReservationDaoImpl();
    }

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
        if (path.equals("/signup.client")) {
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
        } else if (path.equals("/loginClient.client")) {
            String emailPassager = request.getParameter("emailPassager");
            request.setAttribute("emailPassager", emailPassager);
            Cookie ck = new Cookie("email", emailPassager);//creating cookie object
            ck.setMaxAge(24 * 60 * 60);//setting cookie to expiry in 1 day
            response.addCookie(ck);//adding cookie in the response
            request.getRequestDispatcher("/views/client/login.jsp").forward(request, response);
        }
    }
}

