package fr.artofdevelopment;

import fr.artofdevelopment.model.Equipe;
import fr.artofdevelopment.repository.EquipeRepository;
import fr.artofdevelopment.repository.EquipeRepositoryImpl;

import java.util.List;

/**
 * App
 */
public class App {
    public static void main(String[] args) {

        EquipeRepository equipeRepository = new EquipeRepositoryImpl();

        List<Equipe> equipeList = equipeRepository.getEquipes();

        for (Equipe equipe : equipeList) {
            System.out.println(equipe);
        }
    }
}
