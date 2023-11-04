/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

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
 *  Modela un tipo de clasificación de basura específico,
 *  permite mostrar información relevante al usuario para educarlo 
 *  respecto a las diferentes categorías que existen para clasificar los residuos.
 * */
public class Clasificacion {

    private String clasificacion;
    private String descripcion;
    private String datoNegativo;
    private String datoPositivo;
    private ArrayList<String> arrayArticulos;

    public Clasificacion(String clasificacion, String descripcion, String datoNegativo, String datoPositivo, ArrayList<String> arrayArticulos) {
        this.clasificacion = clasificacion;
        this.descripcion = descripcion;
        this.datoNegativo = datoNegativo;
        this.datoPositivo = datoPositivo;
        this.arrayArticulos = arrayArticulos;
    }

    public Clasificacion() {
        this.clasificacion = "";
        this.descripcion = "";
        this.datoNegativo = "";
        this.datoPositivo = "";
        this.arrayArticulos = new ArrayList<>();
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDatoNegativo(String datoNegativo) {
        this.datoNegativo = datoNegativo;
    }

    public void setDatoPositivo(String datoPositivo) {
        this.datoPositivo = datoPositivo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDatoNegativo() {
        return datoNegativo;
    }

    public String getDatoPositivo() {
        return datoPositivo;
    }

    public ArrayList<String> getArrayArticulos() {
        return arrayArticulos;
    }

    public void setArrayArticulos(ArrayList<String> arrayArticulos) {
        this.arrayArticulos = arrayArticulos;
    }

    public void agregarArticulo(String articulo){
        this.arrayArticulos.add(articulo);
    }
    
    @Override
    public String toString() {
        return "Clasificacio{"
                + "clasificacion='" + clasificacion + '\''
                + ", descripcion='" + descripcion + '\''
                + ", datoNegativo='" + datoNegativo + '\''
                + ", datoPositivo='" + datoPositivo + '\''
                + ", arrayArticulos=" + arrayArticulos
                + '}';
    }
}
