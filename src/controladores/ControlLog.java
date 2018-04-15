package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.Conector;
import servicios.Validador;
import vistas.Log;

public class ControlLog implements ActionListener {

    private Log log;
    private Conector con;

    public ControlLog(Conector con) {
        this.log = new Log();
        log.ejecutar();
        log.setControlador(this);
        this.con = con;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(log.BTN_ENTRAR)) {
            Validador v = new Validador(con);
            boolean b = false;
            try {
                b = v.validarUsuario(log.getTxtUsuario(), log.getTxtPassword());
            } catch (Exception ex) {
                Logger.getLogger(ControlLog.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(b);
            if (b == true) {
                log.dispose();
                ControlMenuPrincipal controlMP = new ControlMenuPrincipal(this.con);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no valido.");
                log.limpiar();
            }

        }
        if (e.getActionCommand().equals(log.BTN_SALIR)) {
            System.exit(0);
        }
    }

}
