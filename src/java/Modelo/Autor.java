package Modelo;

public class Autor {
    private int idautor;
    private String nombre;
    private String f_nacimiento;

    public Autor() {
    }
    

    public Autor(int idautor, String nombre, String f_nacimiento) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
}
