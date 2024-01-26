/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;

/**
 *
 * @author nvelizl
 */
public class Controladora {
    
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();

    public void GuardarNuevoProveedor(String rutProv, String nombreProv, int numeroCtaProv, int codigoCtaProv, String emailProv) {
        
        Proveedor prov = new Proveedor();
        prov.setRutProv(rutProv);
        prov.setNombreProv(nombreProv);
        prov.setNumeroCtaProv(numeroCtaProv);
        prov.setCodigoCtaProv(codigoCtaProv);
        prov.setEmailProv(emailProv);
        
        controlpersis.GuardarNuevoProveedor(prov);
    }
    
}
