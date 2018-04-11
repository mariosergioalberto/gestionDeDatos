package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameConsultarCompras;
import vistas.MenuPrincipal;

public class ControlFrameConsultarCompras implements ActionListener {

    private FrameConsultarCompras frameConsultarCompras;

    public ControlFrameConsultarCompras(MenuPrincipal menuPrincipal) {
        frameConsultarCompras = new FrameConsultarCompras(menuPrincipal, true);
        frameConsultarCompras.setControlador(this);
        frameConsultarCompras.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameConsultarCompras.BTN_ANULAR)) {
            System.out.println("ANULAR");
        }
        if (e.getActionCommand().equals(frameConsultarCompras.BTN_SALIR)) {
            frameConsultarCompras.dispose();
        }
    }

}
