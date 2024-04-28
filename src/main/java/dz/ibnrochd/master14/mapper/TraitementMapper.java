package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import dz.ibnrochd.master14.model.Traitement;
@Mapper
public interface TraitementMapper {
    List<Traitement> getAllTraitements();

    void insertTraitement(Traitement traitement);
    void updateTraitement(Traitement traitement);
    void deleteTraitement(int id);
	Traitement getTraitementById(Traitement traitement);
	
	@Select("SELECT a.nom FROM cabinet.consultation b, cabinet.traitement a, cabinet.ligne_consultation c WHERE b.id = c.id_consultation AND a.id = c.id_traitement AND b.id = #{idConsultation}")
	List<String> rechercherTraitements(@Param("idConsultation") int idConsultation);


}
