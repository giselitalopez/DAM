public class Hora {

    protected int hora;
    protected int minutos;
    private int segundos;

    // Constructor por defecto
    public Hora() {
        this.hora = 0;
        this.minutos = 0;
    }

    // Contructor parametrizado
    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

}