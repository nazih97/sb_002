package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class RendezVous implements Serializable {

    private static final long serialVersionUID = -7275578697948165342L;

    private int id;
    private Date dateRdv;
    private int idPatient;

    

}
