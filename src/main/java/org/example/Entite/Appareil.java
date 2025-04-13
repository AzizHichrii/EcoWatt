package org.example.Entite;

public class Appareil {
    private int id;
    private String nom;
    private String type;
    private int consommation;
    boolean etat;
    public Appareil( int id, String nom, String type, int consommation, boolean etat) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.consommation = consommation;
        this.etat = etat;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getConsommation() {
        return consommation;
    }
    public void setConsommation(int consommation) {
        this.consommation = consommation;
    }
    public boolean estActif() {
        return etat;
    }

    public void allumer() {
        etat = true;
    }

    public void eteindre() {
        etat = false;
    }

    public void afficherAppareil() {
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Type: " + type);
        System.out.println("Consommation: " + consommation);
        System.out.println("Etat: " + (etat ? "Allumé" : "Éteint"));
    }
}
