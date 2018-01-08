package fr.artofdevelopment.model;

/**
 * Created by jprec on 14/10/2016.
 */
public class AillierFort extends Joueur {

    public AillierFort(String prenom, String nom) {
        super(prenom, nom);
    }

    @Override
    public Integer drible() {
        return 2;
    }

    @Override
    public Integer shoot() {
        return 3;
    }

    @Override
    public Integer rebond() {
        return 4;
    }

    @Override
    public Integer courrir() {
        return 2;
    }

    @Override
    public Integer contre() {
        return 4;
    }
    @Override
    public String toString() {
        return "AillierFort{"
                + super.toString()
                + ", drible : " + drible()
                + ", shoot : " + shoot()
                + ", rebond : " + rebond()
                + ", courrir : " + courrir()
                + ", contre : " + contre()
                +"}";
    }
}
