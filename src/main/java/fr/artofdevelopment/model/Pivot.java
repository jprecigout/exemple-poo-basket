package fr.artofdevelopment.model;

/**
 * Created by jprec on 14/10/2016.
 */
public class Pivot extends Joueur {

    public Pivot(String prenom, String nom) {
        super(prenom, nom);
    }

    @Override
    public Integer drible() {
        return 1;
    }

    @Override
    public Integer shoot() {
        return 2;
    }

    @Override
    public Integer rebond() {
        return 5;
    }

    @Override
    public Integer courrir() {
        return 1;
    }

    @Override
    public Integer contre() {
        return 5;
    }

    @Override
    public String toString() {
        return "Pivot{"
                + super.toString()
                + ", drible : " + drible()
                + ", shoot : " + shoot()
                + ", rebond : " + rebond()
                + ", courrir : " + courrir()
                + ", contre : " + contre()
                +"}";
    }
}
