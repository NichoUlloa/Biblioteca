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
}
