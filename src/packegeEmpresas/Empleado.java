package packegeEmpresas;
import java.util.Date;

public abstract class Empleado {
    String nombre;
    String direccion;
    Boolean estadoCivil;
    Date fechaNacimiento;
    Float sueldoBasico;

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    //Constructor
    public Empleado(String nombre, String direccion, Boolean estadoCivil, Date fechaNacimiento, Float sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
    }

    // Protocolos  y Procedimientos
    public Date GetEdad() {
        return fechaNacimiento; //todo:calcular edad
    }
    public abstract Double getSueldoBruto();
    public abstract Double  getRetenciones();
    public abstract Double getSueldoNeto();

}