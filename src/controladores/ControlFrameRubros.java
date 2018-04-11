package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoArticulo;
import vistas.FrameRubros;
import vistas.MenuPrincipal;

public class ControlFrameRubros implements ActionListener {

    private FrameRubros frameRubros;

    public ControlFrameRubros(MenuPrincipal menuPrincipal) {
        frameRubros = new FrameRubros(menuPrincipal, true);
        frameRubros.setControlador(this);
        frameRubros.ejecutar();
    }

    ControlFrameRubros(FrameNuevoArticulo frameNuevoArticulo) {
        frameRubros = new FrameRubros(frameNuevoArticulo, true);
        frameRubros.setControlador(this);
        frameRubros.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameRubros.BTN_NUEVO)) {
            System.out.println("NUEVO");
        }
        if (e.getActionCommand().equals(frameRubros.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(frameRubros.BTN_SALIR)) {
            frameRubros.dispose();
        }
    }

}
