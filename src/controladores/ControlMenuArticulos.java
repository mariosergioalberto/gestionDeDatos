package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.MenuArticulos;
import vistas.MenuPrincipal;

public class ControlMenuArticulos implements ActionListener {

    private MenuArticulos menuArticulos;
    private ControlFrameNuevoArticulo controlFrameNuevoArticulo;

    public ControlMenuArticulos(MenuPrincipal menuPrincipal) {
        menuArticulos = new MenuArticulos(menuPrincipal, true);
        menuArticulos.setControlador(this);
        menuArticulos.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(menuArticulos.BTN_NUEVO)) {
            controlFrameNuevoArticulo = new ControlFrameNuevoArticulo(menuArticulos);
        }
        if (e.getActionCommand().equals(menuArticulos.BTN_MODIFICAR)) {
            System.out.println("MODIFICAR");
        }
        if (e.getActionCommand().equals(menuArticulos.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(menuArticulos.BTN_BUSCAR)) {
            System.out.println("BUSCAR");
        }
        if (e.getActionCommand().equals(menuArticulos.BTN_SALIR)) {
            menuArticulos.dispose();
        }
    }

}
