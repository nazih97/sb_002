package dz.ibnrochd.master14.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Consultation implements Serializable {

    private static final long serialVersionUID = -3669998604878710274L;

    private int id;
    private String motif;
    private Date date_consultation;
    private int id_patient;
	public void setLignesConsultation(List<LigneConsultation> lignesConsultation) {
		// TODO Auto-generated method stub
		
	}
	public LigneConsultation[] getLignesConsultation() {
		// TODO Auto-generated method stub
		return null;
	}
    
 
    
}


