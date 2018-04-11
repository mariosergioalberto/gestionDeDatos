package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameFactura;
import vistas.MenuPrincipal;

public class ControlFrameFactura implements ActionListener {

    private FrameFactura frameFactura;

    public ControlFrameFactura(MenuPrincipal menuPrincipal) {
        frameFactura = new FrameFactura(menuPrincipal, true);
        frameFactura.setContralador(this);
        frameFactura.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameFactura.BTN_ACEPTAR)) {
            System.out.println("ACEPTAR");
        }
        if (e.getActionCommand().equals(frameFactura.BTN_SALIR)) {
            frameFactura.dispose();
        }
    }
}
