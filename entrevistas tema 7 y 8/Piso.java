public class Piso extends Inmueble {

    private boolean planta;
    private boolean tieneAscensor;

    public Piso() {

        this.planta = false;
        this.tieneAscensor = false;
    }

    public Piso(boolean planta, boolean tieneAscensor) {
        this.planta = planta;
        this.tieneAscensor = tieneAscensor;
    }

    public Piso(double metrosCuadrados, double precioBase, String direccion, String nombreDueno, String contactoDueno,
            boolean segundaMano, double precio, boolean planta, boolean tieneAscensor) {

        super(metrosCuadrados, precioBase, direccion, nombreDueno, contactoDueno, segundaMano, precio);
        this.planta = planta;
        this.tieneAscensor = tieneAscensor;
    }

}