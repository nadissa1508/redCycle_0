/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
/*
 * POO 2 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 19/09/2023
 * Fecha final: 19/09/2023
 *
 * @author Nadissa Lopez 23764
 * @author Vianka Castro 23201
 * @author Ricardo Godinez 23247
 * 
 * Clase controladora que conecta todos los modelos del
 * programa, es crucial porque concentra la lógica primordial del sistema.
 * 
 * */

import Modelo.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nadis
 */
public class Driver {
    //Atributos

    private Usuario usuario;
    private ArrayList<Clasificacion> clasificacionesBasura;

    //Getters y Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Clasificacion> getClasificacionesBasura() {
        return clasificacionesBasura;
    }

    public void setClasificacionesBasura(ArrayList<Clasificacion> clasificacionesBasura) {
        this.clasificacionesBasura = clasificacionesBasura;
    }

    //constructores
    public Driver(Usuario usuario, ArrayList<Clasificacion> clasificacionesBasura) {
        this.usuario = usuario;
        this.clasificacionesBasura = clasificacionesBasura;
    }

    public Driver() {
        usuario = new Usuario();
        //falta llenar el array clasificacionesBasura segun los tipos personalizados que seleccionó el usuario
        //debe de hacerse por defecto 
        clasificacionesBasura = new ArrayList<>();
    }

    /**
     *
     * @param nombre
     * @param correo
     * @param password
     * @param contenedoresBasura
     */
    public void guardarUsuario(String nombre, String correo, String password, Contenedor contenedoresBasura) {

    }

    public void buscarResiduo(String residuo) {

    }

    public void ingresarResiduos(String clasificación, int cantidadResiduos) {

    }

    public void mostrarMisResiduos() {

    }

    public void mostrarEstadísticas(Date fecha) {

    }

    public String alertaContenedores(String clasificación) {
        String alerta = "";
        return alerta;
    }

    public void actualizarControlContenedor() {

    }

    public void calcularProgresoMensual() {

    }

}
