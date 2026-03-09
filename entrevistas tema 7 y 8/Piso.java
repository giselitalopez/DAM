public class Piso extends Inmueble {

    private int planta;
    private boolean tieneAscensor;

    public Piso() {

        this.planta = 1;
        this.tieneAscensor = false;
    }

    public Piso(int planta, boolean tieneAscensor) {
        setPlanta(planta);
        this.tieneAscensor = tieneAscensor;
    }

    public Piso(double metrosCuadrados, double precioBase, String direccion, String nombreDueno, String contactoDueno,
            boolean segundaMano, int planta, boolean tieneAscensor) {

        super(metrosCuadrados, precioBase, direccion, nombreDueno, contactoDueno, segundaMano);
        setPlanta(planta);
        this.tieneAscensor = tieneAscensor;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {

        if (planta <= 0) {
            System.out.println(
                    "El número de planta no puede ser 0 ni menor que este. Si no tiene plantas, la planta baja se indica como '1");
        } else {
            this.planta = planta;
        }
        this.planta = planta;
    }

    public boolean isTieneAscensor() {
        return tieneAscensor;
    }

    public void setTieneAscensor(boolean tieneAscensor) {
        this.tieneAscensor = tieneAscensor;
    }

    @Override
    public double calcularPrecioFinal() {

        double precio = super.calcularPrecioFinal();

        double calculo = precio * 0.05;
        double precioFinal = calculo + precio;

        if (tieneAscensor) {

            precio = precioFinal;

        }

        this.precio = precio;
        return this.precio;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        if (tieneAscensor) {
            System.out.println("El piso tiene ascensor");
        } else {
            System.out.println("El piso no tiene ascensor");
        }
    }

}