/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Clasificacion;
import java.util.ArrayList;

/**
 *
 * @author richi
 */
public class DriverClasifico {

    ArrayList<Clasificacion> clasificacionesBasura;

    public DriverClasifico() {
        clasificacionesBasura = new ArrayList<>();
        llenarClasificaciones();
    }

    //este metodo toma cada elemento del array articulosClasificacion y los introduce dentro del arrayArticulos, que es atributo
    //de las intancias de Clasificacion
    public void llenarArrayArticulos(String[] articulosClasificacion, Clasificacion clasificacion) {
        for (String articulo : articulosClasificacion) {
            clasificacion.agregarArticulo(articulo);
        }
    }

    public void llenarClasificaciones() {
        ArrayList<String> arrayArticulos = new ArrayList<>();
        Clasificacion tempClas;

        //CREAR OBJETO CLASIFICACION -> BASURA ORGANICA
        String[] articulos = {
            "Cascaras de naranja",
            "Cascaras de platano",
            "Restos de lechuga",
            "Sobras de espaguetis",
            "Pan viejo",
            "Filtros de papel de café",
            "Bolsitas de te",
            "Cascaras de huevo",
            "Hojas de arboles",
            "Ramas de arbustos",};

        tempClas = new Clasificacion("Organica", "La basura orgánica, también conocida como residuos orgánicos, comprende materiales biodegradables de origen natural, como restos de alimentos, hojas, ramas y papel de cocina sucio. Estos desechos se descomponen naturalmente a través de procesos biológicos y pueden convertirse en compost o abono para mejorar la fertilidad del suelo. La gestión adecuada de la basura orgánica es esencial para reducir la cantidad de residuos enviados a vertederos y contribuir a la sostenibilidad ambiental a través del compostaje.", "El mal manejo de la basura orgánica es que cuando se desecha incorrectamente en vertederos o incineradoras, puede generar la liberación de gases de efecto invernadero, como el metano. El metano es un gas que contribuye al cambio climático y al calentamiento global.", "La gestión adecuada de la basura orgánica da como resultado un valioso producto: el compost. El compost es un abono orgánico rico en nutrientes que puede utilizarse para enriquecer el suelo en jardines, huertos y agricultura. Al hacerlo, contribuyes a mejorar la salud del suelo, aumentar la fertilidad y promover un crecimiento más saludable de plantas y cultivos.", arrayArticulos);
        llenarArrayArticulos(articulos, tempClas);
        clasificacionesBasura.add(tempClas);
        //CREAR OBJETO CLASIFICACION -> BASURA PLASTICO

        //CREAR OBJETO CLASIFICACION -> BASURA MULTICAPA
        //CREAR OBJETO CLASIFICACION -> BASURA METAL
        //CREAR OBJETO CLASIFICACION -> BASURA VIDRIO
        //CREAR OBJETO CLASIFICACION -> BASURA PAPEL
    }

    public String buscarArticulo(String articulo) {
        String clas = "";
        for (Clasificacion clasificacion : clasificacionesBasura) {
            ArrayList<String> arrayArticulos = clasificacion.getArrayArtículos();
            if (arrayArticulos.contains(articulo)) {
                clas = clasificacion.getClasificacion();
            }
        }
        return clas;
    }

    public String devolverDescripcion(String clasificacion) {
        String desc = "";
        for (Clasificacion clasBasura : clasificacionesBasura) {
            if (clasBasura.getClasificacion().equals(clasificacion)) {
                desc = clasBasura.getDescripcion();
            }
        }
        return desc;
    }
}
