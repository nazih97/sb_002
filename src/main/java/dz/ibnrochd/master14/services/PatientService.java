package dz.ibnrochd.master14.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.mapper.PatientMapper;
import dz.ibnrochd.master14.model.Patient;

@Service
public class PatientService {
    
    @Autowired
    private PatientMapper patientMapper;
    
    public List<Patient> getAllPatients() {
        return patientMapper.getAllPatients();
    }
    
    public Patient getPatientById(int id) {
        return patientMapper.getPatientById(id);
    }
    
    public List<Patient> getPatientByName(String nom) {
        return patientMapper.getPatientByName(nom);
    }

    
    public void insertPatient(Patient patient) {
        patientMapper.insertPatient(patient);
    }
    
    public void updatePatient(Patient patient) {
        patientMapper.updatePatient(patient);
    }
    
    public void deletePatient(int id) {
        patientMapper.deletePatient(id);
    }
}
