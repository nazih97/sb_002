package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Patient;

@Service
public interface IPatientService {
    List<Patient> obtenirTousLesPatients();
    Patient obtenirPatientParId(int id);
    List<Patient> obtenirPatientsParNom(String nom);
    void creerPatient(Patient patient);
    void mettreAJourPatient(Patient patient);
    void supprimerPatient(int id);
}