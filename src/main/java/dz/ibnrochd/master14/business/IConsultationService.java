package dz.ibnrochd.master14.business;

import java.util.List;
import dz.ibnrochd.master14.model.Consultation;

public interface IConsultationService {
    List<Consultation> obtenirToutesLesConsultations();
    Consultation obtenirConsultationParId(int id);
    void creerConsultation(Consultation consultation);
    void mettreAJourConsultation(Consultation consultation);
    void supprimerConsultation(int id);
}