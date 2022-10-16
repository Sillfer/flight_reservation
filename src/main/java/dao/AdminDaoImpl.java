package dao;

import metier.entities.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl implements IAdminDao {
    @Override
    public admin save(admin a) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("INSERT INTO admin (emailAdmin, passWord) VALUES (?,?)");
            ps.setString(1, a.getEmailAdmin());
            ps.setString(2, a.getPassWord());
            ps.executeUpdate();
            PreparedStatement ps2 = connection.prepareStatement
                    ("SELECT MAX(idAdmin) AS MAX_ID FROM admin"); // get the last inserted id from the table
            ResultSet rs = ps2.executeQuery();
            if (rs.next()) {
                a.setIdAdmin(rs.getLong("MAX_ID"));  // set the id of the product
            }
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return a;
    }

    public List<admin> showAllAdmin(){
        List<admin> admin = new ArrayList<admin>();
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("SELECT * FROM admin ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                admin a = new admin();
                a.setIdAdmin(rs.getLong("idAdmin"));  // set the id of the product
                a.setEmailAdmin(rs.getString("emailAdmin"));
                a.setPassWord(rs.getString("passWord"));
                admin.add(a);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return admin;

    }

    @Override
    public List<admin> adminsParMc(String mc) {
        List<admin> admin = new ArrayList<admin>();
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("SELECT * FROM admin WHERE emailAdmin LIKE ?");
            ps.setString(1, mc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                admin a = new admin();
                a.setIdAdmin(rs.getLong("idAdmin"));  // set the id of the product
                a.setEmailAdmin(rs.getString("emailAdmin"));
                a.setPassWord(rs.getString("passWord"));
                admin.add(a);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return admin;
    }

    @Override
    public admin getAdmin(Long id) {
        return null;
    }

    @Override
    public admin update(admin a) {
        return null;
    }

    @Override
    public admin deleteAdmin(Long id) {
        return null;
    }
}
