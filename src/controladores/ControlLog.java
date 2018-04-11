package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.Log;

public class ControlLog implements ActionListener {
    
    private Log log;

    public ControlLog() {
        this.log = new Log();
        log.ejecutar();
        log.setControlador(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(log.BTN_ENTRAR)) {
            log.dispose();
            ControlMenuPrincipal controlMP = new ControlMenuPrincipal();
        }
        if (e.getActionCommand().equals(log.BTN_SALIR)) {
            System.exit(0);
        }
    }

}
