public class Productos {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Productos() {
        this.nombre = "Desconocido";
        this.precio = 0;
        this.cantidad = 0;
    }

    public Productos(String nombre, double precio, int cantidad) {

        this.nombre = nombre;

        if (precio >= 0) {
        } else {
            this.precio = 0;
        }

        if (cantidad >= 0) {
            this.cantidad = cantidad;

        } else {
            this.cantidad = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio >= 0) {
        } else {
            this.precio = 0;
            System.out.println("El precio no se ha establecido correctamente");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {

        if (cantidad >= 0) {
            this.cantidad = cantidad;

        } else {
            this.cantidad = 0;
        }
    }

    public int incrementarCantidad() {
        return this.cantidad++;
    }

    public int decrementarCantidad() {
        return this.cantidad--;
    }

    public void modificarCantidad(int cantidad) {
        if (cantidad < 0) {
            if (this.cantidad + cantidad < 0) {
                System.out.println("No puedes comprar tanta cantidad");

            } else {
                this.cantidad += cantidad;
            }
        } else {

            this.cantidad += cantidad;
        }
    }

}
