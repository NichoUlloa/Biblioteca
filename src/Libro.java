public class Libro {

    private String Nombre;
    private String Autor;
    private String Editorial;
    private String ISBN;

    public Libro(String Nombre, String Autor, String Editorial, String ISBN) {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.ISBN = ISBN;

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

    public String getISBN() {
        return this.ISBN;
    }


    public String toString() {
        return "Nombre: " + this.Nombre + " Autor: " + this.Autor + " Editorial: " + this.Editorial;
    }

}