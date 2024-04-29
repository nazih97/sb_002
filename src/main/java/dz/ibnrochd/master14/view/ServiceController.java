package dz.ibnrochd.master14.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import dz.ibnrochd.master14.business.ITraitementService;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;
import dz.ibnrochd.master14.business.IConsultationService;
import dz.ibnrochd.master14.business.IPatientService;

@Controller
@RequestMapping("/api")
public class ServiceController {

    @Autowired
    private IPatientService patientService;

    @Autowired
    private ITraitementService traitementService;
    
    @Autowired
    private IConsultationService consultationService;


    // obtenir tous les patients
    @GetMapping("/patients")
    public String  obtenirTousLesPatients(Model model) {
        List<Patient> patients = patientService.obtenirTousLesPatients();
        model.addAttribute("patients",patients);
        return "listePatients.html";
    }


    // créer un nouveau patient
    @PostMapping("/api/addpatient")
    public ModelAndView creerPatient(@ModelAttribute("patient") Patient patient) {
        // Ajoutez le patient à la base de données
        patientService.creerPatient(patient);
        
        // Renvoyez la vue creerPatient.html
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("creerPatient");
        return modelAndView;
    }
    
    

    @GetMapping("/traitements")
    public String  obtenirTousLesTraitements(Model model) {
        List<Traitement> traitements = traitementService.obtenirTousLesTraitements();
        model.addAttribute("traitements",traitements);
        return "listeTraitements.html";
    }
    



    // supprimet un patient
    @DeleteMapping("/patient/delete/{id}")
    public void supprimerPatient(@PathVariable int id) {
    }
    
    
    
}
    

