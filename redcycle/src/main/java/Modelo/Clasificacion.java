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

    private String casificacion;
    private String descripcion;
    private String datoNegativo;
    private String datoPositivo;
    private ArrayList<String> arrayArtículos;

    public Clasificacion(String casificacion, String descripcion, String datoNegativo, String datoPositivo, ArrayList<String> arrayArtículos) {
        this.casificacion = casificacion;
        this.descripcion = descripcion;
        this.datoNegativo = datoNegativo;
        this.datoPositivo = datoPositivo;
        this.arrayArtículos = arrayArtículos;
    }

    public Clasificacion() {
        this.casificacion = "";
        this.descripcion = "";
        this.datoNegativo = "";
        this.datoPositivo = "";
        this.arrayArtículos = new ArrayList<>();
    }

    public void setCasificacion(String casificacion) {
        this.casificacion = casificacion;
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

    public String getCasificacion() {
        return casificacion;
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

    public ArrayList<String> getArrayArtículos() {
        return arrayArtículos;
    }

    public void setArrayArtículos(ArrayList<String> arrayArtículos) {
        this.arrayArtículos = arrayArtículos;
    }

    @Override
    public String toString() {
        return "Clasificacio{"
                + "casificacion='" + casificacion + '\''
                + ", descripcion='" + descripcion + '\''
                + ", datoNegativo='" + datoNegativo + '\''
                + ", datoPositivo='" + datoPositivo + '\''
                + ", arrayArtículos=" + arrayArtículos
                + '}';
    }
}
