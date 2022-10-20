package web.controller;

import dao.passengerDao.PassagerDaoImpl;
import dao.reservationDao.IResarvationDao;
import dao.reservationDao.ReservationDaoImpl;
import dao.tripDao.ITripDao;
import dao.tripDao.TripDaoImpl;
import helpers.SendMail;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.entities.passager;
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
            if(cookies!=null){
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("id")) {
                    idPassager = Integer.parseInt(cookie.getValue());
                }
            }
            }
            int idTrip = Integer.parseInt(request.getParameter("idTrip"));
            ReservationDaoImpl reservationDao = new ReservationDaoImpl();
           boolean test = false;
            if(idPassager != 0){
                PassagerDaoImpl p = new PassagerDaoImpl();

                //Send message procedure ++++++++++++++++++++++++++++++++++
                passager ps = new passager();
                ps=p.getPassagerById(idPassager);
                String messageEnvoyer = "Bonjour ,\nVoyage numero : "+idTrip+"\nVille Depart : "+villeArrivee+"\nDate Depart : "+heureDepart+"\nMontant paye : "+priceTrip;
//            Boolean test = reservationDao.createReservation(idTrip, idPassager, priceTrip, villeDepart, villeArrivee, heureDepart, heureArrivee);
                try {
                    SendMail.sendMail(ps.getEmailPassager(),messageEnvoyer);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                test = reservationDao.createReservation(idTrip, idPassager, priceTrip, villeDepart, villeArrivee,  heureDepart, heureArrivee);
                request.setAttribute("log",String.valueOf(idPassager));
                request.getRequestDispatcher("/views/home/index.jsp").forward(request, response);
            }
           else if (test ) {
                request.setAttribute("log",String.valueOf(idPassager));
                request.getRequestDispatcher("/views/home/index.jsp").forward(request, response);
            } else {
                request.setAttribute("log",String.valueOf(idPassager));
                request.getRequestDispatcher("/views/client/login.jsp").forward(request, response);
            }

        }
    }
}
