package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoPuesto;
import vistas.MenuPrincipal;
import vistas.MenuPuestos;

public class ControlMenuPuestos implements ActionListener {

    private MenuPuestos menuPuestos;
    private ControlFrameNuevoPuesto controlFrameNuevoPuesto;

    public ControlMenuPuestos(MenuPrincipal menuPrincipal) {
        menuPuestos = new MenuPuestos(menuPrincipal, true);
        menuPuestos.setControlador(this);
        menuPuestos.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(menuPuestos.BTN_AGREGAR)) {
            controlFrameNuevoPuesto = new ControlFrameNuevoPuesto(menuPuestos);
        }
        if (e.getActionCommand().equals(menuPuestos.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(menuPuestos.BTN_CANCELAR)) {
            menuPuestos.dispose();
        }
    }

}
