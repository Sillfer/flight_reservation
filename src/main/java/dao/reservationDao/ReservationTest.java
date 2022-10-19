package dao.reservationDao;

import metier.entities.reservation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationTest {
    public static void main(String[] args) {
        ReservationDaoImpl r = new ReservationDaoImpl();
        boolean text = r.createReservation(4, 1, 130, "Niger", "Tunisie", "2022-11-12 00:00:00", "2022-11-15 00:00:00");

        //********************************************creation d'un reservation
//        if(text)
//            System.out.println("reservation added successfuly");
//        }

        //******************************************* Display All reservation made by travler
//         ReservationDaoImpl rs = new ReservationDaoImpl();
//         List<reservation> listreservation = new ArrayList<>();
//         listreservation = rs.listTripPassenger(1);
//         for(reservation test:listreservation)
//             System.out.println(test.toString());



    }

}
