public class Prestamo {
    private Bibliotecario bibliotecario;
    private Usuario usuario;
    private Libro libro;
    private String fechaInicio;
    private String fechaTermino;

    public Prestamo(Bibliotecario bibliotecario, Usuario usuario, Libro libro, String fechaInicio, String fechaTermino) {
        this.bibliotecario = bibliotecario;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public Bibliotecario getBibliotecario() {
        return this.bibliotecario;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public String getFechaTermino() {
        return this.fechaTermino;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
}
