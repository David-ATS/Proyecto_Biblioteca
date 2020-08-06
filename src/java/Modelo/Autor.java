package Modelo;

public class Autor {
    private int idautor;
    private String nombres;
    private String apellidos;
    private String f_nacimiento;
    private String país;
    private String estado;

    public Autor() {
    }

    public Autor(int idautor, String nombres, String apellidos, String f_nacimiento, String país, String estado) {
        this.idautor = idautor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.f_nacimiento = f_nacimiento;
        this.país = país;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

}
