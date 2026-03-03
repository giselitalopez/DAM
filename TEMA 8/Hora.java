package T8Herencias.Ejer1Horas;

public class Hora {
    
    protected int hora;
    protected int minuto;
    
    //constructor por defecto
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
    }
    //constructor parametrizado
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }


    public int getHora() {
        return hora;
    }
    public boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23){
            this.hora = hora;
            System.out.println("Hora asignada correctamente.");
            return true;
        }
        else{
            System.out.println("La hora no se ha asignado.");
            return false;
        }
    }
    public int getMinuto() {
        return minuto;
    }
    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            System.out.println("Minutos asignados correctamente.");
            this.minuto = minuto;
            return true;
        }
        else {
            System.out.println("Los minutos no se han asignado correctamente.");
            return false;
        }
    }

    public void inc(){
        this.minuto++;
        if (this.minuto>59){
            this.hora++;
            this.minuto = 0;
            if (this.hora > 23){
                this.hora = 0;
            }
        }
    }

    @Override
    public String toString(){
        return "Hora: " + this.hora + ":" + this.minuto;
    }

}
