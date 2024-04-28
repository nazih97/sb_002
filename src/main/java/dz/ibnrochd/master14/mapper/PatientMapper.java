package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dz.ibnrochd.master14.model.Patient;


@Mapper
public interface PatientMapper {
    List<Patient> obtenirTousLesPatients();
    Patient obtenirPatientParId(int id);
    List<Patient> obtenirPatientsParNom(String nom);
    void creerPatient(Patient patient);
    void mettreAJourPatient(Patient patient);
    void supprimerPatient(int id);
}
