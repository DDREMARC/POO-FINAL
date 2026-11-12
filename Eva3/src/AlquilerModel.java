public class AlquilerModel {
    private int dni;
    private String nombre;
    private String telefono;

    public AlquilerModel(String telefono, String nombre, int dni) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
