package systore;

import controladores.ControlLog;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import persistencia.Conector;
import persistencia.MySqlConexion;

public class Systore {

    public static void main(String[] args) throws Exception {
        Conector con = new MySqlConexion();
        try {
            con.conectar();
            ControlLog controlLog = new ControlLog(con);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el Driver O Servidor 1", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en el Driver O Servidor 2", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
        
        JOptionPane.showMessageDialog(null, "Prueba de mi repositorio", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
       
    }

 
}
