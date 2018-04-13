package persistencia;

public abstract class Entidad {
    private String nombre;
    private Conector conexion;

    public Entidad(String nombre, Conector conxion) {
        this.nombre = nombre;
        this.conexion = conxion;
    }

    public abstract void agregar();
    public abstract void eliminar();
    public abstract void modificar();
    public abstract boolean buscar();

    public Conector getConexion() {
        return conexion;
    }

    public void setConexion(Conector conexion) {
        this.conexion = conexion;
    }
}
