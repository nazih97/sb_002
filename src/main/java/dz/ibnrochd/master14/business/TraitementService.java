package dz.ibnrochd.master14.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.mapper.TraitementMapper;
import dz.ibnrochd.master14.model.Traitement;

@Service
public class TraitementService implements ITraitementService {
    
    @Autowired
    private TraitementMapper traitementMapper;
    
    @Override
    public List<Traitement> obtenirTousLesTraitements() {
        return traitementMapper.obtenirTousLesTraitements();
    }
     
    @Override
    public List<String> rechercherTraitements(int idConsultation) {
        return traitementMapper.rechercherTraitements(idConsultation);
    }
    
    @Override
    public Traitement obtenirTraitementParId(Traitement traitement) {
        return traitementMapper.obtenirTraitementParId(traitement);
    }
    
    @Override
    public void creerTraitement(Traitement traitement) {
        traitementMapper.creerTraitement(traitement);
    }
    
    @Override
    public void mettreAJourTraitement(Traitement traitement) {
        traitementMapper.mettreAJourTraitement(traitement);
    }
    
    @Override
    public void supprimerTraitement(int id) {
        traitementMapper.supprimerTraitement(id);
    }
}