/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Clasificacion;
import java.util.ArrayList;

/**
 * POO 2 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 19/09/2023
 * Fecha final: 17/11/2023
 *
 * @author Nadissa Lopez 23764
 * @author Vianka Castro 23201
 * @author Ricardo Godinez 23247
 * 
 * La clase DriverClasifico gestiona la clasificación de residuos categorizando los artículos de desecho en sus respectivas clasificaciones.
 * como orgánicos, plástico, multicapa, metal, vidrio y papel y cartón. Permite agregar elementos de desecho al
 * clasificaciones y búsqueda de residuos dentro de los mismos.
 */

public class DriverClasifico {

    ArrayList<Clasificacion> clasificacionesBasura;

    public DriverClasifico() {
        clasificacionesBasura = new ArrayList<>();
        llenarClasificaciones();
    }

    /**
     * Este método toma una serie de nombres de elementos de desecho y los agrega a la lista de elementos de clasificación de residuos.
     *
     * @param articulosClasificacion Una serie de cadenas que representan nombres de elementos de desecho.
     * @return Una ArrayList que contiene los nombres de los elementos de desecho agregados.
     */
    public ArrayList<String> llenarArrayArticulos(String[] articulosClasificacion) {
        Clasificacion clas = new Clasificacion();
        for (String articulo : articulosClasificacion) {
            clas.agregarArticulo(articulo);
        }
        return clas.getArrayArticulos();
    }
    /**
     * Completa la lista de clasificación de residuos con categorías predefinidas y sus elementos asociados.
     *Cada clasificación incluye una descripción, impactos negativos y beneficios del manejo adecuado de los residuos.
     */
    public void llenarClasificaciones() {
        Clasificacion tempClas;

        //CREAR OBJETO CLASIFICACION -> BASURA ORGANICA
        String[] articulosOrganica = {
            "cascaras de naranja",
            "cascaras de platano",
            "restos de lechuga",
            "sobras de espaguetis",
            "pan viejo",
            "filtros de papel de café",
            "bolsitas de te",
            "cascaras de huevo",
            "hojas de arboles",
            "ramas de arbustos",};

        tempClas = new Clasificacion("Organica", "La basura orgánica, también conocida como residuos orgánicos, comprende materiales biodegradables de origen natural, como restos de alimentos, hojas, ramas y papel de cocina sucio. Estos desechos se descomponen naturalmente a través de procesos biológicos y pueden convertirse en compost o abono para mejorar la fertilidad del suelo. La gestión adecuada de la basura orgánica es esencial para reducir la cantidad de residuos enviados a vertederos y contribuir a la sostenibilidad ambiental a través del compostaje.", "El mal manejo de la basura orgánica es que cuando se desecha incorrectamente en vertederos o incineradoras, puede generar la liberación de gases de efecto invernadero, como el metano. El metano es un gas que contribuye al cambio climático y al calentamiento global.", "La gestión adecuada de la basura orgánica da como resultado un valioso producto: el compost. El compost es un abono orgánico rico en nutrientes que puede utilizarse para enriquecer el suelo en jardines, huertos y agricultura. Al hacerlo, contribuyes a mejorar la salud del suelo, aumentar la fertilidad y promover un crecimiento más saludable de plantas y cultivos.", llenarArrayArticulos(articulosOrganica));
        clasificacionesBasura.add(tempClas);

        tempClas = new Clasificacion();
        //CREAR OBJETO CLASIFICACION -> BASURA PLASTICO
        String[] articulosPlastico = {
            "botella de plastico",
            "envases de yogur",
            "bolsas de plastico",
            "envases de productos de limpieza",
            "tapas de botellas",
            "tazas desechables de plastico",
            "juguetes de plastico",
            "cubiertos desechables de plastico",
            "envases de champu",
            "envases de detergente liquido"
        };
        tempClas = new Clasificacion("Plastico", "El artículo que buscaste se debe clasificar como Plástico. Este tipo de desechos están compuestos en su mayoría por derivados del petróleo, tienen un tiempo de degradación muy lento y tardan al menos 100 años en descomponerse.", "Los plásticos mal gestionados a menudo terminan en océanos y mares, los animales marinos pueden ingerir plásticos al confundirlos con alimentos, lo que puede llevar a daños internos, asfixia e incluso la muerte.", "Reducir la producción de residuos de plástico beneficia al medio ambiente al conservar la vida marina y los ecosistemas marinos. Al optar por alternativas sostenibles, como bolsas reutilizables y botellas recargables, ayudas a prevenir la contaminación de los océanos y la ingesta de plásticos por parte de la vida marina. Además, esta elección también puede ahorrarte dinero a largo plazo y disminuir tu huella de carbono.", llenarArrayArticulos(articulosPlastico));
        clasificacionesBasura.add(tempClas);

        //CREAR OBJETO CLASIFICACION -> BASURA MULTICAPA
        String[] articulosMulticapa = {
            "envase de aperitivos",
            "envase de jugo",
            "envase de papas fritas",
            "bolsas de cafe",
            "envoltorios de dulce",
            "bolsas de bocadillos",
            "pasta de dientes",
            "envase de detergente",
            "blister de pastillas",
            "envases de baterías"
        };
        tempClas = new Clasificacion("Multicapa", "categorización de residuos que consisten en envases y productos con capas de diferentes materiales, como papel, plástico, aluminio o metal. Estos materiales combinados en capas pueden ser difíciles de reciclar o reutilizar, lo que a menudo los convierte en un desafío ambiental. La basura multicapa incluye productos como envases de alimentos, envases de bebidas, bolsas de aperitivos y otros artículos que contienen múltiples capas de diferentes materiales.", "El mal manejo de la basura multicapa conlleva dificultades en su reciclaje, lo que a menudo resulta en la acumulación de estos productos en vertederos. Esto puede llevar a la pérdida de recursos y contribuir a la contaminación ambiental. Es importante considerar alternativas y reciclaje adecuado para minimizar estos efectos negativos.", "Al reducir la producción de residuos multicapa, estás ayudando a preservar la belleza natural del planeta y a proteger a la vida silvestre. Menos desechos multicapa significan menos productos dañinos que llegan a hábitats naturales y océanos, lo que beneficia a los ecosistemas y a los animales que dependen de ellos. Tu contribución apoya la biodiversidad y asegura que los animales puedan vivir en un entorno más limpio y saludable.", llenarArrayArticulos(articulosMulticapa));
        clasificacionesBasura.add(tempClas);

        //CREAR OBJETO CLASIFICACION -> BASURA METAL
        String[] articulosMetal = {
            "latas de refrescos",
            "envases de alimentos de metal",
            "tubos de pasta dental de aluminio",
            "tapas de frascos metálicos",
            "alambre de cobre",
            "clips metálicos",
            "tuberias de plomería de metal",
            "cubiertos de acero inoxidable",
            "piezas de maquinaria de metal",
            "llaves y tuercas de metal"
        };
        tempClas = new Clasificacion("Metal", "La clasificación de basura de metal se refiere a la categorización de residuos que están hechos principalmente de materiales metálicos, como latas de refrescos, envases de alimentos de metal, alambre de cobre, herramientas de metal y otros objetos similares. El metal es un material valioso y reciclable que se utiliza en una variedad de productos, y su reciclaje ayuda a conservar recursos naturales y reduce la contaminación.", "El mal manejo de la basura de metal puede resultar en la liberación de sustancias químicas tóxicas en el medio ambiente, lo que amenaza la salud humana y la vida silvestre. Además, la producción de metal implica la explotación de recursos naturales y daños ecológicos. Es importante gestionar adecuadamente la basura de metal para prevenir estos efectos negativos.", "Reciclar metales no solo conserva recursos naturales, sino que también reduce las emisiones de gases de efecto invernadero al ahorrar energía y reducir la extracción de minerales. Al continuar reduciendo los residuos de metal, contribuyes a la sostenibilidad y la lucha contra el cambio climático, marcando una diferencia positiva en la protección del planeta.", llenarArrayArticulos(articulosMetal));
        clasificacionesBasura.add(tempClas);

        //CREAR OBJETO CLASIFICACION -> BASURA VIDRIO
        String[] articulosVidrio = {
            "botellas de vidrio de bebidas",
            "frascos de vidrio de conservas",
            "vasos de vidrio",
            "tazas de cafe de vidrio",
            "envases de perfume de vidrio",
            "jarras de vidrio",
            "bombillas de luz de vidrio",
            "botellas de vino de vidrio",
            "platos de vidrio",
            "adornos de vidrio"
        };
        tempClas = new Clasificacion("Vidrio", "Es la categorización de residuos que consisten principalmente en artículos hechos de vidrio, como botellas de vidrio, frascos de conservas, vasos, jarras y otros objetos de vidrio. El vidrio es un material altamente reciclable y su reciclaje contribuye a reducir la cantidad de desechos en vertederos y a conservar los recursos naturales, ya que se puede fundir y reutilizar en la fabricación de nuevos productos de vidrio. La gestión adecuada de la basura de vidrio es esencial para promover la sostenibilidad y minimizar el impacto ambiental.", "El mal manejo de la basura de vidrio conduce a la acumulación de desechos de vidrio en vertederos, lo que no solo ocupa espacio de manera innecesaria, sino que también no aprovecha la capacidad de reciclaje efectivo del vidrio, desperdiciando un valioso recurso.", "El reciclaje de vidrio contribuye a mantener la pureza del aire y el agua. Al reducir la producción de vidrio nuevo, se disminuye la necesidad de extraer y procesar minerales, lo que evita la liberación de partículas contaminantes en el aire y la contaminación del agua con productos químicos tóxicos utilizados en la producción de vidrio. Al continuar reduciendo los residuos de vidrio y reciclándolos, estás contribuyendo a la calidad del aire y el agua, lo que beneficia tanto al medio ambiente como a la salud humana.", llenarArrayArticulos(articulosVidrio));
        clasificacionesBasura.add(tempClas);

        //CREAR OBJETO CLASIFICACION -> BASURA PAPEL
        String[] articulosPapel = {
            "papel de periodico",
            "revistas",
            "cartón de cajas",
            "papel de oficina",
            "sobres de papel",
            "papel de embalaje",
            "libros",
            "cuadernos",
            "papel de regalo",
            "folletos impresos"
        };
        tempClas = new Clasificacion("Papel y cartón", "La clasificación de basura de papel y cartón se refiere a la categorización de residuos que están hechos principalmente de materiales de papel, cartón y productos relacionados. Incluye elementos como periódicos, cajas de cartón, papel de oficina, cartón de envases, revistas, libros y otros artículos de papel y cartón. Estos materiales son altamente reciclables y su reciclaje contribuye a la conservación de los bosques y a la reducción de la contaminación. ", "El mal manejo de la basura de papel y cartón contribuye a la deforestación y la pérdida de hábitats naturales, lo que afecta la biodiversidad y aumenta la presión sobre los recursos naturales. Es crucial promover el reciclaje de papel y cartón para reducir estos impactos negativos en el medio ambiente.", "Reciclar papel y cartón conserva bosques, reduce emisiones de carbono y promueve un estilo de vida sostenible, marcando una diferencia en la protección de la naturaleza y la mitigación del cambio climático.", llenarArrayArticulos(articulosPapel));
        clasificacionesBasura.add(tempClas);
    }
    /**
     * Busca un elemento de desecho dentro de la lista de clasificación de desechos y devuelve su nombre de clasificación.
     *
     * @param articulo El nombre del elemento de desecho a buscar.
     * @return El nombre de la clasificación a la que pertenece el artículo de desecho, o una cadena vacía si no se encuentra.
     */
    public String buscarArticulo(String articulo) {
        String clas = "";
        for (Clasificacion clasificacion : clasificacionesBasura) {
            ArrayList<String> arrayArticulos = clasificacion.getArrayArticulos();
            if (arrayArticulos.contains(articulo)) {
                clas = clasificacion.getClasificacion();
            }
        }
        return clas;
    }
    /**
     * Devuelve una descripción detallada de una clasificación de residuos determinada, incluidos sus impactos negativos.
     *
     * @param clasificacion El nombre de la clasificación de residuos a describir.
     * @return Una cadena que contiene la descripción y los impactos negativos de la clasificación de residuos.
     */
    public String devolverDescripcion(String clasificacion) {
        String desc = "";
        for (Clasificacion clasBasura : clasificacionesBasura) {
            if (clasBasura.getClasificacion().equalsIgnoreCase(clasificacion)) {
                desc = clasBasura.getDescripcion() + "\n\n" + clasBasura.getDatoNegativo();
            }
        }
        return desc;
    }
    
    public String devolverDatoPositivo(String clasificacion) {
        String dato = "";
        for (Clasificacion clasBasura : clasificacionesBasura) {
            if (clasBasura.getClasificacion().equalsIgnoreCase(clasificacion)) {
                dato = clasBasura.getDatoPositivo();
            }
        }
        return dato;
    }
    
    public String devolverDatoNegativo(String clasificacion) {
        String dato = "";
        for (Clasificacion clasBasura : clasificacionesBasura) {
            if (clasBasura.getClasificacion().equalsIgnoreCase(clasificacion)) {
                dato = clasBasura.getDatoNegativo();
            }
        }
        return dato;
    }
}
