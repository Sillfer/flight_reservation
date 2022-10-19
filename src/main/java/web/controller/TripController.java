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

public class TripController extends HttpServlet {
    private ITripDao tripDao;
    private IResarvationDao reservationDao;

    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
//    String villeDepart = null;
        if (path.equals("/showFlights.flight")) {
            String villeDepart = request.getParameter("villeDepart");
            String villeArrivee = request.getParameter("villeArrivee");
            LocalDateTime heureDepart = LocalDateTime.parse(request.getParameter("heureDepart"));
            TripDaoImpl tripDao = new TripDaoImpl();
            List<trip> trips = tripDao.displayTripByDateAndDate(villeDepart, villeArrivee, heureDepart);
            request.setAttribute("trips", trips);
            request.getRequestDispatcher("/views/trip/flightSearch.jsp").forward(request, response);


        } else if (path.equals("/reserve.flight")) {
            String villeDepart = request.getParameter("villeDepart");
            String villeArrivee = request.getParameter("villeArrivee");
            Double priceTrip = Double.parseDouble(request.getParameter("priceTrip"));
            String heureDepart = request.getParameter("dateDepart");
            String heureArrivee =request.getParameter("dateArrivee");
            Cookie[] cookies = request.getCookies();
            int idPassager = 0;
//            Cookie[] cookies;
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("id")) {
                    idPassager = Integer.parseInt(cookie.getValue());
                }
            }
            int idTrip = Integer.parseInt(request.getParameter("idTrip"));
            ReservationDaoImpl reservationDao = new ReservationDaoImpl();
//            Boolean test = reservationDao.createReservation(idTrip, idPassager, priceTrip, villeDepart, villeArrivee, heureDepart, heureArrivee);
            Boolean test = reservationDao.createReservation(idTrip, idPassager, priceTrip, villeDepart, villeArrivee,  heureDepart, heureArrivee);
            if (test) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/views/client/login.jsp").forward(request, response);
            }

        }
    }
}
