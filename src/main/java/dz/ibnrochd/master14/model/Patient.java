package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Patient implements Serializable {

    private static final long serialVersionUID = -3415388341943341473L;

    private int id;
    private String nom;
    private String prenom;
    private String sexe;
    private Date dateNaissance;
    private String numeroTelephone;
    private String adresse;
    private List<Consultation> consultations;
    private List<RendezVous> rendezVous;

  
 // TODO ajouter la signature d'une méthode pour rechercher des patients par leurs noms (convention Spring Data)
}
