package org.example.Entite;
import java.time.LocalDate;
public class Alerte {
    private int idAlerte;
    private String message;
    private LocalDate dateAlerte;
    private double seuil;

    public Alerte(int idAlerte, String message, LocalDate dateAlerte, double seuil) {
        this.idAlerte = idAlerte;
        this.message = message;
        this.dateAlerte = dateAlerte;
        this.seuil = seuil;
    }
    public int getIdAlerte() {
        return idAlerte;
    }
    public void setIdAlerte(int idAlerte) {
        this.idAlerte = idAlerte;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public LocalDate getDateAlerte() {
        return dateAlerte;
    }
    public void setDateAlerte(LocalDate dateAlerte) {
        this.dateAlerte = dateAlerte;
    }
    public double getSeuil() {
        return seuil;
    }
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }
    public void afficherAlerte() {
        System.out.println("ID Alerte: " + idAlerte);
        System.out.println("Message: " + message);
        System.out.println("Date Alerte: " + dateAlerte);
        System.out.println("Seuil: " + seuil);
    }
}
