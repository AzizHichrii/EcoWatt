package org.example.Entite;

import java.time.LocalDate;

public class Paiement {
    private int id;
    private LocalDate date;
    private double montant;
    private String moyen;

    private Facture facture;

    // Constructeur
    public Paiement(int id, LocalDate date, double montant, String moyen) {
        this.id = id;
        this.date = date;
        this.montant = montant;
        this.moyen = moyen;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public String getMoyen() {
        return moyen;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setMoyen(String moyen) {
        this.moyen = moyen;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
    public void afficherPaiement() {
        System.out.println("ID: " + id);
        System.out.println("Date: " + date);
        System.out.println("Montant: " + montant);
        System.out.println("Moyen: " + moyen);
        if (facture != null) {
            System.out.println("Facture ID: " + facture.getId());
        } else {
            System.out.println("Pas de facture associée.");
        }
    }
}
