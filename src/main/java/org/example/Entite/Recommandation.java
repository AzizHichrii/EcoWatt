package org.example.Entite;
import java.time.LocalDateTime;

public class Recommandation {
    private int id;
    private String message;
    private LocalDateTime date;

    private Utilisateur utilisateur;

    public Recommandation(int id, String message, LocalDateTime date, Utilisateur utilisateur) {
        this.id = id;
        this.message = message;
        this.date = date;
        this.utilisateur = utilisateur;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDate() {
        return date;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public void afficherRecommandation() {
        System.out.println("[" + date + "] Recommandation pour " + utilisateur.getNom() + " : " + message);
    }
}
