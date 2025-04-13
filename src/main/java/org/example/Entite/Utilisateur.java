package org.example.Entite;

public class Utilisateur {
    private int id = 0;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String role;

    public Utilisateur(String nom, String prenom, String email, String motDePasse, String role) {
        id++;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.role = role;
    }
    public int getId(){
        return id;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }
    public void setPrenom( String prenom){
        this.prenom = prenom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setMotDePasse(String motDePasse){
        this.motDePasse = motDePasse;
    }
    public String getMotDePasse(){
        return motDePasse;
    }
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }
    public void afficherUtilisateur(){
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Email: " + email);
        System.out.println("Role: " + role);
    }

}
