package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameMarcas;
import vistas.FrameNuevoArticulo;
import vistas.MenuPrincipal;

public class ControlFrameMarcas implements ActionListener {

    private FrameMarcas frameMarcas;

    public ControlFrameMarcas(MenuPrincipal menuPrincipal) {
        frameMarcas = new FrameMarcas(menuPrincipal, true);
        frameMarcas.setControlador(this);
        frameMarcas.ejecutar();
    }

    ControlFrameMarcas(FrameNuevoArticulo frameNuevoArticulo) {
        frameMarcas = new FrameMarcas(frameNuevoArticulo, true);
        frameMarcas.setControlador(this);
        frameMarcas.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameMarcas.BTN_NUEVO)) {
            System.out.println("NUEVA");
        }
        if (e.getActionCommand().equals(frameMarcas.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(frameMarcas.BTN_SALIR)) {
            frameMarcas.dispose();
        }
    }

}
