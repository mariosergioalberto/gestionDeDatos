package persistencia;

public abstract class Entidad {
    private String nombre;
    private Conexion conexion;

    public Entidad(String nombre, Conexion conxion) {
        this.nombre = nombre;
        this.conexion = conxion;
    }

    public abstract void agregar();
    public abstract void eliminar();
    public abstract void modificar();
    public abstract boolean buscar();

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
}
