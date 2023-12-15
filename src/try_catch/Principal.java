package try_catch;

public class Principal {

    public static void main(String[] args) {
        //EJEMPLO 01: CONVERSION DE TIPOS
        //ejemplo01();
        //EJEMPLO 02: ACCESO A UN INDICE FUERA DEL RANGO
        //ejemplo02();
        //EJEMPLO 03: DIVISION POR CERO
        //ejemplo03();
        //EJEMPLO 04: PERSONALIZAR UNA EXCEPTION PROPIA
        //ejemplo04();
        //EJEMPLO 05: SI PASO A UN METODO LA PALABRA WALTER 
        //            LANCE LA CadenaNoValidaException
        ejemplo05();
    }

    public static void ejemplo01() {
        try {
            String numeros = "187?";
            int numeroi = Integer.parseInt(numeros);
        } catch (Exception e) {
            System.out.println("ERROR: CONVERSION DE TIPOS");
        }
    }

    public static void ejemplo02() {
        try {
            int[] vector = {8, 10, 30};//0 1 2
            int x = vector[2];
            System.out.println("x: " + x);
        } catch (Exception e) {
            System.out.println("ERROR: ACCESO A UN INDICE FUERA DEL RANGO");
        }
    }

    public static void ejemplo03() {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("ERROR: DIVISION POR CERO");
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void ejemplo04() {
        try {
            validarEdad(20);
        } catch (EdadInvalidaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("La edad debe ser mayor o igual a 18");
        } else {
            System.out.println("Edad Válida: " + edad);
        }
    }

    public static void ejemplo05() {
        try {
            validarCadena("dfasdf");
        } catch (CadenaNoValidaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void validarCadena(String cadena) throws CadenaNoValidaException {
        if (cadena.equalsIgnoreCase("Walter")) {
            throw new CadenaNoValidaException("La cadena debe ser distinto de Walter");
        } else {
            System.out.println("Cadena Válida: " + cadena);
        }
    }
} // FIN CLASE

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje); //Enviar el mensaje al padre
    }
}

class CadenaNoValidaException extends Exception {
    public CadenaNoValidaException(String mensaje) {
        super(mensaje); //Enviar el mensaje al padre
    }
}
