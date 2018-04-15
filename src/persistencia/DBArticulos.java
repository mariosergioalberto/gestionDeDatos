package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetosDelDominio.Articulo;

public class DBArticulos {

    private Conector con;

    public DBArticulos(Conector con) {
        this.con = con;
    }

    public ResultSet resultSetArticulos() {
        ResultSet articulos = null;
        try {
            PreparedStatement st = con.getConexion().prepareStatement("SELECT * FROM articulo");
            articulos = st.executeQuery();
            return articulos;
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return articulos;
    }

    public String obtenerRubroDelArticulo(int idRubro) {
        String rubro = "";
        ResultSet rs = null;
        try {
            Statement consulta = con.getConexion().createStatement();
            rs = consulta.executeQuery("SELECT * FROM rubro WHERE idRubro='" + idRubro + "'");
            while (rs.next()) {
                rubro = rs.getString("descripcion");
            }
            return rubro;
        } catch (SQLException ex) {
            System.out.println("Error al buscar el registro.");
        }
        return rubro;
    }

    public String obtenerMarcaDelArticulo(int idMarca) {
        String marca = "";
        ResultSet rs = null;
        try {
            Statement consulta = con.getConexion().createStatement();
            rs = consulta.executeQuery("SELECT * FROM marca WHERE idMarca='" + idMarca + "'");
            while (rs.next()) {
                marca = rs.getString("descripcion");
            }
            return marca;
        } catch (SQLException ex) {
            System.out.println("Error al buscar el registro.");
        }
        return marca;
    }

    public int obtenerElUltimoIdArticulo() throws SQLException {
        int idArticulo = 0;
        Statement consulta = con.getConexion().createStatement();
        ResultSet rs = consulta.executeQuery("SELECT MAX(idArticulo) AS id FROM articulo");
        while (rs.next()) {
            idArticulo = rs.getInt("id");
        }
        return idArticulo;
    }

    public int buscarRubroPorDescripcion(String rubroDescripcion) throws SQLException {
        int idRubro = 0;
        ResultSet rs = null;

        Statement consulta = con.getConexion().createStatement();
        rs = consulta.executeQuery("SELECT * FROM rubro WHERE descripcion='" + rubroDescripcion + "'");
        while (rs.next()) {
            idRubro = rs.getInt("idRubro");
            return idRubro;
        }
        return 0;

    }

    public int buscarMarcaPorDescripcion(String marcaDescripcion) throws SQLException {
        int idMarca = 0;
        ResultSet rs = null;

        Statement consulta = con.getConexion().createStatement();
        rs = consulta.executeQuery("SELECT * FROM marca WHERE descripcion='" + marcaDescripcion + "'");
        while (rs.next()) {
            idMarca = rs.getInt("idMarca");
            return idMarca;
        }
        return 0;
    }

    public void altaDeAriculo(Articulo art) {
        try {
            String table = "INSERT INTO `articulo` "
                    + "(`idArticulo`, "
                    + "`descripcion`, "
                    + "`precioUnitario`, "
                    + "`costo`, "
                    + "`stock`, "
                    + "`stockMin`, "
                    + "`Rubro_idRubro`, "
                    + "`Marca_idMarca`) ";

            String datos = "VALUES (NULL, "
                    + " '" + art.getDescripcion() + "',"
                    + " '" + art.getPrecioUnitario() + "',"
                    + " '" + art.getCosto() + "',"
                    + " '" + art.getStock() + "',"
                    + " '" + art.getStockMin() + "',"
                    + " '" + art.getRubro() + "',"
                    + " '" + art.getRubro() + "')";
            PreparedStatement st = con.getConexion().prepareStatement(table + datos);
            st.execute();

            JOptionPane.showMessageDialog(null, "Articulo agregado.");
        } catch (SQLException ex) {
            System.out.println("Error al agregar el registro.");
        }
    }

    public void bajaDeArticulo(int idArticulo) {
    }

    public void modificarArticulo(Articulo art) {
    }

    public static void actualizarTablaArticulos() throws SQLException, ClassNotFoundException {
    }
}
