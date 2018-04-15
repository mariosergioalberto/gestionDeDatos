package servicios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import persistencia.Conector;

public class Validador {
    
    private Conector con;

    public Validador(Conector con) {
        this.con = con;
    }

    public boolean validarUsuario(String user, String pass) throws Exception {
        try {
            String url = "SELECT * FROM usuario WHERE user='" + user + "'";
            Statement consulta = con.getConexion().createStatement();
            ResultSet registro = consulta.executeQuery(url);
            if (registro.next() == true) {
                if (registro.getString("user").equals(user)) {
                    String passDes = StringEncrypt.decrypt(StringEncrypt.getKey(), StringEncrypt.getiv(), registro.getString("pass"));
                    if (passDes.equals(pass)) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al verificar el usuario.");
        }
        return false;
    }
}
