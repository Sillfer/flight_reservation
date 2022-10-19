package dao.tripDao;

import dao.adminDao.AdminDaoImpl;
import dao.tripDao.TripDaoImpl;
import metier.entities.trip;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TripTest {
    public static void main(String[] args) {
        AdminDaoImpl dao = new AdminDaoImpl();
        TripDaoImpl trip = new TripDaoImpl();
        System.out.println("************ display Trips *************");
//        admin admins = dao.loginAdmin("mahdi@gmail.com","qdsqdcsfdd");
//        if(admins.getIdAdmin()!= 0)System.out.println(admins.getIdAdmin());
//        else System.out.println("nooooooooooooooooooo");
//            System.out.println(admins.toString());
        List<trip> TripList = new ArrayList<>();
        String str = "2022-11-12 00:20:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        List<trip> list = new ArrayList<>();
        list = trip.displayTripByDateAndDate("Marrakech", "Paris", dateTime);
        int i = 1;
        for (trip t : list) {
            System.out.println("------------------Voyage " + i + "------------------ ");
            System.out.println("Ville depart  :" + t.getVilleDepart());
            System.out.println("Ville Arrivee :" + t.getVilleArrivee());
            System.out.println("Heure Depart  :" + t.getDateDepart());
            System.out.println("Heure Arrivee :" + t.getDateArrivee());
            if (t.getVilleEscale() != null)
                System.out.println("Ville Escale  :" + t.getVilleEscale());
            System.out.println("Price Trip    :" + t.getPriceTrip());
            i++;
            System.out.println(t.toString());


            //***************************** recupere trip by his id
//        System.out.println(trip.getTrip(1).toString());
        }
    }
}