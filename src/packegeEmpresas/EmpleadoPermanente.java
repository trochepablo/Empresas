package packegeEmpresas;

public class EmpleadoPermanente extends Empleado {
    Integer antiguedad;
    Integer cantidadHijos;

    @Override
    public Float sueldoBruto() { return (this.sueldoBasica + SalarioFamiliar() + SalarioAntiguedad()); }
    @Override
    public Float retenciones() { return RetObraSocial() + RetAporteJubilatorio(); }

    private Float RetAporteJubilatorio() { return sueldoBruto() % 15; }
    private Float RetObraSocial() { return (sueldoBruto() % 10) + 20 * cantidadHijos; }
    private Float SalarioAntiguedad() {
        return (float) (50 * antiguedad);
    }
    private Float SalarioFamiliar(){
        return (float) (150 * cantidadHijos + (this.estadoCivil ? 100 : 0));
    }

    public Float sueldoNeto(){
        return 1f;
    }
}