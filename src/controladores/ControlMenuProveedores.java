package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.MenuPrincipal;
import vistas.MenuProveedores;

public class ControlMenuProveedores implements ActionListener {

    private MenuProveedores menuProveedores;
    private ControlFrameNuevoProveedor controlFrameNuevoProveedor;
    
    public ControlMenuProveedores(MenuPrincipal menuPrincipal) {
        menuProveedores = new MenuProveedores(menuPrincipal, true);
        menuProveedores.setControlador(this);
        menuProveedores.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(menuProveedores.BTN_NUEVO)) {
            controlFrameNuevoProveedor = new ControlFrameNuevoProveedor(menuProveedores);
        }
        if (e.getActionCommand().equals(menuProveedores.BTN_MODIFICAR)) {
            System.out.println("MODIFICAR");
        }
        if (e.getActionCommand().equals(menuProveedores.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(menuProveedores.BTN_BUSCAR)) {
            System.out.println("BUSCAR");
        }
        if (e.getActionCommand().equals(menuProveedores.BTN_SALIR)) {
            menuProveedores.dispose();
        }
    }

}
