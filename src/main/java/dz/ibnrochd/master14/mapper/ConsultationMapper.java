package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dz.ibnrochd.master14.model.Consultation;
@Mapper
public interface ConsultationMapper {
    List<Consultation> getAllConsultations();
    Consultation getConsultationById(int id);
    
    void insertConsultation(Consultation consultation);
    void updateConsultation(Consultation consultation);
    void deleteConsultation(int id);
}
