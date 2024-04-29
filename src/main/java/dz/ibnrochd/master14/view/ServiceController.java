package dz.ibnrochd.master14.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
  /*  @GetMapping("/patients")
    public List<Patient> obtenirTousLesPatients() {
        return patientService.obtenirTousLesPatients();
    }*/
    // obtenir tous les patients
    /*   @GetMapping("/patients")
    public String listPatients(Model model) {
        List<Patient> patients = patientService.obtenirTousLesPatients();
        model.addAttribute("patients", patients);
        return "liste-patients";
    }*/
    
    
    // obtenir tous les patients
    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> obtenirTousLesPatients() {
        List<Patient> patients = patientService.obtenirTousLesPatients();
        return ResponseEntity.ok(patients);
    }
    

    //  obtenir un patient par son ID
    @GetMapping("/patients/{id}")
    public ResponseEntity<Patient> obtenirPatientParId(@PathVariable("id") int id) {
        Patient patient = patientService.obtenirPatientParId(id);
        if (patient != null) {
            return ResponseEntity.ok(patient);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    //  obtenir un patient par son nom
    @GetMapping("/patient/{nom}")
    public ResponseEntity<List<Patient>> obtenirPatientsParNom(@PathVariable("nom") String nom) {
        List<Patient> patients = patientService.obtenirPatientsParNom(nom);
        if (!patients.isEmpty()) {
            return ResponseEntity.ok(patients);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // r créer un nouveau patient
    @PostMapping("/patients")
    public ResponseEntity<Void> creerPatient(@RequestBody Patient patient) {
        patientService.creerPatient(patient);
        return ResponseEntity.ok().build();
    }

    //  obtenir tous les traitements
    @GetMapping("/traitements")
    public ResponseEntity<List<Traitement>> obtenirTousLesTraitements() {
        List<Traitement> traitements = traitementService.obtenirTousLesTraitements();
        return ResponseEntity.ok(traitements);
    }

    //  obtenir un traitement par son ID
    @GetMapping("/traitements/{id}")
    public ResponseEntity<Traitement> obtenirTraitementParId(@PathVariable("id") Traitement traitement) {
        if (traitement != null) {
            return ResponseEntity.ok(traitement);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //  créer un nouveau traitement
    @PostMapping("/traitements")
    public ResponseEntity<Void> creerTraitement(@RequestBody Traitement traitement) {
        traitementService.creerTraitement(traitement);
        return ResponseEntity.ok().build();
    }

}
    

