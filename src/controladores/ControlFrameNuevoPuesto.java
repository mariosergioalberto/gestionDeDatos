package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoPuesto;
import vistas.MenuPuestos;

public class ControlFrameNuevoPuesto implements ActionListener {

    private FrameNuevoPuesto frameNuevoPuesto;

    public ControlFrameNuevoPuesto(MenuPuestos menuPuestos) {
        frameNuevoPuesto = new FrameNuevoPuesto(menuPuestos, true);
        frameNuevoPuesto.setControlador(this);
        frameNuevoPuesto.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevoPuesto.BTN_AGREGAR)) {
            System.out.println("AGREGAR");
        }
        if (e.getActionCommand().equals(frameNuevoPuesto.BTN_CANCELAR)) {
            frameNuevoPuesto.dispose();
        }
    }
}
