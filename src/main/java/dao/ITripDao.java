package dao;

import metier.entities.trip;

import java.util.List;

public interface ITripDao {

    public trip save(trip t);

    public List<trip> tripsParMc(String mc);

    public trip getTrip(Long id);

    public trip update(trip t);

    public trip deleteTrip(Long id);
}
