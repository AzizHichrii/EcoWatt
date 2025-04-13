package org.example.Entite;
import java.util.ArrayList;
import java.util.List;

public class Facture {
    private int id;
    private String mois;
    private double montant;
    private String statut; // "en attente", "payée", etc.

    private List<Paiement> paiements; // liste des paiements associés

    // Constructeur
    public Facture(int id, String mois, double montant) {
        this.id = id;
        this.mois = mois;
        this.montant = montant;
        this.statut = "en attente";
        this.paiements = new ArrayList<>();
    }

    // Ajouter un paiement à la facture
    public void ajouterPaiement(Paiement paiement) {
        paiements.add(paiement);
        paiement.setFacture(this);
        if (getMontantTotalPaye() >= montant) {
            statut = "payée";
        }
    }

    // Calcul du total payé
    public double getMontantTotalPaye() {
        return paiements.stream().mapToDouble(Paiement::getMontant).sum();
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public String getMois() {
        return mois;
    }

    public double getMontant() {
        return montant;
    }

    public String getStatut() {
        return statut;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    public void afficherFacture() {
        System.out.println("ID: " + id);
        System.out.println("Mois: " + mois);
        System.out.println("Montant: " + montant);
        System.out.println("Statut: " + statut);
        System.out.println("Paiements:");
        for (Paiement paiement : paiements) {
            System.out.println("- " + paiement.getMontant() + " (" + paiement.getDate() + ")");
        }
    }
}
