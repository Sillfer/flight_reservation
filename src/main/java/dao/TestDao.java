package dao;

import metier.entities.admin;

import java.util.List;

public class TestDao {
    public static void main(String[] args) {
    AdminDaoImpl dao = new AdminDaoImpl();
        admin a1 = dao.save(new admin("mahdi@gmail.com", "admin"));
        admin a2 = dao.save(new admin("reda@gmail.com", "admin2"));
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println("************ Chercher les admins *************");
        List<admin> admins = dao.adminsParMc("%m%");
        for (admin a : admins) {
            System.out.println(a.toString());
        }
    }
}