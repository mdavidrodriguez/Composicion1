package EjercicioComposicion1;

public class Examen {

    /* Atributos privados */
    private String asignatura;
    private String aula;
    private Fecha fecha;
    private Hora hora;

    // Constructor
    public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {

        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    /* constructor por defecto */
    public Examen() {
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Examen: \nAsignatura=" + asignatura + "\n" + "Grupo=" + aula
                + "\n" + fecha.toString() + hora.toString() + "";
    }
}
