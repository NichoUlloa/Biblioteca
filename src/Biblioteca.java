import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private ArrayList<Libro> listaLibros;
    private String nombreBiblioteca;
    private String direccionBiblioteca;

    public Biblioteca(String nombreBiblioteca, String direccionBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccionBiblioteca = direccionBiblioteca;
        this.listaLibros = new ArrayList<Libro>();
    }

    public String getNombreBiblioteca() {
        return this.nombreBiblioteca;
    }

    public String getDireccionBiblioteca() {
        return this.direccionBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public void setDireccionBiblioteca(String direccionBiblioteca) {
        this.direccionBiblioteca = direccionBiblioteca;
    }

    public void agregarLibro(Libro libro) {
        if (!libroExiste(libro)) {
            this.listaLibros.add(libro);
        }
    }

    public Libro buscarLibro(String nombreLibro) {
        for (Libro libro : this.listaLibros) {
            if (libro.getNombre().equals(nombreLibro)) {
                return libro;
            }
        }
        return null;
    }
    public String obtenerLibroPorAutor(String autor) {
        for (Libro libro : this.listaLibros) {
            if (libro.getAutor().equals(autor)) {
                return libro.getNombre();
            }
        }
        return "No se encontro el libro";
    }

    public boolean libroExiste(Libro libro) {
        for (Libro l : listaLibros) {
            if(libro.getISBN().equals(l.getISBN())) {
                return true;
            }
        }

        return false;

    }
}
