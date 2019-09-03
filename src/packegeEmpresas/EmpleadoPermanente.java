package packegeEmpresas;

import java.util.Date;

public class EmpleadoPermanente extends Empleado {
    private Integer antiguedad;
    private Integer cantidadHijos;

    //Getters & Setters
    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(Integer cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    //Constructor
    public EmpleadoPermanente(String nombre, String direccion, Boolean estaCasado,
                              Date fechaNacimiento, Double sueldoBasico, Integer antiguedad, Integer cantidadHijos) {
        super(nombre, direccion, estaCasado, fechaNacimiento, sueldoBasico);
        this.antiguedad = antiguedad;
        this.cantidadHijos = cantidadHijos;
    }

    //Method
    @Override
    public Double getSueldoBruto() {
        return (this.getSueldoBasico() + this.getSalarioFamilar() + this.getSalarioAntiguedad()); }

    @Override
    public Double getRetenciones() { return this.getRetencionesObraSocial() + this.getReportesAportesJubilatorio(); }

    private Double getReportesAportesJubilatorio() { return this.getSueldoBruto() % 15; }
    private Double getRetencionesObraSocial() { return (double) (this.getSueldoBruto() % 10) + (20 * this.getCantidadHijos()); }

    private Double getSalarioFamilar() {
            if (this.getEstaCasado()) {
                 return (double) (this.getCantidadHijos() * 150)  + 100);
            } else{
                return (double) (this.getCantidadHijos() * 150);
            }
    }
    private Double getSalarioAntiguedad(){
        return (double) (50 * this.getAntiguedad());
    }
    public Double getSueldoNeto(){return 1d;}

    // estoy haciendo un cambio

}