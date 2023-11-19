/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

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
public class Usuario {

    //Atributos 
    private String nombre;
    private String correo;
    private String password;
    private int id;
    private ArrayList<Contenedor> contenedoresBasura;

    @Override
    public String toString() {
        return "Usuario [id=" + id + "nombre=" + nombre + ", correo=" + correo + ", password=" + password + ", contenedoresBasura="
                + contenedoresBasura + "]";
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Contenedor> getContenedoresBasura() {
        return contenedoresBasura;
    }

    public void setContenedoresBasura(ArrayList<Contenedor> contenedoresBasura) {
        this.contenedoresBasura = contenedoresBasura;
    }
    
    public int sizeContenedores(){
        return contenedoresBasura.size();
    }
    
    public String[] getClasificacionesContenedores(){
        String[] clasificaciones = new String[6];
        for(int i = 0; i < contenedoresBasura.size(); i++){
            if(contenedoresBasura.get(i) != null){
                clasificaciones[i] = contenedoresBasura.get(i).getClasificacion();
            }
        }
        return clasificaciones;
    }
   

    //Constructor
    public Usuario(int id, String nombre, String correo, String password, ArrayList<Contenedor> contenedoresBasura) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.contenedoresBasura = contenedoresBasura;
        this.id = id;
    }

    public Usuario() {
        this.id = 0;
        this.nombre = "";
        this.correo = "";
        this.password = "";
        this.contenedoresBasura = new ArrayList<>();
    }

}
