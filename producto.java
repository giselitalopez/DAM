import java.util.ArrayList;
import java.util.List;

public class producto {
    public static void main(String[] args) {

        Productos telefono = new Productos("Samsung s26", 999, 5);
        Productos raton = new Productos("Razer V2 Pro", 120, 3);
        Productos teclado = new Productos("MarsGaming", 230, 2);

        List<Productos> productos = new ArrayList<Productos>();

        productos.add(telefono);
        productos.add(raton);
        productos.add(teclado);

        for (Productos p : productos) {
            System.out.println("El producto es " + p.getNombre() + " tiene un precio de " + p.getPrecio());

        }

        raton.modificarCantidad(5);

    }
}
