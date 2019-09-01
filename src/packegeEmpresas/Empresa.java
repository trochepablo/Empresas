package packegeEmpresas;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Empresa {
    private String nombre;
    private Integer cuit;
    private List < Empleado > empleados = new ArrayList<Empleado>();

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getCuit() {
        return cuit;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    // Monto total que debera desenbolar en concepto de pagos de sueldos a sus empleados =  total de sueldos netos
    public Float totalSueldosNetos(Empleado empleados){
        return (float) this.empleados.stream().mapToDouble (empleado -> empleado.sueldoNeto()).sum();
    }


}
