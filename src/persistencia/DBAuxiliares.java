package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBAuxiliares {

    private Conector con;

    public DBAuxiliares(Conector con) {
        this.con = con;
    }

    public ResultSet resultSetMarcas() {
        ResultSet marcas = null;
        try {
            String url = "SELECT * FROM marca";
            Statement consulta = con.getConexion().createStatement();
            marcas = consulta.executeQuery(url);
            return marcas;
        } catch (SQLException ex) {
            Logger.getLogger(DBAuxiliares.class.getName()).log(Level.SEVERE, null, ex);
        }
        return marcas;
    }

    public ResultSet resultSetRubros() {
        ResultSet rubros = null;
        try {
            String url = "SELECT * FROM rubro";
            Statement consulta = con.getConexion().createStatement();
            rubros = consulta.executeQuery(url);
            return rubros;
        } catch (SQLException ex) {
            Logger.getLogger(DBAuxiliares.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rubros;
    }

    public void altaDeMarca(String descripcionMarca) {
        try {
            String table = "INSERT INTO `marca`(`idMarca`, `descripcion`) ";
            String datos = "VALUES (NULL,'" + descripcionMarca + "')";

            PreparedStatement st = con.getConexion().prepareStatement(table + datos);
            st.execute();
        } catch (SQLException ex) {
            System.out.println("Error al agregar el registro.");
        }
    }

    public void altaDeRubro(String descripcionRubro) {
        try {
            String table = "INSERT INTO `rubro`(`idRubro`, `descripcion`) ";
            String datos = "VALUES (NULL,'" + descripcionRubro + "')";

            PreparedStatement st = con.getConexion().prepareStatement(table + datos);
            st.execute();
        } catch (SQLException ex) {
            System.out.println("Error al agregar el registro.");
        }
    }

    public void bajaDeMarca(String descripcionMarca) {
        try {
//            PreparedStatement st = con.getConexion().prepareStatement("DELETE FROM `marca` WHERE descripcion='" + descripcionMarca + "'");
//            st.execute();
            Statement consulta = con.getConexion().createStatement();
            consulta.executeQuery("DELETE FROM `marca` WHERE descripcion='" + descripcionMarca + "'");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el registro.");
        }
    }

    public void bajaDeRubro(String descripcionRubro) {
        try {
            
//            PreparedStatement st = con.getConexion().prepareStatement("DELETE FROM `rubro` WHERE descripcion='" + descripcionRubro + "'");
//            st.executeUpdate();
            con.getConexion().createStatement().execute("DELETE FROM `rubro` WHERE descripcion='" + descripcionRubro + "'");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el registro.");
        }
    }

}
