package dao.passengerDao;

import database.SingletonConnection;
import metier.entities.passager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PassagerDaoImpl implements IPassengerDao{
    @Override
    public boolean registerPassager(String firstName, String lastName, String emailPassager, String passwordPassager, String phonePassager) {
        Connection connection = SingletonConnection.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO passager(firstName,lastName,emailPassager,passwordPassager,phonePassager)" +
                            "VALUES(?,?,?,?,?)");
            ps.setString(1,firstName);
            ps.setString(2,lastName);
            ps.setString(3,emailPassager);
            ps.setString(4,passwordPassager);
            ps.setString(5,phonePassager);
            ps.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public passager loginPassager(String emailPassager, String passwordPassager) {
        passager p = new passager();
        Connection connection = SingletonConnection.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM passager WHERE emailPassager like ? and passwordPassager like ? ");
            ps.setString(1,emailPassager);
            ps.setString(2,passwordPassager);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                p.setIdPassenger(rs.getLong("idPassager"));
                p.setFirstName(rs.getString("firstName"));
                p.setLastName(rs.getString("lastName"));
                p.setEmailPassager(rs.getString("emailPassager"));
                p.setPasswordPassager(rs.getString("passwordPassager"));
                p.setPhonePassager(rs.getString("phonePassager"));
            }
        }catch(SQLException e){
            throw  new RuntimeException();
        }
        if(p!=null){
            return p;
        }else{
            return null;
        }
    }

    @Override
    public passager getPassagerById(int id) {
        passager p = new passager();
        Connection connection = SingletonConnection.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM passager WHERE idPassager = ? ");
            ps.setLong(1,id);

            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                p.setIdPassenger(rs.getLong("idPassager"));
                p.setFirstName(rs.getString("firstName"));
                p.setLastName(rs.getString("lastName"));
                p.setEmailPassager(rs.getString("emailPassager"));
                p.setPasswordPassager(rs.getString("passwordPassager"));
                p.setPhonePassager(rs.getString("phonePassager"));
            }
        }catch(SQLException e){
            throw  new RuntimeException();
        }
        if(p!=null){
            return p;
        }else{
            return null;
        }
    }
}
