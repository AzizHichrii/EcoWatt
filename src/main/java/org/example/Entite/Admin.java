package org.example.Entite;

public class Admin extends Utilisateur{
    private String emailProfessionnel;

    public Admin(String nom, String prenom, String email, String motDePasse, String emailProfessionnel) {
        super(nom, prenom, email, motDePasse, "admin");
        this.emailProfessionnel = emailProfessionnel;
    }
    public String getEmailProfessionnel() {
        return emailProfessionnel;
    }
    public void setEmailProfessionnel(String emailProfessionnel) {
        this.emailProfessionnel = emailProfessionnel;
    }
    @Override
    public void afficherUtilisateur() {
        super.afficherUtilisateur();
        System.out.println("Email Professionnel: " + emailProfessionnel);
    }
}
