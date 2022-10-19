package dao.passengerDao;

import metier.entities.passager;

public interface IPassengerDao {

    public boolean registerPassager(String firstName,String lastName,String emailPassager,String passwordPassager,String phonePassager);

    public passager loginPassager(String emailPassager,String passwordPassager) ;

    public passager getPassagerById(int id);
}
