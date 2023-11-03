/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Clasificacion;
import Modelo.Contenedor;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author richi
 */

public class DriverClasidico {
    
    Usuario usuario = new Usuario();
    Clasificacion clas  = new Clasificacion();
    ArrayList<String> articulos = new ArrayList<>();
    
    public DriverClasidico(){
        
       for (Contenedor contenedor : usuario.getContedenoresBasura()){
           
            articulos.add(usuario.getContedenoresBasura().toString());
       }
       clas.setArrayArtículos(articulos);
      
       
    }
    
    
    
    
    
    
    
       
}
