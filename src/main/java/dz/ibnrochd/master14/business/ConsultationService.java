package dz.ibnrochd.master14.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.mapper.ConsultationMapper;
import dz.ibnrochd.master14.model.Consultation;

@Service
public class ConsultationService implements IConsultationService {
    
    @Autowired
    private ConsultationMapper consultationMapper;
    
    @Override
    public List<Consultation> obtenirToutesLesConsultations() {
        return consultationMapper.obtenirToutesLesConsultations();
    }
    
    @Override
    public Consultation obtenirConsultationParId(int id) {
        return consultationMapper.obtenirConsultationParId(id);
    }
    
    @Override
    public void creerConsultation(Consultation consultation) {
        consultationMapper.creerConsultation(consultation);
    }
    
    @Override
    public void mettreAJourConsultation(Consultation consultation) {
        consultationMapper.mettreAJourConsultation(consultation);
    }
    
    @Override
    public void supprimerConsultation(int id) {
        consultationMapper.supprimerConsultation(id);
    }
}