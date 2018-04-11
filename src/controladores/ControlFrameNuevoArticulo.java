package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoArticulo;
import vistas.MenuArticulos;

public class ControlFrameNuevoArticulo implements ActionListener {

    private FrameNuevoArticulo frameNuevoArticulo;
    private ControlFrameMarcas controlFrameMarcas;
    private ControlFrameRubros controlFrameRubros;
    
    public ControlFrameNuevoArticulo(MenuArticulos menuArticulos) {
        frameNuevoArticulo = new FrameNuevoArticulo(menuArticulos, true);
        frameNuevoArticulo.setControlador(this);
        frameNuevoArticulo.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(frameNuevoArticulo.BTN_NUEVO_RUBRO)){
            controlFrameRubros = new ControlFrameRubros(frameNuevoArticulo);
        }
        if(e.getActionCommand().equals(frameNuevoArticulo.BTN_NUEVA_MARCA)){
            controlFrameMarcas = new ControlFrameMarcas(frameNuevoArticulo);
        }
        if(e.getActionCommand().equals(frameNuevoArticulo.BTN_GUARDAR)){
            System.out.println("GUARDAR");
        }
        if(e.getActionCommand().equals(frameNuevoArticulo.BTN_CANCELAR)){
            frameNuevoArticulo.dispose();
        }
    }
}
