import java.util.ArrayList;
import java.util.List;

public class Departamentos {

    private String nombreDepartamento;
    private List<Empleados> empleados;

    public Departamentos() {
        this.nombreDepartamento = "Desconocido";
        this.empleados = new ArrayList<>();
    }

    public Departamentos(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    void anadirEmpleados(Empleados empleados) {
        this.empleados.add(empleados);
    }

    public Departamentos(String nombreDepartamento, List<Empleados> empleados) {
        this.nombreDepartamento = nombreDepartamento;
        this.empleados = empleados;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public List<Empleados> getEmpleados() {
        return empleados;
    }

    void mostrarEmpleados() {

        System.out.println("Los empleados del departamento " + getNombreDepartamento() + " trabajan los empleados: ");
        for (Empleados e : empleados) {
            System.out.println("- " + e.getNombre());
        }
    }

}
