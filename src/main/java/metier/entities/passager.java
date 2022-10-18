package metier.entities;

public class passager {
    private long idPassenger;
    private String firstName;
    private String lastName;
    private String emailPassager;
    private String passwordPassager;
    private String phonePassager;

    public passager(){}
    public passager(long idPassenger, String firstName, String lastName, String emailPassager, String passwordPassager, String phonePassager) {
        this.idPassenger = idPassenger;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailPassager = emailPassager;
        this.passwordPassager = passwordPassager;
        this.phonePassager = phonePassager;
    }

    public long getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(long idPassenger) {
        this.idPassenger = idPassenger;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailPassager() {
        return emailPassager;
    }

    public void setEmailPassager(String emailPassager) {
        this.emailPassager = emailPassager;
    }

    public String getPasswordPassager() {
        return passwordPassager;
    }

    public void setPasswordPassager(String passwordPassager) {
        this.passwordPassager = passwordPassager;
    }

    public String getPhonePassager() {
        return phonePassager;
    }

    public void setPhonePassager(String phonePassager) {
        this.phonePassager = phonePassager;
    }

//to String

    @Override
    public String toString() {
        return "passager{" +
                "idPassenger=" + idPassenger +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailPassager='" + emailPassager + '\'' +
                ", passwordPassager='" + passwordPassager + '\'' +
                ", phonePassager='" + phonePassager + '\'' +
                '}';
    }
}
