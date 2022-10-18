package metier.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class trip implements Serializable {
    private Long idTrip;
    private String villeDepart;
    private String villeArrivee;

    private LocalDateTime dateDepart;
    private LocalDateTime dateArrivee;
    private Double priceTrip;
    private int statusEscale;
    private String villeEscale;
    private int idPlane;

    public trip() {
        super();
    }

    public trip(String villeDepart, String villeArrivee, LocalDateTime heureDepart, LocalDateTime dateArrivee, Double priceTrip, int statusEscale, String villeEscale) {
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.dateDepart = heureDepart;
        this.dateArrivee = dateArrivee;
        this.priceTrip = priceTrip;
        this.statusEscale = statusEscale;
        this.villeEscale = villeEscale;
    }

    public Long getIdTrip() {
        return idTrip;
    }

    public void setIdTrip(Long idTrip) {
        this.idTrip = idTrip;
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

    public LocalDateTime getDateDepart() {
        return this.dateDepart;
    }

    public void setDateDepart(LocalDateTime heureDepart) {
        this.dateDepart = heureDepart;
    }

    public LocalDateTime getDateArrivee() {
        return this.dateArrivee;
    }

    public void setDateArrivee(LocalDateTime dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(Double priceTrip) {
        this.priceTrip = priceTrip;
    }

    public int getStatusEscale() {
        return statusEscale;
    }

    public void setStatusEscale(int statusEscale) {
        this.statusEscale = statusEscale;
    }

    public String getVilleEscale() {
        return villeEscale;
    }

    public void setVilleEscale(String villeEscale) {
        this.villeEscale = villeEscale;
    }

    public int getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(int idPlane) {
        this.idPlane = idPlane;
    }

    @Override
    public String toString() {
        return "trip{" +
                "idTrip=" + idTrip +
                ", villeDepart='" + villeDepart + '\'' +
                ", villeArrivee='" + villeArrivee + '\'' +
                ", heureDepart=" + dateDepart +
                ", dateArrivee=" + dateArrivee +
                ", priceTrip=" + priceTrip +
                ", statusEscale=" + statusEscale +
                ", villeEscale='" + villeEscale + '\'' +
                ", idPlane=" + idPlane +
                '}';
    }
}
