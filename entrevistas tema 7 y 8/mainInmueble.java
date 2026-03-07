import java.util.Scanner;

public class mainInmueble {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // mostrarPiso(sc);
        // mostrarLocal(sc);
        // mostrarCasa(sc);
        comprar(sc);
        // soyVendedor(sc);
        // pedirInfoPiso(sc);

    }

    private static void mostrarPiso(Scanner sc) {

        Inmueble piso = new Piso(150, 230, "Calle Turquesa, 23, Bajo Izquierda", "Alejandro Perez", "642080864", false,
                false, 3, true);

        piso.mostrarInformacion();
        System.out.println("El precio es: " + piso.calcularPrecioFinal() + " euros");

        System.out.println("¿Quiere contactar con el dueño del inmueble? \n(1) SI \n(2) NO");
        int opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            piso.llamarDueno();

        }

        System.out.println("¿Quiere reservar el inmueble? \n(1) SI \n(2) NO");
        int opcionCompra = sc.nextInt();
        opcionCompra = validarOpcion(sc, opcionCompra);

        if (opcionCompra == 1) {
            System.out.println(
                    "Enhorabuena, ha hecho una reserva del inmueble. Nos pondremos en contacto contigo pronto");
            piso.vendido();
            // piso.setVendido(true);

        }

    }

    private static void mostrarCasa(Scanner sc) {

        Inmueble casa = new Casa(235, 3000, "Calle Amatista, 36", "Pepa García", "684016573", true, false, true, 2,
                true);

        // 235, 3000, "Calle Amatista, 36", "Pepa Garcia", "684016573", true, true, 2,
        // false, false
        casa.mostrarInformacion();
        System.out.println("El precio es: " + casa.calcularPrecioFinal() + " euros");

        System.out.println("¿Quiere contactar con el dueño del inmueble? \n(1) SI \n(2) NO");
        int opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            casa.llamarDueno();

        } else {
            return;
        }

        System.out.println("¿Quiere reservar el inmueble? \n(1) SI \n(2) NO");
        int opcionCompra = sc.nextInt();
        opcionCompra = validarOpcion(sc, opcionCompra);

        if (opcionCompra == 1) {
            System.out.println(
                    "Enhorabuena, ha hecho una reserva del inmueble. Nos pondremos en contacto contigo pronto");
            casa.vendido();
            // casa.setVendido(true);

        }
    }

    private static void mostrarLocal(Scanner sc) {

        Inmueble local = new Local(80, 500, "Calle San Fernando, 45", "Jose Perez", "654326754", false, false,
                "Restaurante", true);

        local.mostrarInformacion();
        System.out.println("El precio es: " + local.calcularPrecioFinal() + " euros");

        System.out.println("¿Quiere contactar con el dueño del inmueble? \n(1) SI \n(2) NO");
        int opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            local.llamarDueno();

        }
        System.out.println("¿Quiere reservar el inmueble? \n(1) SI \n(2) NO");
        int opcionCompra = sc.nextInt();
        opcionCompra = validarOpcion(sc, opcionCompra);

        if (opcionCompra == 1) {
            System.out.println(
                    "Enhorabuena, ha hecho una reserva del inmueble. Nos pondremos en contacto contigo pronto");
            local.vendido();
            // local.setVendido(true);

        }

    }

    private static void comprar(Scanner sc) {

        int opcion;

        System.out.println(
                "Le vamos a mostrar unos inmuebles por si desea comprar alguno. En base a su preferencia elija: ");

        // (1) VER CASAS (2) VER PISOS (3) VER LOCALES (4) SALIR DE INMOBILIARIA

        do {

            System.out.println(
                    "(1) VER CASAS \n(2) VER PISOS \n(3) VER LOCALES \n(4) QUIERO VENDER UN INMUEBLE \n(5) SALIR DE INMOBILIARIA");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    mostrarCasa(sc);

                    break;

                case 2:

                    mostrarPiso(sc);

                    break;

                case 3:

                    mostrarLocal(sc);

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

                case 5:

                    System.out.println("¡Hasta la próxima!");

                    break;

                default:
                    System.out.println("Seleccione una opción válida");
                    break;
            }

        } while (opcion >= 1 && opcion < 5);
    }

    private static void soyVendedor(Scanner sc) {

        int opcion;

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

                    pedirInfoPiso(sc);

                    break;
                case 2:

                    pedirInfoCasa(sc);

                    break;
                case 3:

                    pedirInfoLocal(sc);

                    break;
                case 4:

                    System.out.println("Volviendo al menú principal...");

                    break;

                default:

                    System.out.println("Introduzca una opción válida");

                    break;
            }

        } while (opcion >= 0 && opcion < 4);

    }

    private static void pedirInfoPiso(Scanner sc) {

        sc.nextLine();

        int opcion;

        Piso piso = new Piso();

        System.out.println("Escriba su nombre y apellidos");
        piso.setNombreDueno(sc.nextLine());
        System.out.println("Escriba su número de teléfono");
        piso.setContactoDueno(sc.nextLine());
        System.out.println("Escriba la dirección del inmueble");
        piso.setDireccion(sc.nextLine());
        System.out.println("¿Qué número de planta es? Si es planta baja, ponga '0'");
        piso.setPlanta(sc.nextInt());
        System.out.println("Introduzca los metros cuadrados de su piso");
        piso.setMetrosCuadrados(sc.nextDouble());
        System.out.println(
                "Introduzca el precio del metro cuadrado en euros de la zona. Lo revisamos para ofrecer el mejor precio del mercado (si no sabe el precio del metro cuadrado, ponga uno estimado)");
        piso.setPrecioBase(sc.nextDouble());
        System.out.println("¿El piso es de segunda mano? \n(1) SI \n(2) NO");
        opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            piso.setSegundaMano(true);
        } else if (opcion == 2) {
            piso.setSegundaMano(false);
        }

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
        System.out.println("Gracias por confiar en nosotros. Le dejamos nuevamente en el menú de inmobiliaria.");
        ;

    }

    private static void pedirInfoCasa(Scanner sc) {

        sc.nextLine();

        int opcion;

        Casa casa = new Casa();

        System.out.println("Escriba su nombre y apellidos");
        casa.setNombreDueno(sc.nextLine());
        System.out.println("Escriba su número de teléfono");
        casa.setContactoDueno(sc.nextLine());
        System.out.println("Escriba la dirección del inmueble");
        casa.setDireccion(sc.nextLine());
        System.out.println("¿Cuántas plantas tiene? Si es planta baja, ponga '0'");
        casa.setPlantas(sc.nextInt());
        System.out.println("Introduzca los metros cuadrados de su casa");
        casa.setMetrosCuadrados(sc.nextDouble());
        System.out.println(
                "Introduzca el precio del metro cuadrado en euros de la zona. Lo revisamos para ofrecer el mejor precio del mercado (si no sabe el precio del metro cuadrado, ponga uno estimado)");
        casa.setPrecioBase(sc.nextDouble());
        System.out.println("¿La casa es de segunda mano? \n(1) SI \n(2) NO");
        opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            casa.setSegundaMano(true);
        } else if (opcion == 2) {
            casa.setSegundaMano(false);
        }

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
        System.out.println("Gracias por confiar en nosotros. Le dejamos nuevamente en el menú de inmobiliaria.");
        ;

    }

    private static void pedirInfoLocal(Scanner sc) {

        sc.nextLine();

        int opcion;

        Local local = new Local();

        System.out.println("Escriba su nombre y apellidos");
        local.setNombreDueno(sc.nextLine());
        System.out.println("Escriba su número de teléfono");
        local.setContactoDueno(sc.nextLine());
        System.out.println("Escriba la dirección del inmueble");
        local.setDireccion(sc.nextLine());
        System.out.println("¿Qué actividad realiza en el local?");
        local.setActividad(sc.nextLine());
        System.out.println("Introduzca los metros cuadrados de su local");
        local.setMetrosCuadrados(sc.nextDouble());
        System.out.println(
                "Introduzca el precio del metro cuadrado en euros de la zona. Lo revisamos para ofrecer el mejor precio del mercado (si no sabe el precio del metro cuadrado, ponga uno estimado)");
        local.setPrecioBase(sc.nextDouble());
        System.out.println("¿El local es de segunda mano? \n(1) SI \n(2) NO");
        opcion = sc.nextInt();
        opcion = validarOpcion(sc, opcion);

        if (opcion == 1) {
            local.setSegundaMano(true);
        } else if (opcion == 2) {
            local.setSegundaMano(false);
        }

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
        ;

    }

    private static int validarOpcion(Scanner sc, int opcion) {

        while (opcion != 1 && opcion != 2) {
            System.out.println("Introduzca una opción válida");
            opcion = sc.nextInt();
        }

        return opcion;
    }

    /*
     * private static void opcionPiso() {
     * 
     * Inmueble piso = new Piso(150, 2300, "Calle Turquesa, 23, Bajo Izquierda",
     * "Alejandro Perez", "642080864",
     * false, 3, true);
     * 
     * piso.mostrarInformacion();
     * System.out.println("Su inmueble está valorado en: " +
     * piso.calcularPrecioFinal() + " euros.");
     * piso.llamarDueno();
     * 
     * }
     */

    /*
     * private static void opcionCasa() {
     * 
     * // ejemplo de casa con jardín y casa no adosada
     * 
     * Inmueble casa = new Casa(235, 3000, "Calle Amatista, 36", "Pepa Garcia",
     * "684016573", true, true, 2, false);
     * casa.mostrarInformacion();
     * System.out.println("Su inmueble está valorado en: " +
     * casa.calcularPrecioFinal() + " euros.");
     * casa.llamarDueno();
     * }
     */

    /*
     * private static void opcionLocal() {
     * 
     * Inmueble local = new Local(80, 500, "Calle San Fernando, 45", "Jose Perez",
     * "654326754", true, "Restaurante",
     * true);
     * local.mostrarInformacion();
     * System.out.println("Su inmueble está valorado en: " +
     * local.calcularPrecioFinal() + " euros.");
     * local.llamarDueno();
     * 
     * } /*
     */
}
