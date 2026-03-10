import java.util.Scanner;

public class mainDefinitivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        comprar(sc);
    }

    private static void comprar(Scanner sc) {

        int opcion;
        int opcionCompra;

        Inmueble piso = new Piso(225, 230, "Calle Turquesa, 23, Tercero Izquierda", "Alejandro Perez", "642080864",
                false,
                4, true);
        Inmueble piso2 = new Piso(100, 68, "Calle Amatista, 16, Primero Derecha", "Ana García", "684016573", true,
                2, false);

        Inmueble casa = new Casa(235, 3000, "Calle Amatista, 36", "Pepa García", "684016573", true, true, 2,
                true);
        Inmueble local = new Local(80, 500, "Calle San Fernando, 45", "Jose Perez", "654326754", false,
                "Restaurante", true);

        System.out.println(
                "Le vamos a mostrar unos inmuebles por si desea comprar alguno. En base a su preferencia elija: ");

        do {

            System.out.println(
                    "(1) VER CASAS \n(2) VER PISOS \n(3) VER LOCALES \n(4) QUIERO VENDER UN INMUEBLE \n(5) SALIR DE INMOBILIARIA");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    if (casa == null) {
                        System.out.println(
                                "Lo sentimos, de momento no hay ninguna casa a la venta. Pronto tendremos más novedades");

                    } else {

                        mostrarCasa(sc, casa);
                        System.out.println("¿Quiere reservar el inmueble? \n(1) SI \n(2) NO");
                        opcionCompra = sc.nextInt();
                        opcionCompra = validarOpcion(sc, opcionCompra);

                        if (opcionCompra == 1) {
                            UsuarioSimulacion(sc);
                            System.out.println(
                                    "Enhorabuena, ha hecho una reserva del inmueble. Nos pondremos en contacto contigo pronto");
                            casa = Inmueble.vendido();

                        }

                    }

                    break;

                case 2:

                    if (piso == null && piso2 == null) {
                        System.out.println(
                                "Lo sentimos, de momento no hay ningún piso a la venta. Pronto tendremos más novedades");

                    } else {

                        mostrarPiso(sc, piso);
                        System.out.println("¿Quiere reservar el inmueble? \n(1) SI \n(2) NO");
                        opcionCompra = sc.nextInt();
                        opcionCompra = validarOpcion(sc, opcionCompra);

                        if (opcionCompra == 1) {
                            UsuarioSimulacion(sc);
                            System.out.println(
                                    "Enhorabuena, ha hecho una reserva del inmueble. Nos pondremos en contacto contigo pronto");
                            piso = Inmueble.vendido();

                        }

                        mostrarPiso2(sc, piso2);
                        System.out.println("¿Quiere reservar el inmueble? \n(1) SI \n(2) NO");
                        opcionCompra = sc.nextInt();
                        opcionCompra = validarOpcion(sc, opcionCompra);

                        if (opcionCompra == 1) {
                            UsuarioSimulacion(sc);
                            System.out.println(
                                    "Enhorabuena, ha hecho una reserva del inmueble. Nos pondremos en contacto contigo pronto");
                            piso2 = Inmueble.vendido();

                        }

                    }

                    break;

                case 3:

                    if (local == null) {
                        System.out.println(
                                "Lo sentimos, de momento no hay ningún local a la venta. Pronto tendremos más novedades");
                    } else {
                        mostrarLocal(sc, local);
                        System.out.println("¿Quiere reservar el inmueble? \n(1) SI \n(2) NO");
                        opcionCompra = sc.nextInt();
                        opcionCompra = validarOpcion(sc, opcionCompra);

                        if (opcionCompra == 1) {
                            UsuarioSimulacion(sc);
                            System.out.println(
                                    "Enhorabuena, ha hecho una reserva del inmueble. Nos pondremos en contacto contigo pronto");
                            local = Inmueble.vendido();

                        }

                    }

                    break;

                case 4:
                    System.out
                            .println(
                                    "Ha marcado que es un vendedor. El proceso es un poco extenso. ¿Quiere continuar el proceso? \n(1) SI \n(2) NO");
                    opcion = sc.nextInt();
                    opcion = validarOpcion(sc, opcion);

                    if (opcion == 1) {
                        soyVendedor(sc);
                    } else if (opcion == 2) {
                        break;
                    }

                    break;

                case 5:

                    System.out.println("¡Hasta la próxima!");

                    break;

                default:
                    System.out.println("Seleccione una opción válida");
                    break;
            }

        } while (opcion != 5);

    }

    private static void mostrarPiso(Scanner sc, Inmueble piso) {

        piso.mostrarInformacion();
        System.out.println("El precio es: " + piso.calcularPrecioFinal() + " euros");
        piso.llamarDueno();

    }

    private static void mostrarPiso2(Scanner sc, Inmueble piso2) {

        piso2.mostrarInformacion();
        System.out.println("El precio es: " + piso2.calcularPrecioFinal() + " euros");
        piso2.llamarDueno();

    }

    private static void mostrarCasa(Scanner sc, Inmueble casa) {

        casa.mostrarInformacion();
        System.out.println("El precio es: " + casa.calcularPrecioFinal() + " euros");

        casa.llamarDueno();

    }

    private static void mostrarLocal(Scanner sc, Inmueble local) {

        local.mostrarInformacion();
        System.out.println("El precio es: " + local.calcularPrecioFinal() + " euros");

        local.llamarDueno();

    }

    private static void soyVendedor(Scanner sc) {

        int opcion;

        Piso piso = new Piso();
        Local local = new Local();
        Casa casa = new Casa();

        System.out.println(
                "Bienvenido Vendedor/a. Si está leyendo esto es porque quiere vender su inmueble y estamos aquí para ayudarte.");

        System.out.println(
                "A continuación, introduzca una de estas opciones: ");

        do {

            System.out.println(
                    "(1) QUIERO VENDER UN PISO \n(2) QUIERO VENDER UNA CASA \n(3) QUIERO VENDER UN LOCAL \n(4) VOLVER A MENÚ PRINCIPAL");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    pedirDatosComunesVendedor(sc, piso);
                    pedirDatosEspecifPiso(sc, piso);

                    break;
                case 2:

                    pedirDatosComunesVendedor(sc, casa);
                    pedirDatosEspecifCasa(sc, casa);

                    break;

                case 3:

                    pedirDatosComunesVendedor(sc, local);
                    pedirDatosEspecifLocal(sc, local);

                    break;
                case 4:

                    System.out.println("Volviendo al menú principal...");

                    break;

                default:

                    System.out.println("Introduzca una opción válida");

                    break;
            }

        } while (opcion != 4);

    }

    private static int validarOpcion(Scanner sc, int opcion) {

        while (opcion != 1 && opcion != 2) {
            System.out.println("Introduzca una opción válida");
            opcion = sc.nextInt();
        }

        return opcion;
    }

    private static String validadorNombre(Scanner sc, String nombre) {

        while (nombre.isBlank()) {
            System.out.println("Escriba su nombre correctamente");
            nombre = sc.nextLine();
        }

        return nombre;
    }

    private static String validarNumeroTelefono(Scanner sc, String numero) {

        while (numero.length() < 9 || numero.length() > 9 || numero.isBlank()) {
            if (numero.length() < 9) {
                System.out.println("Su numero tiene menos de 9 digitos");
            } else if (numero.length() > 9) {
                System.out.println("Su numero tiene más de 9 digitos");
            } else if (numero.isBlank()) {
                System.out.println("No puede dejar el número vacío");
            } else {
                System.out.println("Error desconocido, escriba su número nuevamente");
            }

            numero = sc.nextLine();
        }

        return numero;
    }

    private static String validarDireccion(Scanner sc, String direccion) {

        while (direccion.isBlank()) {

            if (direccion.isBlank()) {
                System.out.println("No puede dejar la dirección vacía");
            } else {
                System.out.println("Error desconocido, vuelva a escribir la dirección");
            }

            direccion = sc.nextLine();
        }
        return direccion;

    }

    private static void UsuarioSimulacion(Scanner sc) {

        sc.nextLine();

        System.out.println("Va a realizar una reserva, solo necesitamos un par de datos antes.");

        System.out.println("Escriba su nombre");
        String nombre = sc.nextLine();
        nombre = validadorNombre(sc, nombre);
        System.out.println("Escriba su número de teléfono");
        String numero = sc.nextLine();
        numero = validarNumeroTelefono(sc, numero);

        System.out.println("¡Gracias por confiar en nosotros!");

    }

    private static void pedirDatosComunesVendedor(Scanner sc, Inmueble inmueble) {

        sc.nextLine();

        int opcion;
        double metros;
        double euros;

        System.out.println("Escriba su nombre");
        String nombre = sc.nextLine();
        nombre = validadorNombre(sc, nombre);
        inmueble.setNombreDueno(nombre);
        System.out.println("Escriba su número de teléfono");
        String telefono = sc.nextLine();
        telefono = validarNumeroTelefono(sc, telefono);
        inmueble.setContactoDueno(telefono);
        System.out.println("Escriba la dirección del inmueble");
        String direccion = sc.nextLine();
        direccion = validarDireccion(sc, direccion);
        inmueble.setDireccion(direccion);

        do {
            System.out.println("Introduzca los metros cuadrados de su inmueble");
            metros = sc.nextDouble();

            if (metros <= 0) {
                System.out.println("Error. Los metros cuadrados deben ser mayores que 0.");
            }

        } while (metros <= 0);
        inmueble.setMetrosCuadrados(metros);

        do {
            System.out.println(
                    "Introduzca el precio del metro cuadrado en euros de la zona. Lo revisamos para ofrecer el mejor precio del mercado (si no sabe el precio del metro cuadrado, ponga uno estimado)");
            euros = sc.nextDouble();
            if (euros <= 0) {
                System.out.println("Error. El precio por metro cuadrado debe ser mayor que 0.");
            }
        } while (euros <= 0);
        inmueble.setPrecioBase(euros);

        sc.nextLine();

        System.out.println("¿El piso es de segunda mano? \n(1) SI \n(2) NO");
        opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            inmueble.setSegundaMano(true);
        } else if (opcion == 2) {
            inmueble.setSegundaMano(false);
        }
    }

    private static void pedirDatosEspecifPiso(Scanner sc, Piso piso) {

        sc.nextLine();

        int opcion;

        System.out.println("¿Qué número de planta es? Si es planta baja, ponga '1'");
        piso.setPlanta(sc.nextInt());
        System.out.println("¿El piso tiene ascensor? \n(1) SI \n(2) NO");
        opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            piso.setTieneAscensor(true);
        } else if (opcion == 2) {
            piso.setTieneAscensor(false);
        }

        System.out.println("¡Gracias! A continuación le mostramos la información: ");
        piso.mostrarInformacion();
        piso.llamarDueno();
        System.out.println("El precio estimado del piso es: " + piso.calcularPrecioFinal()
                + " euros. Esto es una estimación, una vez nos pongamos en contacto contigo y revisemos la zona y sus precios, esta información puede cambiar.");
        System.out.println(
                "Gracias por confiar en nosotros. Le dejamos nuevamente en el menú de inmobiliaria.");
    }

    private static void pedirDatosEspecifCasa(Scanner sc, Casa casa) {

        sc.nextLine();

        int opcion;

        System.out
                .println("¿Qué número de planta es? Si no tiene plantas, ponga '1' que es la única planta que tendría");
        casa.setPlantas(sc.nextInt());

        System.out.println("¿La casa tiene jardín? \n(1) SI \n(2) NO");
        opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            casa.setTienePatio(true);
        } else if (opcion == 2) {
            casa.setTienePatio(false);
        }

        System.out.println("¿La casa es adosada? \n(1) SI \n(2) NO");
        opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            casa.setEsAdosado(true);
        } else if (opcion == 2) {
            casa.setEsAdosado(false);
        }

        System.out.println("¡Gracias! A continuación le mostramos la información: ");
        casa.mostrarInformacion();
        casa.llamarDueno();
        System.out.println("El precio estimado de la casa es: " + casa.calcularPrecioFinal()
                + " euros. Esto es una estimación, una vez nos pongamos en contacto contigo y revisemos la zona y sus precios, esta información puede cambiar.");
        System.out.println(
                "Gracias por confiar en nosotros. Le dejamos nuevamente en el menú de inmobiliaria.");
    }

    private static void pedirDatosEspecifLocal(Scanner sc, Local local) {

        sc.nextLine();

        int opcion;

        System.out.println("¿Qué actividad realiza en el local?");
        local.setActividad(sc.nextLine());

        System.out.println("¿El local tiene escaparate? \n(1) SI \n(2) NO");
        opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            local.setTieneEscaparate(true);
        } else if (opcion == 2) {
            local.setTieneEscaparate(false);
        }

        System.out.println("¡Gracias! A continuación le mostramos la información: ");

        local.mostrarInformacion();
        local.llamarDueno();
        System.out.println("El precio estimado del local es: " + local.calcularPrecioFinal()
                + " euros. Esto es una estimación, una vez nos pongamos en contacto contigo y revisemos la zona y sus precios, esta información puede cambiar.");
        System.out.println("Gracias por confiar en nosotros. Le dejamos nuevamente en el menú de inmobiliaria.");
    }

}