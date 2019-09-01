package packegeEmpresas;
import java.util.Date;

public class EmpleadoTemporario extends Empleado {
    Date fechaFinDesignacionPlantaTemp;
    Integer horasExtra;

    //Getters and Setters
    public Date getFechaFinDesignacionPlantaTemp() {
        return fechaFinDesignacionPlantaTemp;
    }

    public void setFechaFinDesignacionPlantaTemp(Date fechaFinDesignacionPlantaTemp) {
        this.fechaFinDesignacionPlantaTemp = fechaFinDesignacionPlantaTemp;
    }

    public Integer getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(Integer horasExtra) {
        this.horasExtra = horasExtra;
    }

    //Constructores
    public EmpleadoTemporario(String nombre, String direccion, Boolean estadoCivil,
                              Date fechaNacimiento, Float sueldoBasica, Date fechaFinDesignacionPlantaTemp,
                              Integer horasExtra) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasica);
        this.fechaFinDesignacionPlantaTemp = fechaFinDesignacionPlantaTemp;
        this.horasExtra = horasExtra;
    }

    //Method
    @Override
    public Double getSueldoBruto() {
        return (double) ((this.getSueldoBasico() + 40) * this.getHorasExtra());
    }
    @Override
    public Double getRetenciones(){
        return 0d;
    }
    public Double getSueldoNeto(){
        return 1d;
    }

}