package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.MenuPrincipal;
import vistas.MenuUsuarios;

public class ControlMenuUsuarios implements ActionListener {

    private MenuUsuarios menuUsuarios;
    private ControlFrameNuevoUsuario controlFrameNuevoUsuario;

    public ControlMenuUsuarios(MenuPrincipal menuPrincipal) {
        menuUsuarios = new MenuUsuarios(menuPrincipal, true);
        menuUsuarios.setControlador(this);
        menuUsuarios.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(menuUsuarios.BTN_NUEVO)) {
            controlFrameNuevoUsuario = new ControlFrameNuevoUsuario(menuUsuarios);
        }
        if (e.getActionCommand().equals(menuUsuarios.BTN_MODIFICAR)) {
            System.out.println("MODIFICAR");
        }
        if (e.getActionCommand().equals(menuUsuarios.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(menuUsuarios.BTN_SALIR)) {
            menuUsuarios.dispose();
        }
    }

}
