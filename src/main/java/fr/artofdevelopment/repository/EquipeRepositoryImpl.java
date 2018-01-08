package fr.artofdevelopment.repository;

import fr.artofdevelopment.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jprec on 15/10/2016.
 */
public class EquipeRepositoryImpl implements EquipeRepository {

    private List<Equipe> equipeList = new ArrayList<Equipe>();

    public EquipeRepositoryImpl() {
        Equipe warriors = new Equipe("Warriors");

        warriors.getJoueurList().add(new Aillier("Kevin", "Durant"));
        warriors.getJoueurList().add(new AillierFort("Daymond", "Green"));
        warriors.getJoueurList().add(new Pivot("Zaza", "Patchulia"));
        warriors.getJoueurList().add(new Arriere("Kay", "Thomson"));
        warriors.getJoueurList().add(new Meneur("Stephan", "Curry"));
        equipeList.add(warriors);

        Equipe spurs = new Equipe("Spurs");

        spurs.getJoueurList().add(new Aillier("Kawhi", "Leonard"));
        spurs.getJoueurList().add(new AillierFort("Lamarcus", "Aldridge"));
        spurs.getJoueurList().add(new Pivot("Pau", "Gasol"));
        spurs.getJoueurList().add(new Arriere("Manu", "Ginobili"));
        spurs.getJoueurList().add(new Meneur("Tony", "Parker"));
        equipeList.add(spurs);
    }

    @Override
    public List<Equipe> getEquipes() {
        return equipeList;
    }
}
