public class RadioDespertador extends SintonizadorFM {

    private String alarma;
    private boolean alarmaONOFF;

    public RadioDespertador() {
        this.alarma = "00:00";
        this.alarmaONOFF = false;

    }

    public RadioDespertador(String alarma, boolean alarmaONOFF) {
        setAlarma(alarma);
        this.alarmaONOFF = alarmaONOFF;
    }

    public RadioDespertador(double emisora, String alarma, boolean alarmaONOFF) {
        super(emisora);
        setAlarma(alarma);
        this.alarmaONOFF = alarmaONOFF;
    }

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {

        if (alarma.contains(":") && alarma.length() >= 4 && alarma.length() < 6) {

            this.alarma = alarma;

        } else {

            this.alarma = "00:00";
        }

    }

    public boolean isAlarmaONOFF() {
        return alarmaONOFF;
    }

    public void setAlarmaONOFF(boolean alarmaONOFF) {
        this.alarmaONOFF = alarmaONOFF;
    }

    public void apagarAlarma() {

        this.alarmaONOFF = false;

    }

    public void encenderAlarma() {

        this.alarmaONOFF = true;

    }

    @Override
    public String toString() {

    }

}