package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoConcepto;
import vistas.MenuConceptos;

public class ControlFrameNuevoConcepto implements ActionListener {

    private FrameNuevoConcepto frameNuevoConcepto;

    public ControlFrameNuevoConcepto(MenuConceptos menuConceptos) {
        frameNuevoConcepto = new FrameNuevoConcepto(menuConceptos, true);
        frameNuevoConcepto.setControlador(this);
        frameNuevoConcepto.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevoConcepto.BTN_MESES)) {
            System.out.println("MESES");
        }
        if (e.getActionCommand().equals(frameNuevoConcepto.BTN_AGREGAR)) {
            System.out.println("AGREGAR");
        }
        if (e.getActionCommand().equals(frameNuevoConcepto.BTN_CANCELAR)) {
            frameNuevoConcepto.dispose();
        }
    }
}
