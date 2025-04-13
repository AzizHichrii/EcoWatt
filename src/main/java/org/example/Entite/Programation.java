package org.example.Entite;

public class Programation {
    private int idProg;
    private String horaire;
    private String action;
    private Appareil appareil;
    public Programation(int idProg, String horaire, String action, Appareil appareil) {
        this.idProg = idProg;
        this.horaire = horaire;
        this.action = action;
        this.appareil = appareil;
    }
    public int getIdProg() {
        return idProg;
    }
    public void setIdProg(int idProg) {
        this.idProg = idProg;
    }
    public String getHoraire() {
        return horaire;
    }
    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public Appareil getAppareil() {
        return appareil;
    }
    public void setAppareil(Appareil appareil) {
        this.appareil = appareil;
    }
    public void executer() {
        if ("allumer".equalsIgnoreCase(action)) {
            appareil.allumer();
        } else if ("eteindre".equalsIgnoreCase(action)) {
            appareil.eteindre();
        }
    }

}
