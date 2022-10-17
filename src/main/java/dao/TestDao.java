package dao;

import dao.adminDao.AdminDaoImpl;
import metier.entities.admin;

import java.util.List;
import java.util.Objects;

public class TestDao {
    public static void main(String[] args) {
    AdminDaoImpl dao = new AdminDaoImpl();

        System.out.println("************ Chercher les admins *************");
        admin admins = dao.loginAdmin("mahdi@gmail.com","qdsqdcsfdd");
        if(admins.getIdAdmin()!= 0)System.out.println(admins.getIdAdmin());
        else System.out.println("nooooooooooooooooooo");
            System.out.println(admins.toString());
    }
}