package T8Herencias.Ejer1Horas;

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
        if(segundos < 0 && segundos > 59){
            this.segundos = 0;
            System.out.println("Los segundos no se han asignado correctamente.");
        }
        else {
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

    @Override
    public String toString(){
        return "Hora: " + this.hora + ":" + this.minuto + ":" + this.segundos;
    }

}
