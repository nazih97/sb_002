package dz.ibnrochd.master14;



import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.ibnrochd.master14.business.ConsultationService;
import dz.ibnrochd.master14.business.LigneConsultationService;
import dz.ibnrochd.master14.business.PatientService;
import dz.ibnrochd.master14.business.TraitementService;
import dz.ibnrochd.master14.mapper .PatientMapper;
import dz.ibnrochd.master14.mapper.TraitementMapper;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.LigneConsultation;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;

@SpringBootApplication
public class Sb002Application implements CommandLineRunner {
	
	@Autowired
	PatientMapper patientMapper;
	
	@Autowired
	PatientService patientService;
	
	@Autowired
	ConsultationService consultationService;
	
	@Autowired
	LigneConsultationService ligneconsultationService;
	
	@Autowired
	TraitementService traitementService;
	
	@Autowired
	TraitementMapper traitementMapper;
	
	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO : récupérer la liste de tous les patients puis afficher leurs noms
		/*
		List<Patient> patients = patientService.getAllPatients();
		for (Patient patient : patients) {
			System.out.println(patient.getNom());
		}
		
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
		  List<Patient> patientss = patientService.getPatientByName("Yahi");
		    
		    // Affichage des prénoms des patients
		    for (Patient patient : patientss) {
		        System.out.println("Nom : " + patient.getNom() + ", Prénom : " + patient.getPrenom());
		    }
		
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
		    Patient patient = new Patient();
		    patient.setNom("Belkassam");
		    patient.setPrenom("Nazih");
		    patient.setSexe("m"); //
		    Date dateNaissance = Date.valueOf("1997-04-18");
		    patient.setDateNaissance(dateNaissance);
		    patient.setNumeroTelephone("0123456789"); 
		    patient.setAdresse("S.E.G");

		    // Enregistrement du nouveau patient
		    patientService.insertPatient(patient);
	   
		    
				    
				
		// TODO : rechercher la consultation ayant id=3 
		    Consultation consultation = consultationService.getConsultationById(3);
		    
		  
		    if (consultation != null) {
		        System.out.println("ID de la consultation : " + consultation.getId());
		        System.out.println("Motif : " + consultation.getMotif());
		        System.out.println("Date de consultation : " + consultation.getDate_consultation());
		        System.out.println("ID du patient : " + consultation.getId_patient());
		       
		    } else {
		        System.out.println("Aucune consultation trouvée avec l'ID 3");
		    }
	


		
		 // TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
		
		    List<String> traitementsNoms = traitementService.rechercherTraitements(consultation.getId());
		    traitementsNoms.forEach(System.out::println);

	    */
	} 
}

