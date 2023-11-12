/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Clasificacion;
import java.util.ArrayList;

/**
 *
 * @author nadis
 */
public class DriverContenedor {

    private ArrayList<Clasificacion> clasificacionesBasura;
    private DriverUsuario driver;

    public DriverContenedor(DriverUsuario driver) {
        this.driver = driver;
    }

}
