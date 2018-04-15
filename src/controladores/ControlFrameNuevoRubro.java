package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JTable;
import persistencia.Conector;
import persistencia.DBAuxiliares;
import persistencia.MySqlConexion;
import vistas.FrameNuevoRubro;
import vistas.FrameRubros;

public class ControlFrameNuevoRubro implements ActionListener {

    private FrameNuevoRubro frameNuevoRubro;
    private DBAuxiliares dbAuxiliares;
    private ControlFrameRubros controlFrameRubros;
    private JTable tablaRubros;

    public ControlFrameNuevoRubro(FrameRubros frameRubros,
            ControlFrameRubros controlFrameRubros, JTable tablaRubros) {
        frameNuevoRubro = new FrameNuevoRubro(frameRubros, true);
        frameNuevoRubro.setControlador(this);
        this.frameNuevoRubro = frameNuevoRubro;
        this.controlFrameRubros = controlFrameRubros;
        this.tablaRubros = tablaRubros;
        frameNuevoRubro.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevoRubro.BTN_AGREGAR)) {
            try {
                registarRubro();
                controlFrameRubros.mostrarRubrosEnTabla(tablaRubros);
                frameNuevoRubro.dispose();
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
        if (e.getActionCommand().equals(frameNuevoRubro.BTN_CANCELAR)) {
            frameNuevoRubro.dispose();
        }
    }

    public void registarRubro() throws SQLException, ClassNotFoundException {
        Conector con = new MySqlConexion();
        con.conectar();

        dbAuxiliares = new DBAuxiliares(con);
        dbAuxiliares.altaDeRubro(frameNuevoRubro.getTxtDescripcion());

        con.getConexion().close();
    }

}
