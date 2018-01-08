package fr.artofdevelopment.model;

/**
 * Created by jprec on 14/10/2016.
 */
public abstract class Joueur {

    private String prenom;
    private String nom;

    public Joueur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public abstract Integer drible();
    public abstract Integer shoot();
    public abstract Integer rebond();
    public abstract Integer courrir();
    public abstract Integer contre();

    public String toString(){
        return prenom + " " + nom;
    }

}
