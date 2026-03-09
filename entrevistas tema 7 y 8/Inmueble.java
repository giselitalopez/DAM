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
            boolean segundaMano) {

        setMetrosCuadrados(metrosCuadrados);
        setPrecioBase(precioBase);
        setDireccion(direccion);
        setNombreDueno(nombreDueno);
        setContactoDueno(contactoDueno);
        this.segundaMano = segundaMano;

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
                .println("El inmueble situado en la direccion " + direccion + " ,consta de " + metrosCuadrados
                        + " metros cuadrados.");
        if (segundaMano) {
            System.out.println("El inmueble es de segunda mano");
        } else {
            System.out.println("El inmueble no es de segunda mano");
        }
    }

    public void llamarDueno() {
        System.out.println("Los datos del dueño del inmueble para contactar son: ");
        System.out.println("Nombre: " + nombreDueno);
        System.out.println("Número de teléfono: " + contactoDueno);
    }

    protected static Inmueble vendido() {
        return null;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        if (metrosCuadrados <= 0) {
            System.out.println("Error: los metros cuadrados deben ser mayores que 0");
        } else {
            this.metrosCuadrados = metrosCuadrados;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {

        if (precioBase <= 0) {
            System.out.println("Error: el precio debe ser mayor que 0");
        } else {
            this.precioBase = precioBase;
        }
        this.precioBase = precioBase;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {

        if (direccion.isBlank()) {
            System.out.println("No puede dejar la dirección vacía");
        } else {

            this.direccion = direccion;
        }
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {

        if (nombreDueno.isBlank()) {
            System.out.println("No puede dejar el nombre vacío");
        } else {

            this.nombreDueno = nombreDueno;
        }
    }

    public String getContactoDueno() {
        return contactoDueno;
    }

    public void setContactoDueno(String contactoDueno) {

        if (nombreDueno.length() < 9) {
            System.out.println("Su numero tiene menos de 9 digitos");
        } else if (nombreDueno.length() > 9) {
            System.out.println("Su numero tiene más de 9 digitos");
        } else if (nombreDueno.isBlank()) {
            System.out.println("No puede dejar el número vacío");
        } else {
            this.contactoDueno = contactoDueno;
        }

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