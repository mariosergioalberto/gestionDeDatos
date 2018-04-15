package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JTable;
import persistencia.Conector;
import persistencia.DBAuxiliares;
import persistencia.MySqlConexion;
import vistas.FrameMarcas;
import vistas.FrameNuevaMarca;

public class ControlFrameNuevaMarca implements ActionListener {

    private FrameNuevaMarca frameNuevaMarca;
    private DBAuxiliares dbAuxiliares;
    private ControlFrameMarcas controlFrameMarcas;
    private JTable tablaMarcas;

    public ControlFrameNuevaMarca(FrameMarcas frameMarcas,
            ControlFrameMarcas controlFrameMarcas, JTable tablaMarcas) {
        frameNuevaMarca = new FrameNuevaMarca(frameMarcas, true);
        frameNuevaMarca.setControlador(this);
        this.controlFrameMarcas = controlFrameMarcas;
        this.tablaMarcas = tablaMarcas;
        frameNuevaMarca.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevaMarca.BTN_AGREGAR)) {
            try {
                registarMarca();
                controlFrameMarcas.mostrarMarcasEnTabla(tablaMarcas);
                frameNuevaMarca.dispose();
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
        if (e.getActionCommand().equals(frameNuevaMarca.BTN_CANCELAR)) {
            frameNuevaMarca.dispose();
        }
    }

    public void registarMarca() throws SQLException, ClassNotFoundException {
        Conector con = new MySqlConexion();
        con.conectar();

        dbAuxiliares = new DBAuxiliares(con);
        dbAuxiliares.altaDeMarca(frameNuevaMarca.getTxtDescripcion());

        con.getConexion().close();
    }

}
