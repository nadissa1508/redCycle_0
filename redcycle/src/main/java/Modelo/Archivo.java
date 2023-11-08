/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nadis
 */
public class Archivo {

    private File archivo;

    public Archivo(String nombre) {
        archivo = new File(nombre);
    }
    
    public void crearCSV(ArrayList<Usuario> usuarios) throws Exception{
        
        
    }
    
    public ArrayList<Usuario> leerCSV() throws FileNotFoundException, IOException{
        ArrayList<Usuario> usuariosTemp = new ArrayList<>();
        return usuariosTemp;
    }
}
