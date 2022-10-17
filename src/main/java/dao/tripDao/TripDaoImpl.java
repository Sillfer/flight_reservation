package dao.tripDao;

import dao.tripDao.ITripDao;
import database.SingletonConnection;
import metier.entities.trip;

import java.sql.*;
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
            ps.setTimestamp(3, (Timestamp) t.getHeureDepart());
            ps.setTimestamp(4, (Timestamp) t.getDateArrivee());
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
    public trip getTrip(Long id) {
        return null;
    }

    @Override
    public trip update(trip t) {
        return null;
    }

    @Override
    public trip deleteTrip(Long id) {
        return null;
    }
}
