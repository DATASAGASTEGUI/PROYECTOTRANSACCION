package coleccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        //EJEMPLO 01: COLECCION ARRAYLIST(NO ELIMINA DUPLICADOS Y TAMPO ORDENA ALFABETICAMENT)
        //ejemplo01();
        //EJEMPLO 02: COLECCION TREESET(ELIMINAR DUPLICADOS Y ORDENAR ALFABETICAMENTE)
        //ejemplo02();
        //EJEMPLO 03: COLECCION TREESET DE CIUDADES
        ejemplo03();
        //EJEMPLO 04: COLECCION HASHSET(ELIMINAR DUPLICADOS Y NO ORDENA)
        //ejemplo04();
        //EJEMPLO 05: COLECCION HASHSET DE CIUDADES
        ejemplo05();
        //EJEMPLO 06: COLECCION LinkedHashSet CIUDADES(ELIMINA DUPLICADOS Y EL ORDEN ES COMO FUERON INGRESADOS)
        ejemplo06();
    }

    public static void ejemplo01() {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 6 + 1));
        }

        //RECORRER POR INDICE
        for (int i = 0; i < numeros.size(); i++) {
            int x = numeros.get(i);
            System.out.print(x + "  ");
        }
        System.out.println();
        //RECORRER POR ELEMENTO
        for (Integer x : numeros) {
            System.out.print(x + "  ");
        }
        System.out.println();
        System.out.println(numeros);
    }

    public static void ejemplo02() {
        Set<Integer> numeros = new TreeSet<>();
        //ELIMINA DUPLICADOS
        for (int i = 0; i < 20; i++) {
            numeros.add((int) (Math.random() * 100) + 1);
        }
        //RECORRER POR INDICE (NO EXISTE)
        //RECORRER POR ELEMENTO
        for (Integer x : numeros) {
            System.out.print(x + "  ");
        }
        System.out.println();
        System.out.println(numeros);
    }

    public static void ejemplo03() {
        Set<String> ciudades = new TreeSet<>();
        ciudades.add("Madrid");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");
        System.out.println(ciudades);
    }

    public static void ejemplo04() {
        Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numeros.add((int) (Math.random() * 100) + 1);//[1-100]
        }
        System.out.print(numeros);
    }

    public static void ejemplo05() {
        Set<String> ciudades = new HashSet<>();
        ciudades.add("Madrid");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");
        System.out.println(ciudades);
    }

    public static void ejemplo06() {
        Set<String> ciudades = new LinkedHashSet<>();
        ciudades.add("Madrid");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");
        System.out.println(ciudades);
    }
} // FIN CLASE
