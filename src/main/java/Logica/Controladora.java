/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author nvelizl
 */
public class Controladora {
    
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();

    public void GuardarNuevoProveedor(String rutProv, String nombreProv, int numeroCtaProvInt, int codigoCtaProvInt, String emailProv, String sucursalProv) {
        
        Proveedor prov = new Proveedor();
        prov.setRutProv(rutProv);
        prov.setNombreProv(nombreProv);
        prov.setNumeroCtaProv(numeroCtaProvInt);
        prov.setCodigoCtaProv(codigoCtaProvInt);
        prov.setEmailProv(emailProv);
        prov.setSucursalProv(sucursalProv);
        
        controlpersis.GuardarNuevoProveedor(prov);
    }
    
    public List<Proveedor> traerProveedores () {
        return controlpersis.traerProveedores();
    }

    public void borrarProveedor(int idPro) {
        controlpersis.borrarProveedor(idPro);
    }

    public Proveedor traerProveedores(int idPro) {
        return controlpersis.traerProveedores(idPro);
    }

    public void ModificarProveedor(Proveedor prov,String rutProv, String nombreProv, int numeroCtaProv, int codigoCtaProv, String emailProv, String sucursalProv ) {
        
        prov.setRutProv(rutProv);
        prov.setNombreProv(nombreProv);
        prov.setNumeroCtaProv(numeroCtaProv);
        prov.setCodigoCtaProv(codigoCtaProv);
        prov.setEmailProv(emailProv);
        prov.setSucursalProv(sucursalProv);
        
        controlpersis.ModificarProveedor(prov);
    }
    
    
    
}
