package principal;

import archivo.LeerArchivoCsv;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import model.Transaccion;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        List<Transaccion> transacciones = LeerArchivoCsv.obtenerDatos();
        System.out.println("Default Charset=" + java.nio.charset.Charset.defaultCharset());
        do {
            cls();
            System.out.println("Default Charset=" + java.nio.charset.Charset.defaultCharset());
            System.out.println("MENU");
            System.out.println("====");
            System.out.println("(1) MOSTRAR TODOS LAS TRANSACCIONES EN PANTALLA");
            System.out.println("(2) MOSTRAR LAS VENTAS TOTALES POR CATEGORIA");
            System.out.println("(3) MOSTRAR LAS VENTAS TOTALES POR CIUDAD");
            System.out.println("(4) MOSTRAR LA CIUDAD CON LA MAYOR VENTA EN LA CATEGORIA INFORMATICA");
            System.out.println("(5) MOSTRAR LA FORMA DE PAGO QUE TUBO LA MAYOR VENTA");
            System.out.println("(6) MOSTRAR TODAS LAS CIUDADES DISTINTAS");
            System.out.println("(7) MOSTRAR LAS VENTAS TOTALES POR CATEGORIA DE UNA"
                    + "CIUDAD INGRESADA POR TECLADO");
            System.out.println("(0) SALIR");

            System.out.print("INGRESE OPCION? ");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    cls();
                    System.out.println("OPCION 1");
                    System.out.println("========");
                    transacciones = LeerArchivoCsv.obtenerDatos();
                    if (transacciones != null) {
                        for (Transaccion t : transacciones) {
                            System.out.println(t.toString());
                        }
                    }
                    pause();
                    break;
                case "2":
                    cls();
                    System.out.println("OPCION 2");
                    System.out.println("========");
                    transacciones = LeerArchivoCsv.obtenerDatos();
                    double ai = 0;
                    double ae = 0;
                    double aa = 0;
                    for (Transaccion t : transacciones) {
                        if (t.getCategoria().equalsIgnoreCase("Informática")) {
                            ai = ai + t.getVentas();
                        }
                        if (t.getCategoria().equalsIgnoreCase("Electrodoméstico")) {
                            ae = ae + t.getVentas();
                        }
                        if (t.getCategoria().equalsIgnoreCase("Audio y televisión")) {
                            aa = aa + t.getVentas();
                        }
                    }
                    System.out.println("Total Venta Informática       : " + ai);
                    System.out.println("Total Venta Electrodoméstico  : " + ae);
                    System.out.println("Total Venta Audio y televisión: " + aa);
                    pause();
                    break;
                case "3":
                    cls();
                    System.out.println("OPCION 3");
                    //Alicante, Granada, Santander, Sevilla, Valencia, Vigo
                    transacciones = LeerArchivoCsv.obtenerDatos();
                    double ca,
                     cg,
                     cs,
                     ce,
                     cv,
                     ci;
                    ca = cg = cs = ce = cv = ci = 0;
                    for (Transaccion t : transacciones) {
                        if (t.getCiudad().equalsIgnoreCase("Alicante")) {
                            ca = ca + t.getVentas();
                        }
                        if (t.getCiudad().equalsIgnoreCase("Granada")) {
                            cg = cg + t.getVentas();
                        }
                        if (t.getCiudad().equalsIgnoreCase("Santander")) {
                            cs = cs + t.getVentas();
                        }
                        if (t.getCiudad().equalsIgnoreCase("Sevilla")) {
                            ce = ce + t.getVentas();
                        }
                        if (t.getCiudad().equalsIgnoreCase("Valencia")) {
                            cv = cv + t.getVentas();
                        }
                        if (t.getCiudad().equalsIgnoreCase("Vigo")) {
                            ci = ci + t.getVentas();
                        }
                    }
                    System.out.printf("%22s %8.2f\n", "Total Venta Alicante : ", ca);
                    System.out.printf("%22s %8.2f\n", "Total Venta Granada  : ", cg);
                    System.out.printf("%22s %8.2f\n", "Total Venta Santander: ", cs);
                    System.out.printf("%22s %8.2f\n", "Total Venta Sevilla  : ", ce);
                    System.out.printf("%22s %8.2f\n", "Total Venta Valencia : ", cv);
                    System.out.printf("%22s %8.2f\n", "Total Venta Vigo     : ", ci);

                    pause();
                    break;
                case "4":
                    cls();
                    System.out.println("OPCION 4");
                    pause();
                    break;
                case "5":
                    cls();
                    System.out.println("OPCION 5");
                    transacciones = LeerArchivoCsv.obtenerDatos();
                    double at = 0;
                    double ac = 0;
                    for (Transaccion t : transacciones) {
                        if (t.getFormaPago().equalsIgnoreCase("Tarjeta")) {
                            at = at + t.getVentas();
                        } else {
                            ac = ac + t.getVentas();
                        }
                    }
                    System.out.println("Total Venta Tarjeta: " + at);
                    System.out.println("Total Venta Contado: " + ac);
                    if (at > ac) {
                        System.out.println("La mayor venta fue con " + "Tarjeta");
                    } else {
                        System.out.println("La mayor venta fue con " + "Contado");
                    }
                    pause();
                    break;
                case "6":
                    cls();
                    System.out.println("OPCION 6");
                    transacciones = LeerArchivoCsv.obtenerDatos();

                    Set<String> ciudades = new TreeSet<>();
                    for (Transaccion t : transacciones) {
                        ciudades.add(t.getCiudad());
                    }
                    System.out.println(ciudades);
                    pause();
                    break;
                case "7":
                    cls();
                    System.out.println("OPCION 7");
                    System.out.print("Ingrese nombre ciudad? ");
                    String ciudad = sc.next();
                    //transacciones = LeerArchivoCsv.obtenerDatos();
                    double ae1,
                     ai1,
                     aut1;
                    ae1 = ai1 = aut1 = 0;
                    for (Transaccion t : transacciones) {
                        if (t.getCiudad().equalsIgnoreCase(ciudad)) {
                            if (t.getCategoria().equalsIgnoreCase("Electrodoméstico")) {
                                ae1 = ae1 + t.getVentas();
                            }
                            if (t.getCategoria().equalsIgnoreCase("Informática")) {
                                ai1 = ai1 + t.getVentas();
                            }
                            if (t.getCategoria().equalsIgnoreCase("Audio y televisión")) {
                                aut1 = aut1 + t.getVentas();
                            }
                        }
                    }
                    System.out.println("Total Venta Informática       : " + ai1);
                    System.out.println("Total Venta Electrodoméstico  : " + ae1);
                    System.out.println("Total Venta Audio y televisión: " + aut1);
                    pause();
                    break;
                case "0":
                    cls();
                    System.out.println("GRACIAS POR SI VISITA");
                    pause();
                    System.exit(0);
                    break;
            }
        } while (true);

    } // FIN MAIN

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

} // FIN CLASE
