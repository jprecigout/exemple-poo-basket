package fr.artofdevelopment.model;

/**
 * Created by jprec on 14/10/2016.
 */
public class Arriere extends Joueur {

    public Arriere(String prenom, String nom) {
        super(prenom, nom);
    }

    @Override
    public Integer drible() {
        return 4;
    }

    @Override
    public Integer shoot() {
        return 5;
    }

    @Override
    public Integer rebond() {
        return 2;
    }

    @Override
    public Integer courrir() {
        return 5;
    }

    @Override
    public Integer contre() {
        return 1;
    }
    @Override
    public String toString() {
        return "Arriere{"
                + super.toString()
                + ", drible : " + drible()
                + ", shoot : " + shoot()
                + ", rebond : " + rebond()
                + ", courrir : " + courrir()
                + ", contre : " + contre()
                +"}";
    }
}
