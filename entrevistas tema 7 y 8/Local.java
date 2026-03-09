public class Local extends Inmueble {

    private String actividad;
    private boolean tieneEscaparate;

    public Local() {

        this.actividad = "Desconocida";
        this.tieneEscaparate = false;

    }

    public Local(String actividad, boolean tieneEscaparate) {
        this.actividad = actividad;
        this.tieneEscaparate = tieneEscaparate;
    }

    public Local(double metrosCuadrados, double precioBase, String direccion, String nombreDueno, String contactoDueno,
            boolean segundaMano, String actividad, boolean tieneEscaparate) {
        super(metrosCuadrados, precioBase, direccion, nombreDueno, contactoDueno, segundaMano);
        this.actividad = actividad;
        this.tieneEscaparate = tieneEscaparate;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public boolean isTieneEscaparate() {
        return tieneEscaparate;
    }

    public void setTieneEscaparate(boolean tieneEscaparate) {
        this.tieneEscaparate = tieneEscaparate;
    }

    @Override
    public double calcularPrecioFinal() {

        double precio = super.calcularPrecioFinal();

        double calculo = precio * 0.03;
        double calculoFinal = precio + calculo;

        if (tieneEscaparate) {

            precio = calculoFinal;
        }

        this.precio = precio;
        return this.precio;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        if (tieneEscaparate) {
            System.out.println("El local tiene escaparate");
        } else {
            System.out.println("El local no tiene escaparate");
        }
    }

}
