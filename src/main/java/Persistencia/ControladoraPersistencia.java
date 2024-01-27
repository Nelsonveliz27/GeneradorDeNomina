
package Persistencia;

import Logica.Proveedor;
import exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nvelizl
 */
public class ControladoraPersistencia {
    
    ProveedorJpaController provJpa = new ProveedorJpaController();
    
    public void GuardarNuevoProveedor(Proveedor prov) {
        provJpa.create(prov);
    
    
    }

    public List<Proveedor> traerProveedores() {
        return provJpa.findProveedorEntities();
    }

    public void borrarProveedor(int idPro) {
        try {
            provJpa.destroy(idPro);
        }  catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public Proveedor traerProveedores(int idPro) {
        return provJpa.findProveedor(idPro);
    }

    public void ModificarProveedor(Proveedor prov) {
        try {
            provJpa.edit(prov);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
