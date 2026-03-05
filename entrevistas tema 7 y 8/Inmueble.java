public class Inmueble {

    protected double metrosCuadrados;
    protected double precioBase;
    protected String direccion;
    protected String nombreDueno;
    protected String contactoDueno;
    protected boolean segundaMano;
    protected double precio;

    public Inmueble() {
        this.metrosCuadrados = 0;
        this.precioBase = 0;
        this.direccion = "Desconocida";
        this.nombreDueno = "Desconocido";
        this.contactoDueno = "Desconocido";
        this.segundaMano = false;
        this.precio = 0;
    }

    public Inmueble(double metrosCuadrados, double precioBase, String direccion, String nombreDueno,
            String contactoDueno,
            boolean segundaMano, double precio) {
        this.metrosCuadrados = metrosCuadrados;
        this.precioBase = precioBase;
        this.direccion = direccion;
        this.nombreDueno = nombreDueno;
        this.contactoDueno = contactoDueno;
        this.segundaMano = segundaMano;
        this.precio = precio;
    }

    public double calcularPrecioFinal() {

        double calculo = precioBase * metrosCuadrados;
        double bajadaPrecioSegundaMano = precioBase * 0.05;
        double resultadoBajadaPrecio = precioBase - bajadaPrecioSegundaMano;

        if (segundaMano) {

            this.precio = resultadoBajadaPrecio * metrosCuadrados;
            return this.precio;

        } else {

            this.precio = calculo;
            return this.precio;
        }
    }

    public void mostrarInformacion() {
        System.out
                .println("El inmueble con direccion " + direccion + " consta de " + metrosCuadrados
                        + " metros cuadrados.");
        if (segundaMano) {
            System.out.println("El inmueble es de segunda mano");
        } else {
            System.out.println("El inmueble no es de segunda mano");
        }
    }

    public void llamarDueno() {
        System.out.println("Los datos personales del dueño son: ");
        System.out.println("Nombre: " + nombreDueno);
        System.out.println("Número de teléfono: " + contactoDueno);
    }

    public void vendido() {
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getContactoDueno() {
        return contactoDueno;
    }

    public void setContactoDueno(String contactoDueno) {
        this.contactoDueno = contactoDueno;
    }

    public boolean isSegundaMano() {
        return segundaMano;
    }

    public void setSegundaMano(boolean segundaMano) {
        this.segundaMano = segundaMano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}