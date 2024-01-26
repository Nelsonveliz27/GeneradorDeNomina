
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Proveedor implements Serializable {
    //Mapeo para la que la persistencia reconozca cualsera la tabla y cuales seran las columnas
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idProv;
    
    private String rutProv;
    private String nombreProv;
    private int numeroCtaProv;
    private int codigoCtaProv;
    private String emailProv;
    
    //Contructor Vacio
    public Proveedor() {
    }
    //Contructor por Parametro

    public Proveedor(int idProv, String rutProv, String nombreProv, int numeroCtaProv, int codigoCtaProv, String emailProv) {
        this.idProv = idProv;
        this.rutProv = rutProv;
        this.nombreProv = nombreProv;
        this.numeroCtaProv = numeroCtaProv;
        this.codigoCtaProv = codigoCtaProv;
        this.emailProv = emailProv;
    }
    
    //gatter y setter

    public int getIdProv() {
        return idProv;
    }

    public void setIdProv(int idProv) {
        this.idProv = idProv;
    }

    public String getRutProv() {
        return rutProv;
    }

    public void setRutProv(String rutProv) {
        this.rutProv = rutProv;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public int getNumeroCtaProv() {
        return numeroCtaProv;
    }

    public void setNumeroCtaProv(int numeroCtaProv) {
        this.numeroCtaProv = numeroCtaProv;
    }

    public int getCodigoCtaProv() {
        return codigoCtaProv;
    }

    public void setCodigoCtaProv(int codigoCtaProv) {
        this.codigoCtaProv = codigoCtaProv;
    }

    public String getEmailProv() {
        return emailProv;
    }

    public void setEmailProv(String emailProv) {
        this.emailProv = emailProv;
    }
    
    
          
    
}
