package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameConsultarVentas;
import vistas.MenuPrincipal;

public class ControlFrameConsultarVentas implements ActionListener {

    private FrameConsultarVentas frameConsultarVentas;

    public ControlFrameConsultarVentas(MenuPrincipal menuPrincipal) {
        frameConsultarVentas = new FrameConsultarVentas(menuPrincipal, true);
        frameConsultarVentas.setControlador(this);
        frameConsultarVentas.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameConsultarVentas.BTN_ANULAR)) {
            System.out.println("ANULAR");
        }
        if (e.getActionCommand().equals(frameConsultarVentas.BTN_BUSCAR_NRO)) {
            System.out.println("BUSCAR POR NRO DE FACTURA");
        }
        if (e.getActionCommand().equals(frameConsultarVentas.BTN_BUSCAR_FECHA)) {
            System.out.println("BUSCAR POR FECHA");
        }
        if (e.getActionCommand().equals(frameConsultarVentas.BTN_BUSCAR_VENDEDOR)) {
            System.out.println("BUSCAR POR VENDEDOR");
        }
        if (e.getActionCommand().equals(frameConsultarVentas.BTN_SALIR)) {
            frameConsultarVentas.dispose();
        }
    }

}
