package org.example.Entite;

public class Capteur {
    private String type;
    private int id;
    private double valeur;

    public Capteur(String type, int id, double valeur) {
        this.type = type;
        this.id = id;
        this.valeur = valeur;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getValeur() {
        return valeur;
    }
    public void setValeur(double valeur) {
        this.valeur = valeur;
    }
    public void afficherCapteur() {
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Valeur: " + valeur);
    }
}
