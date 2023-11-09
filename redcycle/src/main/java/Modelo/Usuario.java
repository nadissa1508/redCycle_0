/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author nadis
 */
public class Usuario {

    //Atributos 
    private String nombre = "";
    private String correo = "";
    private String password = "";
    private int id;
    private ArrayList<Contenedor> contedenoresBasura;

    @Override
    public String toString() {
        return "Usuario [id=" + id + "nombre=" + nombre + ", correo=" + correo + ", password=" + password + ", contedenoresBasura="
                + contedenoresBasura + "]";
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

    public ArrayList<Contenedor> getContedenoresBasura() {
        return contedenoresBasura;
    }

    public void setContedenoresBasura(ArrayList<Contenedor> contedenoresBasura) {
        this.contedenoresBasura = contedenoresBasura;
    }
    
    public int sizeContenedores(){
        return contedenoresBasura.size();
    }
    
    public String[] getClasificacionesContenedores(){
        String[] clasificaciones = new String[6];
        for(int i = 0; i < contedenoresBasura.size(); i++){
            if(contedenoresBasura.get(i) != null){
                clasificaciones[i] = contedenoresBasura.get(i).getClasificacion();
            }
        }
        return clasificaciones;
    }

    //Constructor
    public Usuario(int id, String nombre, String correo, String password, ArrayList<Contenedor> contedenoresBasura) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.contedenoresBasura = contedenoresBasura;
        this.id = id;
    }

    public Usuario() {
        this.id = 0;
        this.nombre = "";
        this.correo = "";
        this.password = "";
        this.contedenoresBasura = new ArrayList<>();
    }

}
