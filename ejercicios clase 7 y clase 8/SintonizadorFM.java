public class SintonizadorFM {

    protected double emisora;

    public SintonizadorFM() {

        this.emisora = 80;
    }

    public SintonizadorFM(double emisora) {

        setEmisora(emisora);

    }

    public double getEmisora() {
        return emisora;
    }

    public void setEmisora(double emisora) {

        if (emisora < 80 || emisora > 108) {
            this.emisora = 80;
        } else {
            this.emisora = emisora;
        }

    }

    public void up() {

        this.emisora += 0.5;

        if (this.emisora > 108) {
            this.emisora = 80;
        }
    }

    public void down() {

        this.emisora -= 0.5;

        if (this.emisora < 80) {
            this.emisora = 108;
        }
    }

}