
public class ProfesorMedioTiempo extends Profesor {

    public ProfesorMedioTiempo(String cedula, String nombres, String apellidos, int horasClase, String carrera) {
        super(cedula, nombres, apellidos, horasClase, carrera);
    }

    public static final int HORAS_SEMANALES = 20;

    public ProfesorMedioTiempo() {
        super.setHorasClase(10);
    }

    @Override
    public int horasComplementarias() {
        //horas semanales - horas clase
        return HORAS_SEMANALES - super.getHorasClase();
    }

    @Override
    public String toString() {
        return this.getCedula() + " - " + this.getNombres() + " " + this.getApellidos()+ " - " + this.getCarrera() + " - " + this.getHorasClase() + " -> Semi Exclusivo";
    }

}
