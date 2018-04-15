package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import persistencia.Conector;
import persistencia.DBAuxiliares;
import persistencia.MySqlConexion;
import vistas.FrameMarcas;
import vistas.FrameNuevoArticulo;
import vistas.MenuPrincipal;

public class ControlFrameMarcas implements ActionListener {

    private FrameMarcas frameMarcas;
    private DBAuxiliares dbAuxiliares;
    private ControlFrameNuevaMarca controlFrameNuevaMarca;
    private ControlFrameNuevoArticulo controlFrameNuevoArticulo;
    private JComboBox comboMarcas;

    public ControlFrameMarcas(MenuPrincipal menuPrincipal) throws SQLException, ClassNotFoundException {
        frameMarcas = new FrameMarcas(menuPrincipal, true);
        frameMarcas.setControlador(this);
        mostrarMarcasEnTabla(frameMarcas.getTablaMarcas());
        frameMarcas.ejecutar();
    }

    ControlFrameMarcas(FrameNuevoArticulo frameNuevoArticulo,
            ControlFrameNuevoArticulo controlFrameNuevoArticulo, JComboBox comboMarcas) throws SQLException, ClassNotFoundException {
        frameMarcas = new FrameMarcas(frameNuevoArticulo, true);
        frameMarcas.setControlador(this);
        this.controlFrameNuevoArticulo = controlFrameNuevoArticulo;
        this.comboMarcas = comboMarcas;
        mostrarMarcasEnTabla(frameMarcas.getTablaMarcas());
        frameMarcas.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameMarcas.BTN_NUEVO)) {
            controlFrameNuevaMarca = new ControlFrameNuevaMarca(frameMarcas, this, frameMarcas.getTablaMarcas());
        }
        if (e.getActionCommand().equals(frameMarcas.BTN_ELIMINAR)) {
            int i = frameMarcas.getTablaMarcas().getSelectedRow();
            if (i > -1) {
                String marca = (String) frameMarcas.getTablaMarcas().getModel().getValueAt(i, 0);
                JOptionPane.showMessageDialog(null, "SELECCIONASTE LA MARCA: " + marca);
                int op = JOptionPane.showConfirmDialog(null, "Esta seguro de borrar la marca " + marca + "?");
                if (op == 0) {
                    try {
                        dbAuxiliares.bajaDeMarca(marca);
                        mostrarMarcasEnTabla(frameMarcas.getTablaMarcas());
                    } catch (SQLException ex) {
                    } catch (ClassNotFoundException ex) {
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una marca", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getActionCommand().equals(frameMarcas.BTN_SALIR)) {
            frameMarcas.dispose();
            try {
                controlFrameNuevoArticulo.llenarComboMarca(comboMarcas);
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
    }

    public void mostrarMarcasEnTabla(JTable tablaMarcas) throws SQLException, ClassNotFoundException {

        Conector con = new MySqlConexion();
        con.conectar();

        dbAuxiliares = new DBAuxiliares(con);

        DefaultTableModel modelo = new DefaultTableModel();

        String titulos[] = {"Marca"};
        modelo.setColumnIdentifiers(titulos);
        tablaMarcas.setModel(modelo);
        String registro[] = new String[1];

        ResultSet marcas = dbAuxiliares.resultSetMarcas();

        while (marcas.next()) {
            registro[0] = marcas.getString("descripcion");
            modelo.addRow(registro);
        }

        con.getConexion().close();
    }

}
