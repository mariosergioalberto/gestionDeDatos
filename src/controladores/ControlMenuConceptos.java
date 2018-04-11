package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.MenuConceptos;
import vistas.MenuPrincipal;

public class ControlMenuConceptos implements ActionListener {

    private MenuConceptos menuConceptos;
    private ControlFrameNuevoConcepto controlFrameNuevoConcepto;

    public ControlMenuConceptos(MenuPrincipal menuPrincipal) {
        menuConceptos = new MenuConceptos(menuPrincipal, true);
        menuConceptos.setControlador(this);
        menuConceptos.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(menuConceptos.BTN_NUEVO)) {
            controlFrameNuevoConcepto = new ControlFrameNuevoConcepto(menuConceptos);
        }
        if (e.getActionCommand().equals(menuConceptos.BTN_MODIFICAR)) {
            System.out.println("MODIFICAR");
        }
        if (e.getActionCommand().equals(menuConceptos.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(menuConceptos.BTN_SALIR)) {
            menuConceptos.dispose();
        }
    }
}
