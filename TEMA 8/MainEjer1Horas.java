public class MainEjer1Horas {
    public static void main(String[] args) {

        Hora hora = new Hora(12, 35);

        System.out.println(hora.toString());
        hora.inc();
        System.out.println(hora.toString());

        HoraExacta horaExacta = new HoraExacta(15, 34, 23);

        // mostrar la hora con el public void mostrarHora
        horaExacta.inc();
        System.out.println(horaExacta.toString());
    }
}
