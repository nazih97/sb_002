package dz.ibnrochd.master14.business;

import java.util.List;
import dz.ibnrochd.master14.model.Traitement;

public interface ITraitementService {
    List<Traitement> obtenirTousLesTraitements();
    List<String> rechercherTraitements(int idConsultation);
    Traitement obtenirTraitementParId(Traitement traitement);
    void creerTraitement(Traitement traitement);
    void mettreAJourTraitement(Traitement traitement);
    void supprimerTraitement(int id);
}