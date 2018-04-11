package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoEmpleado;
import vistas.MenuEmpleados;

public class ControlFrameNuevoEmpleado implements ActionListener {

    private FrameNuevoEmpleado frameNuevoEmpleado;
    private ControlFrameNuevoGrupoFamiliar controlFrameNuevoGrupoFamiliar;

    public ControlFrameNuevoEmpleado(MenuEmpleados menuEmpleados) {
        frameNuevoEmpleado = new FrameNuevoEmpleado(menuEmpleados, true);
        frameNuevoEmpleado.setControlador(this);
        frameNuevoEmpleado.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevoEmpleado.BTN_AGREGAR_PARIENTES)) {
            controlFrameNuevoGrupoFamiliar = new ControlFrameNuevoGrupoFamiliar(frameNuevoEmpleado);
        }
        if (e.getActionCommand().equals(frameNuevoEmpleado.BTN_ACEPTAR)) {
            System.out.println("ACEPTAR");
        }
        if (e.getActionCommand().equals(frameNuevoEmpleado.BTN_CANCELAR)) {
            frameNuevoEmpleado.dispose();
        }
    }
}
