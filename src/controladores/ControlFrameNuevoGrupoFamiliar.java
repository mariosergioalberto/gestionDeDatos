package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoEmpleado;
import vistas.FrameNuevoGrupoFamiliar;

public class ControlFrameNuevoGrupoFamiliar implements ActionListener {

    private FrameNuevoGrupoFamiliar frameNuevoGrupoFamiliar;

    public ControlFrameNuevoGrupoFamiliar(FrameNuevoEmpleado frameNuevoEmpleado) {
        frameNuevoGrupoFamiliar = new FrameNuevoGrupoFamiliar(frameNuevoEmpleado, true);
        frameNuevoGrupoFamiliar.setControlador(this);
        frameNuevoGrupoFamiliar.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevoGrupoFamiliar.BTN_AGREGAR)) {
            System.out.println("AGREGAR");
        }
        if (e.getActionCommand().equals(frameNuevoGrupoFamiliar.BTN_ACEPTAR)) {
            System.out.println("ACEPTAR");
        }
        if (e.getActionCommand().equals(frameNuevoGrupoFamiliar.BTN_CANCELAR)) {
            frameNuevoGrupoFamiliar.dispose();
        }

    }

}
