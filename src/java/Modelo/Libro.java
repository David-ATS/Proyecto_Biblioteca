package Modelo;

public class Libro {
    private int idlibro;
    private String nombre;
    private String autor;
    private String genero;
    private int cantidad_vendidos;
    private String estado;

    public Libro() {
    }

    public Libro(int idlibro, String nombre, String autor, String genero, int cantidad_vendidos, String estado) {
        this.idlibro = idlibro;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.cantidad_vendidos = cantidad_vendidos;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidad_vendidos() {
        return cantidad_vendidos;
    }

    public void setCantidad_vendidos(int cantidad_vendidos) {
        this.cantidad_vendidos = cantidad_vendidos;
    }

    
      
}
