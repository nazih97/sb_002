package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dz.ibnrochd.master14.model.Patient;


@Mapper
public interface PatientMapper {
    List<Patient> getAllPatients();
    Patient getPatientById(int id);
    List<Patient> getPatientByName(String nom);
    void insertPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatient(int id);
}
