/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/**
 *
 * @author nadissa
 */
public class Archivo {

    private File archivo;
    private File archivoContenedores;
    private int idUsuario;

    public Archivo(String nombreUser, String nombreCont) {
        archivo = new File(nombreUser);
        archivoContenedores = new File(nombreCont);
    }

    public void guardarUsuariosCSV(ArrayList<Usuario> usuarios) throws Exception {

        FileWriter fileWriter = new FileWriter(archivo);
        PrintWriter escritor = new PrintWriter(fileWriter);

        String encabezados = "id,nombre,correo,password";
        escritor.println(encabezados);

        for (Usuario usuario : usuarios) {

            int id = usuario.getId();
            String nombre = usuario.getNombre();
            String correo = usuario.getCorreo();
            String password = usuario.getPassword();

            String linea = id + "," + nombre + "," + correo + "," + password;
            escritor.println(linea);
        }

        escritor.close();

    }

    public ArrayList<Usuario> leerUsuariosCSV() throws FileNotFoundException, IOException {
        ArrayList<Usuario> usuariosTemp = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        br.readLine();
        while ((linea = br.readLine()) != null) {
            String[] datosUsuario = linea.split(",");

            int id = Integer.parseInt(datosUsuario[0]);
            String nombre = datosUsuario[1];
            String correo = datosUsuario[2];
            String password = datosUsuario[3];

            ArrayList<Contenedor> contenedoresBasura = new ArrayList<>();
            Usuario usuario = new Usuario(id, nombre, correo, password, contenedoresBasura);
            usuariosTemp.add(usuario);
        }

        br.close();
        return usuariosTemp;
    }

    public void guardarContenedoresCSV(ArrayList<Usuario> usuarios) throws IOException {
        //        try (FileWriter fileWriter = new FileWriter(archivoContenedores, false); 
        //                PrintWriter escritor = new PrintWriter(fileWriter)) {
        //
        //            String encabezados = "idUsuario,clasificacion,litros,cantResiduos";
        //            escritor.println(encabezados);
        //
        //            for (Usuario usuario : usuarios) {
        //                if (usuario != null && usuario.getContenedoresBasura() != null) {
        //                    for (Contenedor contenedor : usuario.getContenedoresBasura()) {
        //                        if (contenedor != null) {
        //                            String linea = usuario.getId() + "," + contenedor.getClasificacion() + ","
        //                                    + contenedor.getLitros() + "," + contenedor.getCantResiduos();
        //                            escritor.println(linea);
        //                        }
        //
        //                    }
        //                }
        //
        //            }
        //        }

        try (FileWriter fw = new FileWriter("Contenedores.csv")) {
            fw.write("idUsuario,clasificacion,litros,cantResiduos\n");
            for (Usuario usuario : usuarios) {
                if (usuario != null && usuario.getContenedoresBasura() != null) {
                    for (Contenedor contenedor : usuario.getContenedoresBasura()) {
                        if (contenedor != null) {
                            String linea = usuario.getId() + "," + contenedor.getClasificacion() + ","
                                    + contenedor.getLitros() + "," + contenedor.getCantResiduos() + "\n";
                            fw.write(linea);
                        }

                    }
                }

            }
        }

    }

//    public HashMap<Integer, ArrayList<Contenedor>> leerContenedoresCSV() throws IOException {
//        HashMap<Integer, ArrayList<Contenedor>> contenedoresPorUsuario = new HashMap<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(archivoContenedores))) {
//            String linea = br.readLine();
//            while ((linea = br.readLine()) != null) {
//                String[] datos = linea.split(",");
//                int idUsuario = Integer.parseInt(datos[0]);
//                String clasificacion = datos[1];
//                float litros = Float.parseFloat(datos[2]);
//                int cantResiduos = Integer.parseInt(datos[3]);
//
//                Contenedor contenedor = new Contenedor(clasificacion, litros, cantResiduos);
//               
//                contenedoresPorUsuario.putIfAbsent(idUsuario, new ArrayList<>());
//                contenedoresPorUsuario.get(idUsuario).add(contenedor);
//            }
//        }
//        return contenedoresPorUsuario;
//    }
    public HashMap<Integer, ArrayList<Contenedor>> leerContenedoresCSV() throws IOException {
        HashMap<Integer, ArrayList<Contenedor>> contenedoresPorUsuario = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(archivoContenedores));
        String linea;
        br.readLine(); // Leer la primera línea que contiene los encabezados

        while ((linea = br.readLine()) != null) {
            String[] datosContenedores = linea.split(",");
            int idUsuario = Integer.parseInt(datosContenedores[0]);
            String clasificacion = datosContenedores[1];
            float litros = Float.parseFloat(datosContenedores[2]);
            int cantResiduos = Integer.parseInt(datosContenedores[3]);

            Contenedor contenedor = new Contenedor(clasificacion, litros, cantResiduos);

            contenedoresPorUsuario.putIfAbsent(idUsuario, new ArrayList<>());
            contenedoresPorUsuario.get(idUsuario).add(contenedor);
        }

        br.close();
        return contenedoresPorUsuario;
    }
    
    
}
