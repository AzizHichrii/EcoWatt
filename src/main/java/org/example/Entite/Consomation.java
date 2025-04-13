package org.example.Entite;
import java.time.LocalDate;

public class Consomation {
    private int id;
    private double kwh;
    private LocalDate date;
    private Appareil appareil;
    private Utilisateur utilisateur;

    public Consomation(int id, double kwh, LocalDate date, Appareil appareil, Utilisateur utilisateur) {
        this.id = id;
        this.kwh = kwh;
        this.date = date;
        this.appareil = appareil;
        this.utilisateur = utilisateur;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getKwh() {
        return kwh;
    }
    public void setKwh(double kwh) {
        this.kwh = kwh;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Appareil getAppareil() {
        return appareil;
    }
    public void setAppareil(Appareil appareil) {
        this.appareil = appareil;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public void afficherConsomation() {
        System.out.println("ID: " + id);
        System.out.println("KWH: " + kwh);
        System.out.println("Date: " + date);
        System.out.println("Appareil: " + appareil.getNom());
        System.out.println("Utilisateur: " + utilisateur.getNom());
    }

}
