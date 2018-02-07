
public class ProfesorTiempoCompleto extends Profesor {

    public ProfesorTiempoCompleto(String cedula, String nombres, String apellidos, int horasClase, String carrera) {
        super(cedula, nombres, apellidos, horasClase, carrera);
    }

    public static final int HORAS_SEMANALES = 40;

    @Override
    public int horasComplementarias() {
        //horas semanales - horas clase
        return HORAS_SEMANALES - this.getHorasClase();
    }
@Override
    public String toString() {
        return this.getCedula() + " - " + this.getNombres() + " " + this.getApellidos()+ " - " + this.getCarrera() + " - " + this.getHorasClase() + " -> Exclusivo";
    }
}
