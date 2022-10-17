package web.model;

import metier.entities.admin;

import java.util.ArrayList;
import java.util.List;

public class AdminModel {

    private String motCle;
    private long idAdmin;
    private String emailAdmin;

    public AdminModel(){}
    public AdminModel(String motCle, long idAdmin, String emailAdmin) {
        this.motCle = motCle;
        this.idAdmin = idAdmin;
        this.emailAdmin = emailAdmin;
    }

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public long getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(long idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }


}
