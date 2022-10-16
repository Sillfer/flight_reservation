package web.model;

import metier.entities.admin;

import java.util.ArrayList;
import java.util.List;

public class AdminModel {

    private String motCle;

    private List<admin> admin = new ArrayList<admin>();

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    private List<admin> getAdmins() {
        return admin;
    }

    public void setAdmins(List<admin> admin) {
        this.admin = admin;
    }
}
