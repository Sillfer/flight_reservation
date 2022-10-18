package dao.reservationDao;

import metier.entities.reservation;
import metier.entities.trip;

import java.time.LocalDateTime;
import java.util.List;

public interface IResarvationDao {
    public boolean createReservation(int idTrip,
                                     int idPassager,
                                     double prix,
                                     String villedepart,
                                     String villeArrivee,
                                     String dateDepart,
                                     String dateArrivee);
    public List<reservation> listTripPassenger(long id);


}


