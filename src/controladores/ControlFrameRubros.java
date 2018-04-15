package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import persistencia.Conector;
import persistencia.DBAuxiliares;
import persistencia.MySqlConexion;
import vistas.FrameNuevoArticulo;
import vistas.FrameRubros;
import vistas.MenuPrincipal;

public class ControlFrameRubros implements ActionListener {

    private FrameRubros frameRubros;
    private DBAuxiliares dbAuxiliares;
    private ControlFrameNuevoRubro controlFrameNuevoRubro;
    private ControlFrameNuevoArticulo controlFrameNuevoArticulo;
    private JComboBox comboRubros;

    public ControlFrameRubros(MenuPrincipal menuPrincipal) throws SQLException, ClassNotFoundException {
        frameRubros = new FrameRubros(menuPrincipal, true);
        frameRubros.setControlador(this);
        mostrarRubrosEnTabla(frameRubros.getTablaRubros());
        frameRubros.ejecutar();
    }

    ControlFrameRubros(FrameNuevoArticulo frameNuevoArticulo,
            ControlFrameNuevoArticulo controlFrameNuevoArticulo, JComboBox comboRubros) throws SQLException, ClassNotFoundException {
        frameRubros = new FrameRubros(frameNuevoArticulo, true);
        frameRubros.setControlador(this);
        this.controlFrameNuevoArticulo = controlFrameNuevoArticulo;
        this.comboRubros = comboRubros;
        mostrarRubrosEnTabla(frameRubros.getTablaRubros());
        frameRubros.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameRubros.BTN_NUEVO)) {
            controlFrameNuevoRubro = new ControlFrameNuevoRubro(frameRubros, this, frameRubros.getTablaRubros());
        }
        if (e.getActionCommand().equals(frameRubros.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(frameRubros.BTN_SALIR)) {
            frameRubros.dispose();
            try {
                controlFrameNuevoArticulo.llenarComboRubro(comboRubros);
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
    }

    public void mostrarRubrosEnTabla(JTable tablaRubros) throws SQLException, ClassNotFoundException {

        Conector con = new MySqlConexion();
        con.conectar();

        dbAuxiliares = new DBAuxiliares(con);

        DefaultTableModel modelo = new DefaultTableModel();

        String titulos[] = {"Rubro"};
        modelo.setColumnIdentifiers(titulos);
        tablaRubros.setModel(modelo);
        String registro[] = new String[1];

        ResultSet rubros = dbAuxiliares.resultSetRubros();

        while (rubros.next()) {
            registro[0] = rubros.getString("descripcion");
            modelo.addRow(registro);
        }
        con.getConexion().close();
    }

}
