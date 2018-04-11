package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoCliente;
import vistas.MenuClientes;

public class ControlFrameNuevoCliente implements ActionListener {

    private FrameNuevoCliente frameNuevoCliente;

    public ControlFrameNuevoCliente(MenuClientes menuClientes) {
        frameNuevoCliente = new FrameNuevoCliente(menuClientes, true);
        frameNuevoCliente.setControlador(this);
        frameNuevoCliente.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevoCliente.BTN_GUARDAR)) {
            System.out.println("GUARDAR");
        }
        if (e.getActionCommand().equals(frameNuevoCliente.BTN_CANCELAR)) {
            frameNuevoCliente.dispose();
        }
    }

}
