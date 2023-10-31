/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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
 * 
 * Su objetivo es modelar el contenedor de basura que tiene un usuario. 
 * 
 * 
 * */
public class Contenedor {

    //Atributos 
    private String clasificacion = "";
    private float litros = 0.0f;
    private int cantResiduos = 0;

    @Override
    public String toString() {
        return "Contenedor [clasificacion=" + clasificacion + ", litros=" + litros + ", cantResiduos=" + cantResiduos
                + "]";
    }

    //Getters y Setters
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public int getCantResiduos() {
        return cantResiduos;
    }

    public void setCantResiduos(int cantResiduos) {
        this.cantResiduos = cantResiduos;
    }

    //Constructor
    public Contenedor(String clasificacion, float litros, int cantResiduos) {
        this.clasificacion = clasificacion;
        this.litros = litros;
        this.cantResiduos = cantResiduos;
    }

    public Contenedor() {
        this.clasificacion = "";
        this.litros = 0.0f;
        this.cantResiduos = 0;
    }

}
