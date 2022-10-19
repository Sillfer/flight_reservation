package dao.reservationDao;

import database.SingletonConnection;

import metier.entities.reservation;
import metier.entities.trip;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReservationDaoImpl implements IResarvationDao{

    @Override
    public boolean createReservation(int idTrip, int idPassager, double prix, String villedepart, String villeArrivee, String dateDepart, String dateArrivee) {
        Connection connection = SingletonConnection.getConnection();

        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO reservation(idTrip,idPassager,villeDepart,villeArrivee,dateDepart,dateArrivee,priceReservation) VALUES(?,?,?,?,?,?,?)");
            ps.setLong(1,idTrip);
            ps.setLong(2,idPassager);
            ps.setString(3,villedepart);
            ps.setString(4,villeArrivee);
            ps.setString(5,dateDepart);
            ps.setString(6,dateArrivee);
            ps.setDouble(7,prix);
//            ps.setDouble(7,priceReservation);
            ps.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException();
        }
        return true;
    }

    @Override
    public List<reservation> listTripPassenger(long idPassager) {
        Connection connection = SingletonConnection.getConnection();
        List<reservation> listReservation= new ArrayList<>();
        try{
            PreparedStatement ps = connection.prepareStatement
                    ("SELECT * FROM reservation WHERE idPAssager = ?");
            ps.setLong(1,idPassager);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                reservation r= new reservation();
                r.setIdReservation(rs.getLong("idReservation"));
                r.setIdTrip(rs.getLong("idTrip"));
                r.setIdPassager(rs.getLong("idPassager"));
                r.setVilleDepart(rs.getString("villeDepart"));
                r.setVilleArrivee(rs.getString("villeArrivee"));
                r.setDateDepart(rs.getString("dateDepart"));
                r.setDateArrivee(rs.getString("dateArrivee"));
//                r.setDateDepart(rs.getObject("dateDepart"));
//                    String dateD = rs.getString("dateDepart");
//                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//                    LocalDateTime dateTimeD = LocalDateTime.parse(dateD, formatter);
//                r.setDateDepart(dateTimeD);
//                    String dateA = rs.getString("villeArrivee");
//                    LocalDateTime dateTime = LocalDateTime.parse(dateA,formatter);
//                r.setDateArrivee(dateTime);
                r.setPriceTrip(rs.getDouble("priceReservation"));
                listReservation.add(r);

            }

        }catch(SQLException e){
            throw new RuntimeException();
        }
        if(listReservation!=null)return listReservation;
        else return null;
    }


}
