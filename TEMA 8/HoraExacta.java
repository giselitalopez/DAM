
public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta(int segundos) {
        this.segundos = segundos;
    }

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 && segundos > 59) {
            this.segundos = 0;
            System.out.println("Los segundos no se han asignado correctamente.");
        } else {
            this.segundos = segundos;
            System.out.println("Segundos asignados correctamente.");
        }
    }

    public void inc() {
        this.segundos++;
        if (this.segundos > 59) {
            this.segundos = 0;
            super.inc();
        }
    }

    public void mostrarHora() {
        System.out.println("Hora: " + this.hora + ":" + this.segundos);
    }

}
