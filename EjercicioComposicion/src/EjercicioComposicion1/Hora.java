package EjercicioComposicion1;

public class Hora {

    private int hora;
    private int minuto;

    /* Constructor por defecto */
    public Hora() {
    }

    /* Constructor */
    public Hora(int hora, int minuto) {
        this.setHora(hora);
        this.setMinuto(minuto);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "Hora=" + this.hora + ", Minuto=" + this.minuto + " Am";
    }
}
