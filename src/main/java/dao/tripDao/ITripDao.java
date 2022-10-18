package dao.tripDao;

import metier.entities.trip;

import java.time.LocalDateTime;
import java.util.List;

public interface ITripDao {

    public trip save(trip t);

    public List<trip> tripsParMc(String mc);

    public List<trip> displayTripByDateAndDate(String villeDepart, String villeArrivee,LocalDateTime dateDepart);
    public trip getTrip(int id);

    public trip update(trip t);

    public trip deleteTrip(Long id);
}
