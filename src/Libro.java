public class Libro {

    private String Nombre;
    private String Autor;
    private String Editorial;

    public Libro(String Nombre, String Autor, String Editorial) {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Editorial = Editorial;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getAutor() {
        return this.Autor;
    }

    public String getEditorial() {
        return this.Editorial;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
}