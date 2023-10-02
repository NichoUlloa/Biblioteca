import java.util.ArrayList;
import java.util.List;
public class Biblioteca {

    private ArrayList<Libro> libros;
    private String nombreBiblioteca;
    private String direccionBiblioteca;

    public Biblioteca(String nombreBiblioteca, String direccionBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccionBiblioteca = direccionBiblioteca;
        this.libros = new ArrayList<Libro>();
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

    public ArrayList<Libro>getLibros() {
        return this.libros;
    }
}
