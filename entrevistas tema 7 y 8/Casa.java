public class Casa extends Inmueble {

    private boolean tienePatio;
    private int plantas;
    private boolean esAdosado;

    public Casa() {
        this.tienePatio = false;
        this.plantas = 0;
        this.esAdosado = false;
    }

    public Casa(boolean tienePatio, int plantas, boolean esAdosado) {
        this.tienePatio = tienePatio;
        this.plantas = plantas;
        this.esAdosado = esAdosado;
    }

    public Casa(double metrosCuadrados, double precioBase, String direccion, String nombreDueno, String contactoDueno,
            boolean segundaMano, boolean tienePatio, int plantas, boolean esAdosado) {

        super(metrosCuadrados, precioBase, direccion, nombreDueno, contactoDueno, segundaMano);
        this.tienePatio = tienePatio;
        this.plantas = plantas;
        this.esAdosado = esAdosado;
    }

    public boolean isTienePatio() {
        return tienePatio;
    }

    public void setTienePatio(boolean tienePatio) {
        this.tienePatio = tienePatio;
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    public boolean isEsAdosado() {
        return esAdosado;
    }

    public void setEsAdosado(boolean esAdosado) {
        this.esAdosado = esAdosado;
    }

    @Override
    public double calcularPrecioFinal() {

        double precio = super.calcularPrecioFinal();

        double calculoJardin = precio * 0.07;
        double calculoNoAdosada = precio * 0.10;
        double calculoFinalJardin = calculoJardin + precio;
        double calculoFinalAdosado = calculoNoAdosada + precio;

        double esAmbas = precio * 0.17;
        double calculoTotalEsAmbas = esAmbas + precio;

        if (tienePatio && esAdosado == false) {

            precio = calculoTotalEsAmbas;

        } else if (tienePatio) {

            precio = calculoFinalJardin;

        } else if (esAdosado == false) {

            precio = calculoFinalAdosado;
        }

        this.precio = precio;
        return this.precio;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        if (tienePatio) {
            System.out.println("La casa tiene jardín");
        } else {
            System.out.println("La casa no tiene jardín");
        }

        if (esAdosado) {

            System.out.println("La casa es adosada");

        } else {
            System.out.println("La casa no es adosada");
        }
    }
}