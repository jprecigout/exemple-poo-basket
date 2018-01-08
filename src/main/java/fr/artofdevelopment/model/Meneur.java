package fr.artofdevelopment.model;

/**
 * Created by jprec on 14/10/2016.
 */
public class Meneur extends Joueur {

    public Meneur(String prenom, String nom) {
        super(prenom, nom);
    }

    @Override
    public Integer drible() {
        return 5;
    }

    @Override
    public Integer shoot() {
        return 4;
    }

    @Override
    public Integer rebond() {
        return 1;
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
        return "Meneur{"
                + super.toString()
                + ", drible : " + drible()
                + ", shoot : " + shoot()
                + ", rebond : " + rebond()
                + ", courrir : " + courrir()
                + ", contre : " + contre()
                +"}";
    }

}
