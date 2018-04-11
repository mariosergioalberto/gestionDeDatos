package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.FrameNuevoProveedor;
import vistas.MenuProveedores;

public class ControlFrameNuevoProveedor implements ActionListener {
    
    private FrameNuevoProveedor frameNuevoProveedor;
    
    public ControlFrameNuevoProveedor(MenuProveedores menuProveedores) {
        frameNuevoProveedor = new FrameNuevoProveedor(menuProveedores, true);
        frameNuevoProveedor.setControlador(this);
        frameNuevoProveedor.ejecutar();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevoProveedor.BTN_GUARDAR)) {
            System.out.println("GUARDAR");
        }
        if (e.getActionCommand().equals(frameNuevoProveedor.BTN_CANCELAR)) {
            frameNuevoProveedor.dispose();
        }
    }
    
}
