package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import objetosDelDominio.Articulo;
import persistencia.Conector;
import persistencia.DBArticulos;
import persistencia.DBAuxiliares;
import persistencia.MySqlConexion;
import vistas.FrameNuevoArticulo;
import vistas.MenuArticulos;

public class ControlFrameNuevoArticulo implements ActionListener {

    private FrameNuevoArticulo frameNuevoArticulo;
    private ControlFrameMarcas controlFrameMarcas;
    private ControlFrameRubros controlFrameRubros;
    private DBAuxiliares dbAuxiliares;
    private DBArticulos dbArticulos;
    private ControlMenuArticulos controlMenuArticulos;
    private JTable tablaArticulos;

    public ControlFrameNuevoArticulo(MenuArticulos menuArticulos,
            ControlMenuArticulos controlMenuArticulos, JTable tablaArticulos) throws SQLException, ClassNotFoundException {
        frameNuevoArticulo = new FrameNuevoArticulo(menuArticulos, true);
        frameNuevoArticulo.setControlador(this);
        this.controlMenuArticulos = controlMenuArticulos;
        this.tablaArticulos = tablaArticulos;
        mostraElCodigoDelNuevoArticulo();
        llenarComboMarca(frameNuevoArticulo.getComboMarca());
        llenarComboRubro(frameNuevoArticulo.getComboRubro());
        frameNuevoArticulo.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(frameNuevoArticulo.BTN_NUEVO_RUBRO)) {
            try {
                controlFrameRubros = new ControlFrameRubros(frameNuevoArticulo, this, frameNuevoArticulo.getComboRubro());
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
        if (e.getActionCommand().equals(frameNuevoArticulo.BTN_NUEVA_MARCA)) {
            try {
                controlFrameMarcas = new ControlFrameMarcas(frameNuevoArticulo, this, frameNuevoArticulo.getComboMarca());
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
        if (e.getActionCommand().equals(frameNuevoArticulo.BTN_GUARDAR)) {
            try {
                registarElArticulo();
                frameNuevoArticulo.limpiarPantalla();
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
        if (e.getActionCommand().equals(frameNuevoArticulo.BTN_CANCELAR)) {
            frameNuevoArticulo.dispose();
            try {
                controlMenuArticulos.mostrarArticulosEnTabla(tablaArticulos);
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
    }

    public void mostraElCodigoDelNuevoArticulo() throws SQLException, ClassNotFoundException {
        Conector con = new MySqlConexion();
        con.conectar();

        dbArticulos = new DBArticulos(con);
        int intCodigo = dbArticulos.obtenerElUltimoIdArticulo() + 1;
        frameNuevoArticulo.setTxtCodigo(intCodigo + "");
    }

    public void llenarComboMarca(JComboBox<String> comboMarcas) throws SQLException, ClassNotFoundException {

        Conector con = new MySqlConexion();
        con.conectar();

        dbAuxiliares = new DBAuxiliares(con);

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

        modeloCombo.addElement("Seleccione una marca");//es el primer registro q mostrara el combo
        comboMarcas.setModel(modeloCombo);//con esto lo agregamos el modelo al jcombobox

        ResultSet marcas = dbAuxiliares.resultSetMarcas();

        while (marcas.next()) {
            modeloCombo.addElement(marcas.getObject("descripcion"));
            comboMarcas.setModel(modeloCombo);
        }
        con.getConexion().close();
    }

    public void llenarComboRubro(JComboBox<String> comboRubro) throws SQLException, ClassNotFoundException {

        Conector con = new MySqlConexion();
        con.conectar();

        dbAuxiliares = new DBAuxiliares(con);

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

        modeloCombo.addElement("Seleccione un rubro");//es el primer registro q mostrara el combo
        comboRubro.setModel(modeloCombo);//con esto lo agregamos el modelo al jcombobox

        ResultSet rubros = dbAuxiliares.resultSetRubros();

        while (rubros.next()) {
            modeloCombo.addElement(rubros.getObject("descripcion"));
            comboRubro.setModel(modeloCombo);
        }
        con.getConexion().close();
    }

    public void registarElArticulo() throws SQLException, ClassNotFoundException {
        Conector con = new MySqlConexion();
        con.conectar();

        dbAuxiliares = new DBAuxiliares(con);

        Articulo articulo = new Articulo(frameNuevoArticulo.getTxtCodigo(),
                frameNuevoArticulo.getTxtDescripcion(),
                frameNuevoArticulo.getTxtPrecio(),
                frameNuevoArticulo.getTxtCosto(), frameNuevoArticulo.getTxtStock1(),
                frameNuevoArticulo.getTxtStockMin1(),
                dbArticulos.buscarRubroPorDescripcion(frameNuevoArticulo.getRubroSeleccionado()),
                dbArticulos.buscarMarcaPorDescripcion(frameNuevoArticulo.getMarcaSeleccionada()));

        dbArticulos.altaDeAriculo(articulo);
        con.getConexion().close();
    }
}
