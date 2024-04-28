package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dz.ibnrochd.master14.model.LigneConsultation;
@Mapper
public interface LigneConsultationMapper {
    List<LigneConsultation> getAllLignesConsultation();
    LigneConsultation getLigneConsultationById(int id);
    List<LigneConsultation> getLignesConsultationByConsultationId(int consultationId);
    void insertLigneConsultation(LigneConsultation ligneConsultation);
    void updateLigneConsultation(LigneConsultation ligneConsultation);
    void deleteLigneConsultation(int id);
}
