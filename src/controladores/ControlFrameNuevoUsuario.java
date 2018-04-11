package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoUsuario;
import vistas.MenuUsuarios;

public class ControlFrameNuevoUsuario implements ActionListener {

    private FrameNuevoUsuario frameNuevoUsuario;

    public ControlFrameNuevoUsuario(MenuUsuarios menuUsuarios) {
        frameNuevoUsuario = new FrameNuevoUsuario(menuUsuarios, true);
        frameNuevoUsuario.setControlador(this);
        frameNuevoUsuario.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevoUsuario.BTN_ACEPTAR)) {
            System.out.println("ACEPTAR");
        }
        if (e.getActionCommand().equals(frameNuevoUsuario.BTN_SALIR)) {
            frameNuevoUsuario.dispose();
        }
    }

}
