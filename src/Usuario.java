public class Usuario {
    private String nombre;
    private String rut;
    private String numeroTelefonico;

    public Usuario(String nombre, String rut, String numeroTelefonico) {
        this.nombre = nombre;
        this.rut = rut;
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getRut() {
        return this.rut;
    }
    public String getNumeroTelefonico() {
        return this.numeroTelefonico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
}
