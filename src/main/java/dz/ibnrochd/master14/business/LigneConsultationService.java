package dz.ibnrochd.master14.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.mapper.LigneConsultationMapper;
import dz.ibnrochd.master14.model.LigneConsultation;

@Service
public class LigneConsultationService {
    
    @Autowired
    private LigneConsultationMapper ligneConsultationMapper;
    
    public List<LigneConsultation> getAllLignesConsultation() {
        return ligneConsultationMapper.getAllLignesConsultation();
    }
    
    public LigneConsultation getLigneConsultationById(int id) {
        return ligneConsultationMapper.getLigneConsultationById(id);
    }
    
    
    public void insertLigneConsultation(LigneConsultation ligneConsultation) {
        ligneConsultationMapper.insertLigneConsultation(ligneConsultation);
    }
    
    public void updateLigneConsultation(LigneConsultation ligneConsultation) {
        ligneConsultationMapper.updateLigneConsultation(ligneConsultation);
    }
    
    public void deleteLigneConsultation(int id) {
        ligneConsultationMapper.deleteLigneConsultation(id);
    }
}
