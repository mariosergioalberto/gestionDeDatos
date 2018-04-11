package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.ActualizarPrecios;
import vistas.MenuPrincipal;

public class ControlActualizarPrecios implements ActionListener {
    
    private ActualizarPrecios actualizarPrecios;
    
    public ControlActualizarPrecios(MenuPrincipal menuPrincipal) {
        actualizarPrecios = new ActualizarPrecios(menuPrincipal, true);
        actualizarPrecios.setControlador(this);
        actualizarPrecios.ejecutar();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(actualizarPrecios.BTN_ACEPTAR)) {
            System.out.println("BOTON ACEPTAR");
        }
        if (e.getActionCommand().equals(actualizarPrecios.BTN_SALIR)) {
            actualizarPrecios.dispose();
        }
    }
    
}
