package dz.ibnrochd.master14.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.mapper.ConsultationMapper;
import dz.ibnrochd.master14.mapper.LigneConsultationMapper;
import dz.ibnrochd.master14.mapper.TraitementMapper;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.LigneConsultation;

@Service
public class ConsultationService {
    
    @Autowired
    private ConsultationMapper consultationMapper;
    
    @Autowired
    private LigneConsultationMapper ligneConsultationMapper; 
    
    @Autowired
    private TraitementMapper traitementMapper;
    
    
    
    public List<Consultation> getAllConsultations() {
        return consultationMapper.getAllConsultations();
    }
    
    public Consultation getConsultationById(int id) {
        return consultationMapper.getConsultationById(id);
    }
    
    
    public List<LigneConsultation> getLignesConsultationByConsultationId(int consultationId) {
        return ligneConsultationMapper.getLignesConsultationByConsultationId(consultationId);
    }
    
    
    public void insertConsultation(Consultation consultation) {
        consultationMapper.insertConsultation(consultation);
    }
    
    public void updateConsultation(Consultation consultation) {
        consultationMapper.updateConsultation(consultation);
    }
    
    public void deleteConsultation(int id) {
        consultationMapper.deleteConsultation(id);
    }
}
