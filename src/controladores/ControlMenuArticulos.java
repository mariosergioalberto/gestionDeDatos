package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import persistencia.Conector;
import persistencia.DBArticulos;
import persistencia.MySqlConexion;
import vistas.MenuArticulos;
import vistas.MenuPrincipal;

public class ControlMenuArticulos implements ActionListener {

    private MenuArticulos menuArticulos;
    private ControlFrameNuevoArticulo controlFrameNuevoArticulo;
    private DBArticulos dbarticulos;

    public ControlMenuArticulos(MenuPrincipal menuPrincipal) throws SQLException, ClassNotFoundException {
        menuArticulos = new MenuArticulos(menuPrincipal, true);
        menuArticulos.setControlador(this);
        mostrarArticulosEnTabla(menuArticulos.getTablaArticulos());
        menuArticulos.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(menuArticulos.BTN_NUEVO)) {
            try {
                controlFrameNuevoArticulo = new ControlFrameNuevoArticulo(menuArticulos, this, menuArticulos.getTablaArticulos());
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
        if (e.getActionCommand().equals(menuArticulos.BTN_MODIFICAR)) {
            System.out.println("MODIFICAR");
        }
        if (e.getActionCommand().equals(menuArticulos.BTN_ELIMINAR)) {
            System.out.println("ELIMINAR");
        }
        if (e.getActionCommand().equals(menuArticulos.BTN_BUSCAR)) {
            System.out.println("BUSCAR");
        }
        if (e.getActionCommand().equals(menuArticulos.BTN_SALIR)) {
            menuArticulos.dispose();
        }
    }

    public void mostrarArticulosEnTabla(JTable tablaArticulos) throws SQLException, ClassNotFoundException {

        Conector con = new MySqlConexion();
        con.conectar();

        dbarticulos = new DBArticulos(con);

        DefaultTableModel modelo = new DefaultTableModel();

        String titulos[] = {"Codigo", "Descripción", "Marca", "Rubro",
            "Precio de venta", "Precio de compra", "Stock", "Stock minimo"};
        modelo.setColumnIdentifiers(titulos);
        tablaArticulos.setModel(modelo);
        String registro[] = new String[8];

        ResultSet articulos = dbarticulos.resultSetArticulos();

        while (articulos.next()) {
            registro[0] = String.valueOf(articulos.getInt("idArticulo"));
            registro[1] = articulos.getString("descripcion");
            registro[2] = dbarticulos.obtenerMarcaDelArticulo(articulos.getInt("Marca_idMarca"));
            registro[3] = dbarticulos.obtenerRubroDelArticulo(articulos.getInt("Rubro_idRubro"));
            registro[4] = String.valueOf(articulos.getFloat("precioUnitario"));
            registro[5] = String.valueOf(articulos.getFloat("costo"));
            registro[6] = String.valueOf(articulos.getInt("stock"));
            registro[7] = String.valueOf(articulos.getInt("stockMin"));
            modelo.addRow(registro);
        }
        con.getConexion().close();
    }
}
