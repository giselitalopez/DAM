public class Maquinista extends EmpresaFerroviaria {

    private String nombre;
    private String dni;
    private double sueldo;
    private Rango rango;

    public Maquinista() {

        this.nombre = "Desconocido";
        this.dni = "Desconocido";
        this.sueldo = 1000;
        this.rango = rango.EMPLEADO;

    }

    public Maquinista(String nombre, String dni, double sueldo, Rango rango) {
        this.nombre = nombre;
        setDni(dni);
        setSueldo(sueldo);
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {

        if (dni.length() != 9) {
            System.out.println("ERROR: el DNI debe tener 8 números y una letra");
        } else {

            this.dni = dni;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {

        if (sueldo < 1000) {
            System.out.println("ERROR: el sueldo debe ser mayor de 1000 euros");
        } else {

            this.sueldo = sueldo;

        }
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

}