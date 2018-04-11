package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.MenuEmpleados;
import vistas.MenuPrincipal;

public class ControlMenuEmpleados implements ActionListener {

    private MenuEmpleados menuEmpleados;
    private ControlFrameNuevoEmpleado controlFrameNuevoEmpleado;

    public ControlMenuEmpleados(MenuPrincipal menuPrincipal) {
        menuEmpleados = new MenuEmpleados(menuPrincipal, true);
        menuEmpleados.setControlador(this);
        menuEmpleados.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(menuEmpleados.BTN_NUEVO)) {
            controlFrameNuevoEmpleado = new ControlFrameNuevoEmpleado(menuEmpleados);
        }
        if (e.getActionCommand().equals(menuEmpleados.BTN_MODIFICAR)) {
            System.out.println("MODIFICAR");
        }
        if (e.getActionCommand().equals(menuEmpleados.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(menuEmpleados.BTN_BUSCAR)) {
            System.out.println("BUSCAR");
        }
        if (e.getActionCommand().equals(menuEmpleados.BTN_VER)) {
            System.out.println("VER");
        }
        if (e.getActionCommand().equals(menuEmpleados.BTN_SALIR)) {
            menuEmpleados.dispose();
        }
    }

}
