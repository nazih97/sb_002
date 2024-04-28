package dz.ibnrochd.master14.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.mapper.RendezVousMapper;
import dz.ibnrochd.master14.model.RendezVous;

@Service
public class RendezVousService {
    
    @Autowired
    private RendezVousMapper rendezVousMapper;
    
    public List<RendezVous> getAllRendezVous() {
        return rendezVousMapper.getAllRendezVous();
    }
    
    public RendezVous getRendezVousById(int id) {
        return rendezVousMapper.getRendezVousById(id);
    }
    
    public void insertRendezVous(RendezVous rendezVous) {
        rendezVousMapper.insertRendezVous(rendezVous);
    }
    
    public void updateRendezVous(RendezVous rendezVous) {
        rendezVousMapper.updateRendezVous(rendezVous);
    }
    
    public void deleteRendezVous(int id) {
        rendezVousMapper.deleteRendezVous(id);
    }
}
