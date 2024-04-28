package dz.ibnrochd.master14.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.mapper.PatientMapper;
import dz.ibnrochd.master14.model.Patient;

@Service
public class PatientService implements IPatientService {
    
    @Autowired
    private PatientMapper patientMapper;
    
    @Override
    public List<Patient> obtenirTousLesPatients() {
        return patientMapper.obtenirTousLesPatients();
    }
    
    @Override
    public Patient obtenirPatientParId(int id) {
        return patientMapper.obtenirPatientParId(id);
    }
    
    @Override
    public List<Patient> obtenirPatientsParNom(String nom) {
        return patientMapper.obtenirPatientsParNom(nom);
    }
    
    @Override
    public void creerPatient(Patient patient) {
        patientMapper.creerPatient(patient);
    }
    
    @Override
    public void mettreAJourPatient(Patient patient) {
        patientMapper.mettreAJourPatient(patient);
    }
    
    @Override
    public void supprimerPatient(int id) {
        patientMapper.supprimerPatient(id);
    }
}