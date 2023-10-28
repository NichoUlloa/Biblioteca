public class Bibliotecario {
    private String nombre;
    private String rut;
    private String direccion;
    private String id;

    public Bibliotecario(String nombre, String rut, String direccion, String id) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getRut() {
        return this.rut;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId(String id) {
        this.id = id;
    }

}
