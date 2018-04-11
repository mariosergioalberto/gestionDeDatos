package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameIngresoDeMercaderia;
import vistas.MenuPrincipal;

public class ControlFrameIngresoDeMercaderia implements ActionListener {
    
    private FrameIngresoDeMercaderia frameIngresoDeMercaderia;
    
    public ControlFrameIngresoDeMercaderia(MenuPrincipal menuPrincipal) {
        frameIngresoDeMercaderia = new FrameIngresoDeMercaderia(menuPrincipal, true);
        frameIngresoDeMercaderia.setControlador(this);
        frameIngresoDeMercaderia.ejecutar();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameIngresoDeMercaderia.BTN_ACEPTAR)) {
            System.out.println("ACEPTAR");
        }
        if (e.getActionCommand().equals(frameIngresoDeMercaderia.BTN_SALIR)) {
            frameIngresoDeMercaderia.dispose();
        }
    }   
}
