package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dz.ibnrochd.master14.model.RendezVous;
@Mapper
public interface RendezVousMapper {
    List<RendezVous> getAllRendezVous();
    RendezVous getRendezVousById(int id);
    void insertRendezVous(RendezVous rendezVous);
    void updateRendezVous(RendezVous rendezVous);
    void deleteRendezVous(int id);
}
