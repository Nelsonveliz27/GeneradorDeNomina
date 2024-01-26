
package Persistencia;

import Logica.Proveedor;

/**
 *
 * @author nvelizl
 */
public class ControladoraPersistencia {
    
    ProveedorJpaController provJpa = new ProveedorJpaController();
    
    public void GuardarNuevoProveedor(Proveedor prov) {
        provJpa.create(prov);
    
    
    }
    
}
