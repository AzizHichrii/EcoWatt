package org.example.Entite;

public class Client extends Utilisateur {
    private String adresse;

    public Client(String nom, String prenom, String email, String motDePasse, String adresse) {
        super(nom, prenom, email, motDePasse, "client");
        this.adresse = adresse;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    @Override
    public void afficherUtilisateur() {
        super.afficherUtilisateur();
        System.out.println("Adresse: " + adresse);
    }
}
