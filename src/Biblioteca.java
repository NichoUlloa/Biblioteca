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

    public ArrayList<Libro> getListaLibros() {
        return this.listaLibros;
    }

    public String getNombreBiblioteca() {
        return this.nombreBiblioteca;
    }

    public String getDireccionBiblioteca() {
        return this.direccionBiblioteca;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
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

    public List<Libro> obtenerLibroPorAutor(String autor) {
        List<Libro> libros = new ArrayList<Libro>();
        for (Libro libro : this.listaLibros) {
            if (libro.getAutor().equals(autor)) {
                libros.add(libro);
            }
        }
        return libros;
    }

    public boolean libroExiste(Libro libro) {
        for (Libro libroLista : listaLibros) {
            if(libro.getISBN().equals(libroLista.getISBN())) {
                return true;
            }
        }
        return false;
    }

    public Prestamo generarPrestamo(Bibliotecario bibliotecario, Usuario usuario, Libro libro, String fechaInicio, String fechaTermino) {
        Prestamo prestamo = new Prestamo(bibliotecario, usuario, libro, fechaInicio, fechaTermino);
        return prestamo;
    }
}
