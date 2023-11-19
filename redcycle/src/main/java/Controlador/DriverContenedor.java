/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Archivo;
import Modelo.Contenedor;
import Modelo.ControlContenedor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * POO 2 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 19/09/2023
 * Fecha final: 17/11/2023
 *
 * @author Nadissa Lopez 23764
 * @author Vianka Castro 23201
 * @author Ricardo Godinez 23247
 */
public class DriverContenedor {

    private ArrayList<ControlContenedor> controlContenedores;
    private File archivo;

//     public String obtenerFecha(){
//        Date fechaActual = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        String fechaFormateada = dateFormat.format(fechaActual);
//        //System.out.println("Fecha actual del sistema: " + fechaFormateada);
//        return fechaFormateada;
//    }
    public DriverContenedor() {
        archivo = new File("ControlContenedores.csv");
    }

    public void guardarControlContenedor(int idUsuario, Contenedor contenedor, Date fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Formato de fecha

        try {
            String fechaFormateada = dateFormat.format(fecha);

            // Crea un FileWriter en modo de agregar (append)
            FileWriter fileWriter = new FileWriter(archivo, true);

            // Usa un PrintWriter para escribir en el archivo
            PrintWriter escritor = new PrintWriter(fileWriter);

            // Si el archivo no existe o está vacío, escribe el encabezado
            if (archivo.length() == 0) {
                String encabezado = "idUsuario,clasificacion,litros,cantidadResiduos,fecha";
                escritor.println(encabezado);
            }

            // Crea una línea con los datos y escribe en el archivo
            String linea = idUsuario + "," + contenedor.getClasificacion() + "," + contenedor.getLitros() + "," + contenedor.getCantResiduos() + "," + fechaFormateada;
            escritor.println(linea);

            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ControlContenedor> leerControlContenedoresCSV() {
        ArrayList<ControlContenedor> listaObjetos = new ArrayList<>();
        String linea;
        String separador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader("ControlContenedores.csv"))) {
            // Lee el encabezado y descártalo (asume que el encabezado está en la primera línea)
            br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(separador);

                if (datos.length == 5) { // Asegura que haya 5 campos por línea
                    int idUsuario = Integer.parseInt(datos[0]);
                    String clasificacion = datos[1];
                    float litros = Float.parseFloat(datos[2]);
                    int cantResiduos = Integer.parseInt(datos[3]);
                    Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(datos[4]);

                    // Crea un objeto ControlContenedor con los datos
                    Contenedor contTemp = new Contenedor(clasificacion, litros, cantResiduos);
                    ControlContenedor controlContenedor = new ControlContenedor(idUsuario, contTemp, fecha);

                    // Agrega el objeto a la lista
                    listaObjetos.add(controlContenedor);
                }
            }
        } catch (IOException | ParseException e) {
           
        }

        return listaObjetos;
    }

    public String obtenerClasificacionMenosResiduos(int idUsuario) {
        String clasificacion = "";
        int cantidadMinima = Integer.MAX_VALUE, cantidadResiduos = 0;
        controlContenedores = leerControlContenedoresCSV();

        for (int i = 0; i < controlContenedores.size(); i++) {
            if (controlContenedores.get(i).getIdUsuario() != idUsuario) {
                controlContenedores.remove(i);
            }
        }

        for (ControlContenedor contenedor : controlContenedores) {
            cantidadResiduos = contenedor.getCantResiduos();
            if (cantidadResiduos < cantidadMinima) {
                cantidadMinima = cantidadResiduos;
                clasificacion = contenedor.getClasificacion();

            }
        }
        return clasificacion;
    }

    public String obtenerDato(int idUsuario, String clasificacion, int tipoDato) {
        String dato = "";
        controlContenedores = leerControlContenedoresCSV();
        DriverClasifico driverClasifico = new DriverClasifico();

        for (int i = 0; i < controlContenedores.size(); i++) {
            if (controlContenedores.get(i).getIdUsuario() != idUsuario) {
                controlContenedores.remove(i);
            }
        }

        for (ControlContenedor contenedor : controlContenedores) {
            if (contenedor.getClasificacion().equals(clasificacion)) {
                if (tipoDato == 1) {//dato positivo
                    dato = driverClasifico.devolverDatoPositivo(clasificacion);
                } else {
                    dato = driverClasifico.devolverDatoNegativo(clasificacion);
                }

            }
        }

        return dato;
    }

    public double obtenerPorcentajeMes(int idUsuario, String fechaString) {
        double porcentaje = 0.0, basuraBase = 60.0;
        String clasificacion = obtenerClasificacionMenosResiduos(idUsuario);

        controlContenedores = leerControlContenedoresCSV();
        ArrayList<ControlContenedor> contenedoresUsuario = new ArrayList<>();

        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
            // Maneja la excepción si la fecha no se puede analizar correctamente
        }

        for (ControlContenedor contenedor : controlContenedores) {
            System.out.println(contenedor.getIdUsuario() + contenedor.getClasificacion() + contenedor.getCantResiduos() + contenedor.getFecha());
        }

        // Filtrar los contenedores del usuario y clasificación deseada
        for (ControlContenedor contenedor : controlContenedores) {
            if (contenedor.getIdUsuario() == idUsuario && contenedor.getClasificacion().equals(clasificacion)) {
                contenedoresUsuario.add(contenedor);
            }
        }

        ControlContenedor contenedorActual = null;

        for (ControlContenedor contenedor : contenedoresUsuario) {
            if (contenedor.getFecha().equals(fecha)) {
                contenedorActual = contenedor;
                break; // Salir del bucle una vez encontrado el contenedor del mes actual
            }
        }

        if (contenedorActual != null) {
            double basuraActual = contenedorActual.getCantResiduos();
            porcentaje = ((basuraActual - basuraBase) / basuraBase) * 100.0;
        }

        return porcentaje;
    }

}
