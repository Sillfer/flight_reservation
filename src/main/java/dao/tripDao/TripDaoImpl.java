package dao.tripDao;

import dao.tripDao.ITripDao;
import database.SingletonConnection;
import metier.entities.admin;
import metier.entities.trip;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TripDaoImpl implements ITripDao {
    @Override
    public trip save(trip t) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("INSERT INTO trip (villeDepart,villeArrivee,heureDepart,dateArrivee,priceTrip,statusEscale,villeEscale) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, t.getVilleDepart());
            ps.setString(2, t.getVilleArrivee());
//            ps.setTimestamp(3,  t.getDateDepart();
//            ps.setTimestamp(4,  t.getDateArrivee();
            ps.setDouble(5, t.getPriceTrip());
            ps.setInt(6, t.getStatusEscale());
            ps.setString(7, t.getVilleEscale());
            ps.executeUpdate();
            PreparedStatement ps2 = connection.prepareStatement
                    ("SELECT MAX(idTrip) AS MAX_ID FROM trip"); // get the last inserted id from the table
            ResultSet rs = ps2.executeQuery();
            if (rs.next()) {
                t.setIdTrip(rs.getLong("MAX_ID"));  // set the id of the product
            }
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return t;
    }

    @Override
    public List<trip> tripsParMc(String mc) {
        return null;
    }

    @Override
    public trip getTrip(int id) {
        trip t = new trip();
        Connection connection = SingletonConnection.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement
                    ("SELECT * FROM trip WHERE idTrip = ?");
            ps.setLong(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                t.setIdTrip(rs.getLong("idTrip"));
                t.setVilleDepart(rs.getString("villeDepart"));
                t.setVilleArrivee(rs.getString("villeArrivee"));
                String dateD = rs.getString("dateDepart");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime dateTimeD = LocalDateTime.parse(dateD, formatter);
                t.setDateDepart(dateTimeD);
                String dateA = rs.getString("dateArrivee");
                LocalDateTime dateTimeA = LocalDateTime.parse(dateA, formatter);
                t.setDateArrivee(dateTimeA);
                t.setPriceTrip(rs.getDouble("priceTrip"));
                t.setVilleEscale(rs.getString("villeEscale"));
            }

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        if(t != null)
        return t;
        else return null;
    }

    @Override
    public trip update(trip t) {
        return null;
    }

    @Override
    public trip deleteTrip(Long id) {
        return null;
    }

    @Override
    public List<trip> displayTripByDateAndDate(String villeDepart, String villeArrivee, LocalDateTime dateDepart){
        List<trip> listTrip = new ArrayList<>();

        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("SELECT * FROM trip WHERE villeDepart like ? and villeArrivee like ? and dateDepart < ? ");
            ps.setString(1,villeDepart);
            ps.setString(2,villeArrivee);
            ps.setString(3, String.valueOf(dateDepart));


            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                trip t = new trip();
                t.setIdTrip(rs.getLong("idTrip"));
                t.setVilleDepart(rs.getString("villeDepart"));
                t.setVilleArrivee(rs.getString("villeArrivee"));
                    String dateD = rs.getString("dateDepart");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime dateTimeD = LocalDateTime.parse(dateD, formatter);
                t.setDateDepart(dateTimeD);
                    String dateA = rs.getString("dateArrivee");
                    LocalDateTime dateTimeA = LocalDateTime.parse(dateA, formatter);
                t.setDateArrivee(dateTimeA);
                t.setPriceTrip(rs.getDouble("priceTrip"));
                t.setVilleEscale(rs.getString("villeEscale"));
                listTrip.add(t);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
      if(listTrip!=null){
          return listTrip;
      }
          return null;

    }
}
