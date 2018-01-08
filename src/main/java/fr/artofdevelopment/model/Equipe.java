package fr.artofdevelopment.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jprec on 15/10/2016.
 */
public class Equipe {

    private String nom;

    private List<Joueur> joueurList = new ArrayList<Joueur>();

    public Equipe(String nom) {
        this.nom = nom;
    }

    public List<Joueur> getJoueurList() {
        return joueurList;
    }

    public void setJoueurList(List<Joueur> joueurList) {
        this.joueurList = joueurList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Equipe{"
                + "Nom : " + nom
                + ", joueurList=" + joueurList
                + '}';
    }
}
