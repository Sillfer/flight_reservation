package metier.entities;

import java.time.LocalDateTime;

public class reservation {
    private long idReservation;
    private long idTrip;
    private long idPassager;
    private String villeDepart;
    private String villeArrivee;
    private String dateDepart;
    private String dateArrivee;
    private double priceTrip;

    public reservation(){}

    public reservation(long idReservation, long idTrip, long idPassager, String villeDepart, String villeArrivee, String dateDepart, String dateArrivee, double priceTrip) {
        this.idReservation = idReservation;
        this.idTrip = idTrip;
        this.idPassager = idPassager;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.priceTrip = priceTrip;
    }

    //getters and setters

    public long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(long idReservation) {
        this.idReservation = idReservation;
    }

    public long getIdTrip() {
        return idTrip;
    }

    public void setIdTrip(long idTrip) {
        this.idTrip = idTrip;
    }

    public long getIdPassager() {
        return idPassager;
    }

    public void setIdPassager(long idPassager) {
        this.idPassager = idPassager;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        this.priceTrip = priceTrip;
    }

    @Override
    public String toString() {
        return "reservation{" +
                "idReservation=" + idReservation +
                ", idTrip=" + idTrip +
                ", idPassager=" + idPassager +
                ", villeDepart='" + villeDepart + '\'' +
                ", villeArrivee='" + villeArrivee + '\'' +
                ", dateDepart=" + dateDepart +
                ", dateArrivee=" + dateArrivee +
                ", priceTrip=" + priceTrip +
                '}';
    }
}
