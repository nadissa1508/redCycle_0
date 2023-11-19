/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

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
 * Esta clase permite llevar un control sobre la cantidad 
 * de residuos que se generan en fechas específicas del año, 
 * 
 * */
public class ControlContenedor {

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    //Atributos
    private int idUsuario;
    private Contenedor contenedor;
    private Date fecha;

    @Override
    public String toString() {
        return "ControlContenedor [contenedor=" + contenedor + ", fecha=" + fecha + "]";
    }

    //Constructor
    public ControlContenedor(int idUsuario, Contenedor contenedor, Date fecha) {
        this.idUsuario = idUsuario;
        this.contenedor = contenedor;
        this.fecha = fecha;
    }

    public ControlContenedor() {
        this.idUsuario = 0;
        this.contenedor = new Contenedor();
        this.fecha = new Date();
    }
    

    //Getters y Setters
    public Contenedor getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }
    
    public String getClasificacion(){
        return contenedor.getClasificacion(); 
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public int getCantResiduos(){
        return contenedor.getCantResiduos();
    }
    
  
}
