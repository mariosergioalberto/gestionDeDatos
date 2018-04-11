package systore;

import controladores.ControlLog;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import persistencia.Conexion;
import persistencia.MySqlConexion;
import servicios.Encript;

public class Systore {

    public static void main(String[] args) throws Exception {
        Conexion con = new MySqlConexion();
        try {
            con.conectar();
            ControlLog controlLog = new ControlLog();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en el Driver O Servidor","Mensaje de Error",JOptionPane.ERROR_MESSAGE);      
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error en el Driver O Servidor","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
        
        Encript e = new Encript();
        System.out.println("Sin encriptar: rodolfo28");
        byte[] cifrado = e.cifra("rodolfo28");
        System.out.println("Encriptado: " + cifrado);
        System.out.println("Desencriptado: " + e.descifra(cifrado));
    }
    
}
