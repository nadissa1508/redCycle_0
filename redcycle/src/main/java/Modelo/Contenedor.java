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
 *  * Clase Contenedor que representa un contenedor de basura asociado a un usuario en el sistema.
 * Almacena la clasificación de residuos que acepta el contenedor, la capacidad en litros y la cantidad de residuos que contiene.
 * Se utiliza para gestionar y controlar el volumen y tipo de residuos producidos por un usuario.
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
    
    /**
     * Obtiene la clasificación del contenedor.
     * @return La clasificación de basura del contenedor.
     */
    public String getClasificacion() {
        return clasificacion;
    }

     /**
     * Establece la clasificación del contenedor.
     * @param clasificacion La clasificación de basura a establecer para el contenedor.
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
     /**
     * Obtiene la capacidad en litros del contenedor.
     * @return La capacidad del contenedor en litros.
     */
    public float getLitros() {
        return litros;
    }
    /**
     * Establece la capacidad en litros del contenedor.
     * @param litros La capacidad del contenedor en litros a establecer.
     */
    public void setLitros(float litros) {
        this.litros = litros;
    }
    /**
     * Obtiene la cantidad de residuos en el contenedor.
     * @return La cantidad de residuos en el contenedor.
     */
    public int getCantResiduos() {
        return cantResiduos;
    }
     /**
     * Establece la cantidad de residuos en el contenedor.
     * @param cantResiduos La cantidad de residuos a establecer en el contenedor.
     */
    public void setCantResiduos(int cantResiduos) {
        this.cantResiduos = cantResiduos;
    }

   /**
     * Constructor para crear un contenedor con una clasificación específica, una capacidad en litros y una cantidad inicial de residuos.
     * 
     * @param clasificacion La clasificación de basura para el contenedor.
     * @param litros La capacidad del contenedor en litros.
     * @param cantResiduos La cantidad de residuos actual en el contenedor.
     */
    public Contenedor(String clasificacion, float litros, int cantResiduos) {
        this.clasificacion = clasificacion;
        this.litros = litros;
        this.cantResiduos = cantResiduos;
       
    }

    /**
     * Constructor por defecto que crea un contenedor vacío sin clasificación, sin litros y sin residuos.
     */
    public Contenedor() {
        this.clasificacion = "";
        this.litros = 0.0f;
        this.cantResiduos = 0;
    }


}
