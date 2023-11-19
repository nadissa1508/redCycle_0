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
    
    // Atributos que representan los detalles de la clasificación de basura.
    private String clasificacion;
    private String descripcion;
    private String datoNegativo;
    private String datoPositivo;
    private ArrayList<String> arrayArticulos;
     /**
     * Constructor completo para crear una clasificación de basura con toda su información.
     * 
     * @param clasificacion Nombre de la categoría de clasificación.
     * @param descripcion Descripción detallada de la clasificación.
     * @param datoNegativo Explicación del impacto negativo al no clasificar correctamente esta categoría.
     * @param datoPositivo Explicación del impacto positivo al clasificar correctamente esta categoría.
     * @param arrayArticulos Lista de artículos que pertenecen a esta categoría.
     */
    public Clasificacion(String clasificacion, String descripcion, String datoNegativo, String datoPositivo, ArrayList<String> arrayArticulos) {
        this.clasificacion = clasificacion;
        this.descripcion = descripcion;
        this.datoNegativo = datoNegativo;
        this.datoPositivo = datoPositivo;
        this.arrayArticulos = arrayArticulos;
    }
     /**
     * Constructor por defecto que crea una clasificación vacía.
     */
    public Clasificacion() {
        this.clasificacion = "";
        this.descripcion = "";
        this.datoNegativo = "";
        this.datoPositivo = "";
        this.arrayArticulos = new ArrayList<>();
    }
    
    /**
     * Establece el nombre de la clasificación.
     * @param clasificacion Nombre de la clasificación a establecer.
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * Establece la descripción de la clasificación.
     * @param descripcion Descripción a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Establece la información del impacto negativo de la clasificación.
     * @param datoNegativo Impacto negativo a establecer.
     */
    public void setDatoNegativo(String datoNegativo) {
        this.datoNegativo = datoNegativo;
    }

    /**
     * Establece la información del impacto positivo de la clasificación.
     * @param datoPositivo Impacto positivo a establecer.
     */
    public void setDatoPositivo(String datoPositivo) {
        this.datoPositivo = datoPositivo;
    }

    
    // Métodos Getters para obtener los atributos de la clasificación de basura.

    /**
     * Obtiene el nombre de la clasificación.
     * @return Nombre de la clasificación.
     */
    public String getClasificacion() {
        return clasificacion;
    }

     /**
     * Obtiene la descripción de la clasificación.
     * @return Descripción de la clasificación.
     */
    public String getDescripcion() {
        return descripcion;
    }

     /**
     * Obtiene la información del impacto positivo de la clasificación.
     * @return Impacto positivo de la clasificación.
     */
    public String getDatoNegativo() {
        return datoNegativo;
    }

    public String getDatoPositivo() {
        return datoPositivo;
    }

     /**
     * Obtiene la lista de artículos asociados a la clasificación.
     * @return Lista de artículos de la clasificación.
     */
    public ArrayList<String> getArrayArticulos() {
        return arrayArticulos;
    }

    
    /**
     * Establece la lista de artículos para la clasificación.
     * @param arrayArticulos Lista de artículos a establecer.
     */
    public void setArrayArticulos(ArrayList<String> arrayArticulos) {
        this.arrayArticulos = arrayArticulos;
    }
    
     /**
     * Agrega un artículo a la lista de artículos de la clasificación.
     * @param articulo Artículo a agregar.
     */

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
