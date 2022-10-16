package metier.entities;

import java.io.Serializable;

public class admin implements Serializable {
    private Long idAdmin;
    private String emailAdmin;
    private String passWord;

    public admin() {
        super();
    }

    public admin(String emailAdmin, String passWord) {
        this.emailAdmin = emailAdmin;
        this.passWord = passWord;
    }

    public Long getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Long idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "admin{" +
                "idAdmin=" + idAdmin +
                ", emailAdmin='" + emailAdmin + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
