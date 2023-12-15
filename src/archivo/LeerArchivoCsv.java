package archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Transaccion;

//import java.io.*;
public class LeerArchivoCsv {

    public static List<Transaccion> obtenerDatos() {
        List<Transaccion> transacciones = new ArrayList<>();
        File f;
        FileReader fr;
        BufferedReader bf;
        String fila = "";
        try {
            f = new File("C:\\NetbeansProjects\\PROYECTODATA\\data\\transacciones.csv");
            fr = new FileReader(f);
            bf = new BufferedReader(fr);
            int i = 0;
            while ((fila = bf.readLine()) != null) {
                if (i != 0) {
                    Transaccion t = new Transaccion();
                    t.separarCampos(fila);//Inicializa los atributos del objeto
                    transacciones.add(t);
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR LECTURA");
            return null;
        }
        return transacciones;
    }
}
