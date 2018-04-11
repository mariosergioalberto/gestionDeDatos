package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.MenuClientes;
import vistas.MenuPrincipal;

public class ControlMenuClientes implements ActionListener {

    private MenuClientes menuClientes;
    private ControlFrameNuevoCliente controlFrameNuevoCliente;

    public ControlMenuClientes(MenuPrincipal menuPrincipal) {
        menuClientes = new MenuClientes(menuPrincipal, true);
        menuClientes.setControlador(this);
        menuClientes.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(menuClientes.BTN_NUEVO)) {
            controlFrameNuevoCliente = new ControlFrameNuevoCliente(menuClientes);
        }
        if (e.getActionCommand().equals(menuClientes.BTN_MODIFICAR)) {
            System.out.println("MODIFICAR");
        }
        if (e.getActionCommand().equals(menuClientes.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(menuClientes.BTN_BUSCAR)) {
            System.out.println("BUSCAR");
        }
        if (e.getActionCommand().equals(menuClientes.BTN_SALIR)) {
            menuClientes.dispose();
        }
    }

}
