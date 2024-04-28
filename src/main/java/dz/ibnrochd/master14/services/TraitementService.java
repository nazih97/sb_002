package dz.ibnrochd.master14.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.mapper.TraitementMapper;
import dz.ibnrochd.master14.model.Traitement;

@Service
public class TraitementService{
    
    @Autowired
    private TraitementMapper traitementMapper;
    
    public List<Traitement> getAllTraitements() {
        return traitementMapper.getAllTraitements();
    }
     
    public List<String> rechercherTraitements(int idConsultation) {
        return traitementMapper.rechercherTraitements(idConsultation);
    }
    
    
    public Traitement getTraitementById(Traitement tratement) {
        return traitementMapper.getTraitementById(tratement);
    }
    
    public void insertTraitement(Traitement traitement) {
        traitementMapper.insertTraitement(traitement);
    }
    
    public void updateTraitement(Traitement traitement) {
        traitementMapper.updateTraitement(traitement);
    }
    
    public void deleteTraitement(int id) {
        traitementMapper.deleteTraitement(id);
    }
}
