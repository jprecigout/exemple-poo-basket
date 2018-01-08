package fr.artofdevelopment.model;

/**
 * Created by jprec on 14/10/2016.
 */
public class Aillier extends Joueur {

    public Aillier(String prenom, String nom) {
        super(prenom, nom);
    }

    @Override
    public Integer drible() {
        return 3;
    }

    @Override
    public Integer shoot() {
        return 3;
    }

    @Override
    public Integer rebond() {
        return 3;
    }

    @Override
    public Integer courrir() {
        return 3;
    }

    @Override
    public Integer contre() {
        return 2;
    }

    @Override
    public String toString() {
        return "Aillier{"
                + super.toString()
                + ", drible : " + drible()
                + ", shoot : " + shoot()
                + ", rebond : " + rebond()
                + ", courrir : " + courrir()
                + ", contre : " + contre()
                +"}";
    }
}
