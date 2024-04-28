package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class LigneConsultation implements Serializable {

    private static final long serialVersionUID = -1882485395538957648L;

    private int id;
    private int idConsultation;
    private int idTraitement;
    private String posologie;
    private String uniteTemps;
    private String quantite;
    private Consultation consultation;



}
