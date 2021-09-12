package EjercicioComposicion1;

public class Main {

    public static void main(String[] args) {

        /* creamos un objeto Examen con el constructor por defecto */
        Examen examen = new Examen();

        /* creamos dos objetos Fecha y Hora respectivamente */
        Fecha fecha = new Fecha(14, 9, 2021);
        Hora hora = new Hora(8, 30);

        /* establecemos con los métodos set() los valores de asignatura y el Grupo */
        examen.setAsignatura("Programación de Computadores II: Relacion de Composicion en Java");
        examen.setAula("02");

        /* Actualizamos la información del objeto Examen */
        examen = new Examen((examen.getAsignatura()), (examen.getAula()),
                fecha, hora);

        /* devuelve la información del objeto Examen creado */
        System.out.println(examen.toString());
    }
}
