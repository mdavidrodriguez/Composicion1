package EjercicioComposicion1;

public class Fecha {

    /* Atributos privados */
    private int dia;
    private int mes;
    private int año;

    /* Constructor */
    public Fecha(int dia, int mes, int año) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAño(año);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Fecha Dia=" + dia + ", Mes=" + mes + ", Año=" + año + "\n";
    }
}
